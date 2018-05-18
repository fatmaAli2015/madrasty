package com.example.fatmaali.madrasty.Models;

public class ModelPredecessor {
  public   String
            Predecessor1, Predecessor2, Predecessor3,
            Predecessor4, Predecessor5, Predecessor6;
    public String typePredecessor;
    public int Id;

    public ModelPredecessor(String predecessor1, String predecessor2, String predecessor3,
                            String predecessor4, String predecessor5, String predecessor6,
                            String typePredecessor, int id) {
        Predecessor1 = predecessor1;
        Predecessor2 = predecessor2;
        Predecessor3 = predecessor3;
        Predecessor4 = predecessor4;
        Predecessor5 = predecessor5;
        Predecessor6 = predecessor6;
        this.typePredecessor = typePredecessor;
        Id = id;
    }



    public String getPredecessor1() {
        return Predecessor1;
    }

    public String getPredecessor2() {
        return Predecessor2;
    }

    public String getPredecessor3() {
        return Predecessor3;
    }

    public String getPredecessor4() {
        return Predecessor4;
    }

    public String getPredecessor5() {
        return Predecessor5;
    }

    public String getPredecessor6() {
        return Predecessor6;
    }

    public String getTypePredecessor() {
        return typePredecessor;
    }

    public int getId() {
        return Id;
    }

    public void setPredecessor1(String predecessor1) {
        Predecessor1 = predecessor1;
    }

    public void setPredecessor2(String predecessor2) {
        Predecessor2 = predecessor2;
    }

    public void setPredecessor3(String predecessor3) {
        Predecessor3 = predecessor3;
    }

    public void setPredecessor4(String predecessor4) {
        Predecessor4 = predecessor4;
    }

    public void setPredecessor5(String predecessor5) {
        Predecessor5 = predecessor5;
    }

    public void setPredecessor6(String predecessor6) {
        Predecessor6 = predecessor6;
    }

    public void setTypePredecessor(String typePredecessor) {
        this.typePredecessor = typePredecessor;
    }

    public void setId(int id) {
        Id = id;
    }
}
