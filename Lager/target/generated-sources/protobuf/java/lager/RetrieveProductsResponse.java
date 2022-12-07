// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: warehouse.proto

package lager;

/**
 * Protobuf type {@code lager.RetrieveProductsResponse}
 */
public  final class RetrieveProductsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lager.RetrieveProductsResponse)
    RetrieveProductsResponseOrBuilder {
  // Use RetrieveProductsResponse.newBuilder() to construct.
  private RetrieveProductsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RetrieveProductsResponse() {
    product_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RetrieveProductsResponse(
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
              product_ = new java.util.ArrayList<lager.Product>();
              mutable_bitField0_ |= 0x00000001;
            }
            product_.add(
                input.readMessage(lager.Product.parser(), extensionRegistry));
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
        product_ = java.util.Collections.unmodifiableList(product_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lager.WarehouseOuterClass.internal_static_lager_RetrieveProductsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lager.WarehouseOuterClass.internal_static_lager_RetrieveProductsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lager.RetrieveProductsResponse.class, lager.RetrieveProductsResponse.Builder.class);
  }

  public static final int PRODUCT_FIELD_NUMBER = 1;
  private java.util.List<lager.Product> product_;
  /**
   * <code>repeated .lager.Product product = 1;</code>
   */
  public java.util.List<lager.Product> getProductList() {
    return product_;
  }
  /**
   * <code>repeated .lager.Product product = 1;</code>
   */
  public java.util.List<? extends lager.ProductOrBuilder> 
      getProductOrBuilderList() {
    return product_;
  }
  /**
   * <code>repeated .lager.Product product = 1;</code>
   */
  public int getProductCount() {
    return product_.size();
  }
  /**
   * <code>repeated .lager.Product product = 1;</code>
   */
  public lager.Product getProduct(int index) {
    return product_.get(index);
  }
  /**
   * <code>repeated .lager.Product product = 1;</code>
   */
  public lager.ProductOrBuilder getProductOrBuilder(
      int index) {
    return product_.get(index);
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
    for (int i = 0; i < product_.size(); i++) {
      output.writeMessage(1, product_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < product_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, product_.get(i));
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
    if (!(obj instanceof lager.RetrieveProductsResponse)) {
      return super.equals(obj);
    }
    lager.RetrieveProductsResponse other = (lager.RetrieveProductsResponse) obj;

    boolean result = true;
    result = result && getProductList()
        .equals(other.getProductList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getProductCount() > 0) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProductList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lager.RetrieveProductsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.RetrieveProductsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.RetrieveProductsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.RetrieveProductsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.RetrieveProductsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.RetrieveProductsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.RetrieveProductsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lager.RetrieveProductsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lager.RetrieveProductsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lager.RetrieveProductsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lager.RetrieveProductsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lager.RetrieveProductsResponse parseFrom(
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
  public static Builder newBuilder(lager.RetrieveProductsResponse prototype) {
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
   * Protobuf type {@code lager.RetrieveProductsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lager.RetrieveProductsResponse)
      lager.RetrieveProductsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lager.WarehouseOuterClass.internal_static_lager_RetrieveProductsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lager.WarehouseOuterClass.internal_static_lager_RetrieveProductsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lager.RetrieveProductsResponse.class, lager.RetrieveProductsResponse.Builder.class);
    }

    // Construct using lager.RetrieveProductsResponse.newBuilder()
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
        getProductFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (productBuilder_ == null) {
        product_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lager.WarehouseOuterClass.internal_static_lager_RetrieveProductsResponse_descriptor;
    }

    public lager.RetrieveProductsResponse getDefaultInstanceForType() {
      return lager.RetrieveProductsResponse.getDefaultInstance();
    }

    public lager.RetrieveProductsResponse build() {
      lager.RetrieveProductsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lager.RetrieveProductsResponse buildPartial() {
      lager.RetrieveProductsResponse result = new lager.RetrieveProductsResponse(this);
      int from_bitField0_ = bitField0_;
      if (productBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          product_ = java.util.Collections.unmodifiableList(product_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
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
      if (other instanceof lager.RetrieveProductsResponse) {
        return mergeFrom((lager.RetrieveProductsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lager.RetrieveProductsResponse other) {
      if (other == lager.RetrieveProductsResponse.getDefaultInstance()) return this;
      if (productBuilder_ == null) {
        if (!other.product_.isEmpty()) {
          if (product_.isEmpty()) {
            product_ = other.product_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductIsMutable();
            product_.addAll(other.product_);
          }
          onChanged();
        }
      } else {
        if (!other.product_.isEmpty()) {
          if (productBuilder_.isEmpty()) {
            productBuilder_.dispose();
            productBuilder_ = null;
            product_ = other.product_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductFieldBuilder() : null;
          } else {
            productBuilder_.addAllMessages(other.product_);
          }
        }
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
      lager.RetrieveProductsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lager.RetrieveProductsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<lager.Product> product_ =
      java.util.Collections.emptyList();
    private void ensureProductIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        product_ = new java.util.ArrayList<lager.Product>(product_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        lager.Product, lager.Product.Builder, lager.ProductOrBuilder> productBuilder_;

    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public java.util.List<lager.Product> getProductList() {
      if (productBuilder_ == null) {
        return java.util.Collections.unmodifiableList(product_);
      } else {
        return productBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public int getProductCount() {
      if (productBuilder_ == null) {
        return product_.size();
      } else {
        return productBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public lager.Product getProduct(int index) {
      if (productBuilder_ == null) {
        return product_.get(index);
      } else {
        return productBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public Builder setProduct(
        int index, lager.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductIsMutable();
        product_.set(index, value);
        onChanged();
      } else {
        productBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public Builder setProduct(
        int index, lager.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.set(index, builderForValue.build());
        onChanged();
      } else {
        productBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public Builder addProduct(lager.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductIsMutable();
        product_.add(value);
        onChanged();
      } else {
        productBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public Builder addProduct(
        int index, lager.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductIsMutable();
        product_.add(index, value);
        onChanged();
      } else {
        productBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public Builder addProduct(
        lager.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.add(builderForValue.build());
        onChanged();
      } else {
        productBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public Builder addProduct(
        int index, lager.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.add(index, builderForValue.build());
        onChanged();
      } else {
        productBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public Builder addAllProduct(
        java.lang.Iterable<? extends lager.Product> values) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, product_);
        onChanged();
      } else {
        productBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public Builder removeProduct(int index) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.remove(index);
        onChanged();
      } else {
        productBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public lager.Product.Builder getProductBuilder(
        int index) {
      return getProductFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public lager.ProductOrBuilder getProductOrBuilder(
        int index) {
      if (productBuilder_ == null) {
        return product_.get(index);  } else {
        return productBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public java.util.List<? extends lager.ProductOrBuilder> 
         getProductOrBuilderList() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(product_);
      }
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public lager.Product.Builder addProductBuilder() {
      return getProductFieldBuilder().addBuilder(
          lager.Product.getDefaultInstance());
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public lager.Product.Builder addProductBuilder(
        int index) {
      return getProductFieldBuilder().addBuilder(
          index, lager.Product.getDefaultInstance());
    }
    /**
     * <code>repeated .lager.Product product = 1;</code>
     */
    public java.util.List<lager.Product.Builder> 
         getProductBuilderList() {
      return getProductFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        lager.Product, lager.Product.Builder, lager.ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            lager.Product, lager.Product.Builder, lager.ProductOrBuilder>(
                product_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:lager.RetrieveProductsResponse)
  }

  // @@protoc_insertion_point(class_scope:lager.RetrieveProductsResponse)
  private static final lager.RetrieveProductsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lager.RetrieveProductsResponse();
  }

  public static lager.RetrieveProductsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetrieveProductsResponse>
      PARSER = new com.google.protobuf.AbstractParser<RetrieveProductsResponse>() {
    public RetrieveProductsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RetrieveProductsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RetrieveProductsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetrieveProductsResponse> getParserForType() {
    return PARSER;
  }

  public lager.RetrieveProductsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

