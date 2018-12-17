package com.hexad.service.rules;

import com.hexad.model.Video;
import com.hexad.model.parent.GoodAndService;
import com.hexad.service.Action;
import com.hexad.service.RuleAware;
import com.hexad.service.actions.PackageSlipAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by k1 on 12/17/18.
 * email:<k1.tehrani@gmail.com>
 */
public class FreeVideoPackRule implements RuleAware {

  public static final String LEARNINIG_SKI_VIDEO = "Learning to Ski";
  public static final String FIRST_AID_VIDEO = "First Aid";

  @Override
  public List<Action> process(GoodAndService goodAndService) {
    if (goodAndService instanceof Video) {
      Video videoGift = new Video(null);
      videoGift.setName(FIRST_AID_VIDEO);
      if (((Video) goodAndService).getName().equals(LEARNINIG_SKI_VIDEO)) {
        return Arrays.asList(
            new Action[]{new PackageSlipAction(videoGift, "for shipping")});
      }
    }
    return new ArrayList<>();
  }
}
