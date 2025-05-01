import org.testng.Assert;
import org.testng.annotations.Test;

public class grouping {
    @Test(groups={"sanity"})
    void openapp()
    {
        Assert.assertTrue(true);
    }
    @Test(groups={"sanity","regression"})
    void login()
    {
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods={"openapp","login"},groups ={"sanity"})
    void search()
    {
        Assert.assertTrue(true);
    }
    @Test(groups = {"regression"})
    void Adv()
    {
        Assert.assertTrue(true);
    }
}
