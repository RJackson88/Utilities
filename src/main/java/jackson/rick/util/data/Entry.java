/**
 * Created by rickjackson on 2/11/17.
 */
package jackson.rick.util.data;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;

public class Entry<K, V> implements Map.Entry<K, V> {
    final int hash;
    K key;
    V value;
    
    public Entry(int hash, K key, V value) {
        this.hash = hash;
        this.key = key;
        this.value = value;
    }
    
    public K getKey() {
        return this.key;
    }
    
    public V getValue() {
        return this.value;
    }
    
    public V setValue(V value) {
        return value;
    }
    
    public boolean equals(Entry e) {
        return (this.getKey() == null ?
                e.getKey() == null : this.getKey().equals(e.getKey())) &&
                (this.getValue() == null ?
                e.getValue() == null : this.getKey().equals(e.getValue()));
    }
    
    public int hashCode() {
        return this.hash;
    }
}
    
    
    
    //public static final UUID UID = UUID.randomUUID();
    //public static UUID FIELD_UID;
    //public static UUID RECORD_UID;
    //
    //public Entry() {}
    //
    //public Entry(UUID fieldUID, UUID recordUID) {
    //    this.FIELD_UID = fieldUID;
    //    this.RECORD_UID = recordUID;
    //}
    //
    //public UUID UID() {
    //    return this.UID;
    //}
    //
    //public UUID getFieldUUID() {
    //    return this.FIELD_UID;
    //}
    //
    //public UUID getRecordUUID() {
    //    return this.RECORD_UID;
    //}
    //
    //public UUID[] getFieldAndRecordUUID() {
    //    UUID[] fr = new UUID[2];
    //    fr[0] = getFieldUUID();
    //    fr[1] = getRecordUUID();
    //    return fr;
    //}
