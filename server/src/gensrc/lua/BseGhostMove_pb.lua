-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseGhostMove_pb', package.seeall)


local BSEGHOSTMOVE = protobuf.Descriptor();
local BSEGHOSTMOVE_SESSIONID_FIELD = protobuf.FieldDescriptor();
local BSEGHOSTMOVE_X_FIELD = protobuf.FieldDescriptor();
local BSEGHOSTMOVE_Y_FIELD = protobuf.FieldDescriptor();
local BSEGHOSTMOVE_PICKBOX_FIELD = protobuf.FieldDescriptor();
local BSEGHOSTMOVE_TIME_FIELD = protobuf.FieldDescriptor();
local BSEGHOSTMOVE_STRENGTH_FIELD = protobuf.FieldDescriptor();

BSEGHOSTMOVE_SESSIONID_FIELD.name = "sessionId"
BSEGHOSTMOVE_SESSIONID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGhostMove.sessionId"
BSEGHOSTMOVE_SESSIONID_FIELD.number = 1
BSEGHOSTMOVE_SESSIONID_FIELD.index = 0
BSEGHOSTMOVE_SESSIONID_FIELD.label = 2
BSEGHOSTMOVE_SESSIONID_FIELD.has_default_value = false
BSEGHOSTMOVE_SESSIONID_FIELD.default_value = ""
BSEGHOSTMOVE_SESSIONID_FIELD.type = 9
BSEGHOSTMOVE_SESSIONID_FIELD.cpp_type = 9

BSEGHOSTMOVE_X_FIELD.name = "x"
BSEGHOSTMOVE_X_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGhostMove.x"
BSEGHOSTMOVE_X_FIELD.number = 2
BSEGHOSTMOVE_X_FIELD.index = 1
BSEGHOSTMOVE_X_FIELD.label = 2
BSEGHOSTMOVE_X_FIELD.has_default_value = false
BSEGHOSTMOVE_X_FIELD.default_value = 0
BSEGHOSTMOVE_X_FIELD.type = 5
BSEGHOSTMOVE_X_FIELD.cpp_type = 1

BSEGHOSTMOVE_Y_FIELD.name = "y"
BSEGHOSTMOVE_Y_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGhostMove.y"
BSEGHOSTMOVE_Y_FIELD.number = 3
BSEGHOSTMOVE_Y_FIELD.index = 2
BSEGHOSTMOVE_Y_FIELD.label = 2
BSEGHOSTMOVE_Y_FIELD.has_default_value = false
BSEGHOSTMOVE_Y_FIELD.default_value = 0
BSEGHOSTMOVE_Y_FIELD.type = 5
BSEGHOSTMOVE_Y_FIELD.cpp_type = 1

BSEGHOSTMOVE_PICKBOX_FIELD.name = "pickBox"
BSEGHOSTMOVE_PICKBOX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGhostMove.pickBox"
BSEGHOSTMOVE_PICKBOX_FIELD.number = 4
BSEGHOSTMOVE_PICKBOX_FIELD.index = 3
BSEGHOSTMOVE_PICKBOX_FIELD.label = 3
BSEGHOSTMOVE_PICKBOX_FIELD.has_default_value = false
BSEGHOSTMOVE_PICKBOX_FIELD.default_value = {}
BSEGHOSTMOVE_PICKBOX_FIELD.message_type = PICKBOXINFO_PB_PICKBOXINFO
BSEGHOSTMOVE_PICKBOX_FIELD.type = 11
BSEGHOSTMOVE_PICKBOX_FIELD.cpp_type = 10

BSEGHOSTMOVE_TIME_FIELD.name = "time"
BSEGHOSTMOVE_TIME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGhostMove.time"
BSEGHOSTMOVE_TIME_FIELD.number = 5
BSEGHOSTMOVE_TIME_FIELD.index = 4
BSEGHOSTMOVE_TIME_FIELD.label = 2
BSEGHOSTMOVE_TIME_FIELD.has_default_value = false
BSEGHOSTMOVE_TIME_FIELD.default_value = 0
BSEGHOSTMOVE_TIME_FIELD.type = 5
BSEGHOSTMOVE_TIME_FIELD.cpp_type = 1

BSEGHOSTMOVE_STRENGTH_FIELD.name = "strength"
BSEGHOSTMOVE_STRENGTH_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseGhostMove.strength"
BSEGHOSTMOVE_STRENGTH_FIELD.number = 6
BSEGHOSTMOVE_STRENGTH_FIELD.index = 5
BSEGHOSTMOVE_STRENGTH_FIELD.label = 2
BSEGHOSTMOVE_STRENGTH_FIELD.has_default_value = false
BSEGHOSTMOVE_STRENGTH_FIELD.default_value = 0
BSEGHOSTMOVE_STRENGTH_FIELD.type = 5
BSEGHOSTMOVE_STRENGTH_FIELD.cpp_type = 1

BSEGHOSTMOVE.name = "BseGhostMove"
BSEGHOSTMOVE.full_name = ".com.xinqihd.sns.gameserver.proto.BseGhostMove"
BSEGHOSTMOVE.nested_types = {}
BSEGHOSTMOVE.enum_types = {}
BSEGHOSTMOVE.fields = {BSEGHOSTMOVE_SESSIONID_FIELD, BSEGHOSTMOVE_X_FIELD, BSEGHOSTMOVE_Y_FIELD, BSEGHOSTMOVE_PICKBOX_FIELD, BSEGHOSTMOVE_TIME_FIELD, BSEGHOSTMOVE_STRENGTH_FIELD}
BSEGHOSTMOVE.is_extendable = false
BSEGHOSTMOVE.extensions = {}

BseGhostMove = protobuf.Message(BSEGHOSTMOVE)
_G.BSEGHOSTMOVE_PB_BSEGHOSTMOVE = BSEGHOSTMOVE
