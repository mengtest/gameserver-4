-- Generated By protoc-gen-lua Do not Edit
local protobuf = require "protobuf"
module('BseServerList_pb', package.seeall)


local SERVER = protobuf.Descriptor();
local SERVER_SERVERID_FIELD = protobuf.FieldDescriptor();
local SERVER_HOST_FIELD = protobuf.FieldDescriptor();
local SERVER_PORT_FIELD = protobuf.FieldDescriptor();
local SERVER_NAME_FIELD = protobuf.FieldDescriptor();
local SERVER_ISNEW_FIELD = protobuf.FieldDescriptor();
local SERVER_ISHOT_FIELD = protobuf.FieldDescriptor();
local SERVER_ROLENUM_FIELD = protobuf.FieldDescriptor();
local SERVER_STARTSECOND_FIELD = protobuf.FieldDescriptor();
local SERVER_RESERVED1_FIELD = protobuf.FieldDescriptor();
local SERVER_RESERVED2_FIELD = protobuf.FieldDescriptor();
local SERVER_RESERVED3_FIELD = protobuf.FieldDescriptor();
local BSESERVERLIST = protobuf.Descriptor();
local BSESERVERLIST_RECOMMEND_FIELD = protobuf.FieldDescriptor();
local BSESERVERLIST_LASTSERVER_FIELD = protobuf.FieldDescriptor();
local BSESERVERLIST_LASTUSERID_FIELD = protobuf.FieldDescriptor();
local BSESERVERLIST_LASTROLENAME_FIELD = protobuf.FieldDescriptor();
local BSESERVERLIST_SERVERLIST_FIELD = protobuf.FieldDescriptor();

SERVER_SERVERID_FIELD.name = "serverid"
SERVER_SERVERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.serverid"
SERVER_SERVERID_FIELD.number = 1
SERVER_SERVERID_FIELD.index = 0
SERVER_SERVERID_FIELD.label = 1
SERVER_SERVERID_FIELD.has_default_value = false
SERVER_SERVERID_FIELD.default_value = ""
SERVER_SERVERID_FIELD.type = 9
SERVER_SERVERID_FIELD.cpp_type = 9

SERVER_HOST_FIELD.name = "host"
SERVER_HOST_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.host"
SERVER_HOST_FIELD.number = 2
SERVER_HOST_FIELD.index = 1
SERVER_HOST_FIELD.label = 1
SERVER_HOST_FIELD.has_default_value = false
SERVER_HOST_FIELD.default_value = ""
SERVER_HOST_FIELD.type = 9
SERVER_HOST_FIELD.cpp_type = 9

SERVER_PORT_FIELD.name = "port"
SERVER_PORT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.port"
SERVER_PORT_FIELD.number = 3
SERVER_PORT_FIELD.index = 2
SERVER_PORT_FIELD.label = 1
SERVER_PORT_FIELD.has_default_value = false
SERVER_PORT_FIELD.default_value = 0
SERVER_PORT_FIELD.type = 5
SERVER_PORT_FIELD.cpp_type = 1

SERVER_NAME_FIELD.name = "name"
SERVER_NAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.name"
SERVER_NAME_FIELD.number = 4
SERVER_NAME_FIELD.index = 3
SERVER_NAME_FIELD.label = 1
SERVER_NAME_FIELD.has_default_value = false
SERVER_NAME_FIELD.default_value = ""
SERVER_NAME_FIELD.type = 9
SERVER_NAME_FIELD.cpp_type = 9

SERVER_ISNEW_FIELD.name = "isnew"
SERVER_ISNEW_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.isnew"
SERVER_ISNEW_FIELD.number = 5
SERVER_ISNEW_FIELD.index = 4
SERVER_ISNEW_FIELD.label = 1
SERVER_ISNEW_FIELD.has_default_value = false
SERVER_ISNEW_FIELD.default_value = false
SERVER_ISNEW_FIELD.type = 8
SERVER_ISNEW_FIELD.cpp_type = 7

SERVER_ISHOT_FIELD.name = "ishot"
SERVER_ISHOT_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.ishot"
SERVER_ISHOT_FIELD.number = 6
SERVER_ISHOT_FIELD.index = 5
SERVER_ISHOT_FIELD.label = 1
SERVER_ISHOT_FIELD.has_default_value = false
SERVER_ISHOT_FIELD.default_value = false
SERVER_ISHOT_FIELD.type = 8
SERVER_ISHOT_FIELD.cpp_type = 7

SERVER_ROLENUM_FIELD.name = "rolenum"
SERVER_ROLENUM_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.rolenum"
SERVER_ROLENUM_FIELD.number = 7
SERVER_ROLENUM_FIELD.index = 6
SERVER_ROLENUM_FIELD.label = 1
SERVER_ROLENUM_FIELD.has_default_value = false
SERVER_ROLENUM_FIELD.default_value = 0
SERVER_ROLENUM_FIELD.type = 5
SERVER_ROLENUM_FIELD.cpp_type = 1

SERVER_STARTSECOND_FIELD.name = "startSecond"
SERVER_STARTSECOND_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.startSecond"
SERVER_STARTSECOND_FIELD.number = 8
SERVER_STARTSECOND_FIELD.index = 7
SERVER_STARTSECOND_FIELD.label = 1
SERVER_STARTSECOND_FIELD.has_default_value = false
SERVER_STARTSECOND_FIELD.default_value = 0
SERVER_STARTSECOND_FIELD.type = 5
SERVER_STARTSECOND_FIELD.cpp_type = 1

SERVER_RESERVED1_FIELD.name = "reserved1"
SERVER_RESERVED1_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.reserved1"
SERVER_RESERVED1_FIELD.number = 9
SERVER_RESERVED1_FIELD.index = 8
SERVER_RESERVED1_FIELD.label = 1
SERVER_RESERVED1_FIELD.has_default_value = false
SERVER_RESERVED1_FIELD.default_value = ""
SERVER_RESERVED1_FIELD.type = 9
SERVER_RESERVED1_FIELD.cpp_type = 9

SERVER_RESERVED2_FIELD.name = "reserved2"
SERVER_RESERVED2_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.reserved2"
SERVER_RESERVED2_FIELD.number = 10
SERVER_RESERVED2_FIELD.index = 9
SERVER_RESERVED2_FIELD.label = 1
SERVER_RESERVED2_FIELD.has_default_value = false
SERVER_RESERVED2_FIELD.default_value = ""
SERVER_RESERVED2_FIELD.type = 9
SERVER_RESERVED2_FIELD.cpp_type = 9

SERVER_RESERVED3_FIELD.name = "reserved3"
SERVER_RESERVED3_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.Server.reserved3"
SERVER_RESERVED3_FIELD.number = 11
SERVER_RESERVED3_FIELD.index = 10
SERVER_RESERVED3_FIELD.label = 1
SERVER_RESERVED3_FIELD.has_default_value = false
SERVER_RESERVED3_FIELD.default_value = ""
SERVER_RESERVED3_FIELD.type = 9
SERVER_RESERVED3_FIELD.cpp_type = 9

SERVER.name = "Server"
SERVER.full_name = ".com.xinqihd.sns.gameserver.proto.Server"
SERVER.nested_types = {}
SERVER.enum_types = {}
SERVER.fields = {SERVER_SERVERID_FIELD, SERVER_HOST_FIELD, SERVER_PORT_FIELD, SERVER_NAME_FIELD, SERVER_ISNEW_FIELD, SERVER_ISHOT_FIELD, SERVER_ROLENUM_FIELD, SERVER_STARTSECOND_FIELD, SERVER_RESERVED1_FIELD, SERVER_RESERVED2_FIELD, SERVER_RESERVED3_FIELD}
SERVER.is_extendable = false
SERVER.extensions = {}
BSESERVERLIST_RECOMMEND_FIELD.name = "recommend"
BSESERVERLIST_RECOMMEND_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseServerList.recommend"
BSESERVERLIST_RECOMMEND_FIELD.number = 1
BSESERVERLIST_RECOMMEND_FIELD.index = 0
BSESERVERLIST_RECOMMEND_FIELD.label = 1
BSESERVERLIST_RECOMMEND_FIELD.has_default_value = false
BSESERVERLIST_RECOMMEND_FIELD.default_value = nil
BSESERVERLIST_RECOMMEND_FIELD.message_type = SERVER
BSESERVERLIST_RECOMMEND_FIELD.type = 11
BSESERVERLIST_RECOMMEND_FIELD.cpp_type = 10

BSESERVERLIST_LASTSERVER_FIELD.name = "lastserver"
BSESERVERLIST_LASTSERVER_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseServerList.lastserver"
BSESERVERLIST_LASTSERVER_FIELD.number = 2
BSESERVERLIST_LASTSERVER_FIELD.index = 1
BSESERVERLIST_LASTSERVER_FIELD.label = 1
BSESERVERLIST_LASTSERVER_FIELD.has_default_value = false
BSESERVERLIST_LASTSERVER_FIELD.default_value = nil
BSESERVERLIST_LASTSERVER_FIELD.message_type = SERVER
BSESERVERLIST_LASTSERVER_FIELD.type = 11
BSESERVERLIST_LASTSERVER_FIELD.cpp_type = 10

BSESERVERLIST_LASTUSERID_FIELD.name = "lastuserid"
BSESERVERLIST_LASTUSERID_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseServerList.lastuserid"
BSESERVERLIST_LASTUSERID_FIELD.number = 3
BSESERVERLIST_LASTUSERID_FIELD.index = 2
BSESERVERLIST_LASTUSERID_FIELD.label = 1
BSESERVERLIST_LASTUSERID_FIELD.has_default_value = false
BSESERVERLIST_LASTUSERID_FIELD.default_value = ""
BSESERVERLIST_LASTUSERID_FIELD.type = 9
BSESERVERLIST_LASTUSERID_FIELD.cpp_type = 9

BSESERVERLIST_LASTROLENAME_FIELD.name = "lastrolename"
BSESERVERLIST_LASTROLENAME_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseServerList.lastrolename"
BSESERVERLIST_LASTROLENAME_FIELD.number = 4
BSESERVERLIST_LASTROLENAME_FIELD.index = 3
BSESERVERLIST_LASTROLENAME_FIELD.label = 1
BSESERVERLIST_LASTROLENAME_FIELD.has_default_value = false
BSESERVERLIST_LASTROLENAME_FIELD.default_value = ""
BSESERVERLIST_LASTROLENAME_FIELD.type = 9
BSESERVERLIST_LASTROLENAME_FIELD.cpp_type = 9

BSESERVERLIST_SERVERLIST_FIELD.name = "serverlist"
BSESERVERLIST_SERVERLIST_FIELD.full_name = ".com.xinqihd.sns.gameserver.proto.BseServerList.serverlist"
BSESERVERLIST_SERVERLIST_FIELD.number = 5
BSESERVERLIST_SERVERLIST_FIELD.index = 4
BSESERVERLIST_SERVERLIST_FIELD.label = 3
BSESERVERLIST_SERVERLIST_FIELD.has_default_value = false
BSESERVERLIST_SERVERLIST_FIELD.default_value = {}
BSESERVERLIST_SERVERLIST_FIELD.message_type = SERVER
BSESERVERLIST_SERVERLIST_FIELD.type = 11
BSESERVERLIST_SERVERLIST_FIELD.cpp_type = 10

BSESERVERLIST.name = "BseServerList"
BSESERVERLIST.full_name = ".com.xinqihd.sns.gameserver.proto.BseServerList"
BSESERVERLIST.nested_types = {}
BSESERVERLIST.enum_types = {}
BSESERVERLIST.fields = {BSESERVERLIST_RECOMMEND_FIELD, BSESERVERLIST_LASTSERVER_FIELD, BSESERVERLIST_LASTUSERID_FIELD, BSESERVERLIST_LASTROLENAME_FIELD, BSESERVERLIST_SERVERLIST_FIELD}
BSESERVERLIST.is_extendable = false
BSESERVERLIST.extensions = {}

BseServerList = protobuf.Message(BSESERVERLIST)
Server = protobuf.Message(SERVER)
_G.BSESERVERLIST_PB_BSESERVERLIST = BSESERVERLIST
_G.SERVER_PB_SERVER = SERVER
