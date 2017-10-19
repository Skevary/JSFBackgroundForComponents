package com.advert.util.JSFBackground;

import java.text.SimpleDateFormat;

/**
 * A utility class designed for storing two date fields.<p>
 * Inside this class the date Format by default: <tt>dd/MM/yyyy</tt>.
 *
 * @param <T> the type of date field
 * @see java.util.Date
 * @see SimpleDateFormat
 */
public abstract class JSFDateRangePicker<T> {
    private T date1;
    private T date2;
    private SimpleDateFormat dateFormat;


    /**
     * Constructs an empty <tt>JSFDateRangePicker</tt> with the default date format:
     * <i>"dd/MM/yyyy"</i>.
     *
     * @see SimpleDateFormat
     */
    public JSFDateRangePicker() {
        this.dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }


    /**
     * Constructs an <tt>JSFDateRangePicker</tt> with a specified date format.
     *
     * @param dateFormat date format.
     * @see SimpleDateFormat
     */
    public JSFDateRangePicker(String dateFormat) {
        this.dateFormat = new SimpleDateFormat(dateFormat);
    }


    /**
     * Constructs <tt>JSFDateRangePicker</tt> with the specified parameters and
     * the default date format: <i>"dd/MM/yyyy"</i>.
     *
     * @param date1 desired first date.
     * @param date2 desired second date
     * @see SimpleDateFormat
     */
    public JSFDateRangePicker(T date1, T date2) {
        this();
        this.date1 = date1;
        this.date2 = date2;
    }


    /**
     * Constructs <tt>JSFDateRangePicker</tt> with the specified parameters and format.
     *
     * @param date1      desired first date.
     * @param date2      desired second date
     * @param dateFormat date format.
     * @see SimpleDateFormat
     */
    public JSFDateRangePicker(T date1, T date2, String dateFormat) {
        this(dateFormat);
        this.date1 = date1;
        this.date2 = date2;
    }


    /**
     * Return required date.
     *
     * @return required date or <tt>null</tt>.
     */
    public T getDate1() throws NullPointerException {
        return date1;
    }


    /**
     * Return formatted date.
     *
     * @return formatted string or empty string.
     */
    public String getFormattedDate1() {
        if (date1 != null) return dateFormat.format(date1);
        return "";
    }


    /**
     * Set required date.
     *
     * @param date1 required date.
     */
    public void setDate1(T date1) {
        this.date1 = date1;
    }


    /**
     * Return required date.
     *
     * @return required date or <tt>null</tt>.
     */
    public T getDate2() throws NullPointerException {
        return date2;
    }


    /**
     * Return formatted date.
     *
     * @return formatted string or empty string.
     */
    public String getFormattedDate2() {
        if (date2 != null) return dateFormat.format(date2);
        return "";
    }


    /**
     * Set required date.
     *
     * @param date2 required date.
     */
    public void setDate2(T date2) {
        this.date2 = date2;
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
        if (!(o instanceof JSFDateRangePicker)) return false;

        JSFDateRangePicker<?> that = (JSFDateRangePicker<?>) o;

        if (getDate1() != null ? !getDate1().equals(that.getDate1()) : that.getDate1() != null) return false;
        return getDate2() != null ? getDate2().equals(that.getDate2()) : that.getDate2() == null;
    }


    @Override
    public int hashCode() {
        int result = getDate1() != null ? getDate1().hashCode() : 0;
        result = 31 * result + (getDate2() != null ? getDate2().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "JSFDateRangePicker{" + "date1=" + date1 + ", date2=" + date2 + ", dateFormat=" + dateFormat + '}';
    }
}
