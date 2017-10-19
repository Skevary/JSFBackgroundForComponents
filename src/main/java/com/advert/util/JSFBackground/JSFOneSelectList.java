package com.advert.util.JSFBackground;

import java.util.ArrayList;
import java.util.List;

/**
 * A utility class designed for storing <tt>selectOneMenu or similars</tt> component.<p>
 * Inside this class the items collection by default: {@link ArrayList}.
 *
 * @param <T> the {@link #item} type
 * @param <S> the {@link #items} type
 * @see List
 * @see ArrayList
 */
public abstract class JSFOneSelectList<T, S> {

    /**
     * Typically, the current selection in "selectOneMenu".
     * <br><br>
     * Something like this:<br>
     * <i> &lt;h:selectOneMenu value="#{<b>this field</b>} "&gt;<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;f:selectItems value="#{<b>{@link #items}</b>}" /&gt;<br>
     * &lt;/h:selectOneMenu &gt;
     * </i>
     */
    private T item;


    /**
     * Typically, the collection of elements in "selectOneMenu".
     * <br><br>
     * Something like this:<br>
     * <i> &lt;h:selectOneMenu value="#{<b>{@link #item}</b>} "&gt;<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;f:selectItems value="#{<b>this field</b>}" /&gt;<br>
     * &lt;/h:selectOneMenu&gt;
     * </i>
     *
     * @see List
     */
    private List<S> items;


    /**
     * Constructs an empty <tt>JSFOneSelectList</tt> with the default collection: {@link ArrayList}.
     *
     * @see #items
     * @see ArrayList
     */
    public JSFOneSelectList() {
        this.items = new ArrayList<>();
    }


    /**
     * Constructs an <tt>JSFOneSelectList</tt> with a specified {@link #item} value.
     *
     * @param item value<i>(typically, the current selection in "selectOneMenu")</i>.
     * @see #item
     * @see #items
     * @see ArrayList
     */
    public JSFOneSelectList(T item) {
        this.item = item;
        this.items = new ArrayList<>();
    }


    /**
     * Constructs an <tt>JSFOneSelectList</tt> with a specified collection elements.
     *
     * @param items a collection of elements.
     * @see #items
     * @see List
     */
    public JSFOneSelectList(List<S> items) {
        this.items = items;
    }


    /**
     * Constructs an <tt>JSFOneSelectList</tt> with a
     * specified {@link #item} value and specified collection elements.
     *
     * @param item  a value<i>(typically, the current selection in "selectOneMenu")</i>.
     * @param items a collection of elements.
     * @see #item
     * @see #items
     * @see List
     */
    public JSFOneSelectList(T item, List<S> items) {
        this.item = item;
        this.items = items;
    }


    /**
     * Appends the specified element to the end of this collection {@link #items}.
     *
     * @param item element to be appended to this list.
     * @see List
     */
    public void addItem(S item) {
        this.items.add(item);
    }


    /**
     * Return this {@link #item}.
     *
     * @return {@link #item}
     */
    public T getItem() {
        return item;
    }


    /**
     * Set a specified {@link #item} value.
     *
     * @param item a specified item value.
     * @see #item
     */
    public void setItem(T item) {
        this.item = item;
    }


    /**
     * Return this {@link #items}.
     *
     * @return {@link #items}
     * @see List
     */
    public List<S> getItems() {
        return items;
    }


    /**
     * Set a specified collection elements.
     *
     * @param items a specified collection elements.
     * @see #items
     * @see List
     */
    public void setItems(List<S> items) {
        this.items = items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JSFOneSelectList)) return false;

        JSFOneSelectList<?, ?> that = (JSFOneSelectList<?, ?>) o;

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
        return "JSFOneSelectList{" + "item=" + item + ", items=" + items + '}';
    }

}