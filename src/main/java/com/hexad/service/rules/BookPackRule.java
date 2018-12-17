package com.hexad.service.rules;

import com.hexad.model.Book;
import com.hexad.model.parent.GoodAndService;
import com.hexad.model.parent.Physical;
import com.hexad.service.Action;
import com.hexad.service.RuleAware;
import com.hexad.service.actions.PackageSlipAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by k1 on 12/17/18.
 * email:<k1.tehrani@gmail.com>
 */
public class BookPackRule implements RuleAware {

  @Override
  public List<Action> process(GoodAndService goodAndService) {
    if (goodAndService instanceof Book) {
      return Arrays.asList(
          new Action[]{
              new PackageSlipAction((Physical) goodAndService, "for the royalty department")});
    }
    return new ArrayList<>();
  }
}
