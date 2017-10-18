package com.advert.util.JSFBackground;

import java.util.ArrayList;
import java.util.List;

public abstract class JSFSelectOneMenuList<T> {
    private String item;
    private List<T> items;


    public JSFSelectOneMenuList() {
        this.item = "";
        this.items = new ArrayList<>();
    }


    public JSFSelectOneMenuList(String item) {
        this.item = item;
        this.items = new ArrayList<>();
    }


    public JSFSelectOneMenuList(List<T> items) {
        this.item = "";
        this.items = items;
    }


    public JSFSelectOneMenuList(String item, List<T> items) {
        this.item = item;
        this.items = items;
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public String getItem() {
        return item;
    }


    public void setItem(String item) {
        this.item = item;
    }


    public List<T> getItems() {
        return items;
    }


    public void setItems(List<T> items) {
        this.items = items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JSFSelectOneMenuList)) return false;

        JSFSelectOneMenuList<?> that = (JSFSelectOneMenuList<?>) o;

        if (getItem() != null ? !getItem().equals(that.getItem()) : that.getItem() != null) return false;
        return getItems() != null ? getItems().equals(that.getItems()) : that.getItems() == null;
    }


    @Override
    public int hashCode() {
        int result = getItem() != null ? getItem().hashCode() : 0;
        result = 31 * result + (getItems() != null ? getItems().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "JSFSelectOneMenuList{" + "item='" + item + '\'' + ", items=" + items + '}';
    }
}
