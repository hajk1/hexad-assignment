package com.hexad.model;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class Payment {
    private final GoodType paidForGood;

    public Payment(GoodType paidForGood) {
        this.paidForGood = paidForGood;
    }

    public GoodType getPaidForGood() {
        return paidForGood;
    }
}
