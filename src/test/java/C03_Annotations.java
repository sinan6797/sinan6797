import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class C03_Annotations {
    @Before
    public void before(){
        System.out.println("Before Metodu");

    }

    @After
    public void after(){
        System.out.println("After Metodu");

    }

    @Test
    public void test01(){
        System.out.println("Test 1");


    }

    @Test
    public void test02(){
        System.out.println("Test 2");


    }

    @Test
    public void test03(){
        System.out.println("Test 3");


    }

    @Test @Ignore("Test Ignore: reason")
    public void test04(){
        System.out.println("Test 4");


    }

    @Test
    public void test05(){
        System.out.println("Test 5");


    }
}
