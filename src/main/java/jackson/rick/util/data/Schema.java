/**
 * Created by rickjackson on 2/10/17.
 */
package jackson.rick.util.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 2/10/17.
 */
public class Schema<K, V> extends Database<K, V> {
    private Database<Integer, Table> tables;
    
    private Schema() {
        this.tables = null;
    }
}
