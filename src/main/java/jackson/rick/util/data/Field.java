package jackson.rick.util.data;

import java.util.List;
import java.util.Map;

/**
 * Created by rickjackson on 2/10/17.
 */
public class Field {
    String field;
    Map<String, Data> fieldData;
    
    public Field() {
        this.field = null;
        this.fieldData = null;
    }
}
