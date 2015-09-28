package TestArrayList;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
/**
 * Created by yura on 28.09.15.
 */
public class ArrayListTest {
    List list;
    @Before
    public void init(){
        list = new ArrayList(Arrays.asList("one","two","three"));
    }
    @Test
    public void sizeTest(){
        assertEquals(3,list.size());
        assertNotEquals(2, list.size());
    }
    @Test
    public void addTest(){
        assertEquals(3,list.size());
        list.add("four");
        assertEquals(4,list.size());
        assertEquals("four", list.get(3));
        assertArrayEquals(new String []{"one", "two", "three", "four"}, list.toArray());
        list.add(3,null);
        assertTrue(5==list.size());
        assertNull(list.get(3));
    }

    @Test// (expected = NullPointerException.class)
    public void isEptyTest(){
        assertTrue(0!=list.size());
        list.clear();
        assertTrue(0==list.size());
    }

    @Test
    public void clearTest(){
        assertTrue(0!=list.size());
        list.clear();
        list.size();
        assertTrue(0 == list.size());
    }

    @Test
    public void containsTest(){
        assertTrue(list.contains("two"));
        assertFalse(list.contains("test"));
    }
    @Test
    public void setTest(){
        assertEquals(3, list.size());
        assertEquals("two", list.get(1));
        list.set(1, "second");
        assertEquals(3, list.size());
        assertNotEquals("two", list.get(1));
        assertEquals("second", list.get(1));
    }

    @Test
    public void toArrayTest(){
        assertArrayEquals(new String []{"one", "two", "three"}, list.toArray());
    }

}
