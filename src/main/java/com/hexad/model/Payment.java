package com.hexad.model;

import com.hexad.model.parent.GoodAndService;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class Payment {

    private final GoodAndService paidForGood;

    public Payment(GoodAndService paidForGood) {
        this.paidForGood = paidForGood;
    }

    public GoodAndService getPaidForGood() {
        return paidForGood;
    }
}
