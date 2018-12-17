package com.hexad.service.rules;

import com.hexad.model.Membership;
import com.hexad.model.parent.GoodAndServiceType;
import com.hexad.service.Action;
import com.hexad.service.RuleAware;
import com.hexad.service.actions.ActivateMembership;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by k1 on 12/17/18.
 * email:<k1.tehrani@gmail.com>
 */
public class ActivateRule implements RuleAware {
    @Override
    public List<Action> process(GoodAndServiceType goodAndServiceType) {
        if (goodAndServiceType instanceof Membership)
            return Arrays.asList(new Action[]{new ActivateMembership((Membership) goodAndServiceType)});
        return new ArrayList<>();
    }
}
