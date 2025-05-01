import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class asser {
    @Test
    void ma() {
//        String actual1 = "hello";
//        String expected = "hi";
//        if (actual1.equals(expected)) {
//            System.out.println("pass");
//            Assert.assertTrue(true);
//        } else {
//            System.out.println("fail");
//            Assert.assertTrue(false);
//        }
//     Assert.assertEquals(expected,actual1);
        Assert.assertEquals(123,123);
//        Assert.assertEquals("123",123);
//        Assert.assertEquals("abc",123);
//        Assert.assertTrue(true);
//        Assert.assertTrue(false);
//        Assert.assertTrue(1==2);
//        Assert.assertTrue(2==2);
//        Assert.assertNotEquals(123,245);
//        Assert.assertNotEquals(123,123);
//        Assert.assertFalse(false);
//        Assert.assertFalse(true);

        SoftAssert sa=new SoftAssert();
        sa.assertEquals("hello","hei");
        System.out.println("hi");
        System.out.println("hi amu");
        sa.assertAll();
    }
}