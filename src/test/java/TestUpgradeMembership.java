import static junit.framework.TestCase.assertTrue;

import com.hexad.model.Payment;
import com.hexad.model.Upgrade;
import com.hexad.service.Action;
import com.hexad.service.MasterRule;
import com.hexad.service.actions.ActivateMembershipAction;
import com.hexad.service.actions.EmailOwnerAction;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class TestUpgradeMembership {

  @Test
  public void testActions() {
    Upgrade membership = new Upgrade(null);
    Payment payment = new Payment(membership);
    MasterRule masterRule = new MasterRule();
    List<Action> actions = masterRule.process(payment.getPaidForGood());
    Assert.assertEquals(actions.size(), 2);
    assertTrue(actions.stream().anyMatch(e -> e instanceof EmailOwnerAction));
    assertTrue(actions.stream().anyMatch(e -> e instanceof ActivateMembershipAction));
  }
}
