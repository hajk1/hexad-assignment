package com.hexad.model;

import com.hexad.model.parent.Physical;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public class Video extends Physical {
    private String name;

    public Video(Agent agent) {
        super(agent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
