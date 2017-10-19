package com.advert.controller.impl;

import com.advert.util.JSFBackground.JSFSelectOneMenuMap;

import java.util.HashMap;

public class SelectOneMenu extends JSFSelectOneMenuMap<String, String, Integer> {
    public SelectOneMenu() {
        super(new HashMap<>()); // You can specify the collection types here.
        for (int i = 0; i < 10; i++)
            addItem("Key " + i, i);
    }
}
