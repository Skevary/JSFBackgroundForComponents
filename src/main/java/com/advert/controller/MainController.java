package com.advert.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(eager = true)
@SessionScoped
public class MainController {
    /* Pay attention to the overloaded constructors in the parent class */
    DatePicker singleDate = new DatePicker("dd/MM/yyyy");
    DateRangePicker rangeDate = new DateRangePicker(); // The date format is installed inside


    public DateRangePicker getRangeDate() {
        return rangeDate;
    }

    public void setRangeDate(DateRangePicker rangeDate) {
        this.rangeDate = rangeDate;
    }

    public DatePicker getSingleDate() {
        return singleDate;
    }

    public void setSingleDate(DatePicker singleDate) {
        this.singleDate = singleDate;
    }

}
