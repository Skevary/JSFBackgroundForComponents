package com.advert.controller;

import com.advert.controller.impl.DatePicker;
import com.advert.controller.impl.DateRangePicker;
import com.advert.controller.impl.SelectOneMenu;
import com.advert.controller.impl.SelectOneMenuGroup;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(eager = true)
@SessionScoped
public class MainController {
    /* Pay attention to the overloaded constructors in the parent class */
    private DatePicker singleDate = new DatePicker("dd/MM/yyyy");
    private DateRangePicker rangeDate = new DateRangePicker(); // The date format is installed inside
    private SelectOneMenu oneMenu = new SelectOneMenu();
    private SelectOneMenuGroup oneMenuGroup = new SelectOneMenuGroup();

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

    public SelectOneMenu getOneMenu() {
        return oneMenu;
    }

    public void setOneMenu(SelectOneMenu oneMenu) {
        this.oneMenu = oneMenu;
    }

    public SelectOneMenuGroup getOneMenuGroup() {
        return oneMenuGroup;
    }

    public void setOneMenuGroup(SelectOneMenuGroup oneMenuGroup) {
        this.oneMenuGroup = oneMenuGroup;
    }
}
