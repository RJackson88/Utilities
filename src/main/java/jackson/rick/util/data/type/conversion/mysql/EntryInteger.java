/**
 * Created by rickjackson on 2/11/17.
 */
package jackson.rick.util.data.type.conversion.mysql;

import jackson.rick.util.data.Entry;

import java.util.UUID;

public class EntryInteger extends Entry {
    public static final UUID UID = UUID.randomUUID();
    public static UUID FIELD_UID;
    public static UUID RECORD_UID;
    public static int VALUE;
    
    public EntryInteger(UUID fieldUID, UUID recordUID, int value) {
        this.FIELD_UID = fieldUID;
        this.RECORD_UID = recordUID;
        this.VALUE = new Integer(value);
    }
    
    public EntryInteger(int value) {
        this.VALUE = new Integer(value);
    }
    
    public EntryInteger(String s) {
        this.VALUE = Integer.parseInt(s);
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
