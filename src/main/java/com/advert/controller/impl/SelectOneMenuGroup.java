package com.advert.controller.impl;


import com.advert.util.JSFBackground.JSFSelectOneMenuList;

import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import java.util.ArrayList;

public class SelectOneMenuGroup extends JSFSelectOneMenuList<String,SelectItem> {

    public SelectOneMenuGroup() {
        super(new ArrayList<>()); // To set the collection type.

        SelectItemGroup group1 = new SelectItemGroup("Group 1");
        group1.setSelectItems(new SelectItem[] {
                new SelectItem("Group 1 Value 1", "Group 1 Label 1"),
                new SelectItem("Group 1 Value 2", "Group 1 Label 2"),
                new SelectItem("Group 1 Value 3", "Group 1 Label 3")
        });
        addItem(group1);    // Add new group to the collection.

        SelectItemGroup group2 = new SelectItemGroup("Group 2");
        group2.setSelectItems(new SelectItem[] {
                new SelectItem("Group 2 Value 1", "Group 2 Label 1"),
                new SelectItem("Group 2 Value 2", "Group 2 Label 2"),
                new SelectItem("Group 2 Value 3", "Group 2 Label 3")
        });
        addItem(group2); // Add new group to the collection.
    }

}
