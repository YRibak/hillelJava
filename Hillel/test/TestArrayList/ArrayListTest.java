package TestArrayList;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.*;
/**
 * Created by yura on 28.09.15.
 */
public class ArrayListTest {
    List testedList;
    Collection collection;
    @Before
    public void init(){
        testedList = new ArrayList(Arrays.asList("one","two","three"));
        collection = new ArrayList(Arrays.asList("four","one"));
    }

    @Test
    public void sizeTest(){
        assertEquals(3, testedList.size());
        assertNotEquals(2, testedList.size());
    }

    @Test
    public void addTest(){
        assertEquals(3, testedList.size());
        testedList.add("four");
        assertEquals(4, testedList.size());
        assertEquals("four", testedList.get(3));
        assertArrayEquals(new String[]{"one", "two", "three", "four"}, testedList.toArray());
        testedList.add(3, null);
        assertTrue(5 == testedList.size());
        assertNull(testedList.get(3));
    }

    @Test
    public void addAllTest(){
        assertTrue(3==testedList.size());
        assertArrayEquals(new String[]{"one", "two", "three"}, testedList.toArray());
        testedList.addAll(collection);
        assertTrue(5 == testedList.size());
        assertArrayEquals(new String[]{"one", "two", "three", "four", "one"}, testedList.toArray());
    }

    @Test// (expected = NullPointerException.class)
    public void isEptyTest(){
        assertTrue(0 != testedList.size());
        testedList.clear();
        assertTrue(0 == testedList.size());
    }

    @Test
    public void clearTest(){
        assertTrue(0 != testedList.size());
        testedList.clear();
        assertTrue(0 == testedList.size());
    }

    @Test
    public void containsTest(){
        assertTrue(testedList.contains("two"));
        assertFalse(testedList.contains("test"));
    }
    @Test
    public void containsAllTest(){
        assertTrue(testedList.containsAll(new ArrayList(Arrays.asList("two", "one"))));
    }
    @Test
    public void setTest(){
        assertEquals(3, testedList.size());
        assertEquals("two", testedList.get(1));
        testedList.set(1, "second");
        assertEquals(3, testedList.size());
        assertNotEquals("two", testedList.get(1));
        assertEquals("second", testedList.get(1));
    }

    @Test
    public void toArrayTest(){
        assertArrayEquals(new String[]{"one", "two", "three"}, testedList.toArray());
    }

    @Test
    public void removeTest(){
        assertEquals(3, testedList.size());
        assertTrue("two" == testedList.get(1));
        testedList.remove("two");
        assertEquals(2, testedList.size());
        assertFalse("two" == testedList.get(1));
    }

    @Test
    public void removeAllTest(){
        assertTrue(3==testedList.size());
        assertEquals("one", testedList.get(0));
        testedList.removeAll(collection);
        assertFalse(3==testedList.size());
        assertTrue(2==testedList.size());
        assertNotEquals("one",testedList.get(0));
    }
}
