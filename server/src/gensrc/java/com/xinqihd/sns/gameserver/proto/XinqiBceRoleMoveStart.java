// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceRoleMoveStart.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceRoleMoveStart {
  private XinqiBceRoleMoveStart() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceRoleMoveStartOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required uint32 frame = 1;
    boolean hasFrame();
    int getFrame();
    
    // required uint32 direction = 2;
    boolean hasDirection();
    int getDirection();
  }
  public static final class BceRoleMoveStart extends
      com.google.protobuf.GeneratedMessage
      implements BceRoleMoveStartOrBuilder {
    // Use BceRoleMoveStart.newBuilder() to construct.
    private BceRoleMoveStart(Builder builder) {
      super(builder);
    }
    private BceRoleMoveStart(boolean noInit) {}
    
    private static final BceRoleMoveStart defaultInstance;
    public static BceRoleMoveStart getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceRoleMoveStart getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStart_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStart_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required uint32 frame = 1;
    public static final int FRAME_FIELD_NUMBER = 1;
    private int frame_;
    public boolean hasFrame() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getFrame() {
      return frame_;
    }
    
    // required uint32 direction = 2;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    private int direction_;
    public boolean hasDirection() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getDirection() {
      return direction_;
    }
    
    private void initFields() {
      frame_ = 0;
      direction_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasFrame()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDirection()) {
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
        output.writeUInt32(1, frame_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, direction_);
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
          .computeUInt32Size(1, frame_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, direction_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStartOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStart_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStart_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart.newBuilder()
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
        frame_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        direction_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart result = new com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.frame_ = frame_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.direction_ = direction_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart.getDefaultInstance()) return this;
        if (other.hasFrame()) {
          setFrame(other.getFrame());
        }
        if (other.hasDirection()) {
          setDirection(other.getDirection());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasFrame()) {
          
          return false;
        }
        if (!hasDirection()) {
          
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
              frame_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              direction_ = input.readUInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required uint32 frame = 1;
      private int frame_ ;
      public boolean hasFrame() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getFrame() {
        return frame_;
      }
      public Builder setFrame(int value) {
        bitField0_ |= 0x00000001;
        frame_ = value;
        onChanged();
        return this;
      }
      public Builder clearFrame() {
        bitField0_ = (bitField0_ & ~0x00000001);
        frame_ = 0;
        onChanged();
        return this;
      }
      
      // required uint32 direction = 2;
      private int direction_ ;
      public boolean hasDirection() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getDirection() {
        return direction_;
      }
      public Builder setDirection(int value) {
        bitField0_ |= 0x00000002;
        direction_ = value;
        onChanged();
        return this;
      }
      public Builder clearDirection() {
        bitField0_ = (bitField0_ & ~0x00000002);
        direction_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceRoleMoveStart)
    }
    
    static {
      defaultInstance = new BceRoleMoveStart(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceRoleMoveStart)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStart_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStart_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026BceRoleMoveStart.proto\022 com.xinqihd.sn" +
      "s.gameserver.proto\"4\n\020BceRoleMoveStart\022\r" +
      "\n\005frame\030\001 \002(\r\022\021\n\tdirection\030\002 \002(\rB\027B\025Xinq" +
      "iBceRoleMoveStart"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStart_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStart_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceRoleMoveStart_descriptor,
              new java.lang.String[] { "Frame", "Direction", },
              com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceRoleMoveStart.BceRoleMoveStart.Builder.class);
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
