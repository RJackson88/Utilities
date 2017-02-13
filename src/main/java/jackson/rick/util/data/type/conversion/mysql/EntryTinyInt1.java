/**
 * Created by rickjackson on 2/11/17.
 */
package jackson.rick.util.data.type.conversion.mysql;

import jackson.rick.util.data.Entry;

import java.util.UUID;

public final class EntryTinyInt1 extends Entry {
    public static final UUID UID = UUID.randomUUID();
    public static UUID FIELD_UID;
    public static UUID RECORD_UID;
    public static boolean VALUE;
    
    public EntryTinyInt1(UUID fieldUID, UUID recordUID, boolean value) {
        this.FIELD_UID = fieldUID;
        this.RECORD_UID = recordUID;
        this.VALUE = new Boolean(value);
    }
    
    public EntryTinyInt1(boolean value) {
        this.VALUE = new Boolean(value);
    }
    
    public EntryTinyInt1(String s) {
        this.VALUE = Boolean.parseBoolean(s);
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
}
