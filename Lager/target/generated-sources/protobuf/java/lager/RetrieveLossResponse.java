// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: warehouse.proto

package lager;

/**
 * Protobuf type {@code lager.RetrieveLossResponse}
 */
public  final class RetrieveLossResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lager.RetrieveLossResponse)
    RetrieveLossResponseOrBuilder {
  // Use RetrieveLossResponse.newBuilder() to construct.
  private RetrieveLossResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RetrieveLossResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RetrieveLossResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            lager.Loss.Builder subBuilder = null;
            if (loss_ != null) {
              subBuilder = loss_.toBuilder();
            }
            loss_ = input.readMessage(lager.Loss.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(loss_);
              loss_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lager.WarehouseOuterClass.internal_static_lager_RetrieveLossResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lager.WarehouseOuterClass.internal_static_lager_RetrieveLossResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lager.RetrieveLossResponse.class, lager.RetrieveLossResponse.Builder.class);
  }

  public static final int LOSS_FIELD_NUMBER = 1;
  private lager.Loss loss_;
  /**
   * <code>.lager.Loss loss = 1;</code>
   */
  public boolean hasLoss() {
    return loss_ != null;
  }
  /**
   * <code>.lager.Loss loss = 1;</code>
   */
  public lager.Loss getLoss() {
    return loss_ == null ? lager.Loss.getDefaultInstance() : loss_;
  }
  /**
   * <code>.lager.Loss loss = 1;</code>
   */
  public lager.LossOrBuilder getLossOrBuilder() {
    return getLoss();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (loss_ != null) {
      output.writeMessage(1, getLoss());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (loss_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLoss());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof lager.RetrieveLossResponse)) {
      return super.equals(obj);
    }
    lager.RetrieveLossResponse other = (lager.RetrieveLossResponse) obj;

    boolean result = true;
    result = result && (hasLoss() == other.hasLoss());
    if (hasLoss()) {
      result = result && getLoss()
          .equals(other.getLoss());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLoss()) {
      hash = (37 * hash) + LOSS_FIELD_NUMBER;
      hash = (53 * hash) + getLoss().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lager.RetrieveLossResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.RetrieveLossResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.RetrieveLossResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.RetrieveLossResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.RetrieveLossResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.RetrieveLossResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.RetrieveLossResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lager.RetrieveLossResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lager.RetrieveLossResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lager.RetrieveLossResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lager.RetrieveLossResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lager.RetrieveLossResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(lager.RetrieveLossResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code lager.RetrieveLossResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lager.RetrieveLossResponse)
      lager.RetrieveLossResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lager.WarehouseOuterClass.internal_static_lager_RetrieveLossResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lager.WarehouseOuterClass.internal_static_lager_RetrieveLossResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lager.RetrieveLossResponse.class, lager.RetrieveLossResponse.Builder.class);
    }

    // Construct using lager.RetrieveLossResponse.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (lossBuilder_ == null) {
        loss_ = null;
      } else {
        loss_ = null;
        lossBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lager.WarehouseOuterClass.internal_static_lager_RetrieveLossResponse_descriptor;
    }

    public lager.RetrieveLossResponse getDefaultInstanceForType() {
      return lager.RetrieveLossResponse.getDefaultInstance();
    }

    public lager.RetrieveLossResponse build() {
      lager.RetrieveLossResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lager.RetrieveLossResponse buildPartial() {
      lager.RetrieveLossResponse result = new lager.RetrieveLossResponse(this);
      if (lossBuilder_ == null) {
        result.loss_ = loss_;
      } else {
        result.loss_ = lossBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof lager.RetrieveLossResponse) {
        return mergeFrom((lager.RetrieveLossResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lager.RetrieveLossResponse other) {
      if (other == lager.RetrieveLossResponse.getDefaultInstance()) return this;
      if (other.hasLoss()) {
        mergeLoss(other.getLoss());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      lager.RetrieveLossResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lager.RetrieveLossResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private lager.Loss loss_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        lager.Loss, lager.Loss.Builder, lager.LossOrBuilder> lossBuilder_;
    /**
     * <code>.lager.Loss loss = 1;</code>
     */
    public boolean hasLoss() {
      return lossBuilder_ != null || loss_ != null;
    }
    /**
     * <code>.lager.Loss loss = 1;</code>
     */
    public lager.Loss getLoss() {
      if (lossBuilder_ == null) {
        return loss_ == null ? lager.Loss.getDefaultInstance() : loss_;
      } else {
        return lossBuilder_.getMessage();
      }
    }
    /**
     * <code>.lager.Loss loss = 1;</code>
     */
    public Builder setLoss(lager.Loss value) {
      if (lossBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loss_ = value;
        onChanged();
      } else {
        lossBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.lager.Loss loss = 1;</code>
     */
    public Builder setLoss(
        lager.Loss.Builder builderForValue) {
      if (lossBuilder_ == null) {
        loss_ = builderForValue.build();
        onChanged();
      } else {
        lossBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.lager.Loss loss = 1;</code>
     */
    public Builder mergeLoss(lager.Loss value) {
      if (lossBuilder_ == null) {
        if (loss_ != null) {
          loss_ =
            lager.Loss.newBuilder(loss_).mergeFrom(value).buildPartial();
        } else {
          loss_ = value;
        }
        onChanged();
      } else {
        lossBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.lager.Loss loss = 1;</code>
     */
    public Builder clearLoss() {
      if (lossBuilder_ == null) {
        loss_ = null;
        onChanged();
      } else {
        loss_ = null;
        lossBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.lager.Loss loss = 1;</code>
     */
    public lager.Loss.Builder getLossBuilder() {
      
      onChanged();
      return getLossFieldBuilder().getBuilder();
    }
    /**
     * <code>.lager.Loss loss = 1;</code>
     */
    public lager.LossOrBuilder getLossOrBuilder() {
      if (lossBuilder_ != null) {
        return lossBuilder_.getMessageOrBuilder();
      } else {
        return loss_ == null ?
            lager.Loss.getDefaultInstance() : loss_;
      }
    }
    /**
     * <code>.lager.Loss loss = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        lager.Loss, lager.Loss.Builder, lager.LossOrBuilder> 
        getLossFieldBuilder() {
      if (lossBuilder_ == null) {
        lossBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            lager.Loss, lager.Loss.Builder, lager.LossOrBuilder>(
                getLoss(),
                getParentForChildren(),
                isClean());
        loss_ = null;
      }
      return lossBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:lager.RetrieveLossResponse)
  }

  // @@protoc_insertion_point(class_scope:lager.RetrieveLossResponse)
  private static final lager.RetrieveLossResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lager.RetrieveLossResponse();
  }

  public static lager.RetrieveLossResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetrieveLossResponse>
      PARSER = new com.google.protobuf.AbstractParser<RetrieveLossResponse>() {
    public RetrieveLossResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RetrieveLossResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RetrieveLossResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetrieveLossResponse> getParserForType() {
    return PARSER;
  }

  public lager.RetrieveLossResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
