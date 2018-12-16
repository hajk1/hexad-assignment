package com.hexad.model;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class Payment {
    private final GoodAndServiceType paidForGood;
    private final Agent agent;

    public Payment(GoodAndServiceType paidForGood, Agent agent) {
        this.paidForGood = paidForGood;
        this.agent = agent;
    }

    public GoodAndServiceType getPaidForGood() {
        return paidForGood;
    }
}
