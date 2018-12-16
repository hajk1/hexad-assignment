package com.hexad.service;

import com.hexad.model.GoodAndServiceType;
import com.hexad.service.rules.ActivateRule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class MasterRule implements RuleAware {
    private final RuleAware[] rules;

    private MasterRule(RuleAware[] rules) {
        this.rules = rules;
    }

    public static MasterRule getInstance() {
        RuleAware[] ruleAwares = {new ActivateRule()};
        return new MasterRule(ruleAwares);
    }

    public List<Action> process(GoodAndServiceType good) {
        List<Action> actions = new ArrayList<Action>();
        for (RuleAware rule : rules) {
            actions.addAll(rule.process(good));
        }
        return actions;
    }
}
