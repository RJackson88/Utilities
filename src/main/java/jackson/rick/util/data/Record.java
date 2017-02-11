package jackson.rick.util.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 2/10/17.
 */
class Record<K, V> {
    private HashMap<Integer, Cell> cells;
    
    public Record() {
        this.cells = new HashMap<>();
    }
    
    public Record(int initialCapacity, float loadFactor) {
        this.cells = new HashMap<>(initialCapacity, loadFactor);
    }
    
    public Record(int initialCapacity) {
        
    }
    
    public Record(Map<? extends K, ? extends V> m) {
        
    }
}
