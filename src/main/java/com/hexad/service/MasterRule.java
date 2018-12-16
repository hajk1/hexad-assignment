package com.hexad.service;

import com.hexad.model.GoodType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class MasterRule implements RuleAware {
    private final RuleAware[] rules;

    public MasterRule(RuleAware[] rules) {
        this.rules = rules;
    }

    public List<Action> process(GoodType good) {
        List<Action> actions = new ArrayList<Action>();
        for (RuleAware rule : rules) {
            actions.addAll(rule.process(good));
        }
        return actions;
    }
}
