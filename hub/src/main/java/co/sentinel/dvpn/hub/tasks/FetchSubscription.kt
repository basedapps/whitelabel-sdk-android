package co.sentinel.dvpn.hub.tasks

import co.sentinel.cosmos.network.ChannelBuilder
import co.uk.basedapps.domain.exception.Failure
import co.uk.basedapps.domain.functional.Either
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.guava.await
import sentinel.subscription.v2.Querier
import sentinel.subscription.v2.QueryServiceGrpc
import timber.log.Timber

object FetchSubscription {
  suspend fun execute(subscriptionId: Long) = kotlin.runCatching {
    val stub = QueryServiceGrpc.newFutureStub(ChannelBuilder.getMainChannel())
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
