// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseError.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseError {
  private XinqiBseError() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseErrorOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 errorID = 1;
    boolean hasErrorID();
    int getErrorID();
    
    // optional string sessionID = 2;
    boolean hasSessionID();
    String getSessionID();
    
    // optional int32 roomID = 3;
    boolean hasRoomID();
    int getRoomID();
  }
  public static final class BseError extends
      com.google.protobuf.GeneratedMessage
      implements BseErrorOrBuilder {
    // Use BseError.newBuilder() to construct.
    private BseError(Builder builder) {
      super(builder);
    }
    private BseError(boolean noInit) {}
    
    private static final BseError defaultInstance;
    public static BseError getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseError getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseError.internal_static_com_xinqihd_sns_gameserver_proto_BseError_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseError.internal_static_com_xinqihd_sns_gameserver_proto_BseError_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 errorID = 1;
    public static final int ERRORID_FIELD_NUMBER = 1;
    private int errorID_;
    public boolean hasErrorID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getErrorID() {
      return errorID_;
    }
    
    // optional string sessionID = 2;
    public static final int SESSIONID_FIELD_NUMBER = 2;
    private java.lang.Object sessionID_;
    public boolean hasSessionID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getSessionID() {
      java.lang.Object ref = sessionID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          sessionID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSessionIDBytes() {
      java.lang.Object ref = sessionID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        sessionID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 roomID = 3;
    public static final int ROOMID_FIELD_NUMBER = 3;
    private int roomID_;
    public boolean hasRoomID() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getRoomID() {
      return roomID_;
    }
    
    private void initFields() {
      errorID_ = 0;
      sessionID_ = "";
      roomID_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasErrorID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, errorID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getSessionIDBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, roomID_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, errorID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getSessionIDBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, roomID_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xinqihd.sns.gameserver.proto.XinqiBseError.BseErrorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseError.internal_static_com_xinqihd_sns_gameserver_proto_BseError_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseError.internal_static_com_xinqihd_sns_gameserver_proto_BseError_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        errorID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        sessionID_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        roomID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError result = new com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.errorID_ = errorID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.sessionID_ = sessionID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.roomID_ = roomID_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError.getDefaultInstance()) return this;
        if (other.hasErrorID()) {
          setErrorID(other.getErrorID());
        }
        if (other.hasSessionID()) {
          setSessionID(other.getSessionID());
        }
        if (other.hasRoomID()) {
          setRoomID(other.getRoomID());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasErrorID()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              errorID_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              sessionID_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              roomID_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 errorID = 1;
      private int errorID_ ;
      public boolean hasErrorID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getErrorID() {
        return errorID_;
      }
      public Builder setErrorID(int value) {
        bitField0_ |= 0x00000001;
        errorID_ = value;
        onChanged();
        return this;
      }
      public Builder clearErrorID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        errorID_ = 0;
        onChanged();
        return this;
      }
      
      // optional string sessionID = 2;
      private java.lang.Object sessionID_ = "";
      public boolean hasSessionID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getSessionID() {
        java.lang.Object ref = sessionID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          sessionID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSessionID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        sessionID_ = value;
        onChanged();
        return this;
      }
      public Builder clearSessionID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sessionID_ = getDefaultInstance().getSessionID();
        onChanged();
        return this;
      }
      void setSessionID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        sessionID_ = value;
        onChanged();
      }
      
      // optional int32 roomID = 3;
      private int roomID_ ;
      public boolean hasRoomID() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getRoomID() {
        return roomID_;
      }
      public Builder setRoomID(int value) {
        bitField0_ |= 0x00000004;
        roomID_ = value;
        onChanged();
        return this;
      }
      public Builder clearRoomID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        roomID_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseError)
    }
    
    static {
      defaultInstance = new BseError(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseError)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseError_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseError_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016BseError.proto\022 com.xinqihd.sns.gamese" +
      "rver.proto\">\n\010BseError\022\017\n\007errorID\030\001 \002(\005\022" +
      "\021\n\tsessionID\030\002 \001(\t\022\016\n\006roomID\030\003 \001(\005B\017B\rXi" +
      "nqiBseError"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseError_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseError_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseError_descriptor,
              new java.lang.String[] { "ErrorID", "SessionID", "RoomID", },
              com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseError.BseError.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
