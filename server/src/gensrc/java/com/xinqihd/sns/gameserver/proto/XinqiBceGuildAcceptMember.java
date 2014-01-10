// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceGuildAcceptMember.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceGuildAcceptMember {
  private XinqiBceGuildAcceptMember() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceGuildAcceptMemberOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string uid = 1;
    boolean hasUid();
    String getUid();
    
    // optional bool accept = 2;
    boolean hasAccept();
    boolean getAccept();
  }
  public static final class BceGuildAcceptMember extends
      com.google.protobuf.GeneratedMessage
      implements BceGuildAcceptMemberOrBuilder {
    // Use BceGuildAcceptMember.newBuilder() to construct.
    private BceGuildAcceptMember(Builder builder) {
      super(builder);
    }
    private BceGuildAcceptMember(boolean noInit) {}
    
    private static final BceGuildAcceptMember defaultInstance;
    public static BceGuildAcceptMember getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceGuildAcceptMember getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildAcceptMember_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildAcceptMember_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string uid = 1;
    public static final int UID_FIELD_NUMBER = 1;
    private java.lang.Object uid_;
    public boolean hasUid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getUid() {
      java.lang.Object ref = uid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          uid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUidBytes() {
      java.lang.Object ref = uid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional bool accept = 2;
    public static final int ACCEPT_FIELD_NUMBER = 2;
    private boolean accept_;
    public boolean hasAccept() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getAccept() {
      return accept_;
    }
    
    private void initFields() {
      uid_ = "";
      accept_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasUid()) {
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
        output.writeBytes(1, getUidBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, accept_);
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
          .computeBytesSize(1, getUidBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, accept_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMemberOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildAcceptMember_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.internal_static_com_xinqihd_sns_gameserver_proto_BceGuildAcceptMember_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember.newBuilder()
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
        uid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        accept_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember result = new com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.uid_ = uid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.accept_ = accept_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember.getDefaultInstance()) return this;
        if (other.hasUid()) {
          setUid(other.getUid());
        }
        if (other.hasAccept()) {
          setAccept(other.getAccept());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasUid()) {
          
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
              uid_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              accept_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string uid = 1;
      private java.lang.Object uid_ = "";
      public boolean hasUid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getUid() {
        java.lang.Object ref = uid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          uid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        uid_ = value;
        onChanged();
        return this;
      }
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = getDefaultInstance().getUid();
        onChanged();
        return this;
      }
      void setUid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        uid_ = value;
        onChanged();
      }
      
      // optional bool accept = 2;
      private boolean accept_ ;
      public boolean hasAccept() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getAccept() {
        return accept_;
      }
      public Builder setAccept(boolean value) {
        bitField0_ |= 0x00000002;
        accept_ = value;
        onChanged();
        return this;
      }
      public Builder clearAccept() {
        bitField0_ = (bitField0_ & ~0x00000002);
        accept_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceGuildAcceptMember)
    }
    
    static {
      defaultInstance = new BceGuildAcceptMember(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceGuildAcceptMember)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceGuildAcceptMember_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceGuildAcceptMember_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032BceGuildAcceptMember.proto\022 com.xinqih" +
      "d.sns.gameserver.proto\"3\n\024BceGuildAccept" +
      "Member\022\013\n\003uid\030\001 \002(\t\022\016\n\006accept\030\002 \001(\010B\033B\031X" +
      "inqiBceGuildAcceptMember"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceGuildAcceptMember_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceGuildAcceptMember_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceGuildAcceptMember_descriptor,
              new java.lang.String[] { "Uid", "Accept", },
              com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceGuildAcceptMember.BceGuildAcceptMember.Builder.class);
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