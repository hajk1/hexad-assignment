package com.hexad.service.actions;

import com.hexad.model.Membership;
import com.hexad.service.Action;

/**
 * Created by k1 on 12/17/18.
 * email:<k1.tehrani@gmail.com>
 */
public class ActivateMembership implements Action {
    private final Membership membership;

    public ActivateMembership(Membership membership) {
        this.membership = membership;
    }
}
