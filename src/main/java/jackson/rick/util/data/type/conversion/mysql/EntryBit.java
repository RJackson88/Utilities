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
public final class EntryBit extends Entry {
    public static final UUID UID = UUID.randomUUID();
    public static UUID FIELD_UID;
    public static UUID RECORD_UID;
    public final byte[] VALUE;
    
    public EntryBit(UUID FIELD_UID, UUID RECORD_UID, byte[] VALUE) {
        this.FIELD_UID = FIELD_UID;
        this.RECORD_UID = RECORD_UID;
        this.VALUE = VALUE;
    }
    
    EntryBit(byte[] VALUE) {
        this.VALUE = VALUE;
    }
    
    public UUID UID() {
        return this.UID;
    }
    
    public UUID getFieldUID() {
        return this.FIELD_UID;
    }
    
    public UUID getRecordUID() {
        return this.RECORD_UID;
    }
    
    public UUID[] getFieldAndRecordUUID() {
        UUID[] fr = new UUID[2];
        fr[0] = getFieldUID();
        fr[1] = getRecordUID();
        return fr;
    }
}