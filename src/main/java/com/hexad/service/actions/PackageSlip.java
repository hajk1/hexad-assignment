package com.hexad.service.actions;

import com.hexad.model.parent.Physical;
import com.hexad.service.Action;

/**
 * Created by k1 on 12/17/18.
 * email:<k1.tehrani@gmail.com>
 */
public class PackageSlip implements Action {
    private final Physical physical;
    private final String destination;

    public PackageSlip(Physical physical, String destination) {
        this.physical = physical;
        this.destination = destination;
    }
}
