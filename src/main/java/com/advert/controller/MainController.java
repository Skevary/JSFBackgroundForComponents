package com.advert.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(eager = true)
@SessionScoped
public class MainController {
    DateRangePicker rangeDate = new DateRangePicker();
    DatePicker singleDate = new DatePicker("dd/MM/yyyy");

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
