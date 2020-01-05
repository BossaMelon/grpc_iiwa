// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_iiwa.proto

package io.grpc.iiwaService;

/**
 * Protobuf type {@code python_cartesian_pose_request}
 */
public  final class python_cartesian_pose_request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:python_cartesian_pose_request)
    python_cartesian_pose_requestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use python_cartesian_pose_request.newBuilder() to construct.
  private python_cartesian_pose_request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private python_cartesian_pose_request() {
    x_ = 0D;
    y_ = 0D;
    z_ = 0D;
    a_ = 0D;
    b_ = 0D;
    c_ = 0D;
    velocity_ = 0D;
    mode_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private python_cartesian_pose_request(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 9: {

            x_ = input.readDouble();
            break;
          }
          case 17: {

            y_ = input.readDouble();
            break;
          }
          case 25: {

            z_ = input.readDouble();
            break;
          }
          case 33: {

            a_ = input.readDouble();
            break;
          }
          case 41: {

            b_ = input.readDouble();
            break;
          }
          case 49: {

            c_ = input.readDouble();
            break;
          }
          case 57: {

            velocity_ = input.readDouble();
            break;
          }
          case 64: {

            mode_ = input.readBool();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.iiwaService.GrpcIiwa.internal_static_python_cartesian_pose_request_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.iiwaService.GrpcIiwa.internal_static_python_cartesian_pose_request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.iiwaService.python_cartesian_pose_request.class, io.grpc.iiwaService.python_cartesian_pose_request.Builder.class);
  }

  public static final int X_FIELD_NUMBER = 1;
  private double x_;
  /**
   * <code>double X = 1;</code>
   */
  public double getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 2;
  private double y_;
  /**
   * <code>double Y = 2;</code>
   */
  public double getY() {
    return y_;
  }

  public static final int Z_FIELD_NUMBER = 3;
  private double z_;
  /**
   * <code>double Z = 3;</code>
   */
  public double getZ() {
    return z_;
  }

  public static final int A_FIELD_NUMBER = 4;
  private double a_;
  /**
   * <code>double A = 4;</code>
   */
  public double getA() {
    return a_;
  }

  public static final int B_FIELD_NUMBER = 5;
  private double b_;
  /**
   * <code>double B = 5;</code>
   */
  public double getB() {
    return b_;
  }

  public static final int C_FIELD_NUMBER = 6;
  private double c_;
  /**
   * <code>double C = 6;</code>
   */
  public double getC() {
    return c_;
  }

  public static final int VELOCITY_FIELD_NUMBER = 7;
  private double velocity_;
  /**
   * <code>double velocity = 7;</code>
   */
  public double getVelocity() {
    return velocity_;
  }

  public static final int MODE_FIELD_NUMBER = 8;
  private boolean mode_;
  /**
   * <code>bool mode = 8;</code>
   */
  public boolean getMode() {
    return mode_;
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
    if (x_ != 0D) {
      output.writeDouble(1, x_);
    }
    if (y_ != 0D) {
      output.writeDouble(2, y_);
    }
    if (z_ != 0D) {
      output.writeDouble(3, z_);
    }
    if (a_ != 0D) {
      output.writeDouble(4, a_);
    }
    if (b_ != 0D) {
      output.writeDouble(5, b_);
    }
    if (c_ != 0D) {
      output.writeDouble(6, c_);
    }
    if (velocity_ != 0D) {
      output.writeDouble(7, velocity_);
    }
    if (mode_ != false) {
      output.writeBool(8, mode_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (x_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, x_);
    }
    if (y_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, y_);
    }
    if (z_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, z_);
    }
    if (a_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, a_);
    }
    if (b_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, b_);
    }
    if (c_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, c_);
    }
    if (velocity_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, velocity_);
    }
    if (mode_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, mode_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.iiwaService.python_cartesian_pose_request)) {
      return super.equals(obj);
    }
    io.grpc.iiwaService.python_cartesian_pose_request other = (io.grpc.iiwaService.python_cartesian_pose_request) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getX())
        == java.lang.Double.doubleToLongBits(
            other.getX()));
    result = result && (
        java.lang.Double.doubleToLongBits(getY())
        == java.lang.Double.doubleToLongBits(
            other.getY()));
    result = result && (
        java.lang.Double.doubleToLongBits(getZ())
        == java.lang.Double.doubleToLongBits(
            other.getZ()));
    result = result && (
        java.lang.Double.doubleToLongBits(getA())
        == java.lang.Double.doubleToLongBits(
            other.getA()));
    result = result && (
        java.lang.Double.doubleToLongBits(getB())
        == java.lang.Double.doubleToLongBits(
            other.getB()));
    result = result && (
        java.lang.Double.doubleToLongBits(getC())
        == java.lang.Double.doubleToLongBits(
            other.getC()));
    result = result && (
        java.lang.Double.doubleToLongBits(getVelocity())
        == java.lang.Double.doubleToLongBits(
            other.getVelocity()));
    result = result && (getMode()
        == other.getMode());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + X_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getX()));
    hash = (37 * hash) + Y_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getY()));
    hash = (37 * hash) + Z_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getZ()));
    hash = (37 * hash) + A_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getA()));
    hash = (37 * hash) + B_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getB()));
    hash = (37 * hash) + C_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getC()));
    hash = (37 * hash) + VELOCITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getVelocity()));
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMode());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.iiwaService.python_cartesian_pose_request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.iiwaService.python_cartesian_pose_request parseFrom(
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
  public static Builder newBuilder(io.grpc.iiwaService.python_cartesian_pose_request prototype) {
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
   * Protobuf type {@code python_cartesian_pose_request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:python_cartesian_pose_request)
      io.grpc.iiwaService.python_cartesian_pose_requestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.iiwaService.GrpcIiwa.internal_static_python_cartesian_pose_request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.iiwaService.GrpcIiwa.internal_static_python_cartesian_pose_request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.iiwaService.python_cartesian_pose_request.class, io.grpc.iiwaService.python_cartesian_pose_request.Builder.class);
    }

    // Construct using io.grpc.iiwaService.python_cartesian_pose_request.newBuilder()
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
      x_ = 0D;

      y_ = 0D;

      z_ = 0D;

      a_ = 0D;

      b_ = 0D;

      c_ = 0D;

      velocity_ = 0D;

      mode_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.iiwaService.GrpcIiwa.internal_static_python_cartesian_pose_request_descriptor;
    }

    public io.grpc.iiwaService.python_cartesian_pose_request getDefaultInstanceForType() {
      return io.grpc.iiwaService.python_cartesian_pose_request.getDefaultInstance();
    }

    public io.grpc.iiwaService.python_cartesian_pose_request build() {
      io.grpc.iiwaService.python_cartesian_pose_request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.iiwaService.python_cartesian_pose_request buildPartial() {
      io.grpc.iiwaService.python_cartesian_pose_request result = new io.grpc.iiwaService.python_cartesian_pose_request(this);
      result.x_ = x_;
      result.y_ = y_;
      result.z_ = z_;
      result.a_ = a_;
      result.b_ = b_;
      result.c_ = c_;
      result.velocity_ = velocity_;
      result.mode_ = mode_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.iiwaService.python_cartesian_pose_request) {
        return mergeFrom((io.grpc.iiwaService.python_cartesian_pose_request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.iiwaService.python_cartesian_pose_request other) {
      if (other == io.grpc.iiwaService.python_cartesian_pose_request.getDefaultInstance()) return this;
      if (other.getX() != 0D) {
        setX(other.getX());
      }
      if (other.getY() != 0D) {
        setY(other.getY());
      }
      if (other.getZ() != 0D) {
        setZ(other.getZ());
      }
      if (other.getA() != 0D) {
        setA(other.getA());
      }
      if (other.getB() != 0D) {
        setB(other.getB());
      }
      if (other.getC() != 0D) {
        setC(other.getC());
      }
      if (other.getVelocity() != 0D) {
        setVelocity(other.getVelocity());
      }
      if (other.getMode() != false) {
        setMode(other.getMode());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.grpc.iiwaService.python_cartesian_pose_request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.iiwaService.python_cartesian_pose_request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double x_ ;
    /**
     * <code>double X = 1;</code>
     */
    public double getX() {
      return x_;
    }
    /**
     * <code>double X = 1;</code>
     */
    public Builder setX(double value) {
      
      x_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double X = 1;</code>
     */
    public Builder clearX() {
      
      x_ = 0D;
      onChanged();
      return this;
    }

    private double y_ ;
    /**
     * <code>double Y = 2;</code>
     */
    public double getY() {
      return y_;
    }
    /**
     * <code>double Y = 2;</code>
     */
    public Builder setY(double value) {
      
      y_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double Y = 2;</code>
     */
    public Builder clearY() {
      
      y_ = 0D;
      onChanged();
      return this;
    }

    private double z_ ;
    /**
     * <code>double Z = 3;</code>
     */
    public double getZ() {
      return z_;
    }
    /**
     * <code>double Z = 3;</code>
     */
    public Builder setZ(double value) {
      
      z_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double Z = 3;</code>
     */
    public Builder clearZ() {
      
      z_ = 0D;
      onChanged();
      return this;
    }

    private double a_ ;
    /**
     * <code>double A = 4;</code>
     */
    public double getA() {
      return a_;
    }
    /**
     * <code>double A = 4;</code>
     */
    public Builder setA(double value) {
      
      a_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double A = 4;</code>
     */
    public Builder clearA() {
      
      a_ = 0D;
      onChanged();
      return this;
    }

    private double b_ ;
    /**
     * <code>double B = 5;</code>
     */
    public double getB() {
      return b_;
    }
    /**
     * <code>double B = 5;</code>
     */
    public Builder setB(double value) {
      
      b_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double B = 5;</code>
     */
    public Builder clearB() {
      
      b_ = 0D;
      onChanged();
      return this;
    }

    private double c_ ;
    /**
     * <code>double C = 6;</code>
     */
    public double getC() {
      return c_;
    }
    /**
     * <code>double C = 6;</code>
     */
    public Builder setC(double value) {
      
      c_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double C = 6;</code>
     */
    public Builder clearC() {
      
      c_ = 0D;
      onChanged();
      return this;
    }

    private double velocity_ ;
    /**
     * <code>double velocity = 7;</code>
     */
    public double getVelocity() {
      return velocity_;
    }
    /**
     * <code>double velocity = 7;</code>
     */
    public Builder setVelocity(double value) {
      
      velocity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double velocity = 7;</code>
     */
    public Builder clearVelocity() {
      
      velocity_ = 0D;
      onChanged();
      return this;
    }

    private boolean mode_ ;
    /**
     * <code>bool mode = 8;</code>
     */
    public boolean getMode() {
      return mode_;
    }
    /**
     * <code>bool mode = 8;</code>
     */
    public Builder setMode(boolean value) {
      
      mode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool mode = 8;</code>
     */
    public Builder clearMode() {
      
      mode_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:python_cartesian_pose_request)
  }

  // @@protoc_insertion_point(class_scope:python_cartesian_pose_request)
  private static final io.grpc.iiwaService.python_cartesian_pose_request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.iiwaService.python_cartesian_pose_request();
  }

  public static io.grpc.iiwaService.python_cartesian_pose_request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<python_cartesian_pose_request>
      PARSER = new com.google.protobuf.AbstractParser<python_cartesian_pose_request>() {
    public python_cartesian_pose_request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new python_cartesian_pose_request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<python_cartesian_pose_request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<python_cartesian_pose_request> getParserForType() {
    return PARSER;
  }

  public io.grpc.iiwaService.python_cartesian_pose_request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

