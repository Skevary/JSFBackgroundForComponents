package com.advert.controller.impl;

import com.advert.util.JSFBackground.JSFSelectItemMap;

import java.util.HashMap;

public class ManyMenuMap extends JSFSelectItemMap<String, String, String> {
    public ManyMenuMap() {
        super(new HashMap<>());
        addItem("Ticonderoga","CV-14");
        addItem("Independence","CVL-22");
        addItem("Midway","CVB-41");
        addItem("Forrestal","CV-59");
        addItem("Kitty Hawk","CV-63");
        addItem("Enterprise","CVN-65");
    }
}
