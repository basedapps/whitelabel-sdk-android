package co.sentinel.dvpn.hub.tasks

import co.sentinel.cosmos.base.BaseChain
import co.sentinel.cosmos.dao.Account
import co.sentinel.cosmos.network.ChannelBuilder
import co.uk.basedapps.domain.exception.Failure
import co.uk.basedapps.domain.functional.Either
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.guava.await
import sentinel.subscription.v2.Querier
import sentinel.subscription.v2.QueryServiceGrpc
import timber.log.Timber

object FetchSubscription {
  suspend fun execute(account: Account, subscriptionId: Long) = kotlin.runCatching {
    val chain = BaseChain.getChain(account.baseChain)
    val stub = QueryServiceGrpc.newFutureStub(ChannelBuilder.getChain(chain))
      .withDeadlineAfter(ChannelBuilder.TIME_OUT.toLong(), TimeUnit.SECONDS)
    val response = stub.querySubscription(
      Querier.QuerySubscriptionRequest.newBuilder()
        .setId(subscriptionId)
        .build(),
    ).await()
    Either.Right(response.subscription)
  }.onFailure { Timber.e(it) }
    .getOrNull() ?: Either.Left(Failure.AppError)
}
