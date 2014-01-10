// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BceSelectRole.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBceSelectRole {
  private XinqiBceSelectRole() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BceSelectRoleOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string userid = 1;
    boolean hasUserid();
    String getUserid();
    
    // optional string serverid = 2;
    boolean hasServerid();
    String getServerid();
    
    // optional string uuid = 3;
    boolean hasUuid();
    String getUuid();
    
    // optional string screen = 4;
    boolean hasScreen();
    String getScreen();
    
    // optional string devicetoken = 5;
    boolean hasDevicetoken();
    String getDevicetoken();
    
    // optional string client = 6;
    boolean hasClient();
    String getClient();
    
    // optional string lang = 7;
    boolean hasLang();
    String getLang();
    
    // optional string token = 8;
    boolean hasToken();
    String getToken();
  }
  public static final class BceSelectRole extends
      com.google.protobuf.GeneratedMessage
      implements BceSelectRoleOrBuilder {
    // Use BceSelectRole.newBuilder() to construct.
    private BceSelectRole(Builder builder) {
      super(builder);
    }
    private BceSelectRole(boolean noInit) {}
    
    private static final BceSelectRole defaultInstance;
    public static BceSelectRole getDefaultInstance() {
      return defaultInstance;
    }
    
    public BceSelectRole getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.internal_static_com_xinqihd_sns_gameserver_proto_BceSelectRole_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.internal_static_com_xinqihd_sns_gameserver_proto_BceSelectRole_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string userid = 1;
    public static final int USERID_FIELD_NUMBER = 1;
    private java.lang.Object userid_;
    public boolean hasUserid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getUserid() {
      java.lang.Object ref = userid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          userid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUseridBytes() {
      java.lang.Object ref = userid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        userid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string serverid = 2;
    public static final int SERVERID_FIELD_NUMBER = 2;
    private java.lang.Object serverid_;
    public boolean hasServerid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getServerid() {
      java.lang.Object ref = serverid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          serverid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getServeridBytes() {
      java.lang.Object ref = serverid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        serverid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string uuid = 3;
    public static final int UUID_FIELD_NUMBER = 3;
    private java.lang.Object uuid_;
    public boolean hasUuid() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getUuid() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          uuid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string screen = 4;
    public static final int SCREEN_FIELD_NUMBER = 4;
    private java.lang.Object screen_;
    public boolean hasScreen() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getScreen() {
      java.lang.Object ref = screen_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          screen_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getScreenBytes() {
      java.lang.Object ref = screen_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        screen_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string devicetoken = 5;
    public static final int DEVICETOKEN_FIELD_NUMBER = 5;
    private java.lang.Object devicetoken_;
    public boolean hasDevicetoken() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getDevicetoken() {
      java.lang.Object ref = devicetoken_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          devicetoken_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getDevicetokenBytes() {
      java.lang.Object ref = devicetoken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        devicetoken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string client = 6;
    public static final int CLIENT_FIELD_NUMBER = 6;
    private java.lang.Object client_;
    public boolean hasClient() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public String getClient() {
      java.lang.Object ref = client_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          client_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getClientBytes() {
      java.lang.Object ref = client_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        client_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string lang = 7;
    public static final int LANG_FIELD_NUMBER = 7;
    private java.lang.Object lang_;
    public boolean hasLang() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public String getLang() {
      java.lang.Object ref = lang_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          lang_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLangBytes() {
      java.lang.Object ref = lang_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        lang_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string token = 8;
    public static final int TOKEN_FIELD_NUMBER = 8;
    private java.lang.Object token_;
    public boolean hasToken() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public String getToken() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          token_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      userid_ = "";
      serverid_ = "";
      uuid_ = "";
      screen_ = "";
      devicetoken_ = "";
      client_ = "";
      lang_ = "";
      token_ = "";
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
        output.writeBytes(1, getUseridBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getServeridBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getUuidBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getScreenBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getDevicetokenBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getClientBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, getLangBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(8, getTokenBytes());
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
          .computeBytesSize(1, getUseridBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getServeridBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getUuidBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getScreenBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getDevicetokenBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getClientBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getLangBytes());
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8, getTokenBytes());
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRoleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.internal_static_com_xinqihd_sns_gameserver_proto_BceSelectRole_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.internal_static_com_xinqihd_sns_gameserver_proto_BceSelectRole_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole.newBuilder()
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
        userid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        serverid_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        uuid_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        screen_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        devicetoken_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        client_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        lang_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        token_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole build() {
        com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole result = new com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userid_ = userid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.serverid_ = serverid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.uuid_ = uuid_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.screen_ = screen_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.devicetoken_ = devicetoken_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.client_ = client_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.lang_ = lang_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.token_ = token_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole.getDefaultInstance()) return this;
        if (other.hasUserid()) {
          setUserid(other.getUserid());
        }
        if (other.hasServerid()) {
          setServerid(other.getServerid());
        }
        if (other.hasUuid()) {
          setUuid(other.getUuid());
        }
        if (other.hasScreen()) {
          setScreen(other.getScreen());
        }
        if (other.hasDevicetoken()) {
          setDevicetoken(other.getDevicetoken());
        }
        if (other.hasClient()) {
          setClient(other.getClient());
        }
        if (other.hasLang()) {
          setLang(other.getLang());
        }
        if (other.hasToken()) {
          setToken(other.getToken());
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
            case 10: {
              bitField0_ |= 0x00000001;
              userid_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              serverid_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              uuid_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              screen_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              devicetoken_ = input.readBytes();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              client_ = input.readBytes();
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              lang_ = input.readBytes();
              break;
            }
            case 66: {
              bitField0_ |= 0x00000080;
              token_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string userid = 1;
      private java.lang.Object userid_ = "";
      public boolean hasUserid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getUserid() {
        java.lang.Object ref = userid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          userid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUserid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        userid_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userid_ = getDefaultInstance().getUserid();
        onChanged();
        return this;
      }
      void setUserid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        userid_ = value;
        onChanged();
      }
      
      // optional string serverid = 2;
      private java.lang.Object serverid_ = "";
      public boolean hasServerid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getServerid() {
        java.lang.Object ref = serverid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          serverid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setServerid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        serverid_ = value;
        onChanged();
        return this;
      }
      public Builder clearServerid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        serverid_ = getDefaultInstance().getServerid();
        onChanged();
        return this;
      }
      void setServerid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        serverid_ = value;
        onChanged();
      }
      
      // optional string uuid = 3;
      private java.lang.Object uuid_ = "";
      public boolean hasUuid() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getUuid() {
        java.lang.Object ref = uuid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          uuid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUuid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        uuid_ = value;
        onChanged();
        return this;
      }
      public Builder clearUuid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        uuid_ = getDefaultInstance().getUuid();
        onChanged();
        return this;
      }
      void setUuid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        uuid_ = value;
        onChanged();
      }
      
      // optional string screen = 4;
      private java.lang.Object screen_ = "";
      public boolean hasScreen() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getScreen() {
        java.lang.Object ref = screen_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          screen_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setScreen(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        screen_ = value;
        onChanged();
        return this;
      }
      public Builder clearScreen() {
        bitField0_ = (bitField0_ & ~0x00000008);
        screen_ = getDefaultInstance().getScreen();
        onChanged();
        return this;
      }
      void setScreen(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        screen_ = value;
        onChanged();
      }
      
      // optional string devicetoken = 5;
      private java.lang.Object devicetoken_ = "";
      public boolean hasDevicetoken() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getDevicetoken() {
        java.lang.Object ref = devicetoken_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          devicetoken_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setDevicetoken(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        devicetoken_ = value;
        onChanged();
        return this;
      }
      public Builder clearDevicetoken() {
        bitField0_ = (bitField0_ & ~0x00000010);
        devicetoken_ = getDefaultInstance().getDevicetoken();
        onChanged();
        return this;
      }
      void setDevicetoken(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        devicetoken_ = value;
        onChanged();
      }
      
      // optional string client = 6;
      private java.lang.Object client_ = "";
      public boolean hasClient() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public String getClient() {
        java.lang.Object ref = client_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          client_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setClient(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        client_ = value;
        onChanged();
        return this;
      }
      public Builder clearClient() {
        bitField0_ = (bitField0_ & ~0x00000020);
        client_ = getDefaultInstance().getClient();
        onChanged();
        return this;
      }
      void setClient(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000020;
        client_ = value;
        onChanged();
      }
      
      // optional string lang = 7;
      private java.lang.Object lang_ = "";
      public boolean hasLang() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public String getLang() {
        java.lang.Object ref = lang_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          lang_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLang(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        lang_ = value;
        onChanged();
        return this;
      }
      public Builder clearLang() {
        bitField0_ = (bitField0_ & ~0x00000040);
        lang_ = getDefaultInstance().getLang();
        onChanged();
        return this;
      }
      void setLang(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000040;
        lang_ = value;
        onChanged();
      }
      
      // optional string token = 8;
      private java.lang.Object token_ = "";
      public boolean hasToken() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public String getToken() {
        java.lang.Object ref = token_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          token_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setToken(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        token_ = value;
        onChanged();
        return this;
      }
      public Builder clearToken() {
        bitField0_ = (bitField0_ & ~0x00000080);
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }
      void setToken(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000080;
        token_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BceSelectRole)
    }
    
    static {
      defaultInstance = new BceSelectRole(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BceSelectRole)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BceSelectRole_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BceSelectRole_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BceSelectRole.proto\022 com.xinqihd.sns.g" +
      "ameserver.proto\"\221\001\n\rBceSelectRole\022\016\n\006use" +
      "rid\030\001 \001(\t\022\020\n\010serverid\030\002 \001(\t\022\014\n\004uuid\030\003 \001(" +
      "\t\022\016\n\006screen\030\004 \001(\t\022\023\n\013devicetoken\030\005 \001(\t\022\016" +
      "\n\006client\030\006 \001(\t\022\014\n\004lang\030\007 \001(\t\022\r\n\005token\030\010 " +
      "\001(\tB\024B\022XinqiBceSelectRole"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BceSelectRole_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BceSelectRole_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BceSelectRole_descriptor,
              new java.lang.String[] { "Userid", "Serverid", "Uuid", "Screen", "Devicetoken", "Client", "Lang", "Token", },
              com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole.class,
              com.xinqihd.sns.gameserver.proto.XinqiBceSelectRole.BceSelectRole.Builder.class);
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