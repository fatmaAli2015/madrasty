package com.example.fatmaali.madrasty.Models;

public class ModelNumOfPayers {

    public String numOfPayers75,numOfPayers100,txtTextTilte;
    public int id;

    public ModelNumOfPayers(String numOfPayers75, String numOfPayers100, String txtTextTilte, int id) {
        this.numOfPayers75 = numOfPayers75;
        this.numOfPayers100 = numOfPayers100;
        this.txtTextTilte = txtTextTilte;
        this.id = id;
    }

    public String getNumOfPayers75() {
        return numOfPayers75;
    }

    public void setNumOfPayers75(String numOfPayers75) {
        this.numOfPayers75 = numOfPayers75;
    }

    public String getNumOfPayers100() {
        return numOfPayers100;
    }

    public void setNumOfPayers100(String numOfPayers100) {
        this.numOfPayers100 = numOfPayers100;
    }

    public String getTxtTextTilte() {
        return txtTextTilte;
    }

    public void setTxtTextTilte(String txtTextTilte) {
        this.txtTextTilte = txtTextTilte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
