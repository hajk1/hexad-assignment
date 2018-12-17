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
      rules.add(rule);
    }
  }

  /**
   * @return list of all actions which must be done based on the rules
   */
  public List<Action> process(GoodAndService goodAndService) {
    List<Action> actions = new ArrayList<Action>();
        for (RuleAware rule : rules) {
            actions.addAll(rule.process(goodAndService));
        }
    return actions;
    }
}
