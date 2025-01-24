// GENERATED CODE - DO NOT MODIFY BY HAND

part of 'get_detailed_node_info_ok.dart';

// **************************************************************************
// BuiltValueGenerator
// **************************************************************************

class _$GetDetailedNodeInfoOK extends GetDetailedNodeInfoOK {
  @override
  final String? getUrl;
  @override
  final String nodeId;
  @override
  final NodeStatus status;
  @override
  final int? fileCount;
  @override
  final int? profileCount;
  @override
  final int? folderCount;
  @override
  final int? vcCount;
  @override
  final String name;
  @override
  final String consumerId;
  @override
  final String parentNodeId;
  @override
  final String profileId;
  @override
  final String createdAt;
  @override
  final String modifiedAt;
  @override
  final String createdBy;
  @override
  final String modifiedBy;
  @override
  final String? description;
  @override
  final NodeType type;
  @override
  final String? link;
  @override
  final String? schema;
  @override
  final int? consumedFileStorage;
  @override
  final EdekInfo? edekInfo;
  @override
  final String? metadata;

  factory _$GetDetailedNodeInfoOK(
          [void Function(GetDetailedNodeInfoOKBuilder)? updates]) =>
      (new GetDetailedNodeInfoOKBuilder()..update(updates))._build();

  _$GetDetailedNodeInfoOK._(
      {this.getUrl,
      required this.nodeId,
      required this.status,
      this.fileCount,
      this.profileCount,
      this.folderCount,
      this.vcCount,
      required this.name,
      required this.consumerId,
      required this.parentNodeId,
      required this.profileId,
      required this.createdAt,
      required this.modifiedAt,
      required this.createdBy,
      required this.modifiedBy,
      this.description,
      required this.type,
      this.link,
      this.schema,
      this.consumedFileStorage,
      this.edekInfo,
      this.metadata})
      : super._() {
    BuiltValueNullFieldError.checkNotNull(
        nodeId, r'GetDetailedNodeInfoOK', 'nodeId');
    BuiltValueNullFieldError.checkNotNull(
        status, r'GetDetailedNodeInfoOK', 'status');
    BuiltValueNullFieldError.checkNotNull(
        name, r'GetDetailedNodeInfoOK', 'name');
    BuiltValueNullFieldError.checkNotNull(
        consumerId, r'GetDetailedNodeInfoOK', 'consumerId');
    BuiltValueNullFieldError.checkNotNull(
        parentNodeId, r'GetDetailedNodeInfoOK', 'parentNodeId');
    BuiltValueNullFieldError.checkNotNull(
        profileId, r'GetDetailedNodeInfoOK', 'profileId');
    BuiltValueNullFieldError.checkNotNull(
        createdAt, r'GetDetailedNodeInfoOK', 'createdAt');
    BuiltValueNullFieldError.checkNotNull(
        modifiedAt, r'GetDetailedNodeInfoOK', 'modifiedAt');
    BuiltValueNullFieldError.checkNotNull(
        createdBy, r'GetDetailedNodeInfoOK', 'createdBy');
    BuiltValueNullFieldError.checkNotNull(
        modifiedBy, r'GetDetailedNodeInfoOK', 'modifiedBy');
    BuiltValueNullFieldError.checkNotNull(
        type, r'GetDetailedNodeInfoOK', 'type');
  }

  @override
  GetDetailedNodeInfoOK rebuild(
          void Function(GetDetailedNodeInfoOKBuilder) updates) =>
      (toBuilder()..update(updates)).build();

  @override
  GetDetailedNodeInfoOKBuilder toBuilder() =>
      new GetDetailedNodeInfoOKBuilder()..replace(this);

  @override
  bool operator ==(Object other) {
    if (identical(other, this)) return true;
    return other is GetDetailedNodeInfoOK &&
        getUrl == other.getUrl &&
        nodeId == other.nodeId &&
        status == other.status &&
        fileCount == other.fileCount &&
        profileCount == other.profileCount &&
        folderCount == other.folderCount &&
        vcCount == other.vcCount &&
        name == other.name &&
        consumerId == other.consumerId &&
        parentNodeId == other.parentNodeId &&
        profileId == other.profileId &&
        createdAt == other.createdAt &&
        modifiedAt == other.modifiedAt &&
        createdBy == other.createdBy &&
        modifiedBy == other.modifiedBy &&
        description == other.description &&
        type == other.type &&
        link == other.link &&
        schema == other.schema &&
        consumedFileStorage == other.consumedFileStorage &&
        edekInfo == other.edekInfo &&
        metadata == other.metadata;
  }

  @override
  int get hashCode {
    var _$hash = 0;
    _$hash = $jc(_$hash, getUrl.hashCode);
    _$hash = $jc(_$hash, nodeId.hashCode);
    _$hash = $jc(_$hash, status.hashCode);
    _$hash = $jc(_$hash, fileCount.hashCode);
    _$hash = $jc(_$hash, profileCount.hashCode);
    _$hash = $jc(_$hash, folderCount.hashCode);
    _$hash = $jc(_$hash, vcCount.hashCode);
    _$hash = $jc(_$hash, name.hashCode);
    _$hash = $jc(_$hash, consumerId.hashCode);
    _$hash = $jc(_$hash, parentNodeId.hashCode);
    _$hash = $jc(_$hash, profileId.hashCode);
    _$hash = $jc(_$hash, createdAt.hashCode);
    _$hash = $jc(_$hash, modifiedAt.hashCode);
    _$hash = $jc(_$hash, createdBy.hashCode);
    _$hash = $jc(_$hash, modifiedBy.hashCode);
    _$hash = $jc(_$hash, description.hashCode);
    _$hash = $jc(_$hash, type.hashCode);
    _$hash = $jc(_$hash, link.hashCode);
    _$hash = $jc(_$hash, schema.hashCode);
    _$hash = $jc(_$hash, consumedFileStorage.hashCode);
    _$hash = $jc(_$hash, edekInfo.hashCode);
    _$hash = $jc(_$hash, metadata.hashCode);
    _$hash = $jf(_$hash);
    return _$hash;
  }

  @override
  String toString() {
    return (newBuiltValueToStringHelper(r'GetDetailedNodeInfoOK')
          ..add('getUrl', getUrl)
          ..add('nodeId', nodeId)
          ..add('status', status)
          ..add('fileCount', fileCount)
          ..add('profileCount', profileCount)
          ..add('folderCount', folderCount)
          ..add('vcCount', vcCount)
          ..add('name', name)
          ..add('consumerId', consumerId)
          ..add('parentNodeId', parentNodeId)
          ..add('profileId', profileId)
          ..add('createdAt', createdAt)
          ..add('modifiedAt', modifiedAt)
          ..add('createdBy', createdBy)
          ..add('modifiedBy', modifiedBy)
          ..add('description', description)
          ..add('type', type)
          ..add('link', link)
          ..add('schema', schema)
          ..add('consumedFileStorage', consumedFileStorage)
          ..add('edekInfo', edekInfo)
          ..add('metadata', metadata))
        .toString();
  }
}

class GetDetailedNodeInfoOKBuilder
    implements
        Builder<GetDetailedNodeInfoOK, GetDetailedNodeInfoOKBuilder>,
        NodeDtoBuilder {
  _$GetDetailedNodeInfoOK? _$v;

  String? _getUrl;
  String? get getUrl => _$this._getUrl;
  set getUrl(covariant String? getUrl) => _$this._getUrl = getUrl;

  String? _nodeId;
  String? get nodeId => _$this._nodeId;
  set nodeId(covariant String? nodeId) => _$this._nodeId = nodeId;

  NodeStatus? _status;
  NodeStatus? get status => _$this._status;
  set status(covariant NodeStatus? status) => _$this._status = status;

  int? _fileCount;
  int? get fileCount => _$this._fileCount;
  set fileCount(covariant int? fileCount) => _$this._fileCount = fileCount;

  int? _profileCount;
  int? get profileCount => _$this._profileCount;
  set profileCount(covariant int? profileCount) =>
      _$this._profileCount = profileCount;

  int? _folderCount;
  int? get folderCount => _$this._folderCount;
  set folderCount(covariant int? folderCount) =>
      _$this._folderCount = folderCount;

  int? _vcCount;
  int? get vcCount => _$this._vcCount;
  set vcCount(covariant int? vcCount) => _$this._vcCount = vcCount;

  String? _name;
  String? get name => _$this._name;
  set name(covariant String? name) => _$this._name = name;

  String? _consumerId;
  String? get consumerId => _$this._consumerId;
  set consumerId(covariant String? consumerId) =>
      _$this._consumerId = consumerId;

  String? _parentNodeId;
  String? get parentNodeId => _$this._parentNodeId;
  set parentNodeId(covariant String? parentNodeId) =>
      _$this._parentNodeId = parentNodeId;

  String? _profileId;
  String? get profileId => _$this._profileId;
  set profileId(covariant String? profileId) => _$this._profileId = profileId;

  String? _createdAt;
  String? get createdAt => _$this._createdAt;
  set createdAt(covariant String? createdAt) => _$this._createdAt = createdAt;

  String? _modifiedAt;
  String? get modifiedAt => _$this._modifiedAt;
  set modifiedAt(covariant String? modifiedAt) =>
      _$this._modifiedAt = modifiedAt;

  String? _createdBy;
  String? get createdBy => _$this._createdBy;
  set createdBy(covariant String? createdBy) => _$this._createdBy = createdBy;

  String? _modifiedBy;
  String? get modifiedBy => _$this._modifiedBy;
  set modifiedBy(covariant String? modifiedBy) =>
      _$this._modifiedBy = modifiedBy;

  String? _description;
  String? get description => _$this._description;
  set description(covariant String? description) =>
      _$this._description = description;

  NodeType? _type;
  NodeType? get type => _$this._type;
  set type(covariant NodeType? type) => _$this._type = type;

  String? _link;
  String? get link => _$this._link;
  set link(covariant String? link) => _$this._link = link;

  String? _schema;
  String? get schema => _$this._schema;
  set schema(covariant String? schema) => _$this._schema = schema;

  int? _consumedFileStorage;
  int? get consumedFileStorage => _$this._consumedFileStorage;
  set consumedFileStorage(covariant int? consumedFileStorage) =>
      _$this._consumedFileStorage = consumedFileStorage;

  EdekInfoBuilder? _edekInfo;
  EdekInfoBuilder get edekInfo => _$this._edekInfo ??= new EdekInfoBuilder();
  set edekInfo(covariant EdekInfoBuilder? edekInfo) =>
      _$this._edekInfo = edekInfo;

  String? _metadata;
  String? get metadata => _$this._metadata;
  set metadata(covariant String? metadata) => _$this._metadata = metadata;

  GetDetailedNodeInfoOKBuilder() {
    GetDetailedNodeInfoOK._defaults(this);
  }

  GetDetailedNodeInfoOKBuilder get _$this {
    final $v = _$v;
    if ($v != null) {
      _getUrl = $v.getUrl;
      _nodeId = $v.nodeId;
      _status = $v.status;
      _fileCount = $v.fileCount;
      _profileCount = $v.profileCount;
      _folderCount = $v.folderCount;
      _vcCount = $v.vcCount;
      _name = $v.name;
      _consumerId = $v.consumerId;
      _parentNodeId = $v.parentNodeId;
      _profileId = $v.profileId;
      _createdAt = $v.createdAt;
      _modifiedAt = $v.modifiedAt;
      _createdBy = $v.createdBy;
      _modifiedBy = $v.modifiedBy;
      _description = $v.description;
      _type = $v.type;
      _link = $v.link;
      _schema = $v.schema;
      _consumedFileStorage = $v.consumedFileStorage;
      _edekInfo = $v.edekInfo?.toBuilder();
      _metadata = $v.metadata;
      _$v = null;
    }
    return this;
  }

  @override
  void replace(covariant GetDetailedNodeInfoOK other) {
    ArgumentError.checkNotNull(other, 'other');
    _$v = other as _$GetDetailedNodeInfoOK;
  }

  @override
  void update(void Function(GetDetailedNodeInfoOKBuilder)? updates) {
    if (updates != null) updates(this);
  }

  @override
  GetDetailedNodeInfoOK build() => _build();

  _$GetDetailedNodeInfoOK _build() {
    _$GetDetailedNodeInfoOK _$result;
    try {
      _$result = _$v ??
          new _$GetDetailedNodeInfoOK._(
            getUrl: getUrl,
            nodeId: BuiltValueNullFieldError.checkNotNull(
                nodeId, r'GetDetailedNodeInfoOK', 'nodeId'),
            status: BuiltValueNullFieldError.checkNotNull(
                status, r'GetDetailedNodeInfoOK', 'status'),
            fileCount: fileCount,
            profileCount: profileCount,
            folderCount: folderCount,
            vcCount: vcCount,
            name: BuiltValueNullFieldError.checkNotNull(
                name, r'GetDetailedNodeInfoOK', 'name'),
            consumerId: BuiltValueNullFieldError.checkNotNull(
                consumerId, r'GetDetailedNodeInfoOK', 'consumerId'),
            parentNodeId: BuiltValueNullFieldError.checkNotNull(
                parentNodeId, r'GetDetailedNodeInfoOK', 'parentNodeId'),
            profileId: BuiltValueNullFieldError.checkNotNull(
                profileId, r'GetDetailedNodeInfoOK', 'profileId'),
            createdAt: BuiltValueNullFieldError.checkNotNull(
                createdAt, r'GetDetailedNodeInfoOK', 'createdAt'),
            modifiedAt: BuiltValueNullFieldError.checkNotNull(
                modifiedAt, r'GetDetailedNodeInfoOK', 'modifiedAt'),
            createdBy: BuiltValueNullFieldError.checkNotNull(
                createdBy, r'GetDetailedNodeInfoOK', 'createdBy'),
            modifiedBy: BuiltValueNullFieldError.checkNotNull(
                modifiedBy, r'GetDetailedNodeInfoOK', 'modifiedBy'),
            description: description,
            type: BuiltValueNullFieldError.checkNotNull(
                type, r'GetDetailedNodeInfoOK', 'type'),
            link: link,
            schema: schema,
            consumedFileStorage: consumedFileStorage,
            edekInfo: _edekInfo?.build(),
            metadata: metadata,
          );
    } catch (_) {
      late String _$failedField;
      try {
        _$failedField = 'edekInfo';
        _edekInfo?.build();
      } catch (e) {
        throw new BuiltValueNestedFieldError(
            r'GetDetailedNodeInfoOK', _$failedField, e.toString());
      }
      rethrow;
    }
    replace(_$result);
    return _$result;
  }
}

// ignore_for_file: deprecated_member_use_from_same_package,type=lint
