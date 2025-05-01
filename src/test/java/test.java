import org.testng.annotations.*;

public class test {

    @BeforeMethod
    void m1()
    {
        System.out.println("before method");
    }
    @BeforeClass

        void m3()
        {
            System.out.println("before class");
        }
    @AfterClass
    void m4()
    {
        System.out.println("After class");
    }
    @AfterTest
    void m5()
    {
        System.out.println("AfterTest");
    }
    @Test
            void m7()
    {
        System.out.println("Test");
    }
    @BeforeTest
    void m6()
    {
        System.out.println("Before test");
    }
    @AfterMethod()
    void m2()
    {
        System.out.println("After  method");
    }
    @BeforeSuite
    void m8()
    {
        System.out.println("Before suite");
    }
    @AfterSuite
    void m9()
    {
        System.out.println("After suite");
    }


}
