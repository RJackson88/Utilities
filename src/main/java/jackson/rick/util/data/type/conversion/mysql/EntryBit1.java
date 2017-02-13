/**
 * Created by rickjackson on 2/11/17.
 */
package jackson.rick.util.data.type.conversion.mysql;

import jackson.rick.util.data.Entry;

import java.util.UUID;

/**
 * The EntryBit class is a representation of a single cell
 * (field-record intersection) of a MySQL BIT field type with an
 * SQL return VALUE of a BIT, that would be returned as a
 * java.lang.Boolean class with additional needed fields declared.
 */
public class EntryBit1 extends Entry {
    //public static final EntryBit1 TRUE = new EntryBit1(true);
    //public static final EntryBit1 FALSE = new EntryBit1(false);
    //public static final Class<Entry> TYPE = Entry.class;
    public static final UUID UID = UUID.randomUUID();
    public static UUID FIELD_UID;
    public static UUID RECORD_UID;
    public static boolean VALUE;
    
    public EntryBit1(UUID fieldUID, UUID recordUID, boolean value) {
        this.FIELD_UID = fieldUID;
        this.RECORD_UID = recordUID;
        this.VALUE = new Boolean(value);
    }
    
    public EntryBit1(boolean value) {
        this.VALUE = value;
    }
    
    public EntryBit1(String s) {
        this(Boolean.parseBoolean(s));
    }
    
    public UUID UID() {
        return this.UID;
    }
    
    public UUID getFieldUUID() {
        return this.FIELD_UID;
    }
    
    public UUID getRecordUUID() {
        return this.RECORD_UID;
    }
    
    public UUID[] getFieldAndRecordUUID() {
        UUID[] fr = new UUID[2];
        fr[0] = getFieldUUID();
        fr[1] = getRecordUUID();
        return fr;
    }
    //
    //public static EntryBit1 parseCellBit(String s) {
    //    return ((s != null) && s.equalsIgnoreCase("true")
    //            ? TRUE : FALSE);
    //}
    //
    //public boolean booleanValue() {
    //    return this.VALUE;
    //}
    //
    //public static EntryBit1 valueOf(boolean b) {
    //    return (b ? TRUE : FALSE);
    //}
    //
    //public static EntryBit1 valueOf(String s) {
    //    return Boolean.parseBoolean(s) ? TRUE : FALSE;
    //}
    //
    //public String toString() {
    //    return this.VALUE ? "true" : "false";
    //}
    //
    //public int hashCode() {
    //    return this.hashCode();
    //}
    //
    //public int booleanHashCode(boolean VALUE) {
    //    return VALUE ? 1231 : 1237;
    //}
    //
    //public boolean equals(Object obj) {
    //    if (obj instanceof EntryBit1) {
    //        return this.VALUE = ((EntryBit1)obj).booleanValue();
    //    }
    //    return false;
    //}
    //
    //public int compareTo(EntryBit1 cb) {
    //    return compare(this, cb);
    //}
    //
    //public static int compare(EntryBit1 x, EntryBit1 y) {
    //    return (x.VALUE == y.VALUE) ? 0 : (x.VALUE ? 1 : -1);
    //}
    //
    //public static boolean logicalAnd(EntryBit1 a, EntryBit1 b) {
    //    return a.VALUE && b.VALUE;
    //}
    //
    //public static boolean logicalOr(EntryBit1 a, EntryBit1 b) {
    //    return a.VALUE || b.VALUE;
    //}
    //
    //public static boolean logicalXor(EntryBit1 a, EntryBit1 b) {
    //    return a.VALUE ^ b.VALUE;
    //}
}