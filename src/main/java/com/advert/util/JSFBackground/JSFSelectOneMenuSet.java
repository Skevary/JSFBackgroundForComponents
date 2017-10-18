package com.advert.util.JSFBackground;

import java.util.HashSet;
import java.util.Set;

public abstract class JSFSelectOneMenuSet<T> {
    private String item;
    private Set<T> items;


    public JSFSelectOneMenuSet() {
        this.item = "";
        this.items = new HashSet<>();
    }


    public JSFSelectOneMenuSet(String item) {
        this.item = item;
        this.items = new HashSet<>();
    }


    public JSFSelectOneMenuSet(Set<T> items) {
        this.item = "";
        this.items = items;
    }


    public JSFSelectOneMenuSet(String item, Set<T> items) {
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


    public Set<T> getItems() {
        return items;
    }


    public void setItems(Set<T> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JSFSelectOneMenuSet)) return false;

        JSFSelectOneMenuSet<?> that = (JSFSelectOneMenuSet<?>) o;

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
        return "JSFSelectOneMenuSet{" + "item='" + item + '\'' + ", items=" + items + '}';
    }
}
