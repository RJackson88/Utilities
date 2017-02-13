/**
 * Created by rickjackson on 2/11/17.
 */
package jackson.rick.util.data.type.conversion.mysql;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

public class EntryTinyInt1Test {
    private EntryTinyInt1 tinyInt1;
    
    @Before
    public void setUp() {
        tinyInt1 = new EntryTinyInt1(UUID.randomUUID(), UUID.randomUUID(), true);
    }
    
    @Test
    public void UIDTest() {
        EntryTinyInt1 test = new EntryTinyInt1(true);
        String expected = null;
        String actual = null;
        System.out.println("Expected : " + expected);
        System.out.println("Actual   : " + actual);
        assertEquals(String.format("I expected the result to be: %s", expected),
                expected, actual);
    }
}
