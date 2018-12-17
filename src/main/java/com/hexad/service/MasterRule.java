package com.hexad.service;

import com.hexad.model.parent.GoodAndService;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class MasterRule implements RuleAware {

  private final List<RuleAware> rules = new ArrayList<>();


  public MasterRule() {
    ServiceLoader<RuleAware> loader = ServiceLoader.load(RuleAware.class);
    for (RuleAware rule : loader) {
      System.out.println(rule.getClass().getSimpleName()); // prints Dog, Cat
      rules.add(rule);
    }

  }

  public List<Action> process(GoodAndService good) {
    List<Action> actions = new ArrayList<Action>();
        for (RuleAware rule : rules) {
            actions.addAll(rule.process(good));
        }
        return actions;
    }
}
