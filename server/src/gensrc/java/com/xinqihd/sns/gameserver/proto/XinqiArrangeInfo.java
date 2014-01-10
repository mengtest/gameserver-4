// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ArrangeInfo.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiArrangeInfo {
  private XinqiArrangeInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ArrangeInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string userid = 1;
    boolean hasUserid();
    String getUserid();
    
    // required int32 rank = 2;
    boolean hasRank();
    int getRank();
    
    // required string name = 3;
    boolean hasName();
    String getName();
    
    // required int32 level = 4;
    boolean hasLevel();
    int getLevel();
    
    // optional int32 power = 5;
    boolean hasPower();
    int getPower();
    
    // required int32 type = 6;
    boolean hasType();
    int getType();
    
    // required int32 score = 7;
    boolean hasScore();
    int getScore();
    
    // optional int32 viplevel = 8;
    boolean hasViplevel();
    int getViplevel();
    
    // optional int32 reserved1 = 9;
    boolean hasReserved1();
    int getReserved1();
    
    // optional int32 reserved2 = 10;
    boolean hasReserved2();
    int getReserved2();
    
    // optional int32 reserved3 = 11;
    boolean hasReserved3();
    int getReserved3();
    
    // optional int32 reserved4 = 12;
    boolean hasReserved4();
    int getReserved4();
    
    // optional int32 reserved5 = 13;
    boolean hasReserved5();
    int getReserved5();
  }
  public static final class ArrangeInfo extends
      com.google.protobuf.GeneratedMessage
      implements ArrangeInfoOrBuilder {
    // Use ArrangeInfo.newBuilder() to construct.
    private ArrangeInfo(Builder builder) {
      super(builder);
    }
    private ArrangeInfo(boolean noInit) {}
    
    private static final ArrangeInfo defaultInstance;
    public static ArrangeInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public ArrangeInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.internal_static_com_xinqihd_sns_gameserver_proto_ArrangeInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.internal_static_com_xinqihd_sns_gameserver_proto_ArrangeInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string userid = 1;
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
    
    // required int32 rank = 2;
    public static final int RANK_FIELD_NUMBER = 2;
    private int rank_;
    public boolean hasRank() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getRank() {
      return rank_;
    }
    
    // required string name = 3;
    public static final int NAME_FIELD_NUMBER = 3;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 level = 4;
    public static final int LEVEL_FIELD_NUMBER = 4;
    private int level_;
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getLevel() {
      return level_;
    }
    
    // optional int32 power = 5;
    public static final int POWER_FIELD_NUMBER = 5;
    private int power_;
    public boolean hasPower() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getPower() {
      return power_;
    }
    
    // required int32 type = 6;
    public static final int TYPE_FIELD_NUMBER = 6;
    private int type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getType() {
      return type_;
    }
    
    // required int32 score = 7;
    public static final int SCORE_FIELD_NUMBER = 7;
    private int score_;
    public boolean hasScore() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getScore() {
      return score_;
    }
    
    // optional int32 viplevel = 8;
    public static final int VIPLEVEL_FIELD_NUMBER = 8;
    private int viplevel_;
    public boolean hasViplevel() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public int getViplevel() {
      return viplevel_;
    }
    
    // optional int32 reserved1 = 9;
    public static final int RESERVED1_FIELD_NUMBER = 9;
    private int reserved1_;
    public boolean hasReserved1() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public int getReserved1() {
      return reserved1_;
    }
    
    // optional int32 reserved2 = 10;
    public static final int RESERVED2_FIELD_NUMBER = 10;
    private int reserved2_;
    public boolean hasReserved2() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public int getReserved2() {
      return reserved2_;
    }
    
    // optional int32 reserved3 = 11;
    public static final int RESERVED3_FIELD_NUMBER = 11;
    private int reserved3_;
    public boolean hasReserved3() {
      return ((bitField0_ & 0x00000400) == 0x00000400);
    }
    public int getReserved3() {
      return reserved3_;
    }
    
    // optional int32 reserved4 = 12;
    public static final int RESERVED4_FIELD_NUMBER = 12;
    private int reserved4_;
    public boolean hasReserved4() {
      return ((bitField0_ & 0x00000800) == 0x00000800);
    }
    public int getReserved4() {
      return reserved4_;
    }
    
    // optional int32 reserved5 = 13;
    public static final int RESERVED5_FIELD_NUMBER = 13;
    private int reserved5_;
    public boolean hasReserved5() {
      return ((bitField0_ & 0x00001000) == 0x00001000);
    }
    public int getReserved5() {
      return reserved5_;
    }
    
    private void initFields() {
      userid_ = "";
      rank_ = 0;
      name_ = "";
      level_ = 0;
      power_ = 0;
      type_ = 0;
      score_ = 0;
      viplevel_ = 0;
      reserved1_ = 0;
      reserved2_ = 0;
      reserved3_ = 0;
      reserved4_ = 0;
      reserved5_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasUserid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRank()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLevel()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasScore()) {
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
        output.writeBytes(1, getUseridBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, rank_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, level_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, power_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, type_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, score_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(8, viplevel_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(9, reserved1_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt32(10, reserved2_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        output.writeInt32(11, reserved3_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        output.writeInt32(12, reserved4_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        output.writeInt32(13, reserved5_);
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
          .computeInt32Size(2, rank_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, level_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, power_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, type_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, score_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, viplevel_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, reserved1_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, reserved2_);
      }
      if (((bitField0_ & 0x00000400) == 0x00000400)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, reserved3_);
      }
      if (((bitField0_ & 0x00000800) == 0x00000800)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, reserved4_);
      }
      if (((bitField0_ & 0x00001000) == 0x00001000)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, reserved5_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.internal_static_com_xinqihd_sns_gameserver_proto_ArrangeInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.internal_static_com_xinqihd_sns_gameserver_proto_ArrangeInfo_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.newBuilder()
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
        rank_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        power_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        score_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        viplevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        reserved1_ = 0;
        bitField0_ = (bitField0_ & ~0x00000100);
        reserved2_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        reserved3_ = 0;
        bitField0_ = (bitField0_ & ~0x00000400);
        reserved4_ = 0;
        bitField0_ = (bitField0_ & ~0x00000800);
        reserved5_ = 0;
        bitField0_ = (bitField0_ & ~0x00001000);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo build() {
        com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo result = new com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userid_ = userid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.rank_ = rank_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.level_ = level_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.power_ = power_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.score_ = score_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.viplevel_ = viplevel_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.reserved1_ = reserved1_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.reserved2_ = reserved2_;
        if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
          to_bitField0_ |= 0x00000400;
        }
        result.reserved3_ = reserved3_;
        if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
          to_bitField0_ |= 0x00000800;
        }
        result.reserved4_ = reserved4_;
        if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
          to_bitField0_ |= 0x00001000;
        }
        result.reserved5_ = reserved5_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.getDefaultInstance()) return this;
        if (other.hasUserid()) {
          setUserid(other.getUserid());
        }
        if (other.hasRank()) {
          setRank(other.getRank());
        }
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        if (other.hasPower()) {
          setPower(other.getPower());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasScore()) {
          setScore(other.getScore());
        }
        if (other.hasViplevel()) {
          setViplevel(other.getViplevel());
        }
        if (other.hasReserved1()) {
          setReserved1(other.getReserved1());
        }
        if (other.hasReserved2()) {
          setReserved2(other.getReserved2());
        }
        if (other.hasReserved3()) {
          setReserved3(other.getReserved3());
        }
        if (other.hasReserved4()) {
          setReserved4(other.getReserved4());
        }
        if (other.hasReserved5()) {
          setReserved5(other.getReserved5());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasUserid()) {
          
          return false;
        }
        if (!hasRank()) {
          
          return false;
        }
        if (!hasName()) {
          
          return false;
        }
        if (!hasLevel()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        if (!hasScore()) {
          
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
              userid_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              rank_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              name_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              level_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              power_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              type_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              score_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              viplevel_ = input.readInt32();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              reserved1_ = input.readInt32();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              reserved2_ = input.readInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000400;
              reserved3_ = input.readInt32();
              break;
            }
            case 96: {
              bitField0_ |= 0x00000800;
              reserved4_ = input.readInt32();
              break;
            }
            case 104: {
              bitField0_ |= 0x00001000;
              reserved5_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string userid = 1;
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
      
      // required int32 rank = 2;
      private int rank_ ;
      public boolean hasRank() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getRank() {
        return rank_;
      }
      public Builder setRank(int value) {
        bitField0_ |= 0x00000002;
        rank_ = value;
        onChanged();
        return this;
      }
      public Builder clearRank() {
        bitField0_ = (bitField0_ & ~0x00000002);
        rank_ = 0;
        onChanged();
        return this;
      }
      
      // required string name = 3;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
      }
      
      // required int32 level = 4;
      private int level_ ;
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getLevel() {
        return level_;
      }
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000008;
        level_ = value;
        onChanged();
        return this;
      }
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000008);
        level_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 power = 5;
      private int power_ ;
      public boolean hasPower() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getPower() {
        return power_;
      }
      public Builder setPower(int value) {
        bitField0_ |= 0x00000010;
        power_ = value;
        onChanged();
        return this;
      }
      public Builder clearPower() {
        bitField0_ = (bitField0_ & ~0x00000010);
        power_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 type = 6;
      private int type_ ;
      public boolean hasType() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getType() {
        return type_;
      }
      public Builder setType(int value) {
        bitField0_ |= 0x00000020;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000020);
        type_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 score = 7;
      private int score_ ;
      public boolean hasScore() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getScore() {
        return score_;
      }
      public Builder setScore(int value) {
        bitField0_ |= 0x00000040;
        score_ = value;
        onChanged();
        return this;
      }
      public Builder clearScore() {
        bitField0_ = (bitField0_ & ~0x00000040);
        score_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 viplevel = 8;
      private int viplevel_ ;
      public boolean hasViplevel() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public int getViplevel() {
        return viplevel_;
      }
      public Builder setViplevel(int value) {
        bitField0_ |= 0x00000080;
        viplevel_ = value;
        onChanged();
        return this;
      }
      public Builder clearViplevel() {
        bitField0_ = (bitField0_ & ~0x00000080);
        viplevel_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 reserved1 = 9;
      private int reserved1_ ;
      public boolean hasReserved1() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public int getReserved1() {
        return reserved1_;
      }
      public Builder setReserved1(int value) {
        bitField0_ |= 0x00000100;
        reserved1_ = value;
        onChanged();
        return this;
      }
      public Builder clearReserved1() {
        bitField0_ = (bitField0_ & ~0x00000100);
        reserved1_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 reserved2 = 10;
      private int reserved2_ ;
      public boolean hasReserved2() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public int getReserved2() {
        return reserved2_;
      }
      public Builder setReserved2(int value) {
        bitField0_ |= 0x00000200;
        reserved2_ = value;
        onChanged();
        return this;
      }
      public Builder clearReserved2() {
        bitField0_ = (bitField0_ & ~0x00000200);
        reserved2_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 reserved3 = 11;
      private int reserved3_ ;
      public boolean hasReserved3() {
        return ((bitField0_ & 0x00000400) == 0x00000400);
      }
      public int getReserved3() {
        return reserved3_;
      }
      public Builder setReserved3(int value) {
        bitField0_ |= 0x00000400;
        reserved3_ = value;
        onChanged();
        return this;
      }
      public Builder clearReserved3() {
        bitField0_ = (bitField0_ & ~0x00000400);
        reserved3_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 reserved4 = 12;
      private int reserved4_ ;
      public boolean hasReserved4() {
        return ((bitField0_ & 0x00000800) == 0x00000800);
      }
      public int getReserved4() {
        return reserved4_;
      }
      public Builder setReserved4(int value) {
        bitField0_ |= 0x00000800;
        reserved4_ = value;
        onChanged();
        return this;
      }
      public Builder clearReserved4() {
        bitField0_ = (bitField0_ & ~0x00000800);
        reserved4_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 reserved5 = 13;
      private int reserved5_ ;
      public boolean hasReserved5() {
        return ((bitField0_ & 0x00001000) == 0x00001000);
      }
      public int getReserved5() {
        return reserved5_;
      }
      public Builder setReserved5(int value) {
        bitField0_ |= 0x00001000;
        reserved5_ = value;
        onChanged();
        return this;
      }
      public Builder clearReserved5() {
        bitField0_ = (bitField0_ & ~0x00001000);
        reserved5_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.ArrangeInfo)
    }
    
    static {
      defaultInstance = new ArrangeInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.ArrangeInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_ArrangeInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_ArrangeInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ArrangeInfo.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\"\345\001\n\013ArrangeInfo\022\016\n\006userid\030" +
      "\001 \002(\t\022\014\n\004rank\030\002 \002(\005\022\014\n\004name\030\003 \002(\t\022\r\n\005lev" +
      "el\030\004 \002(\005\022\r\n\005power\030\005 \001(\005\022\014\n\004type\030\006 \002(\005\022\r\n" +
      "\005score\030\007 \002(\005\022\020\n\010viplevel\030\010 \001(\005\022\021\n\treserv" +
      "ed1\030\t \001(\005\022\021\n\treserved2\030\n \001(\005\022\021\n\treserved" +
      "3\030\013 \001(\005\022\021\n\treserved4\030\014 \001(\005\022\021\n\treserved5\030" +
      "\r \001(\005B\022B\020XinqiArrangeInfo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_ArrangeInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_ArrangeInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_ArrangeInfo_descriptor,
              new java.lang.String[] { "Userid", "Rank", "Name", "Level", "Power", "Type", "Score", "Viplevel", "Reserved1", "Reserved2", "Reserved3", "Reserved4", "Reserved5", },
              com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.class,
              com.xinqihd.sns.gameserver.proto.XinqiArrangeInfo.ArrangeInfo.Builder.class);
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