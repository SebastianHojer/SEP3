// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package lager;

/**
 * Protobuf type {@code lager.UsernameRetrievalResponse}
 */
public  final class UsernameRetrievalResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lager.UsernameRetrievalResponse)
    UsernameRetrievalResponseOrBuilder {
  // Use UsernameRetrievalResponse.newBuilder() to construct.
  private UsernameRetrievalResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UsernameRetrievalResponse() {
    username_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UsernameRetrievalResponse(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              username_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            username_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        username_ = username_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lager.UserOuterClass.internal_static_lager_UsernameRetrievalResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lager.UserOuterClass.internal_static_lager_UsernameRetrievalResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lager.UsernameRetrievalResponse.class, lager.UsernameRetrievalResponse.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList username_;
  /**
   * <code>repeated string username = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getUsernameList() {
    return username_;
  }
  /**
   * <code>repeated string username = 1;</code>
   */
  public int getUsernameCount() {
    return username_.size();
  }
  /**
   * <code>repeated string username = 1;</code>
   */
  public java.lang.String getUsername(int index) {
    return username_.get(index);
  }
  /**
   * <code>repeated string username = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUsernameBytes(int index) {
    return username_.getByteString(index);
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
    for (int i = 0; i < username_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < username_.size(); i++) {
        dataSize += computeStringSizeNoTag(username_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUsernameList().size();
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
    if (!(obj instanceof lager.UsernameRetrievalResponse)) {
      return super.equals(obj);
    }
    lager.UsernameRetrievalResponse other = (lager.UsernameRetrievalResponse) obj;

    boolean result = true;
    result = result && getUsernameList()
        .equals(other.getUsernameList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUsernameCount() > 0) {
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsernameList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lager.UsernameRetrievalResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.UsernameRetrievalResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.UsernameRetrievalResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.UsernameRetrievalResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.UsernameRetrievalResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.UsernameRetrievalResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.UsernameRetrievalResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lager.UsernameRetrievalResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lager.UsernameRetrievalResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lager.UsernameRetrievalResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lager.UsernameRetrievalResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lager.UsernameRetrievalResponse parseFrom(
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
  public static Builder newBuilder(lager.UsernameRetrievalResponse prototype) {
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
   * Protobuf type {@code lager.UsernameRetrievalResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lager.UsernameRetrievalResponse)
      lager.UsernameRetrievalResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lager.UserOuterClass.internal_static_lager_UsernameRetrievalResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lager.UserOuterClass.internal_static_lager_UsernameRetrievalResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lager.UsernameRetrievalResponse.class, lager.UsernameRetrievalResponse.Builder.class);
    }

    // Construct using lager.UsernameRetrievalResponse.newBuilder()
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
      username_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lager.UserOuterClass.internal_static_lager_UsernameRetrievalResponse_descriptor;
    }

    public lager.UsernameRetrievalResponse getDefaultInstanceForType() {
      return lager.UsernameRetrievalResponse.getDefaultInstance();
    }

    public lager.UsernameRetrievalResponse build() {
      lager.UsernameRetrievalResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lager.UsernameRetrievalResponse buildPartial() {
      lager.UsernameRetrievalResponse result = new lager.UsernameRetrievalResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        username_ = username_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.username_ = username_;
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
      if (other instanceof lager.UsernameRetrievalResponse) {
        return mergeFrom((lager.UsernameRetrievalResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lager.UsernameRetrievalResponse other) {
      if (other == lager.UsernameRetrievalResponse.getDefaultInstance()) return this;
      if (!other.username_.isEmpty()) {
        if (username_.isEmpty()) {
          username_ = other.username_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureUsernameIsMutable();
          username_.addAll(other.username_);
        }
        onChanged();
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
      lager.UsernameRetrievalResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lager.UsernameRetrievalResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList username_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureUsernameIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        username_ = new com.google.protobuf.LazyStringArrayList(username_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string username = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getUsernameList() {
      return username_.getUnmodifiableView();
    }
    /**
     * <code>repeated string username = 1;</code>
     */
    public int getUsernameCount() {
      return username_.size();
    }
    /**
     * <code>repeated string username = 1;</code>
     */
    public java.lang.String getUsername(int index) {
      return username_.get(index);
    }
    /**
     * <code>repeated string username = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes(int index) {
      return username_.getByteString(index);
    }
    /**
     * <code>repeated string username = 1;</code>
     */
    public Builder setUsername(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureUsernameIsMutable();
      username_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string username = 1;</code>
     */
    public Builder addUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureUsernameIsMutable();
      username_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string username = 1;</code>
     */
    public Builder addAllUsername(
        java.lang.Iterable<java.lang.String> values) {
      ensureUsernameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, username_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string username = 1;</code>
     */
    public Builder clearUsername() {
      username_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string username = 1;</code>
     */
    public Builder addUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureUsernameIsMutable();
      username_.add(value);
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:lager.UsernameRetrievalResponse)
  }

  // @@protoc_insertion_point(class_scope:lager.UsernameRetrievalResponse)
  private static final lager.UsernameRetrievalResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lager.UsernameRetrievalResponse();
  }

  public static lager.UsernameRetrievalResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsernameRetrievalResponse>
      PARSER = new com.google.protobuf.AbstractParser<UsernameRetrievalResponse>() {
    public UsernameRetrievalResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UsernameRetrievalResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UsernameRetrievalResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsernameRetrievalResponse> getParserForType() {
    return PARSER;
  }

  public lager.UsernameRetrievalResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

