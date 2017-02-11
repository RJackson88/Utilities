/**
 * Created by rickjackson on 2/11/17.
 */
package jackson.rick.util.data.type.conversions.mysql;

import jackson.rick.util.data.Cell;

import java.lang.*;
import java.util.UUID;

/**
 * The CellBit1 class is a representation of a single cell
 * (field-record intersection) of a MySQL BIT field type with an
 * SQL return value of a BIT, that would be returned as a
 * java.lang.Boolean class with additional needed fields declared.
 */
public final class CellBit1 implements Cell {
    private static final UUID uuid = UUID.randomUUID();
    private static UUID fieldUUID;
    private static UUID recordUUID;
    private final boolean value;
    
    public CellBit1(UUID fieldUUID, UUID recordUUID, boolean value) {
        this.fieldUUID = fieldUUID;
        this.recordUUID = recordUUID;
        this.value = new Boolean(value);
    }
    
    CellBit1(boolean value) {
        this.value = new Boolean(value);
    }
    
    CellBit1(String s) {
        this(Boolean.parseBoolean(s));
    }
    
    public UUID uuid() {
        return this.uuid();
    }
    
    public UUID getFieldUUID() {
        return this.fieldUUID;
    }
    
    public UUID getRecordUUID() {
        return this.recordUUID;
    }
    
    public UUID[] getFieldAndRecordUID() {
        UUID[] fr = new UUID[2];
        fr[0] = getFieldUUID();
        fr[1] = getRecordUUID();
        return fr;
    }
}