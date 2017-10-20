package com.advert.controller.impl;

import com.advert.util.JSFBackground.JSFSelectItemList;

import java.util.LinkedList;

public class ManyListBox extends JSFSelectItemList<String, String>{
    public ManyListBox() {
        super(new LinkedList<>());
        addItem("Gerald R. Ford");
        addItem("George H.W. Bush");
        addItem("Ronald Reagan");
        addItem("Harry S. Truman");
        addItem("John C. Stennis");
        addItem("George Washington");
    }
}
