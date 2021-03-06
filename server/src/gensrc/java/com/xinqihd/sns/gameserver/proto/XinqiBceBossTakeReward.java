// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceBossTakeReward.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceBossTakeReward {
  private XinqiBceBossTakeReward() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceBossTakeRewardOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string bossid = 1;
    boolean hasBossid();
    String getBossid();
  }
  public static final class BceBossTakeReward extends
      com.google.protobuf.GeneratedMessage
      implements BceBossTakeRewardOrBuilder {
    // Use BceBossTakeReward.newBuilder() to construct.
    private BceBossTakeReward(Builder builder) {
      super(builder);
    }
    private BceBossTakeReward(boolean noInit) {}
    
    private static final BceBossTakeReward defaultInstance;
    public static BceBossTakeReward getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceBossTakeReward getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.internal_static_com_xinqihd_sns_gameserver_proto_BceBossTakeReward_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.internal_static_com_xinqihd_sns_gameserver_proto_BceBossTakeReward_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string bossid = 1;
    public static final int BOSSID_FIELD_NUMBER = 1;
    private java.lang.Object bossid_;
    public boolean hasBossid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getBossid() {
      java.lang.Object ref = bossid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          bossid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getBossidBytes() {
      java.lang.Object ref = bossid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        bossid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      bossid_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasBossid()) {
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
        output.writeBytes(1, getBossidBytes());
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
          .computeBytesSize(1, getBossidBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeRewardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.internal_static_com_xinqihd_sns_gameserver_proto_BceBossTakeReward_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.internal_static_com_xinqihd_sns_gameserver_proto_BceBossTakeReward_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward.newBuilder()
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
        bossid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward result = new com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.bossid_ = bossid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward.getDefaultInstance()) return this;
        if (other.hasBossid()) {
          setBossid(other.getBossid());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasBossid()) {
          
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
            case 10: {
              bitField0_ |= 0x00000001;
              bossid_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string bossid = 1;
      private java.lang.Object bossid_ = "";
      public boolean hasBossid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getBossid() {
        java.lang.Object ref = bossid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          bossid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setBossid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        bossid_ = value;
        onChanged();
        return this;
      }
      public Builder clearBossid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        bossid_ = getDefaultInstance().getBossid();
        onChanged();
        return this;
      }
      void setBossid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        bossid_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceBossTakeReward)
    }
    
    static {
      defaultInstance = new BceBossTakeReward(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceBossTakeReward)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceBossTakeReward_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceBossTakeReward_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BceBossTakeReward.proto\022 com.xinqihd.s" +
      "ns.gameserver.proto\"#\n\021BceBossTakeReward" +
      "\022\016\n\006bossid\030\001 \002(\tB\030B\026XinqiBceBossTakeRewa" +
      "rd"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceBossTakeReward_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceBossTakeReward_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceBossTakeReward_descriptor,
              new java.lang.String[] { "Bossid", },
              com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceBossTakeReward.BceBossTakeReward.Builder.class);
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
