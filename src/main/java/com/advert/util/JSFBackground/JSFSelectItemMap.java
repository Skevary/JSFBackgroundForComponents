package com.advert.util.JSFBackground;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * A utility class designed for storing <tt>selectOneMenu, selectManyMenu,<br>
 * selectOneListbox, selectManyListbox or similars</tt> component.<p>
 * Inside this class the items collection by default: {@link HashMap}.
 *
 * @param <T> the {@link #item} & {@link #itemArray} type
 * @param <K> the key type for {@link #items}
 * @param <V> the value type for {@link #items}
 * @see Map
 * @see HashMap
 */
public abstract class JSFSelectItemMap<T, K, V> {

    /**
     * Typically, the current selection in "selectOneMenu".
     * <br><br>
     * Something like this:<br><br>
     * <i> &lt;h:selectOneMenu value="#{<b>this field</b>} "&gt;<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;f:selectItems value="#{<b>{@link #items}</b>}" /&gt;<br>
     * &lt;/h:selectOneMenu &gt;
     * </i>
     */
    private T item;

    /**
     * Typically, the current selection in "selectManyMenu".
     * <br><br>
     * Something like this:<br><br>
     * <i> &lt;h:selectManyMenu value="#{<b>this field</b>} "&gt;<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;f:selectItems value="#{<b>{@link #items}</b>}" /&gt;<br>
     * &lt;/h:selectManyMenu &gt;
     * </i>
     */
    private T []itemArray;


    /**
     * Typically, the collection of elements in "selectOneMenu".
     * <br><br>
     * Something like this:<br>
     * <i> &lt;h:selectOneMenu value="#{<b>{@link #item}</b>} "&gt;<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;f:selectItems value="#{<b>this field</b>}" /&gt;<br>
     * &lt;/h:selectOneMenu&gt;
     * </i>
     *
     * @see Map
     */
    private Map<K, V> items;


    /**
     * Constructs an empty <tt>JSFSelectItemMap</tt> with the default collection: {@link HashMap}.
     *
     * @see #items
     * @see HashMap
     */
    public JSFSelectItemMap() {
        this.items = new HashMap<>();
    }


    /**
     * Constructs an <tt>JSFSelectItemMap</tt> with a specified {@link #item} value.
     *
     * @param item value<i>(typically, the current selection in "selectOneMenu")</i>.
     * @see #item
     * @see #items
     * @see HashMap
     */
    public JSFSelectItemMap(T item) {
        this.item = item;
        this.items = new HashMap<>();
    }


    /**
     * Constructs an <tt>JSFSelectItemMap</tt> with a specified {@link #itemArray} value.
     *
     * @param itemArray value<i>(typically, the current selection in "selectManyMenu")</i>.
     * @see #itemArray
     * @see #items
     * @see HashMap
     */
    public JSFSelectItemMap(T[] itemArray) {
        this.itemArray = itemArray;
        this.items = new HashMap<>();
    }


    /**
     * Constructs an <tt>JSFSelectItemMap</tt> with a specified collection elements.
     *
     * @param items a collection of elements.
     * @see #items
     * @see Map
     */
    public JSFSelectItemMap(Map<K, V> items) {
        this.items = items;
    }


    /**
     * Constructs an <tt>JSFSelectItemMap</tt> with a
     * specified {@link #item} value and specified collection elements.
     *
     * @param item  a value<i>(typically, the current selection in "selectOneMenu")</i>.
     * @param items a collection of elements.
     * @see #item
     * @see #items
     * @see Map
     */
    public JSFSelectItemMap(T item, Map<K, V> items) {
        this.item = item;
        this.items = items;
    }


    /**
     * Constructs an <tt>JSFSelectItemMap</tt> with a
     * specified {@link #itemArray} value and specified collection elements.
     *
     * @param itemArray value<i>(typically, the current selection in "selectManyMenu")</i>.
     * @param items a collection of elements.
     * @see #itemArray
     * @see #items
     * @see Map
     */
    public JSFSelectItemMap(T[] itemArray, Map<K, V> items) {
        this.itemArray = itemArray;
        this.items = items;
    }


    /**
     * Associates the specified value with the specified key in this collection {@link #items}.
     *
     * @param key   key with which the specified value is to be associated.
     * @param value value to be associated with the specified key
     * @see Map
     */
    public void addItem(K key, V value) {
        this.items.put(key, value);
    }


    /**
     * Returns the value to which the specified key is mapped,
     * or null if this map contains no mapping for the key.
     *
     * @param key the key whose associated value is to be returned.
     * @return the value to which the specified key is mapped,
     * or null if this map contains no mapping for the key.
     *
     * @see #items
     * @see Map
     */
    public V getItemsValue(K key) {
        return items.get(key);
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
     * Return this {@link #itemArray}.
     *
     * @return {@link #itemArray}
     */
    public T[] getItemArray() {
        return itemArray;
    }


    /**
     * Set a specified values for {@link #itemArray}.
     *
     * @param itemArray a specified values for itemArray.
     * @see #itemArray
     */
    public void setItemArray(T[] itemArray) {
        this.itemArray = itemArray;
    }


    /**
     * Return this {@link #items}.
     *
     * @return {@link #items}
     * @see Map
     */
    public Map<K, V> getItems() {
        return items;
    }


    /**
     * Set a specified collection elements.
     *
     * @param items a specified collection elements.
     * @see #items
     * @see Map
     */
    public void setItems(Map<K, V> items) {
        this.items = items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JSFSelectItemMap)) return false;

        JSFSelectItemMap<?, ?, ?> that = (JSFSelectItemMap<?, ?, ?>) o;

        if (getItem() != null ? !getItem().equals(that.getItem()) : that.getItem() != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(getItemArray(), that.getItemArray())) return false;
        return getItems() != null ? getItems().equals(that.getItems()) : that.getItems() == null;
    }


    @Override
    public int hashCode() {
        int result = getItem() != null ? getItem().hashCode() : 0;
        result = 31 * result + Arrays.hashCode(getItemArray());
        result = 31 * result + (getItems() != null ? getItems().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "JSFSelectItemMap{" + "item=" + item + ", itemArray=" + Arrays.toString(itemArray) + ", items=" + items + '}';
    }

}