import org.junit.Assert;
import org.junit.Test;

public class I18NManagerTest {

    @Test
    public void test() {
        String r = I18NManager.getInstance().getEtiqueta("en","l1");
        Assert.assertEquals("Hello",r);

    }
}
