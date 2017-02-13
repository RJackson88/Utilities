package jackson.rick.util.data.type.conversion.mysql;

import jackson.rick.util.data.Entry;

import java.util.UUID;

public class EntryMediumInt extends Entry {
    public static final UUID UID = UUID.randomUUID();
    public static UUID FIELD_UID;
    public static UUID RECORD_UID;
    public static int VALUE;
    
    public EntryMediumInt(UUID fieldUID, UUID recordUID, int value) {
        this.FIELD_UID = fieldUID;
        this.RECORD_UID = recordUID;
        this.VALUE = new Integer(value);
    }
    
    public EntryMediumInt(int value) {
        this.VALUE = new Integer(value);
    }
    
    public EntryMediumInt(String s) {
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