-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseMap_pb', package.seeall)


local POINT = protobuf.Descriptor();
local POINT_X_FIELD = protobuf.FieldDescriptor();
local POINT_Y_FIELD = protobuf.FieldDescriptor();
local ENEMY = protobuf.Descriptor();
local ENEMY_ID_FIELD = protobuf.FieldDescriptor();
local ENEMY_X_FIELD = protobuf.FieldDescriptor();
local ENEMY_Y_FIELD = protobuf.FieldDescriptor();
local LAYER = protobuf.Descriptor();
local LAYER_ID_FIELD = protobuf.FieldDescriptor();
local LAYER_NUM_FIELD = protobuf.FieldDescriptor();
local LAYER_SCROLLRATE_FIELD = protobuf.FieldDescriptor();
local LAYER_WIDTH_FIELD = protobuf.FieldDescriptor();
local LAYER_HEIGHT_FIELD = protobuf.FieldDescriptor();
local LAYER_TYPE_FIELD = protobuf.FieldDescriptor();
local MAPDATA = protobuf.Descriptor();
local MAPDATA_ID_FIELD = protobuf.FieldDescriptor();
local MAPDATA_NAME_FIELD = protobuf.FieldDescriptor();
local MAPDATA_TYPE_FIELD = protobuf.FieldDescriptor();
local MAPDATA_REQLV_FIELD = protobuf.FieldDescriptor();
local MAPDATA_SCROLLAREAX_FIELD = protobuf.FieldDescriptor();
local MAPDATA_SCROLLAREAY_FIELD = protobuf.FieldDescriptor();
local MAPDATA_SCROLLAREAWIDTH_FIELD = protobuf.FieldDescriptor();
local MAPDATA_SCROLLAREAHEIGHT_FIELD = protobuf.FieldDescriptor();
local MAPDATA_BGM_FIELD = protobuf.FieldDescriptor();
local MAPDATA_DAMAGE_FIELD = protobuf.FieldDescriptor();
local MAPDATA_LAYERS_FIELD = protobuf.FieldDescriptor();
local MAPDATA_BOSSES_FIELD = protobuf.FieldDescriptor();
local MAPDATA_ENEMIES_FIELD = protobuf.FieldDescriptor();
local MAPDATA_STARTPOINTS_FIELD = protobuf.FieldDescriptor();
local MAPDATA_HIDDEN_FIELD = protobuf.FieldDescriptor();
local BSEMAP = protobuf.Descriptor();
local BSEMAP_MAPS_FIELD = protobuf.FieldDescriptor();

POINT_X_FIELD.name = "x"
POINT_X_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Point.x"
POINT_X_FIELD.number = 1
POINT_X_FIELD.index = 0
POINT_X_FIELD.label = 1
POINT_X_FIELD.has_default_value = false
POINT_X_FIELD.default_value = 0
POINT_X_FIELD.type = 5
POINT_X_FIELD.cpp_type = 1

POINT_Y_FIELD.name = "y"
POINT_Y_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Point.y"
POINT_Y_FIELD.number = 2
POINT_Y_FIELD.index = 1
POINT_Y_FIELD.label = 1
POINT_Y_FIELD.has_default_value = false
POINT_Y_FIELD.default_value = 0
POINT_Y_FIELD.type = 5
POINT_Y_FIELD.cpp_type = 1

POINT.name = "Point"
POINT.full_name = ".com.xinqihd.sns.gameserver.proto.Point"
POINT.nested_types = {}
POINT.enum_types = {}
POINT.fields = {POINT_X_FIELD, POINT_Y_FIELD}
POINT.is_extendable = false
POINT.extensions = {}
ENEMY_ID_FIELD.name = "id"
ENEMY_ID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Enemy.id"
ENEMY_ID_FIELD.number = 1
ENEMY_ID_FIELD.index = 0
ENEMY_ID_FIELD.label = 1
ENEMY_ID_FIELD.has_default_value = false
ENEMY_ID_FIELD.default_value = ""
ENEMY_ID_FIELD.type = 9
ENEMY_ID_FIELD.cpp_type = 9

ENEMY_X_FIELD.name = "x"
ENEMY_X_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Enemy.x"
ENEMY_X_FIELD.number = 2
ENEMY_X_FIELD.index = 1
ENEMY_X_FIELD.label = 1
ENEMY_X_FIELD.has_default_value = false
ENEMY_X_FIELD.default_value = 0
ENEMY_X_FIELD.type = 5
ENEMY_X_FIELD.cpp_type = 1

ENEMY_Y_FIELD.name = "y"
ENEMY_Y_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Enemy.y"
ENEMY_Y_FIELD.number = 3
ENEMY_Y_FIELD.index = 2
ENEMY_Y_FIELD.label = 1
ENEMY_Y_FIELD.has_default_value = false
ENEMY_Y_FIELD.default_value = 0
ENEMY_Y_FIELD.type = 5
ENEMY_Y_FIELD.cpp_type = 1

ENEMY.name = "Enemy"
ENEMY.full_name = ".com.xinqihd.sns.gameserver.proto.Enemy"
ENEMY.nested_types = {}
ENEMY.enum_types = {}
ENEMY.fields = {ENEMY_ID_FIELD, ENEMY_X_FIELD, ENEMY_Y_FIELD}
ENEMY.is_extendable = false
ENEMY.extensions = {}
LAYER_ID_FIELD.name = "id"
LAYER_ID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Layer.id"
LAYER_ID_FIELD.number = 1
LAYER_ID_FIELD.index = 0
LAYER_ID_FIELD.label = 1
LAYER_ID_FIELD.has_default_value = false
LAYER_ID_FIELD.default_value = ""
LAYER_ID_FIELD.type = 9
LAYER_ID_FIELD.cpp_type = 9

LAYER_NUM_FIELD.name = "num"
LAYER_NUM_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Layer.num"
LAYER_NUM_FIELD.number = 2
LAYER_NUM_FIELD.index = 1
LAYER_NUM_FIELD.label = 1
LAYER_NUM_FIELD.has_default_value = false
LAYER_NUM_FIELD.default_value = 0
LAYER_NUM_FIELD.type = 5
LAYER_NUM_FIELD.cpp_type = 1

LAYER_SCROLLRATE_FIELD.name = "scrollRate"
LAYER_SCROLLRATE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Layer.scrollRate"
LAYER_SCROLLRATE_FIELD.number = 3
LAYER_SCROLLRATE_FIELD.index = 2
LAYER_SCROLLRATE_FIELD.label = 1
LAYER_SCROLLRATE_FIELD.has_default_value = false
LAYER_SCROLLRATE_FIELD.default_value = 0
LAYER_SCROLLRATE_FIELD.type = 5
LAYER_SCROLLRATE_FIELD.cpp_type = 1

LAYER_WIDTH_FIELD.name = "width"
LAYER_WIDTH_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Layer.width"
LAYER_WIDTH_FIELD.number = 4
LAYER_WIDTH_FIELD.index = 3
LAYER_WIDTH_FIELD.label = 1
LAYER_WIDTH_FIELD.has_default_value = false
LAYER_WIDTH_FIELD.default_value = 0
LAYER_WIDTH_FIELD.type = 5
LAYER_WIDTH_FIELD.cpp_type = 1

LAYER_HEIGHT_FIELD.name = "height"
LAYER_HEIGHT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Layer.height"
LAYER_HEIGHT_FIELD.number = 5
LAYER_HEIGHT_FIELD.index = 4
LAYER_HEIGHT_FIELD.label = 1
LAYER_HEIGHT_FIELD.has_default_value = false
LAYER_HEIGHT_FIELD.default_value = 0
LAYER_HEIGHT_FIELD.type = 5
LAYER_HEIGHT_FIELD.cpp_type = 1

LAYER_TYPE_FIELD.name = "type"
LAYER_TYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Layer.type"
LAYER_TYPE_FIELD.number = 6
LAYER_TYPE_FIELD.index = 5
LAYER_TYPE_FIELD.label = 1
LAYER_TYPE_FIELD.has_default_value = false
LAYER_TYPE_FIELD.default_value = ""
LAYER_TYPE_FIELD.type = 9
LAYER_TYPE_FIELD.cpp_type = 9

LAYER.name = "Layer"
LAYER.full_name = ".com.xinqihd.sns.gameserver.proto.Layer"
LAYER.nested_types = {}
LAYER.enum_types = {}
LAYER.fields = {LAYER_ID_FIELD, LAYER_NUM_FIELD, LAYER_SCROLLRATE_FIELD, LAYER_WIDTH_FIELD, LAYER_HEIGHT_FIELD, LAYER_TYPE_FIELD}
LAYER.is_extendable = false
LAYER.extensions = {}
MAPDATA_ID_FIELD.name = "id"
MAPDATA_ID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.id"
MAPDATA_ID_FIELD.number = 1
MAPDATA_ID_FIELD.index = 0
MAPDATA_ID_FIELD.label = 2
MAPDATA_ID_FIELD.has_default_value = false
MAPDATA_ID_FIELD.default_value = ""
MAPDATA_ID_FIELD.type = 9
MAPDATA_ID_FIELD.cpp_type = 9

MAPDATA_NAME_FIELD.name = "name"
MAPDATA_NAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.name"
MAPDATA_NAME_FIELD.number = 2
MAPDATA_NAME_FIELD.index = 1
MAPDATA_NAME_FIELD.label = 1
MAPDATA_NAME_FIELD.has_default_value = false
MAPDATA_NAME_FIELD.default_value = ""
MAPDATA_NAME_FIELD.type = 9
MAPDATA_NAME_FIELD.cpp_type = 9

MAPDATA_TYPE_FIELD.name = "type"
MAPDATA_TYPE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.type"
MAPDATA_TYPE_FIELD.number = 3
MAPDATA_TYPE_FIELD.index = 2
MAPDATA_TYPE_FIELD.label = 1
MAPDATA_TYPE_FIELD.has_default_value = false
MAPDATA_TYPE_FIELD.default_value = 0
MAPDATA_TYPE_FIELD.type = 5
MAPDATA_TYPE_FIELD.cpp_type = 1

MAPDATA_REQLV_FIELD.name = "reqlv"
MAPDATA_REQLV_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.reqlv"
MAPDATA_REQLV_FIELD.number = 4
MAPDATA_REQLV_FIELD.index = 3
MAPDATA_REQLV_FIELD.label = 1
MAPDATA_REQLV_FIELD.has_default_value = false
MAPDATA_REQLV_FIELD.default_value = 0
MAPDATA_REQLV_FIELD.type = 5
MAPDATA_REQLV_FIELD.cpp_type = 1

MAPDATA_SCROLLAREAX_FIELD.name = "scrollAreaX"
MAPDATA_SCROLLAREAX_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.scrollAreaX"
MAPDATA_SCROLLAREAX_FIELD.number = 5
MAPDATA_SCROLLAREAX_FIELD.index = 4
MAPDATA_SCROLLAREAX_FIELD.label = 1
MAPDATA_SCROLLAREAX_FIELD.has_default_value = false
MAPDATA_SCROLLAREAX_FIELD.default_value = 0
MAPDATA_SCROLLAREAX_FIELD.type = 5
MAPDATA_SCROLLAREAX_FIELD.cpp_type = 1

MAPDATA_SCROLLAREAY_FIELD.name = "scrollAreaY"
MAPDATA_SCROLLAREAY_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.scrollAreaY"
MAPDATA_SCROLLAREAY_FIELD.number = 6
MAPDATA_SCROLLAREAY_FIELD.index = 5
MAPDATA_SCROLLAREAY_FIELD.label = 1
MAPDATA_SCROLLAREAY_FIELD.has_default_value = false
MAPDATA_SCROLLAREAY_FIELD.default_value = 0
MAPDATA_SCROLLAREAY_FIELD.type = 5
MAPDATA_SCROLLAREAY_FIELD.cpp_type = 1

MAPDATA_SCROLLAREAWIDTH_FIELD.name = "scrollAreaWidth"
MAPDATA_SCROLLAREAWIDTH_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.scrollAreaWidth"
MAPDATA_SCROLLAREAWIDTH_FIELD.number = 7
MAPDATA_SCROLLAREAWIDTH_FIELD.index = 6
MAPDATA_SCROLLAREAWIDTH_FIELD.label = 1
MAPDATA_SCROLLAREAWIDTH_FIELD.has_default_value = false
MAPDATA_SCROLLAREAWIDTH_FIELD.default_value = 0
MAPDATA_SCROLLAREAWIDTH_FIELD.type = 5
MAPDATA_SCROLLAREAWIDTH_FIELD.cpp_type = 1

MAPDATA_SCROLLAREAHEIGHT_FIELD.name = "scrollAreaHeight"
MAPDATA_SCROLLAREAHEIGHT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.scrollAreaHeight"
MAPDATA_SCROLLAREAHEIGHT_FIELD.number = 8
MAPDATA_SCROLLAREAHEIGHT_FIELD.index = 7
MAPDATA_SCROLLAREAHEIGHT_FIELD.label = 1
MAPDATA_SCROLLAREAHEIGHT_FIELD.has_default_value = false
MAPDATA_SCROLLAREAHEIGHT_FIELD.default_value = 0
MAPDATA_SCROLLAREAHEIGHT_FIELD.type = 5
MAPDATA_SCROLLAREAHEIGHT_FIELD.cpp_type = 1

MAPDATA_BGM_FIELD.name = "bgm"
MAPDATA_BGM_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.bgm"
MAPDATA_BGM_FIELD.number = 10
MAPDATA_BGM_FIELD.index = 8
MAPDATA_BGM_FIELD.label = 1
MAPDATA_BGM_FIELD.has_default_value = false
MAPDATA_BGM_FIELD.default_value = ""
MAPDATA_BGM_FIELD.type = 9
MAPDATA_BGM_FIELD.cpp_type = 9

MAPDATA_DAMAGE_FIELD.name = "damage"
MAPDATA_DAMAGE_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.damage"
MAPDATA_DAMAGE_FIELD.number = 11
MAPDATA_DAMAGE_FIELD.index = 9
MAPDATA_DAMAGE_FIELD.label = 1
MAPDATA_DAMAGE_FIELD.has_default_value = false
MAPDATA_DAMAGE_FIELD.default_value = false
MAPDATA_DAMAGE_FIELD.type = 8
MAPDATA_DAMAGE_FIELD.cpp_type = 7

MAPDATA_LAYERS_FIELD.name = "layers"
MAPDATA_LAYERS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.layers"
MAPDATA_LAYERS_FIELD.number = 9
MAPDATA_LAYERS_FIELD.index = 10
MAPDATA_LAYERS_FIELD.label = 3
MAPDATA_LAYERS_FIELD.has_default_value = false
MAPDATA_LAYERS_FIELD.default_value = {}
MAPDATA_LAYERS_FIELD.message_type = LAYER
MAPDATA_LAYERS_FIELD.type = 11
MAPDATA_LAYERS_FIELD.cpp_type = 10

MAPDATA_BOSSES_FIELD.name = "bosses"
MAPDATA_BOSSES_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.bosses"
MAPDATA_BOSSES_FIELD.number = 12
MAPDATA_BOSSES_FIELD.index = 11
MAPDATA_BOSSES_FIELD.label = 3
MAPDATA_BOSSES_FIELD.has_default_value = false
MAPDATA_BOSSES_FIELD.default_value = {}
MAPDATA_BOSSES_FIELD.message_type = ENEMY
MAPDATA_BOSSES_FIELD.type = 11
MAPDATA_BOSSES_FIELD.cpp_type = 10

MAPDATA_ENEMIES_FIELD.name = "enemies"
MAPDATA_ENEMIES_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.enemies"
MAPDATA_ENEMIES_FIELD.number = 13
MAPDATA_ENEMIES_FIELD.index = 12
MAPDATA_ENEMIES_FIELD.label = 3
MAPDATA_ENEMIES_FIELD.has_default_value = false
MAPDATA_ENEMIES_FIELD.default_value = {}
MAPDATA_ENEMIES_FIELD.message_type = ENEMY
MAPDATA_ENEMIES_FIELD.type = 11
MAPDATA_ENEMIES_FIELD.cpp_type = 10

MAPDATA_STARTPOINTS_FIELD.name = "startPoints"
MAPDATA_STARTPOINTS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.startPoints"
MAPDATA_STARTPOINTS_FIELD.number = 14
MAPDATA_STARTPOINTS_FIELD.index = 13
MAPDATA_STARTPOINTS_FIELD.label = 3
MAPDATA_STARTPOINTS_FIELD.has_default_value = false
MAPDATA_STARTPOINTS_FIELD.default_value = {}
MAPDATA_STARTPOINTS_FIELD.message_type = POINT
MAPDATA_STARTPOINTS_FIELD.type = 11
MAPDATA_STARTPOINTS_FIELD.cpp_type = 10

MAPDATA_HIDDEN_FIELD.name = "hidden"
MAPDATA_HIDDEN_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.MapData.hidden"
MAPDATA_HIDDEN_FIELD.number = 15
MAPDATA_HIDDEN_FIELD.index = 14
MAPDATA_HIDDEN_FIELD.label = 1
MAPDATA_HIDDEN_FIELD.has_default_value = false
MAPDATA_HIDDEN_FIELD.default_value = false
MAPDATA_HIDDEN_FIELD.type = 8
MAPDATA_HIDDEN_FIELD.cpp_type = 7

MAPDATA.name = "MapData"
MAPDATA.full_name = ".com.xinqihd.sns.gameserver.proto.MapData"
MAPDATA.nested_types = {}
MAPDATA.enum_types = {}
MAPDATA.fields = {MAPDATA_ID_FIELD, MAPDATA_NAME_FIELD, MAPDATA_TYPE_FIELD, MAPDATA_REQLV_FIELD, MAPDATA_SCROLLAREAX_FIELD, MAPDATA_SCROLLAREAY_FIELD, MAPDATA_SCROLLAREAWIDTH_FIELD, MAPDATA_SCROLLAREAHEIGHT_FIELD, MAPDATA_BGM_FIELD, MAPDATA_DAMAGE_FIELD, MAPDATA_LAYERS_FIELD, MAPDATA_BOSSES_FIELD, MAPDATA_ENEMIES_FIELD, MAPDATA_STARTPOINTS_FIELD, MAPDATA_HIDDEN_FIELD}
MAPDATA.is_extendable = false
MAPDATA.extensions = {}
BSEMAP_MAPS_FIELD.name = "maps"
BSEMAP_MAPS_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseMap.maps"
BSEMAP_MAPS_FIELD.number = 1
BSEMAP_MAPS_FIELD.index = 0
BSEMAP_MAPS_FIELD.label = 3
BSEMAP_MAPS_FIELD.has_default_value = false
BSEMAP_MAPS_FIELD.default_value = {}
BSEMAP_MAPS_FIELD.message_type = MAPDATA
BSEMAP_MAPS_FIELD.type = 11
BSEMAP_MAPS_FIELD.cpp_type = 10

BSEMAP.name = "BseMap"
BSEMAP.full_name = ".com.xinqihd.sns.gameserver.proto.BseMap"
BSEMAP.nested_types = {}
BSEMAP.enum_types = {}
BSEMAP.fields = {BSEMAP_MAPS_FIELD}
BSEMAP.is_extendable = false
BSEMAP.extensions = {}

BseMap = protobuf.Message(BSEMAP)
Enemy = protobuf.Message(ENEMY)
Layer = protobuf.Message(LAYER)
MapData = protobuf.Message(MAPDATA)
Point = protobuf.Message(POINT)
_G.BSEMAP_PB_BSEMAP = BSEMAP
_G.ENEMY_PB_ENEMY = ENEMY
_G.LAYER_PB_LAYER = LAYER
_G.MAPDATA_PB_MAPDATA = MAPDATA
_G.POINT_PB_POINT = POINT

