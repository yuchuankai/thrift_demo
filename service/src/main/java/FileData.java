/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.nio.ByteBuffer;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 文件传输类
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2022-10-27")
public class FileData implements org.apache.thrift.TBase<FileData, FileData._Fields>, java.io.Serializable, Cloneable, Comparable<FileData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FileData");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BUFF_FIELD_DESC = new org.apache.thrift.protocol.TField("buff", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FileDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FileDataTupleSchemeFactory());
  }

  public String name; // required
  public ByteBuffer buff; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    BUFF((short)2, "buff");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // BUFF
          return BUFF;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BUFF, new org.apache.thrift.meta_data.FieldMetaData("buff", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FileData.class, metaDataMap);
  }

  public FileData() {
  }

  public FileData(
    String name,
    ByteBuffer buff)
  {
    this();
    this.name = name;
    this.buff = org.apache.thrift.TBaseHelper.copyBinary(buff);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FileData(FileData other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetBuff()) {
      this.buff = org.apache.thrift.TBaseHelper.copyBinary(other.buff);
    }
  }

  public FileData deepCopy() {
    return new FileData(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.buff = null;
  }

  public String getName() {
    return this.name;
  }

  public FileData setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public byte[] getBuff() {
    setBuff(org.apache.thrift.TBaseHelper.rightSize(buff));
    return buff == null ? null : buff.array();
  }

  public ByteBuffer bufferForBuff() {
    return org.apache.thrift.TBaseHelper.copyBinary(buff);
  }

  public FileData setBuff(byte[] buff) {
    this.buff = buff == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(buff, buff.length));
    return this;
  }

  public FileData setBuff(ByteBuffer buff) {
    this.buff = org.apache.thrift.TBaseHelper.copyBinary(buff);
    return this;
  }

  public void unsetBuff() {
    this.buff = null;
  }

  /** Returns true if field buff is set (has been assigned a value) and false otherwise */
  public boolean isSetBuff() {
    return this.buff != null;
  }

  public void setBuffIsSet(boolean value) {
    if (!value) {
      this.buff = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case BUFF:
      if (value == null) {
        unsetBuff();
      } else {
        setBuff((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case BUFF:
      return getBuff();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case BUFF:
      return isSetBuff();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FileData)
      return this.equals((FileData)that);
    return false;
  }

  public boolean equals(FileData that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_buff = true && this.isSetBuff();
    boolean that_present_buff = true && that.isSetBuff();
    if (this_present_buff || that_present_buff) {
      if (!(this_present_buff && that_present_buff))
        return false;
      if (!this.buff.equals(that.buff))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_buff = true && (isSetBuff());
    list.add(present_buff);
    if (present_buff)
      list.add(buff);

    return list.hashCode();
  }

  @Override
  public int compareTo(FileData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuff()).compareTo(other.isSetBuff());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuff()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buff, other.buff);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FileData(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("buff:");
    if (this.buff == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.buff, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (name == null) {
      throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (buff == null) {
      throw new TProtocolException("Required field 'buff' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FileDataStandardSchemeFactory implements SchemeFactory {
    public FileDataStandardScheme getScheme() {
      return new FileDataStandardScheme();
    }
  }

  private static class FileDataStandardScheme extends StandardScheme<FileData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FileData struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BUFF
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.buff = iprot.readBinary();
              struct.setBuffIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, FileData struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.buff != null) {
        oprot.writeFieldBegin(BUFF_FIELD_DESC);
        oprot.writeBinary(struct.buff);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FileDataTupleSchemeFactory implements SchemeFactory {
    public FileDataTupleScheme getScheme() {
      return new FileDataTupleScheme();
    }
  }

  private static class FileDataTupleScheme extends TupleScheme<FileData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FileData struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeBinary(struct.buff);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FileData struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.buff = iprot.readBinary();
      struct.setBuffIsSet(true);
    }
  }

}

