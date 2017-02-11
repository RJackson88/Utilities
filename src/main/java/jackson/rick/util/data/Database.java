/**
 * Created by rickjackson on 2/10/17.
 */
package jackson.rick.util.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 2/10/17.
 */
public class Database<K, V> extends HashMap<K, V> {
    private Map<Integer, Schema> schemas;
    
    public Database() {
        this.schemas = new HashMap<>();
    }
}
