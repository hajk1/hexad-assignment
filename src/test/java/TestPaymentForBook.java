import com.hexad.model.Agent;
import com.hexad.model.Book;
import com.hexad.model.Payment;
import com.hexad.service.MasterRule;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class TestPaymentForBook {

    @Test
    public void testActionsCount() {
        Payment payment = new Payment(new Book(), new Agent("Joe"));
        MasterRule masterRule = MasterRule.getInstance();
        Assert.assertEquals(masterRule.process(payment.getPaidForGood()).size(), 0);
    }
}
