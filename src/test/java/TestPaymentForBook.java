import com.hexad.model.Book;
import com.hexad.model.Payment;
import com.hexad.service.MasterRule;
import com.hexad.service.RuleAware;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class TestPaymentForBook {

    @Test
    void testRulesCount() {
        Payment payment = new Payment(new Book());
        MasterRule masterRule = new MasterRule(new RuleAware[]{});
        Assert.assertEquals(masterRule.process(payment.getPaidForGood()).size(), 3);
    }
}
