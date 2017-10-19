package com.advert.util.JSFBackground;

import java.text.SimpleDateFormat;

/**
 * Utility class is designed to store a single date field.<p>
 * Inside this class the date Format by default: <tt>dd/MM/yyyy</tt>.
 *
 * @param <T> the type of date field.
 * @see java.util.Date
 * @see SimpleDateFormat
 */
public abstract class JSFDatePicker<T> {
    private T date;
    private SimpleDateFormat dateFormat;


    /**
     * Constructs an empty <tt>JSFDatePicker</tt> with the default date format:
     * <i>"dd/MM/yyyy"</i>.
     *
     * @see SimpleDateFormat
     */
    public JSFDatePicker() {
        this.dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }


    /**
     * Constructs an <tt>JSFDatePicker</tt> with a specified date format.
     *
     * @param dateFormat date format.
     * @see SimpleDateFormat
     */
    public JSFDatePicker(String dateFormat) {
        this.dateFormat = new SimpleDateFormat(dateFormat);
    }


    /**
     * Constructs <tt>JSFDatePicker</tt> with the specified parameters and
     * the default date format: <i>"dd/MM/yyyy"</i>.
     *
     * @param date desired date.
     * @see SimpleDateFormat
     */
    public JSFDatePicker(T date) {
        this();
        this.date = date;
    }


    /**
     * Constructs <tt>JSFDatePicker</tt> with the specified parameters and format.
     *
     * @param date       desired date.
     * @param dateFormat date format.
     * @see SimpleDateFormat
     */
    public JSFDatePicker(T date, String dateFormat) {
        this(dateFormat);
        this.date = date;
    }


    /**
     * Return required date.
     *
     * @return required date or <tt>null</tt>.
     */
    public T getDate() throws NullPointerException {
        return date;
    }


    /**
     * Return formatted date.
     *
     * @return formatted string or empty string.
     */
    public String getFormattedDate() {
        if (date != null) return dateFormat.format(date);
        return "";
    }


    /**
     * Set required date.
     *
     * @param date required date.
     */
    public void setDate(T date) {
        this.date = date;
    }


    /**
     * Return a <tt>date format</tt>.
     *
     * @return SimpleDateFormat
     * @see SimpleDateFormat
     */
    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }


    /**
     * Set <tt>date format</tt>.
     *
     * @param dateFormat
     * @see SimpleDateFormat
     */
    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JSFDatePicker)) return false;

        JSFDatePicker<?> that = (JSFDatePicker<?>) o;

        return getDate() != null ? getDate().equals(that.getDate()) : that.getDate() == null;
    }


    @Override
    public int hashCode() {
        return getDate() != null ? getDate().hashCode() : 0;
    }


    @Override
    public String toString() {
        return "JSFDatePicker{" + "date=" + date + ", dateFormat=" + dateFormat + '}';
    }
}
