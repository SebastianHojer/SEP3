// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: warehouse.proto

package lager;

public interface ProductCreationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lager.ProductCreationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 ean = 1;</code>
   */
  int getEan();

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
   * <code>string information = 4;</code>
   */
  java.lang.String getInformation();
  /**
   * <code>string information = 4;</code>
   */
  com.google.protobuf.ByteString
      getInformationBytes();
}