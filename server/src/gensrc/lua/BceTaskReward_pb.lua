-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceTaskReward_pb', package.seeall)


local BCETASKREWARD = protobuf.Descriptor();
local BCETASKREWARD_TASKID_FIELD = protobuf.FieldDescriptor();
local BCETASKREWARD_CDKEY_FIELD = protobuf.FieldDescriptor();
local BCETASKREWARD_CHOOSE_FIELD = protobuf.FieldDescriptor();

BCETASKREWARD_TASKID_FIELD.name = "taskID"
BCETASKREWARD_TASKID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceTaskReward.taskID"
BCETASKREWARD_TASKID_FIELD.number = 1
BCETASKREWARD_TASKID_FIELD.index = 0
BCETASKREWARD_TASKID_FIELD.label = 2
BCETASKREWARD_TASKID_FIELD.has_default_value = false
BCETASKREWARD_TASKID_FIELD.default_value = 0
BCETASKREWARD_TASKID_FIELD.type = 5
BCETASKREWARD_TASKID_FIELD.cpp_type = 1

BCETASKREWARD_CDKEY_FIELD.name = "cdkey"
BCETASKREWARD_CDKEY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceTaskReward.cdkey"
BCETASKREWARD_CDKEY_FIELD.number = 2
BCETASKREWARD_CDKEY_FIELD.index = 1
BCETASKREWARD_CDKEY_FIELD.label = 1
BCETASKREWARD_CDKEY_FIELD.has_default_value = false
BCETASKREWARD_CDKEY_FIELD.default_value = ""
BCETASKREWARD_CDKEY_FIELD.type = 9
BCETASKREWARD_CDKEY_FIELD.cpp_type = 9

BCETASKREWARD_CHOOSE_FIELD.name = "choose"
BCETASKREWARD_CHOOSE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceTaskReward.choose"
BCETASKREWARD_CHOOSE_FIELD.number = 3
BCETASKREWARD_CHOOSE_FIELD.index = 2
BCETASKREWARD_CHOOSE_FIELD.label = 1
BCETASKREWARD_CHOOSE_FIELD.has_default_value = false
BCETASKREWARD_CHOOSE_FIELD.default_value = 0
BCETASKREWARD_CHOOSE_FIELD.type = 5
BCETASKREWARD_CHOOSE_FIELD.cpp_type = 1

BCETASKREWARD.name = "BceTaskReward"
BCETASKREWARD.full_name = ".com.xinqihd.sns.gameserver.proto.BceTaskReward"
BCETASKREWARD.nested_types = {}
BCETASKREWARD.enum_types = {}
BCETASKREWARD.fields = {BCETASKREWARD_TASKID_FIELD, BCETASKREWARD_CDKEY_FIELD, BCETASKREWARD_CHOOSE_FIELD}
BCETASKREWARD.is_extendable = false
BCETASKREWARD.extensions = {}

BceTaskReward = protobuf.Message(BCETASKREWARD)
_G.BCETASKREWARD_PB_BCETASKREWARD = BCETASKREWARD
