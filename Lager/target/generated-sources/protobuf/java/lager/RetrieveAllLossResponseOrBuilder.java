// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: warehouse.proto

package lager;

public interface RetrieveAllLossResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lager.RetrieveAllLossResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .lager.Loss loss = 1;</code>
   */
  java.util.List<lager.Loss> 
      getLossList();
  /**
   * <code>repeated .lager.Loss loss = 1;</code>
   */
  lager.Loss getLoss(int index);
  /**
   * <code>repeated .lager.Loss loss = 1;</code>
   */
  int getLossCount();
  /**
   * <code>repeated .lager.Loss loss = 1;</code>
   */
  java.util.List<? extends lager.LossOrBuilder> 
      getLossOrBuilderList();
  /**
   * <code>repeated .lager.Loss loss = 1;</code>
   */
  lager.LossOrBuilder getLossOrBuilder(
      int index);
}
