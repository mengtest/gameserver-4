-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BceTraining_pb', package.seeall)


local BCETRAINING = protobuf.Descriptor();
local BCETRAINING_STEP_FIELD = protobuf.FieldDescriptor();

BCETRAINING_STEP_FIELD.name = "step"
BCETRAINING_STEP_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BceTraining.step"
BCETRAINING_STEP_FIELD.number = 1
BCETRAINING_STEP_FIELD.index = 0
BCETRAINING_STEP_FIELD.label = 2
BCETRAINING_STEP_FIELD.has_default_value = true
BCETRAINING_STEP_FIELD.default_value = 0
BCETRAINING_STEP_FIELD.type = 5
BCETRAINING_STEP_FIELD.cpp_type = 1

BCETRAINING.name = "BceTraining"
BCETRAINING.full_name = ".com.xinqihd.sns.gameserver.proto.BceTraining"
BCETRAINING.nested_types = {}
BCETRAINING.enum_types = {}
BCETRAINING.fields = {BCETRAINING_STEP_FIELD}
BCETRAINING.is_extendable = false
BCETRAINING.extensions = {}

BceTraining = protobuf.Message(BCETRAINING)
_G.BCETRAINING_PB_BCETRAINING = BCETRAINING

