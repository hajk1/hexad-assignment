package com.hexad.service.actions;

import com.hexad.model.Agent;
import com.hexad.service.Action;

/**
 * Created by k1 on 12/17/18.
 * email:<k1.tehrani@gmail.com>
 */
public class GenerateCommissionAction implements Action {
    private final Agent agent;

    public GenerateCommissionAction(Agent agent) {
        this.agent = agent;
    }
}
