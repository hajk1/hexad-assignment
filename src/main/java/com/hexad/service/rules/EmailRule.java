package com.hexad.service.rules;

import com.hexad.model.Membership;
import com.hexad.model.parent.GoodAndService;
import com.hexad.service.Action;
import com.hexad.service.RuleAware;
import com.hexad.service.actions.EmailOwnerAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by k1 on 12/17/18.
 * email:<k1.tehrani@gmail.com>
 */
public class EmailRule implements RuleAware {

  @Override
  public List<Action> process(GoodAndService goodAndService) {
    if (goodAndService instanceof Membership) {
      return Arrays
          .asList(new Action[]{new EmailOwnerAction((Membership) goodAndService)});
    }
    return new ArrayList<>();
  }
}
