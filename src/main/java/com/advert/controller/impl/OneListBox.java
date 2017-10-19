package com.advert.controller.impl;

import com.advert.util.JSFBackground.JSFSelectItemMap;

import java.util.HashMap;

public class OneListBox extends JSFSelectItemMap<String, String, Object> {
    public OneListBox() {
        super(new HashMap<>());
        addItem("Langley", "CV-1");
        addItem("Lexington", "CV-2");
        addItem("Ranger", "CV-4");
        addItem("Yorktown", "CV-5");
        addItem("Wasp", "CV-7");
        addItem("Essex", "CV-9");
    }
}
