package com.hexad.model.parent;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public abstract class PhysicalDelivery {

  private List<Physical> physicalList = new ArrayList<Physical>();

  public List<Physical> getPhysicalList() {
    return physicalList;
  }

  public void setPhysicalList(List<Physical> physicalList) {
    this.physicalList = physicalList;
  }
}
