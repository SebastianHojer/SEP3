// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: warehouse.proto

package lager;

/**
 * Protobuf type {@code lager.Product}
 */
public  final class Product extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lager.Product)
    ProductOrBuilder {
  // Use Product.newBuilder() to construct.
  private Product(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Product() {
    ean_ = 0L;
    productName_ = "";
    stock_ = 0;
    photoPath_ = "";
    location_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Product(
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
          case 8: {

            ean_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            productName_ = s;
            break;
          }
          case 24: {

            stock_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            photoPath_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              location_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000010;
            }
            location_.add(s);
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        location_ = location_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lager.WarehouseOuterClass.internal_static_lager_Product_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lager.WarehouseOuterClass.internal_static_lager_Product_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lager.Product.class, lager.Product.Builder.class);
  }

  private int bitField0_;
  public static final int EAN_FIELD_NUMBER = 1;
  private long ean_;
  /**
   * <code>int64 ean = 1;</code>
   */
  public long getEan() {
    return ean_;
  }

  public static final int PRODUCTNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object productName_;
  /**
   * <code>string productName = 2;</code>
   */
  public java.lang.String getProductName() {
    java.lang.Object ref = productName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productName_ = s;
      return s;
    }
  }
  /**
   * <code>string productName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProductNameBytes() {
    java.lang.Object ref = productName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STOCK_FIELD_NUMBER = 3;
  private int stock_;
  /**
   * <code>int32 stock = 3;</code>
   */
  public int getStock() {
    return stock_;
  }

  public static final int PHOTOPATH_FIELD_NUMBER = 4;
  private volatile java.lang.Object photoPath_;
  /**
   * <code>string photoPath = 4;</code>
   */
  public java.lang.String getPhotoPath() {
    java.lang.Object ref = photoPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      photoPath_ = s;
      return s;
    }
  }
  /**
   * <code>string photoPath = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPhotoPathBytes() {
    java.lang.Object ref = photoPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      photoPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList location_;
  /**
   * <code>repeated string location = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getLocationList() {
    return location_;
  }
  /**
   * <code>repeated string location = 5;</code>
   */
  public int getLocationCount() {
    return location_.size();
  }
  /**
   * <code>repeated string location = 5;</code>
   */
  public java.lang.String getLocation(int index) {
    return location_.get(index);
  }
  /**
   * <code>repeated string location = 5;</code>
   */
  public com.google.protobuf.ByteString
      getLocationBytes(int index) {
    return location_.getByteString(index);
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
    if (ean_ != 0L) {
      output.writeInt64(1, ean_);
    }
    if (!getProductNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, productName_);
    }
    if (stock_ != 0) {
      output.writeInt32(3, stock_);
    }
    if (!getPhotoPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, photoPath_);
    }
    for (int i = 0; i < location_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, location_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ean_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, ean_);
    }
    if (!getProductNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, productName_);
    }
    if (stock_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, stock_);
    }
    if (!getPhotoPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, photoPath_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < location_.size(); i++) {
        dataSize += computeStringSizeNoTag(location_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLocationList().size();
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
    if (!(obj instanceof lager.Product)) {
      return super.equals(obj);
    }
    lager.Product other = (lager.Product) obj;

    boolean result = true;
    result = result && (getEan()
        == other.getEan());
    result = result && getProductName()
        .equals(other.getProductName());
    result = result && (getStock()
        == other.getStock());
    result = result && getPhotoPath()
        .equals(other.getPhotoPath());
    result = result && getLocationList()
        .equals(other.getLocationList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EAN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEan());
    hash = (37 * hash) + PRODUCTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getProductName().hashCode();
    hash = (37 * hash) + STOCK_FIELD_NUMBER;
    hash = (53 * hash) + getStock();
    hash = (37 * hash) + PHOTOPATH_FIELD_NUMBER;
    hash = (53 * hash) + getPhotoPath().hashCode();
    if (getLocationCount() > 0) {
      hash = (37 * hash) + LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getLocationList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lager.Product parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.Product parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.Product parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.Product parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.Product parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lager.Product parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lager.Product parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lager.Product parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lager.Product parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lager.Product parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lager.Product parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lager.Product parseFrom(
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
  public static Builder newBuilder(lager.Product prototype) {
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
   * Protobuf type {@code lager.Product}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lager.Product)
      lager.ProductOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lager.WarehouseOuterClass.internal_static_lager_Product_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lager.WarehouseOuterClass.internal_static_lager_Product_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lager.Product.class, lager.Product.Builder.class);
    }

    // Construct using lager.Product.newBuilder()
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
      ean_ = 0L;

      productName_ = "";

      stock_ = 0;

      photoPath_ = "";

      location_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lager.WarehouseOuterClass.internal_static_lager_Product_descriptor;
    }

    public lager.Product getDefaultInstanceForType() {
      return lager.Product.getDefaultInstance();
    }

    public lager.Product build() {
      lager.Product result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lager.Product buildPartial() {
      lager.Product result = new lager.Product(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.ean_ = ean_;
      result.productName_ = productName_;
      result.stock_ = stock_;
      result.photoPath_ = photoPath_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        location_ = location_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.location_ = location_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof lager.Product) {
        return mergeFrom((lager.Product)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lager.Product other) {
      if (other == lager.Product.getDefaultInstance()) return this;
      if (other.getEan() != 0L) {
        setEan(other.getEan());
      }
      if (!other.getProductName().isEmpty()) {
        productName_ = other.productName_;
        onChanged();
      }
      if (other.getStock() != 0) {
        setStock(other.getStock());
      }
      if (!other.getPhotoPath().isEmpty()) {
        photoPath_ = other.photoPath_;
        onChanged();
      }
      if (!other.location_.isEmpty()) {
        if (location_.isEmpty()) {
          location_ = other.location_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureLocationIsMutable();
          location_.addAll(other.location_);
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
      lager.Product parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lager.Product) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long ean_ ;
    /**
     * <code>int64 ean = 1;</code>
     */
    public long getEan() {
      return ean_;
    }
    /**
     * <code>int64 ean = 1;</code>
     */
    public Builder setEan(long value) {
      
      ean_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ean = 1;</code>
     */
    public Builder clearEan() {
      
      ean_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object productName_ = "";
    /**
     * <code>string productName = 2;</code>
     */
    public java.lang.String getProductName() {
      java.lang.Object ref = productName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string productName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProductNameBytes() {
      java.lang.Object ref = productName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string productName = 2;</code>
     */
    public Builder setProductName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string productName = 2;</code>
     */
    public Builder clearProductName() {
      
      productName_ = getDefaultInstance().getProductName();
      onChanged();
      return this;
    }
    /**
     * <code>string productName = 2;</code>
     */
    public Builder setProductNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productName_ = value;
      onChanged();
      return this;
    }

    private int stock_ ;
    /**
     * <code>int32 stock = 3;</code>
     */
    public int getStock() {
      return stock_;
    }
    /**
     * <code>int32 stock = 3;</code>
     */
    public Builder setStock(int value) {
      
      stock_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 stock = 3;</code>
     */
    public Builder clearStock() {
      
      stock_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object photoPath_ = "";
    /**
     * <code>string photoPath = 4;</code>
     */
    public java.lang.String getPhotoPath() {
      java.lang.Object ref = photoPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        photoPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string photoPath = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPhotoPathBytes() {
      java.lang.Object ref = photoPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        photoPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string photoPath = 4;</code>
     */
    public Builder setPhotoPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      photoPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string photoPath = 4;</code>
     */
    public Builder clearPhotoPath() {
      
      photoPath_ = getDefaultInstance().getPhotoPath();
      onChanged();
      return this;
    }
    /**
     * <code>string photoPath = 4;</code>
     */
    public Builder setPhotoPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      photoPath_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList location_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLocationIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        location_ = new com.google.protobuf.LazyStringArrayList(location_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string location = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getLocationList() {
      return location_.getUnmodifiableView();
    }
    /**
     * <code>repeated string location = 5;</code>
     */
    public int getLocationCount() {
      return location_.size();
    }
    /**
     * <code>repeated string location = 5;</code>
     */
    public java.lang.String getLocation(int index) {
      return location_.get(index);
    }
    /**
     * <code>repeated string location = 5;</code>
     */
    public com.google.protobuf.ByteString
        getLocationBytes(int index) {
      return location_.getByteString(index);
    }
    /**
     * <code>repeated string location = 5;</code>
     */
    public Builder setLocation(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLocationIsMutable();
      location_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string location = 5;</code>
     */
    public Builder addLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLocationIsMutable();
      location_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string location = 5;</code>
     */
    public Builder addAllLocation(
        java.lang.Iterable<java.lang.String> values) {
      ensureLocationIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, location_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string location = 5;</code>
     */
    public Builder clearLocation() {
      location_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string location = 5;</code>
     */
    public Builder addLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLocationIsMutable();
      location_.add(value);
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


    // @@protoc_insertion_point(builder_scope:lager.Product)
  }

  // @@protoc_insertion_point(class_scope:lager.Product)
  private static final lager.Product DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lager.Product();
  }

  public static lager.Product getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Product>
      PARSER = new com.google.protobuf.AbstractParser<Product>() {
    public Product parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Product(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Product> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Product> getParserForType() {
    return PARSER;
  }

  public lager.Product getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

