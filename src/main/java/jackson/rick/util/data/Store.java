/**
 * Created by rickjackson on 2/10/17.
 */
package jackson.rick.util.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Data storage class for indexing and retrieving the various data
 * class in the util.data package.
 *
 * Items are stored in maps with their hash code as the key and their
 * string name as the VALUE for lookup purposes.
 */
public class Store extends HashMap {
    private Map<Integer, Database> databases;
    private Map<Integer, Schema> schemas;
    private Map<Integer, Table> tables;
    private Map<Integer, Field> fields;
    private Map<Integer, Record> records;
    
    protected Store() {
        this.databases = new HashMap<>();
        this.schemas = new HashMap<>();
        this.tables = new HashMap<>();
        this.fields = new HashMap<>();
        this.records = new HashMap<>();
    }
}
