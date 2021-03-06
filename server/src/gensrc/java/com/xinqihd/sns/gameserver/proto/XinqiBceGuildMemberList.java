// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceGuildMemberList.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceGuildMemberList {
  private XinqiBceGuildMemberList() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceGuildMemberListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional bool online = 1 [default = false];
    boolean hasOnline();
    boolean getOnline();
  }
  public static final class BceGuildMemberList extends
      com.google.protobuf.GeneratedMessage
      implements BceGuildMemberListOrBuilder {
    // Use BceGuildMemberList.newBuilder() to construct.
    private BceGuildMemberList(Builder builder) {
      super(builder);
    }
    private BceGuildMemberList(boolean noInit) {}
    
    private static final BceGuildMemberList defaultInstance;
    public static BceGuildMemberList getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceGuildMemberList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildMemberList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildMemberList_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional bool online = 1 [default = false];
    public static final int ONLINE_FIELD_NUMBER = 1;
    private boolean online_;
    public boolean hasOnline() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getOnline() {
      return online_;
    }
    
    private void initFields() {
      online_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, online_);
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
          .computeBoolSize(1, online_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildMemberList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildMemberList_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList.newBuilder()
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
        online_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList result = new com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.online_ = online_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList.getDefaultInstance()) return this;
        if (other.hasOnline()) {
          setOnline(other.getOnline());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
              online_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional bool online = 1 [default = false];
      private boolean online_ ;
      public boolean hasOnline() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getOnline() {
        return online_;
      }
      public Builder setOnline(boolean value) {
        bitField0_ |= 0x00000001;
        online_ = value;
        onChanged();
        return this;
      }
      public Builder clearOnline() {
        bitField0_ = (bitField0_ & ~0x00000001);
        online_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceGuildMemberList)
    }
    
    static {
      defaultInstance = new BceGuildMemberList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceGuildMemberList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceGuildMemberList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceGuildMemberList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030BceGuildMemberList.proto\022 com.xinqihd." +
      "sns.gameserver.proto\"+\n\022BceGuildMemberLi" +
      "st\022\025\n\006online\030\001 \001(\010:\005falseB\031B\027XinqiBceGui" +
      "ldMemberList"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceGuildMemberList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceGuildMemberList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceGuildMemberList_descriptor,
              new java.lang.String[] { "Online", },
              com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceGuildMemberList.BceGuildMemberList.Builder.class);
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
