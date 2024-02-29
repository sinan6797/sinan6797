import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class C05_AssertionMethods {
    @Test
    public void assertEqualsTest() {

        String greet = "Hello World";
        assertEquals("Hello World", greet);
        assertEquals("String degerler birbirine uymadi", "Hello World", greet);

    }

    @Test
    public void assertTrueTest() {


        boolean condition = "Hello".contains("lo");
        assertTrue(condition);


    }

    @Test
    public void assertFalseTest() {

        boolean condition = "Hello".contains("la");
        assertFalse(condition);
        assertFalse("Condition `true`döndü", condition);
    }

    @Test
    public void assertNullTest() {
        //Assert.assertNull() metodunun parantez icindeki degeri null is test gecer, aksi takdirde fail olur

        String name = null;
        assertNull(name);


    }

    @Test
    public void assertNotNullTest() {

        String name = "John";
        assertNotNull(name);


    }

    @Test
    public void assertSameTest() {

        String name1 = "John";
        String name2 = "John";
        String name3 = new String("John");

        assertSame(name1, name2);
        //assertSame(name1, name3);


    }

    @Test
    public void assertNotSameTest() {

        String name1 = "John";
        String name2 = "John";
        String name3 = new String("John");

        assertNotSame(name1, name3);
        assertNotSame(name1, name3);

    }


}