package com.hexad.service.actions;

import com.hexad.model.Agent;
import com.hexad.service.Action;

/**
 * Created by k1 on 12/17/18.
 * email:<k1.tehrani@gmail.com>
 */
public class GenerateCommission implements Action {
    private final Agent agent;

    public GenerateCommission(Agent agent) {
        this.agent = agent;
    }
}
