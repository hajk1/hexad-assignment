package com.hexad.service;

import com.hexad.model.parent.GoodAndService;
import java.util.List;

/**
 * Created by k1 on 12/16/18.
 * email:<k1.tehrani@gmail.com>
 */
public interface RuleAware {

    List<Action> process(GoodAndService goodAndService);
}
