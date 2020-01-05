package io.grpc.iiwaService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: grpc_iiwa.proto")
public final class iiwaServiceGrpc {

  private iiwaServiceGrpc() {}

  public static final String SERVICE_NAME = "iiwaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.iiwaService.python_request,
      io.grpc.iiwaService.robot_cartesian_position_reply> getAskCartesianPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "askCartesianPosition",
      requestType = io.grpc.iiwaService.python_request.class,
      responseType = io.grpc.iiwaService.robot_cartesian_position_reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.iiwaService.python_request,
      io.grpc.iiwaService.robot_cartesian_position_reply> getAskCartesianPositionMethod() {
    io.grpc.MethodDescriptor<io.grpc.iiwaService.python_request, io.grpc.iiwaService.robot_cartesian_position_reply> getAskCartesianPositionMethod;
    if ((getAskCartesianPositionMethod = iiwaServiceGrpc.getAskCartesianPositionMethod) == null) {
      synchronized (iiwaServiceGrpc.class) {
        if ((getAskCartesianPositionMethod = iiwaServiceGrpc.getAskCartesianPositionMethod) == null) {
          iiwaServiceGrpc.getAskCartesianPositionMethod = getAskCartesianPositionMethod = 
              io.grpc.MethodDescriptor.<io.grpc.iiwaService.python_request, io.grpc.iiwaService.robot_cartesian_position_reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iiwaService", "askCartesianPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.python_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.robot_cartesian_position_reply.getDefaultInstance()))
                  .setSchemaDescriptor(new iiwaServiceMethodDescriptorSupplier("askCartesianPosition"))
                  .build();
          }
        }
     }
     return getAskCartesianPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.iiwaService.python_request,
      io.grpc.iiwaService.robot_joint_position_reply> getAskJointPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "askJointPosition",
      requestType = io.grpc.iiwaService.python_request.class,
      responseType = io.grpc.iiwaService.robot_joint_position_reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.iiwaService.python_request,
      io.grpc.iiwaService.robot_joint_position_reply> getAskJointPositionMethod() {
    io.grpc.MethodDescriptor<io.grpc.iiwaService.python_request, io.grpc.iiwaService.robot_joint_position_reply> getAskJointPositionMethod;
    if ((getAskJointPositionMethod = iiwaServiceGrpc.getAskJointPositionMethod) == null) {
      synchronized (iiwaServiceGrpc.class) {
        if ((getAskJointPositionMethod = iiwaServiceGrpc.getAskJointPositionMethod) == null) {
          iiwaServiceGrpc.getAskJointPositionMethod = getAskJointPositionMethod = 
              io.grpc.MethodDescriptor.<io.grpc.iiwaService.python_request, io.grpc.iiwaService.robot_joint_position_reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iiwaService", "askJointPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.python_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.robot_joint_position_reply.getDefaultInstance()))
                  .setSchemaDescriptor(new iiwaServiceMethodDescriptorSupplier("askJointPosition"))
                  .build();
          }
        }
     }
     return getAskJointPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.iiwaService.python_cartesian_position_request,
      io.grpc.iiwaService.robot_reply> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "move",
      requestType = io.grpc.iiwaService.python_cartesian_position_request.class,
      responseType = io.grpc.iiwaService.robot_reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.iiwaService.python_cartesian_position_request,
      io.grpc.iiwaService.robot_reply> getMoveMethod() {
    io.grpc.MethodDescriptor<io.grpc.iiwaService.python_cartesian_position_request, io.grpc.iiwaService.robot_reply> getMoveMethod;
    if ((getMoveMethod = iiwaServiceGrpc.getMoveMethod) == null) {
      synchronized (iiwaServiceGrpc.class) {
        if ((getMoveMethod = iiwaServiceGrpc.getMoveMethod) == null) {
          iiwaServiceGrpc.getMoveMethod = getMoveMethod = 
              io.grpc.MethodDescriptor.<io.grpc.iiwaService.python_cartesian_position_request, io.grpc.iiwaService.robot_reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iiwaService", "move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.python_cartesian_position_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.robot_reply.getDefaultInstance()))
                  .setSchemaDescriptor(new iiwaServiceMethodDescriptorSupplier("move"))
                  .build();
          }
        }
     }
     return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.iiwaService.python_cartesian_pose_request,
      io.grpc.iiwaService.robot_reply> getMoveWithOrientationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "move_with_orientation",
      requestType = io.grpc.iiwaService.python_cartesian_pose_request.class,
      responseType = io.grpc.iiwaService.robot_reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.iiwaService.python_cartesian_pose_request,
      io.grpc.iiwaService.robot_reply> getMoveWithOrientationMethod() {
    io.grpc.MethodDescriptor<io.grpc.iiwaService.python_cartesian_pose_request, io.grpc.iiwaService.robot_reply> getMoveWithOrientationMethod;
    if ((getMoveWithOrientationMethod = iiwaServiceGrpc.getMoveWithOrientationMethod) == null) {
      synchronized (iiwaServiceGrpc.class) {
        if ((getMoveWithOrientationMethod = iiwaServiceGrpc.getMoveWithOrientationMethod) == null) {
          iiwaServiceGrpc.getMoveWithOrientationMethod = getMoveWithOrientationMethod = 
              io.grpc.MethodDescriptor.<io.grpc.iiwaService.python_cartesian_pose_request, io.grpc.iiwaService.robot_reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iiwaService", "move_with_orientation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.python_cartesian_pose_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.robot_reply.getDefaultInstance()))
                  .setSchemaDescriptor(new iiwaServiceMethodDescriptorSupplier("move_with_orientation"))
                  .build();
          }
        }
     }
     return getMoveWithOrientationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.iiwaService.force_condition,
      io.grpc.iiwaService.robot_reply> getAutoDownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "auto_down",
      requestType = io.grpc.iiwaService.force_condition.class,
      responseType = io.grpc.iiwaService.robot_reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.iiwaService.force_condition,
      io.grpc.iiwaService.robot_reply> getAutoDownMethod() {
    io.grpc.MethodDescriptor<io.grpc.iiwaService.force_condition, io.grpc.iiwaService.robot_reply> getAutoDownMethod;
    if ((getAutoDownMethod = iiwaServiceGrpc.getAutoDownMethod) == null) {
      synchronized (iiwaServiceGrpc.class) {
        if ((getAutoDownMethod = iiwaServiceGrpc.getAutoDownMethod) == null) {
          iiwaServiceGrpc.getAutoDownMethod = getAutoDownMethod = 
              io.grpc.MethodDescriptor.<io.grpc.iiwaService.force_condition, io.grpc.iiwaService.robot_reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iiwaService", "auto_down"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.force_condition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.robot_reply.getDefaultInstance()))
                  .setSchemaDescriptor(new iiwaServiceMethodDescriptorSupplier("auto_down"))
                  .build();
          }
        }
     }
     return getAutoDownMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.iiwaService.python_cartesian_pose_request,
      io.grpc.iiwaService.robot_reply> getHoldPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hold_position",
      requestType = io.grpc.iiwaService.python_cartesian_pose_request.class,
      responseType = io.grpc.iiwaService.robot_reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.iiwaService.python_cartesian_pose_request,
      io.grpc.iiwaService.robot_reply> getHoldPositionMethod() {
    io.grpc.MethodDescriptor<io.grpc.iiwaService.python_cartesian_pose_request, io.grpc.iiwaService.robot_reply> getHoldPositionMethod;
    if ((getHoldPositionMethod = iiwaServiceGrpc.getHoldPositionMethod) == null) {
      synchronized (iiwaServiceGrpc.class) {
        if ((getHoldPositionMethod = iiwaServiceGrpc.getHoldPositionMethod) == null) {
          iiwaServiceGrpc.getHoldPositionMethod = getHoldPositionMethod = 
              io.grpc.MethodDescriptor.<io.grpc.iiwaService.python_cartesian_pose_request, io.grpc.iiwaService.robot_reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "iiwaService", "hold_position"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.python_cartesian_pose_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.iiwaService.robot_reply.getDefaultInstance()))
                  .setSchemaDescriptor(new iiwaServiceMethodDescriptorSupplier("hold_position"))
                  .build();
          }
        }
     }
     return getHoldPositionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static iiwaServiceStub newStub(io.grpc.Channel channel) {
    return new iiwaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static iiwaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new iiwaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static iiwaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new iiwaServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class iiwaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void askCartesianPosition(io.grpc.iiwaService.python_request request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_cartesian_position_reply> responseObserver) {
      asyncUnimplementedUnaryCall(getAskCartesianPositionMethod(), responseObserver);
    }

    /**
     */
    public void askJointPosition(io.grpc.iiwaService.python_request request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_joint_position_reply> responseObserver) {
      asyncUnimplementedUnaryCall(getAskJointPositionMethod(), responseObserver);
    }

    /**
     */
    public void move(io.grpc.iiwaService.python_cartesian_position_request request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     */
    public void moveWithOrientation(io.grpc.iiwaService.python_cartesian_pose_request request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveWithOrientationMethod(), responseObserver);
    }

    /**
     */
    public void autoDown(io.grpc.iiwaService.force_condition request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply> responseObserver) {
      asyncUnimplementedUnaryCall(getAutoDownMethod(), responseObserver);
    }

    /**
     */
    public void holdPosition(io.grpc.iiwaService.python_cartesian_pose_request request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply> responseObserver) {
      asyncUnimplementedUnaryCall(getHoldPositionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAskCartesianPositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.iiwaService.python_request,
                io.grpc.iiwaService.robot_cartesian_position_reply>(
                  this, METHODID_ASK_CARTESIAN_POSITION)))
          .addMethod(
            getAskJointPositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.iiwaService.python_request,
                io.grpc.iiwaService.robot_joint_position_reply>(
                  this, METHODID_ASK_JOINT_POSITION)))
          .addMethod(
            getMoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.iiwaService.python_cartesian_position_request,
                io.grpc.iiwaService.robot_reply>(
                  this, METHODID_MOVE)))
          .addMethod(
            getMoveWithOrientationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.iiwaService.python_cartesian_pose_request,
                io.grpc.iiwaService.robot_reply>(
                  this, METHODID_MOVE_WITH_ORIENTATION)))
          .addMethod(
            getAutoDownMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.iiwaService.force_condition,
                io.grpc.iiwaService.robot_reply>(
                  this, METHODID_AUTO_DOWN)))
          .addMethod(
            getHoldPositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.iiwaService.python_cartesian_pose_request,
                io.grpc.iiwaService.robot_reply>(
                  this, METHODID_HOLD_POSITION)))
          .build();
    }
  }

  /**
   */
  public static final class iiwaServiceStub extends io.grpc.stub.AbstractStub<iiwaServiceStub> {
    private iiwaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private iiwaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected iiwaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new iiwaServiceStub(channel, callOptions);
    }

    /**
     */
    public void askCartesianPosition(io.grpc.iiwaService.python_request request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_cartesian_position_reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAskCartesianPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void askJointPosition(io.grpc.iiwaService.python_request request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_joint_position_reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAskJointPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void move(io.grpc.iiwaService.python_cartesian_position_request request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void moveWithOrientation(io.grpc.iiwaService.python_cartesian_pose_request request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveWithOrientationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void autoDown(io.grpc.iiwaService.force_condition request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAutoDownMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void holdPosition(io.grpc.iiwaService.python_cartesian_pose_request request,
        io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHoldPositionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class iiwaServiceBlockingStub extends io.grpc.stub.AbstractStub<iiwaServiceBlockingStub> {
    private iiwaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private iiwaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected iiwaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new iiwaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.iiwaService.robot_cartesian_position_reply askCartesianPosition(io.grpc.iiwaService.python_request request) {
      return blockingUnaryCall(
          getChannel(), getAskCartesianPositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.iiwaService.robot_joint_position_reply askJointPosition(io.grpc.iiwaService.python_request request) {
      return blockingUnaryCall(
          getChannel(), getAskJointPositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.iiwaService.robot_reply move(io.grpc.iiwaService.python_cartesian_position_request request) {
      return blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.iiwaService.robot_reply moveWithOrientation(io.grpc.iiwaService.python_cartesian_pose_request request) {
      return blockingUnaryCall(
          getChannel(), getMoveWithOrientationMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.iiwaService.robot_reply autoDown(io.grpc.iiwaService.force_condition request) {
      return blockingUnaryCall(
          getChannel(), getAutoDownMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.iiwaService.robot_reply holdPosition(io.grpc.iiwaService.python_cartesian_pose_request request) {
      return blockingUnaryCall(
          getChannel(), getHoldPositionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class iiwaServiceFutureStub extends io.grpc.stub.AbstractStub<iiwaServiceFutureStub> {
    private iiwaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private iiwaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected iiwaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new iiwaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.iiwaService.robot_cartesian_position_reply> askCartesianPosition(
        io.grpc.iiwaService.python_request request) {
      return futureUnaryCall(
          getChannel().newCall(getAskCartesianPositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.iiwaService.robot_joint_position_reply> askJointPosition(
        io.grpc.iiwaService.python_request request) {
      return futureUnaryCall(
          getChannel().newCall(getAskJointPositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.iiwaService.robot_reply> move(
        io.grpc.iiwaService.python_cartesian_position_request request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.iiwaService.robot_reply> moveWithOrientation(
        io.grpc.iiwaService.python_cartesian_pose_request request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveWithOrientationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.iiwaService.robot_reply> autoDown(
        io.grpc.iiwaService.force_condition request) {
      return futureUnaryCall(
          getChannel().newCall(getAutoDownMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.iiwaService.robot_reply> holdPosition(
        io.grpc.iiwaService.python_cartesian_pose_request request) {
      return futureUnaryCall(
          getChannel().newCall(getHoldPositionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASK_CARTESIAN_POSITION = 0;
  private static final int METHODID_ASK_JOINT_POSITION = 1;
  private static final int METHODID_MOVE = 2;
  private static final int METHODID_MOVE_WITH_ORIENTATION = 3;
  private static final int METHODID_AUTO_DOWN = 4;
  private static final int METHODID_HOLD_POSITION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final iiwaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(iiwaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASK_CARTESIAN_POSITION:
          serviceImpl.askCartesianPosition((io.grpc.iiwaService.python_request) request,
              (io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_cartesian_position_reply>) responseObserver);
          break;
        case METHODID_ASK_JOINT_POSITION:
          serviceImpl.askJointPosition((io.grpc.iiwaService.python_request) request,
              (io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_joint_position_reply>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((io.grpc.iiwaService.python_cartesian_position_request) request,
              (io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply>) responseObserver);
          break;
        case METHODID_MOVE_WITH_ORIENTATION:
          serviceImpl.moveWithOrientation((io.grpc.iiwaService.python_cartesian_pose_request) request,
              (io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply>) responseObserver);
          break;
        case METHODID_AUTO_DOWN:
          serviceImpl.autoDown((io.grpc.iiwaService.force_condition) request,
              (io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply>) responseObserver);
          break;
        case METHODID_HOLD_POSITION:
          serviceImpl.holdPosition((io.grpc.iiwaService.python_cartesian_pose_request) request,
              (io.grpc.stub.StreamObserver<io.grpc.iiwaService.robot_reply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class iiwaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    iiwaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.iiwaService.GrpcIiwa.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("iiwaService");
    }
  }

  private static final class iiwaServiceFileDescriptorSupplier
      extends iiwaServiceBaseDescriptorSupplier {
    iiwaServiceFileDescriptorSupplier() {}
  }

  private static final class iiwaServiceMethodDescriptorSupplier
      extends iiwaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    iiwaServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (iiwaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new iiwaServiceFileDescriptorSupplier())
              .addMethod(getAskCartesianPositionMethod())
              .addMethod(getAskJointPositionMethod())
              .addMethod(getMoveMethod())
              .addMethod(getMoveWithOrientationMethod())
              .addMethod(getAutoDownMethod())
              .addMethod(getHoldPositionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
