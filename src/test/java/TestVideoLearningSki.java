import static com.hexad.service.rules.FreeVideoPackRule.LEARNINIG_SKI_VIDEO;
import static junit.framework.TestCase.assertTrue;

import com.hexad.model.Payment;
import com.hexad.model.Video;
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
public class TestVideoLearningSki {

  @Test
  public void testActions() {
    Video video = new Video(null);
    video.setName(LEARNINIG_SKI_VIDEO);
    Payment payment = new Payment(video);
    MasterRule masterRule = new MasterRule();
    List<Action> actions = masterRule.process(payment.getPaidForGood());
    Assert.assertEquals(actions.size(), 2);
    assertTrue(actions.stream().anyMatch(e -> e instanceof PackageSlipAction));
    assertTrue(actions.stream().anyMatch(e -> e instanceof GenerateCommissionAction));
  }
}
