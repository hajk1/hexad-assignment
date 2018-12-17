package com.hexad.model.parent;

import com.hexad.model.Agent;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public abstract class GoodAndService {

  private Agent agent;

  public GoodAndService(Agent agent) {
    this.agent = agent;
  }

  public Agent getAgent() {
    return agent;
  }
}
