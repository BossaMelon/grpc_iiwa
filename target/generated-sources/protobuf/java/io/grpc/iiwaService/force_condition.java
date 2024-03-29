// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_iiwa.proto

package io.grpc.iiwaService;

/**
 * Protobuf type {@code force_condition}
 */
public  final class force_condition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:force_condition)
    force_conditionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use force_condition.newBuilder() to construct.
  private force_condition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private force_condition() {
    force_ = 0D;
    zDistance_ = 0D;
    velocity_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private force_condition(
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

            force_ = input.readDouble();
            break;
          }
          case 17: {

            zDistance_ = input.readDouble();
            break;
          }
          case 25: {

            velocity_ = input.readDouble();
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
    return io.grpc.iiwaService.GrpcIiwa.internal_static_force_condition_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.iiwaService.GrpcIiwa.internal_static_force_condition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.iiwaService.force_condition.class, io.grpc.iiwaService.force_condition.Builder.class);
  }

  public static final int FORCE_FIELD_NUMBER = 1;
  private double force_;
  /**
   * <code>double force = 1;</code>
   */
  public double getForce() {
    return force_;
  }

  public static final int Z_DISTANCE_FIELD_NUMBER = 2;
  private double zDistance_;
  /**
   * <code>double z_distance = 2;</code>
   */
  public double getZDistance() {
    return zDistance_;
  }

  public static final int VELOCITY_FIELD_NUMBER = 3;
  private double velocity_;
  /**
   * <code>double velocity = 3;</code>
   */
  public double getVelocity() {
    return velocity_;
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
    if (force_ != 0D) {
      output.writeDouble(1, force_);
    }
    if (zDistance_ != 0D) {
      output.writeDouble(2, zDistance_);
    }
    if (velocity_ != 0D) {
      output.writeDouble(3, velocity_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (force_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, force_);
    }
    if (zDistance_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, zDistance_);
    }
    if (velocity_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, velocity_);
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
    if (!(obj instanceof io.grpc.iiwaService.force_condition)) {
      return super.equals(obj);
    }
    io.grpc.iiwaService.force_condition other = (io.grpc.iiwaService.force_condition) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getForce())
        == java.lang.Double.doubleToLongBits(
            other.getForce()));
    result = result && (
        java.lang.Double.doubleToLongBits(getZDistance())
        == java.lang.Double.doubleToLongBits(
            other.getZDistance()));
    result = result && (
        java.lang.Double.doubleToLongBits(getVelocity())
        == java.lang.Double.doubleToLongBits(
            other.getVelocity()));
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
    hash = (37 * hash) + FORCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getForce()));
    hash = (37 * hash) + Z_DISTANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getZDistance()));
    hash = (37 * hash) + VELOCITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getVelocity()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.iiwaService.force_condition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.iiwaService.force_condition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.iiwaService.force_condition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.iiwaService.force_condition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.iiwaService.force_condition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.iiwaService.force_condition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.iiwaService.force_condition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.iiwaService.force_condition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.iiwaService.force_condition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.iiwaService.force_condition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.iiwaService.force_condition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.iiwaService.force_condition parseFrom(
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
  public static Builder newBuilder(io.grpc.iiwaService.force_condition prototype) {
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
   * Protobuf type {@code force_condition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:force_condition)
      io.grpc.iiwaService.force_conditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.iiwaService.GrpcIiwa.internal_static_force_condition_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.iiwaService.GrpcIiwa.internal_static_force_condition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.iiwaService.force_condition.class, io.grpc.iiwaService.force_condition.Builder.class);
    }

    // Construct using io.grpc.iiwaService.force_condition.newBuilder()
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
      force_ = 0D;

      zDistance_ = 0D;

      velocity_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.iiwaService.GrpcIiwa.internal_static_force_condition_descriptor;
    }

    public io.grpc.iiwaService.force_condition getDefaultInstanceForType() {
      return io.grpc.iiwaService.force_condition.getDefaultInstance();
    }

    public io.grpc.iiwaService.force_condition build() {
      io.grpc.iiwaService.force_condition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.iiwaService.force_condition buildPartial() {
      io.grpc.iiwaService.force_condition result = new io.grpc.iiwaService.force_condition(this);
      result.force_ = force_;
      result.zDistance_ = zDistance_;
      result.velocity_ = velocity_;
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
      if (other instanceof io.grpc.iiwaService.force_condition) {
        return mergeFrom((io.grpc.iiwaService.force_condition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.iiwaService.force_condition other) {
      if (other == io.grpc.iiwaService.force_condition.getDefaultInstance()) return this;
      if (other.getForce() != 0D) {
        setForce(other.getForce());
      }
      if (other.getZDistance() != 0D) {
        setZDistance(other.getZDistance());
      }
      if (other.getVelocity() != 0D) {
        setVelocity(other.getVelocity());
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
      io.grpc.iiwaService.force_condition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.iiwaService.force_condition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double force_ ;
    /**
     * <code>double force = 1;</code>
     */
    public double getForce() {
      return force_;
    }
    /**
     * <code>double force = 1;</code>
     */
    public Builder setForce(double value) {
      
      force_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double force = 1;</code>
     */
    public Builder clearForce() {
      
      force_ = 0D;
      onChanged();
      return this;
    }

    private double zDistance_ ;
    /**
     * <code>double z_distance = 2;</code>
     */
    public double getZDistance() {
      return zDistance_;
    }
    /**
     * <code>double z_distance = 2;</code>
     */
    public Builder setZDistance(double value) {
      
      zDistance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double z_distance = 2;</code>
     */
    public Builder clearZDistance() {
      
      zDistance_ = 0D;
      onChanged();
      return this;
    }

    private double velocity_ ;
    /**
     * <code>double velocity = 3;</code>
     */
    public double getVelocity() {
      return velocity_;
    }
    /**
     * <code>double velocity = 3;</code>
     */
    public Builder setVelocity(double value) {
      
      velocity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double velocity = 3;</code>
     */
    public Builder clearVelocity() {
      
      velocity_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:force_condition)
  }

  // @@protoc_insertion_point(class_scope:force_condition)
  private static final io.grpc.iiwaService.force_condition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.iiwaService.force_condition();
  }

  public static io.grpc.iiwaService.force_condition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<force_condition>
      PARSER = new com.google.protobuf.AbstractParser<force_condition>() {
    public force_condition parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new force_condition(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<force_condition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<force_condition> getParserForType() {
    return PARSER;
  }

  public io.grpc.iiwaService.force_condition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

