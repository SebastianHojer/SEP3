// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: warehouse.proto

package lager;

public interface ProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lager.Product)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 ean = 1;</code>
   */
  long getEan();

  /**
   * <code>string productName = 2;</code>
   */
  java.lang.String getProductName();
  /**
   * <code>string productName = 2;</code>
   */
  com.google.protobuf.ByteString
      getProductNameBytes();

  /**
   * <code>int32 stock = 3;</code>
   */
  int getStock();

  /**
   * <code>string photoPath = 4;</code>
   */
  java.lang.String getPhotoPath();
  /**
   * <code>string photoPath = 4;</code>
   */
  com.google.protobuf.ByteString
      getPhotoPathBytes();

  /**
   * <code>repeated string location = 5;</code>
   */
  java.util.List<java.lang.String>
      getLocationList();
  /**
   * <code>repeated string location = 5;</code>
   */
  int getLocationCount();
  /**
   * <code>repeated string location = 5;</code>
   */
  java.lang.String getLocation(int index);
  /**
   * <code>repeated string location = 5;</code>
   */
  com.google.protobuf.ByteString
      getLocationBytes(int index);
}
