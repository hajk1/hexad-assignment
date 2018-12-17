import static junit.framework.TestCase.assertTrue;

import com.hexad.model.Agent;
import com.hexad.model.Book;
import com.hexad.model.Payment;
import com.hexad.service.Action;
import com.hexad.service.MasterRule;
import com.hexad.service.actions.GenerateCommissionAction;
import com.hexad.service.actions.PackageSlipAction;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class TestPaymentForBook {

  @Test
  public void testActions() {
    Payment payment = new Payment(new Book(new Agent("Jack")));
    MasterRule masterRule = new MasterRule();
    List<Action> actions = masterRule.process(payment.getPaidForGood());
    Assert.assertEquals(3, actions.size());
    assertTrue(actions.stream().anyMatch(e -> e instanceof PackageSlipAction));
    assertTrue(actions.stream().anyMatch(e -> e instanceof GenerateCommissionAction));
    Assert.assertEquals(2, actions.stream().filter(e -> e instanceof PackageSlipAction).count());
  }
}
