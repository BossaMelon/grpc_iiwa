// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_iiwa.proto

package io.grpc.iiwaService;

public interface python_cartesian_position_requestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:python_cartesian_position_request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double X = 1;</code>
   */
  double getX();

  /**
   * <code>double Y = 2;</code>
   */
  double getY();

  /**
   * <code>double Z = 3;</code>
   */
  double getZ();

  /**
   * <code>double velocity = 4;</code>
   */
  double getVelocity();

  /**
   * <code>bool mode = 5;</code>
   */
  boolean getMode();
}