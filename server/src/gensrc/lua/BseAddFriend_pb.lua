-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseAddFriend_pb', package.seeall)


local BSEADDFRIEND = protobuf.Descriptor();
local BSEADDFRIEND_USERNAME_FIELD = protobuf.FieldDescriptor();
local BSEADDFRIEND_BLACKLIST_FIELD = protobuf.FieldDescriptor();
local BSEADDFRIEND_SUCC_FIELD = protobuf.FieldDescriptor();
local BSEADDFRIEND_ISDEL_FIELD = protobuf.FieldDescriptor();

BSEADDFRIEND_USERNAME_FIELD.name = "username"
BSEADDFRIEND_USERNAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseAddFriend.username"
BSEADDFRIEND_USERNAME_FIELD.number = 1
BSEADDFRIEND_USERNAME_FIELD.index = 0
BSEADDFRIEND_USERNAME_FIELD.label = 2
BSEADDFRIEND_USERNAME_FIELD.has_default_value = false
BSEADDFRIEND_USERNAME_FIELD.default_value = ""
BSEADDFRIEND_USERNAME_FIELD.type = 9
BSEADDFRIEND_USERNAME_FIELD.cpp_type = 9

BSEADDFRIEND_BLACKLIST_FIELD.name = "blacklist"
BSEADDFRIEND_BLACKLIST_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseAddFriend.blacklist"
BSEADDFRIEND_BLACKLIST_FIELD.number = 2
BSEADDFRIEND_BLACKLIST_FIELD.index = 1
BSEADDFRIEND_BLACKLIST_FIELD.label = 1
BSEADDFRIEND_BLACKLIST_FIELD.has_default_value = true
BSEADDFRIEND_BLACKLIST_FIELD.default_value = false
BSEADDFRIEND_BLACKLIST_FIELD.type = 8
BSEADDFRIEND_BLACKLIST_FIELD.cpp_type = 7

BSEADDFRIEND_SUCC_FIELD.name = "succ"
BSEADDFRIEND_SUCC_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseAddFriend.succ"
BSEADDFRIEND_SUCC_FIELD.number = 3
BSEADDFRIEND_SUCC_FIELD.index = 2
BSEADDFRIEND_SUCC_FIELD.label = 1
BSEADDFRIEND_SUCC_FIELD.has_default_value = true
BSEADDFRIEND_SUCC_FIELD.default_value = false
BSEADDFRIEND_SUCC_FIELD.type = 8
BSEADDFRIEND_SUCC_FIELD.cpp_type = 7

BSEADDFRIEND_ISDEL_FIELD.name = "isdel"
BSEADDFRIEND_ISDEL_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseAddFriend.isdel"
BSEADDFRIEND_ISDEL_FIELD.number = 4
BSEADDFRIEND_ISDEL_FIELD.index = 3
BSEADDFRIEND_ISDEL_FIELD.label = 1
BSEADDFRIEND_ISDEL_FIELD.has_default_value = true
BSEADDFRIEND_ISDEL_FIELD.default_value = false
BSEADDFRIEND_ISDEL_FIELD.type = 8
BSEADDFRIEND_ISDEL_FIELD.cpp_type = 7

BSEADDFRIEND.name = "BseAddFriend"
BSEADDFRIEND.full_name = ".com.xinqihd.sns.gameserver.proto.BseAddFriend"
BSEADDFRIEND.nested_types = {}
BSEADDFRIEND.enum_types = {}
BSEADDFRIEND.fields = {BSEADDFRIEND_USERNAME_FIELD, BSEADDFRIEND_BLACKLIST_FIELD, BSEADDFRIEND_SUCC_FIELD, BSEADDFRIEND_ISDEL_FIELD}
BSEADDFRIEND.is_extendable = false
BSEADDFRIEND.extensions = {}

BseAddFriend = protobuf.Message(BSEADDFRIEND)
_G.BSEADDFRIEND_PB_BSEADDFRIEND = BSEADDFRIEND

