package com.advert.controller;

import com.advert.controller.impl.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(eager = true)
@SessionScoped
public class MainController {
    /* Pay attention to the overloaded constructors in the parent class */
    private DatePicker singleDate = new DatePicker("dd/MM/yyyy");
    private DateRangePicker rangeDate = new DateRangePicker(); // The date format is installed inside
    private OneMenuMap oneMenu = new OneMenuMap();
    private OneMenuGroupList oneMenuGroup = new OneMenuGroupList();
    private OneListBox listBox = new OneListBox();

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

    public OneMenuMap getOneMenu() {
        return oneMenu;
    }

    public void setOneMenu(OneMenuMap oneMenu) {
        this.oneMenu = oneMenu;
    }

    public OneMenuGroupList getOneMenuGroup() {
        return oneMenuGroup;
    }

    public void setOneMenuGroup(OneMenuGroupList oneMenuGroup) {
        this.oneMenuGroup = oneMenuGroup;
    }

    public OneListBox getListBox() {
        return listBox;
    }

    public void setListBox(OneListBox listBox) {
        this.listBox = listBox;
    }
}
