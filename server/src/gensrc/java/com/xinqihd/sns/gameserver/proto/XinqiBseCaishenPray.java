// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseCaishenPray.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseCaishenPray {
  private XinqiBseCaishenPray() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseCaishenPrayOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional bool success = 1;
    boolean hasSuccess();
    boolean getSuccess();
    
    // optional string response = 2;
    boolean hasResponse();
    String getResponse();
    
    // optional uint32 count = 3;
    boolean hasCount();
    int getCount();
    
    // optional uint32 price = 4;
    boolean hasPrice();
    int getPrice();
    
    // optional uint32 goldenvalue = 5;
    boolean hasGoldenvalue();
    int getGoldenvalue();
    
    // optional string info = 6;
    boolean hasInfo();
    String getInfo();
  }
  public static final class BseCaishenPray extends
      com.google.protobuf.GeneratedMessage
      implements BseCaishenPrayOrBuilder {
    // Use BseCaishenPray.newBuilder() to construct.
    private BseCaishenPray(Builder builder) {
      super(builder);
    }
    private BseCaishenPray(boolean noInit) {}
    
    private static final BseCaishenPray defaultInstance;
    public static BseCaishenPray getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseCaishenPray getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.internal_static_com_xinqihd_sns_gameserver_proto_BseCaishenPray_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.internal_static_com_xinqihd_sns_gameserver_proto_BseCaishenPray_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional bool success = 1;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private boolean success_;
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getSuccess() {
      return success_;
    }
    
    // optional string response = 2;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    private java.lang.Object response_;
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getResponse() {
      java.lang.Object ref = response_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          response_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getResponseBytes() {
      java.lang.Object ref = response_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        response_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional uint32 count = 3;
    public static final int COUNT_FIELD_NUMBER = 3;
    private int count_;
    public boolean hasCount() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getCount() {
      return count_;
    }
    
    // optional uint32 price = 4;
    public static final int PRICE_FIELD_NUMBER = 4;
    private int price_;
    public boolean hasPrice() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getPrice() {
      return price_;
    }
    
    // optional uint32 goldenvalue = 5;
    public static final int GOLDENVALUE_FIELD_NUMBER = 5;
    private int goldenvalue_;
    public boolean hasGoldenvalue() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getGoldenvalue() {
      return goldenvalue_;
    }
    
    // optional string info = 6;
    public static final int INFO_FIELD_NUMBER = 6;
    private java.lang.Object info_;
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getInfo() {
      java.lang.Object ref = info_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          info_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getInfoBytes() {
      java.lang.Object ref = info_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        info_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      success_ = false;
      response_ = "";
      count_ = 0;
      price_ = 0;
      goldenvalue_ = 0;
      info_ = "";
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
        output.writeBool(1, success_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getResponseBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, count_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, price_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, goldenvalue_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getInfoBytes());
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
          .computeBoolSize(1, success_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getResponseBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, count_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, price_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, goldenvalue_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getInfoBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPrayOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.internal_static_com_xinqihd_sns_gameserver_proto_BseCaishenPray_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.internal_static_com_xinqihd_sns_gameserver_proto_BseCaishenPray_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray.newBuilder()
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
        success_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        response_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        count_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        price_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        goldenvalue_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        info_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray result = new com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.success_ = success_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.response_ = response_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.count_ = count_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.price_ = price_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.goldenvalue_ = goldenvalue_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.info_ = info_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray.getDefaultInstance()) return this;
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasResponse()) {
          setResponse(other.getResponse());
        }
        if (other.hasCount()) {
          setCount(other.getCount());
        }
        if (other.hasPrice()) {
          setPrice(other.getPrice());
        }
        if (other.hasGoldenvalue()) {
          setGoldenvalue(other.getGoldenvalue());
        }
        if (other.hasInfo()) {
          setInfo(other.getInfo());
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
              success_ = input.readBool();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              response_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              count_ = input.readUInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              price_ = input.readUInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              goldenvalue_ = input.readUInt32();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              info_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional bool success = 1;
      private boolean success_ ;
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getSuccess() {
        return success_;
      }
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000001;
        success_ = value;
        onChanged();
        return this;
      }
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        onChanged();
        return this;
      }
      
      // optional string response = 2;
      private java.lang.Object response_ = "";
      public boolean hasResponse() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getResponse() {
        java.lang.Object ref = response_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          response_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setResponse(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        response_ = value;
        onChanged();
        return this;
      }
      public Builder clearResponse() {
        bitField0_ = (bitField0_ & ~0x00000002);
        response_ = getDefaultInstance().getResponse();
        onChanged();
        return this;
      }
      void setResponse(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        response_ = value;
        onChanged();
      }
      
      // optional uint32 count = 3;
      private int count_ ;
      public boolean hasCount() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getCount() {
        return count_;
      }
      public Builder setCount(int value) {
        bitField0_ |= 0x00000004;
        count_ = value;
        onChanged();
        return this;
      }
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000004);
        count_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 price = 4;
      private int price_ ;
      public boolean hasPrice() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getPrice() {
        return price_;
      }
      public Builder setPrice(int value) {
        bitField0_ |= 0x00000008;
        price_ = value;
        onChanged();
        return this;
      }
      public Builder clearPrice() {
        bitField0_ = (bitField0_ & ~0x00000008);
        price_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 goldenvalue = 5;
      private int goldenvalue_ ;
      public boolean hasGoldenvalue() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getGoldenvalue() {
        return goldenvalue_;
      }
      public Builder setGoldenvalue(int value) {
        bitField0_ |= 0x00000010;
        goldenvalue_ = value;
        onChanged();
        return this;
      }
      public Builder clearGoldenvalue() {
        bitField0_ = (bitField0_ & ~0x00000010);
        goldenvalue_ = 0;
        onChanged();
        return this;
      }
      
      // optional string info = 6;
      private java.lang.Object info_ = "";
      public boolean hasInfo() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getInfo() {
        java.lang.Object ref = info_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          info_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setInfo(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        info_ = value;
        onChanged();
        return this;
      }
      public Builder clearInfo() {
        bitField0_ = (bitField0_ & ~0x00000020);
        info_ = getDefaultInstance().getInfo();
        onChanged();
        return this;
      }
      void setInfo(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        info_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseCaishenPray)
    }
    
    static {
      defaultInstance = new BseCaishenPray(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseCaishenPray)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseCaishenPray_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseCaishenPray_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BseCaishenPray.proto\022 com.xinqihd.sns." +
      "gameserver.proto\"t\n\016BseCaishenPray\022\017\n\007su" +
      "ccess\030\001 \001(\010\022\020\n\010response\030\002 \001(\t\022\r\n\005count\030\003" +
      " \001(\r\022\r\n\005price\030\004 \001(\r\022\023\n\013goldenvalue\030\005 \001(\r" +
      "\022\014\n\004info\030\006 \001(\tB\025B\023XinqiBseCaishenPray"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseCaishenPray_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseCaishenPray_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseCaishenPray_descriptor,
              new java.lang.String[] { "Success", "Response", "Count", "Price", "Goldenvalue", "Info", },
              com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseCaishenPray.BseCaishenPray.Builder.class);
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
