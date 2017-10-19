package com.advert.controller.impl;

import com.advert.util.JSFBackground.JSFSelectItemMap;

import java.util.HashMap;

public class OneMenuMap extends JSFSelectItemMap<String, String, Integer> {
    public OneMenuMap() {
        super(new HashMap<>()); // You can specify the collection types here.
        for (int i = 0; i < 10; i++)
            addItem("Key " + i, i);
    }
}
