// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: warehouse.proto

package lager;

/**
 * Protobuf type {@code lager.RegisterLossRequest}
 */
public  final class RegisterLossRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lager.RegisterLossRequest)
    RegisterLossRequestOrBuilder {
  // Use RegisterLossRequest.newBuilder() to construct.
  private RegisterLossRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterLossRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RegisterLossRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              loss_ = com.google.protobuf.MapField.newMapField(
                  LossDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Long, java.lang.Integer>
            loss__ = input.readMessage(
                LossDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            loss_.getMutableMap().put(
                loss__.getKey(), loss__.getValue());
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
    return lager.WarehouseOuterClass.internal_static_lager_RegisterLossRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetLoss();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lager.WarehouseOuterClass.internal_static_lager_RegisterLossRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lager.RegisterLossRequest.class, lager.RegisterLossRequest.Builder.class);
  }

  public static final int LOSS_FIELD_NUMBER = 1;
  private static final class LossDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Long, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Long, java.lang.Integer>newDefaultInstance(
                lager.WarehouseOuterClass.internal_static_lager_RegisterLossRequest_LossEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L,
                com.google.protobuf.WireFormat.FieldType.INT32,
                0);
  }
  private com.google.protobuf.MapField<
      java.lang.Long, java.lang.Integer> loss_;
  private com.google.protobuf.MapField<java.lang.Long, java.lang.Integer>
  internalGetLoss() {
    if (loss_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          LossDefaultEntryHolder.defaultEntry);
    }
    return loss_;
  }

  public int getLossCount() {
    return internalGetLoss().getMap().size();
  }
  /**
   * <code>map&lt;int64, int32&gt; loss = 1;</code>
   */

  public boolean containsLoss(
      long key) {
    
    return internalGetLoss().getMap().containsKey(key);
  }
  /**
   * Use {@link #getLossMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Long, java.lang.Integer> getLoss() {
    return getLossMap();
  }
  /**
   * <code>map&lt;int64, int32&gt; loss = 1;</code>
   */

  public java.util.Map<java.lang.Long, java.lang.Integer> getLossMap() {
    return internalGetLoss().getMap();
  }
  /**
   * <code>map&lt;int64, int32&gt; loss = 1;</code>
   */

  public int getLossOrDefault(
      long key,
      int defaultValue) {
    
    java.util.Map<java.lang.Long, java.lang.Integer> map =
        internalGetLoss().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int64, int32&gt; loss = 1;</code>
   */

  public int getLossOrThrow(
      long key) {
    
    java.util.Map<java.lang.Long, java.lang.Integer> map =
        internalGetLoss().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeLongMapTo(
        output,
        internalGetLoss(),
        LossDefaultEntryHolder.defaultEntry,
        1);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Long, java.lang.Integer> entry
         : internalGetLoss().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Long, java.lang.Integer>
      loss__ = LossDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, loss__);
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
    if (!(obj instanceof lager.RegisterLossRequest)) {
      return super.equals(obj);
    }
    lager.RegisterLossRequest other = (lager.RegisterLossRequest) obj;

    boolean result = true;
    result = result && internalGetLoss().equals(
        other.internalGetLoss());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetLoss().getMap().isEmpty()) {
      hash = (37 * hash) + LOSS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLoss().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lager.RegisterLossRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.RegisterLossRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.RegisterLossRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.RegisterLossRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.RegisterLossRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.RegisterLossRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.RegisterLossRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lager.RegisterLossRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lager.RegisterLossRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lager.RegisterLossRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lager.RegisterLossRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lager.RegisterLossRequest parseFrom(
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
  public static Builder newBuilder(lager.RegisterLossRequest prototype) {
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
   * Protobuf type {@code lager.RegisterLossRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lager.RegisterLossRequest)
      lager.RegisterLossRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lager.WarehouseOuterClass.internal_static_lager_RegisterLossRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetLoss();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableLoss();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lager.WarehouseOuterClass.internal_static_lager_RegisterLossRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lager.RegisterLossRequest.class, lager.RegisterLossRequest.Builder.class);
    }

    // Construct using lager.RegisterLossRequest.newBuilder()
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
      internalGetMutableLoss().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lager.WarehouseOuterClass.internal_static_lager_RegisterLossRequest_descriptor;
    }

    public lager.RegisterLossRequest getDefaultInstanceForType() {
      return lager.RegisterLossRequest.getDefaultInstance();
    }

    public lager.RegisterLossRequest build() {
      lager.RegisterLossRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lager.RegisterLossRequest buildPartial() {
      lager.RegisterLossRequest result = new lager.RegisterLossRequest(this);
      int from_bitField0_ = bitField0_;
      result.loss_ = internalGetLoss();
      result.loss_.makeImmutable();
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
      if (other instanceof lager.RegisterLossRequest) {
        return mergeFrom((lager.RegisterLossRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lager.RegisterLossRequest other) {
      if (other == lager.RegisterLossRequest.getDefaultInstance()) return this;
      internalGetMutableLoss().mergeFrom(
          other.internalGetLoss());
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
      lager.RegisterLossRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lager.RegisterLossRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Long, java.lang.Integer> loss_;
    private com.google.protobuf.MapField<java.lang.Long, java.lang.Integer>
    internalGetLoss() {
      if (loss_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            LossDefaultEntryHolder.defaultEntry);
      }
      return loss_;
    }
    private com.google.protobuf.MapField<java.lang.Long, java.lang.Integer>
    internalGetMutableLoss() {
      onChanged();;
      if (loss_ == null) {
        loss_ = com.google.protobuf.MapField.newMapField(
            LossDefaultEntryHolder.defaultEntry);
      }
      if (!loss_.isMutable()) {
        loss_ = loss_.copy();
      }
      return loss_;
    }

    public int getLossCount() {
      return internalGetLoss().getMap().size();
    }
    /**
     * <code>map&lt;int64, int32&gt; loss = 1;</code>
     */

    public boolean containsLoss(
        long key) {
      
      return internalGetLoss().getMap().containsKey(key);
    }
    /**
     * Use {@link #getLossMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.Integer> getLoss() {
      return getLossMap();
    }
    /**
     * <code>map&lt;int64, int32&gt; loss = 1;</code>
     */

    public java.util.Map<java.lang.Long, java.lang.Integer> getLossMap() {
      return internalGetLoss().getMap();
    }
    /**
     * <code>map&lt;int64, int32&gt; loss = 1;</code>
     */

    public int getLossOrDefault(
        long key,
        int defaultValue) {
      
      java.util.Map<java.lang.Long, java.lang.Integer> map =
          internalGetLoss().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int64, int32&gt; loss = 1;</code>
     */

    public int getLossOrThrow(
        long key) {
      
      java.util.Map<java.lang.Long, java.lang.Integer> map =
          internalGetLoss().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLoss() {
      internalGetMutableLoss().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int64, int32&gt; loss = 1;</code>
     */

    public Builder removeLoss(
        long key) {
      
      internalGetMutableLoss().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.Integer>
    getMutableLoss() {
      return internalGetMutableLoss().getMutableMap();
    }
    /**
     * <code>map&lt;int64, int32&gt; loss = 1;</code>
     */
    public Builder putLoss(
        long key,
        int value) {
      
      
      internalGetMutableLoss().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;int64, int32&gt; loss = 1;</code>
     */

    public Builder putAllLoss(
        java.util.Map<java.lang.Long, java.lang.Integer> values) {
      internalGetMutableLoss().getMutableMap()
          .putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:lager.RegisterLossRequest)
  }

  // @@protoc_insertion_point(class_scope:lager.RegisterLossRequest)
  private static final lager.RegisterLossRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lager.RegisterLossRequest();
  }

  public static lager.RegisterLossRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterLossRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegisterLossRequest>() {
    public RegisterLossRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegisterLossRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterLossRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterLossRequest> getParserForType() {
    return PARSER;
  }

  public lager.RegisterLossRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

