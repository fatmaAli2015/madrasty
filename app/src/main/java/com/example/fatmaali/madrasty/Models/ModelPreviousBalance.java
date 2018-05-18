package com.example.fatmaali.madrasty.Models;

public class ModelPreviousBalance {

    public String TitlePreviousBalance, EditPreviousBalance;
    public int id;

    public ModelPreviousBalance(String titlePreviousBalance, String editPreviousBalance, int id) {
        TitlePreviousBalance = titlePreviousBalance;
        EditPreviousBalance = editPreviousBalance;
        this.id = id;
    }

    public String getTitlePreviousBalance() {
        return TitlePreviousBalance;
    }

    public void setTitlePreviousBalance(String titlePreviousBalance) {
        TitlePreviousBalance = titlePreviousBalance;
    }

    public String getEditPreviousBalance() {
        return EditPreviousBalance;
    }

    public void setEditPreviousBalance(String editPreviousBalance) {
        EditPreviousBalance = editPreviousBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
