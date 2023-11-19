// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/swap/v1/swap.proto

package sentinel.swap.v1;

public final class SwapOuterClass {
  private SwapOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SwapOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sentinel.swap.v1.Swap)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes tx_hash = 1;</code>
     * @return The txHash.
     */
    com.google.protobuf.ByteString getTxHash();

    /**
     * <code>string receiver = 2;</code>
     * @return The receiver.
     */
    java.lang.String getReceiver();
    /**
     * <code>string receiver = 2;</code>
     * @return The bytes for receiver.
     */
    com.google.protobuf.ByteString
        getReceiverBytes();

    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the amount field is set.
     */
    boolean hasAmount();
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
     * @return The amount.
     */
    cosmos.base.v1beta1.CoinOuterClass.Coin getAmount();
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
     */
    cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getAmountOrBuilder();
  }
  /**
   * Protobuf type {@code sentinel.swap.v1.Swap}
   */
  public static final class Swap extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sentinel.swap.v1.Swap)
      SwapOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Swap.newBuilder() to construct.
    private Swap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Swap() {
      txHash_ = com.google.protobuf.ByteString.EMPTY;
      receiver_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Swap();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sentinel.swap.v1.SwapOuterClass.internal_static_sentinel_swap_v1_Swap_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sentinel.swap.v1.SwapOuterClass.internal_static_sentinel_swap_v1_Swap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sentinel.swap.v1.SwapOuterClass.Swap.class, sentinel.swap.v1.SwapOuterClass.Swap.Builder.class);
    }

    private int bitField0_;
    public static final int TX_HASH_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString txHash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes tx_hash = 1;</code>
     * @return The txHash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTxHash() {
      return txHash_;
    }

    public static final int RECEIVER_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object receiver_ = "";
    /**
     * <code>string receiver = 2;</code>
     * @return The receiver.
     */
    @java.lang.Override
    public java.lang.String getReceiver() {
      java.lang.Object ref = receiver_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiver_ = s;
        return s;
      }
    }
    /**
     * <code>string receiver = 2;</code>
     * @return The bytes for receiver.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getReceiverBytes() {
      java.lang.Object ref = receiver_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiver_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AMOUNT_FIELD_NUMBER = 3;
    private cosmos.base.v1beta1.CoinOuterClass.Coin amount_;
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
     * @return Whether the amount field is set.
     */
    @java.lang.Override
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
     * @return The amount.
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.Coin getAmount() {
      return amount_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : amount_;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
     */
    @java.lang.Override
    public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getAmountOrBuilder() {
      return amount_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : amount_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!txHash_.isEmpty()) {
        output.writeBytes(1, txHash_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiver_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, receiver_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(3, getAmount());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!txHash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, txHash_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiver_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, receiver_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getAmount());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof sentinel.swap.v1.SwapOuterClass.Swap)) {
        return super.equals(obj);
      }
      sentinel.swap.v1.SwapOuterClass.Swap other = (sentinel.swap.v1.SwapOuterClass.Swap) obj;

      if (!getTxHash()
          .equals(other.getTxHash())) return false;
      if (!getReceiver()
          .equals(other.getReceiver())) return false;
      if (hasAmount() != other.hasAmount()) return false;
      if (hasAmount()) {
        if (!getAmount()
            .equals(other.getAmount())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TX_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getTxHash().hashCode();
      hash = (37 * hash) + RECEIVER_FIELD_NUMBER;
      hash = (53 * hash) + getReceiver().hashCode();
      if (hasAmount()) {
        hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getAmount().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sentinel.swap.v1.SwapOuterClass.Swap parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.swap.v1.SwapOuterClass.Swap parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.swap.v1.SwapOuterClass.Swap parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.swap.v1.SwapOuterClass.Swap parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.swap.v1.SwapOuterClass.Swap parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sentinel.swap.v1.SwapOuterClass.Swap parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sentinel.swap.v1.SwapOuterClass.Swap parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.swap.v1.SwapOuterClass.Swap parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static sentinel.swap.v1.SwapOuterClass.Swap parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static sentinel.swap.v1.SwapOuterClass.Swap parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sentinel.swap.v1.SwapOuterClass.Swap parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sentinel.swap.v1.SwapOuterClass.Swap parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(sentinel.swap.v1.SwapOuterClass.Swap prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code sentinel.swap.v1.Swap}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sentinel.swap.v1.Swap)
        sentinel.swap.v1.SwapOuterClass.SwapOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sentinel.swap.v1.SwapOuterClass.internal_static_sentinel_swap_v1_Swap_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sentinel.swap.v1.SwapOuterClass.internal_static_sentinel_swap_v1_Swap_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sentinel.swap.v1.SwapOuterClass.Swap.class, sentinel.swap.v1.SwapOuterClass.Swap.Builder.class);
      }

      // Construct using sentinel.swap.v1.SwapOuterClass.Swap.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getAmountFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        txHash_ = com.google.protobuf.ByteString.EMPTY;
        receiver_ = "";
        amount_ = null;
        if (amountBuilder_ != null) {
          amountBuilder_.dispose();
          amountBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sentinel.swap.v1.SwapOuterClass.internal_static_sentinel_swap_v1_Swap_descriptor;
      }

      @java.lang.Override
      public sentinel.swap.v1.SwapOuterClass.Swap getDefaultInstanceForType() {
        return sentinel.swap.v1.SwapOuterClass.Swap.getDefaultInstance();
      }

      @java.lang.Override
      public sentinel.swap.v1.SwapOuterClass.Swap build() {
        sentinel.swap.v1.SwapOuterClass.Swap result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sentinel.swap.v1.SwapOuterClass.Swap buildPartial() {
        sentinel.swap.v1.SwapOuterClass.Swap result = new sentinel.swap.v1.SwapOuterClass.Swap(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(sentinel.swap.v1.SwapOuterClass.Swap result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.txHash_ = txHash_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.receiver_ = receiver_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.amount_ = amountBuilder_ == null
              ? amount_
              : amountBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof sentinel.swap.v1.SwapOuterClass.Swap) {
          return mergeFrom((sentinel.swap.v1.SwapOuterClass.Swap)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sentinel.swap.v1.SwapOuterClass.Swap other) {
        if (other == sentinel.swap.v1.SwapOuterClass.Swap.getDefaultInstance()) return this;
        if (other.getTxHash() != com.google.protobuf.ByteString.EMPTY) {
          setTxHash(other.getTxHash());
        }
        if (!other.getReceiver().isEmpty()) {
          receiver_ = other.receiver_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasAmount()) {
          mergeAmount(other.getAmount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                txHash_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                receiver_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                input.readMessage(
                    getAmountFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString txHash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes tx_hash = 1;</code>
       * @return The txHash.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getTxHash() {
        return txHash_;
      }
      /**
       * <code>bytes tx_hash = 1;</code>
       * @param value The txHash to set.
       * @return This builder for chaining.
       */
      public Builder setTxHash(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        txHash_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes tx_hash = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTxHash() {
        bitField0_ = (bitField0_ & ~0x00000001);
        txHash_ = getDefaultInstance().getTxHash();
        onChanged();
        return this;
      }

      private java.lang.Object receiver_ = "";
      /**
       * <code>string receiver = 2;</code>
       * @return The receiver.
       */
      public java.lang.String getReceiver() {
        java.lang.Object ref = receiver_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          receiver_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string receiver = 2;</code>
       * @return The bytes for receiver.
       */
      public com.google.protobuf.ByteString
          getReceiverBytes() {
        java.lang.Object ref = receiver_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          receiver_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string receiver = 2;</code>
       * @param value The receiver to set.
       * @return This builder for chaining.
       */
      public Builder setReceiver(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        receiver_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string receiver = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearReceiver() {
        receiver_ = getDefaultInstance().getReceiver();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string receiver = 2;</code>
       * @param value The bytes for receiver to set.
       * @return This builder for chaining.
       */
      public Builder setReceiverBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        receiver_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private cosmos.base.v1beta1.CoinOuterClass.Coin amount_;
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> amountBuilder_;
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
       * @return Whether the amount field is set.
       */
      public boolean hasAmount() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
       * @return The amount.
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin getAmount() {
        if (amountBuilder_ == null) {
          return amount_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : amount_;
        } else {
          return amountBuilder_.getMessage();
        }
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setAmount(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (amountBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          amount_ = value;
        } else {
          amountBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder setAmount(
          cosmos.base.v1beta1.CoinOuterClass.Coin.Builder builderForValue) {
        if (amountBuilder_ == null) {
          amount_ = builderForValue.build();
        } else {
          amountBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder mergeAmount(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
        if (amountBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            amount_ != null &&
            amount_ != cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance()) {
            getAmountBuilder().mergeFrom(value);
          } else {
            amount_ = value;
          }
        } else {
          amountBuilder_.mergeFrom(value);
        }
        if (amount_ != null) {
          bitField0_ |= 0x00000004;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
       */
      public Builder clearAmount() {
        bitField0_ = (bitField0_ & ~0x00000004);
        amount_ = null;
        if (amountBuilder_ != null) {
          amountBuilder_.dispose();
          amountBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.Coin.Builder getAmountBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getAmountFieldBuilder().getBuilder();
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
       */
      public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getAmountOrBuilder() {
        if (amountBuilder_ != null) {
          return amountBuilder_.getMessageOrBuilder();
        } else {
          return amount_ == null ?
              cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : amount_;
        }
      }
      /**
       * <code>.cosmos.base.v1beta1.Coin amount = 3 [(.gogoproto.nullable) = false];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
          getAmountFieldBuilder() {
        if (amountBuilder_ == null) {
          amountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder>(
                  getAmount(),
                  getParentForChildren(),
                  isClean());
          amount_ = null;
        }
        return amountBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:sentinel.swap.v1.Swap)
    }

    // @@protoc_insertion_point(class_scope:sentinel.swap.v1.Swap)
    private static final sentinel.swap.v1.SwapOuterClass.Swap DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sentinel.swap.v1.SwapOuterClass.Swap();
    }

    public static sentinel.swap.v1.SwapOuterClass.Swap getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Swap>
        PARSER = new com.google.protobuf.AbstractParser<Swap>() {
      @java.lang.Override
      public Swap parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Swap> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Swap> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sentinel.swap.v1.SwapOuterClass.Swap getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sentinel_swap_v1_Swap_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sentinel_swap_v1_Swap_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033sentinel/swap/v1/swap.proto\022\020sentinel." +
      "swap.v1\032\036cosmos/base/v1beta1/coin.proto\032" +
      "\024gogoproto/gogo.proto\"Z\n\004Swap\022\017\n\007tx_hash" +
      "\030\001 \001(\014\022\020\n\010receiver\030\002 \001(\t\022/\n\006amount\030\003 \001(\013" +
      "2\031.cosmos.base.v1beta1.CoinB\004\310\336\037\000B7Z-git" +
      "hub.com/sentinel-official/hub/x/swap/typ" +
      "es\310\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
          com.google.protobuf2.GoGoProtos.getDescriptor(),
        });
    internal_static_sentinel_swap_v1_Swap_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sentinel_swap_v1_Swap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sentinel_swap_v1_Swap_descriptor,
        new java.lang.String[] { "TxHash", "Receiver", "Amount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf2.GoGoProtos.equalAll);
    registry.add(com.google.protobuf2.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf2.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
    com.google.protobuf2.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
