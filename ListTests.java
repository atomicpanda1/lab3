import static org.junit.Assert.*;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void test() {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        String[] expectedList = {"a", "b", "c", "d", "e", "f", "g", "h"};
        List<String> actualList = new ArrayList<String>();
        

        list1.add("b");
        list1.add("d");
        list1.add("f");

        list2.add("a");
        list2.add("c");
        list2.add("e");
        list2.add("g");
        list2.add("h");

        actualList = ListExamples.merge(list1, list2);
        
        assertArrayEquals(actualList.toArray(), expectedList);
    }
}
