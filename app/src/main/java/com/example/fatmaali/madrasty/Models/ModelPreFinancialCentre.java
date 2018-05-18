package com.example.fatmaali.madrasty.Models;

public class ModelPreFinancialCentre {
    private String TitleFinancialCentre,
            TypeFinancialCentre, DateFinancialCentre,
            PeriodToFinancialCentre, PeriodFromFinancialCentre;

    public ModelPreFinancialCentre(String titleFinancialCentre, String typeFinancialCentre,
                                   String dateFinancialCentre, String periodToFinancialCentre, String periodFromFinancialCentre) {
        TitleFinancialCentre = titleFinancialCentre;
        TypeFinancialCentre = typeFinancialCentre;
        DateFinancialCentre = dateFinancialCentre;
        PeriodToFinancialCentre = periodToFinancialCentre;
        PeriodFromFinancialCentre = periodFromFinancialCentre;
    }

    public String getTitleFinancialCentre() {
        return TitleFinancialCentre;
    }

    public void setTitleFinancialCentre(String titleFinancialCentre) {
        TitleFinancialCentre = titleFinancialCentre;
    }

    public String getTypeFinancialCentre() {
        return TypeFinancialCentre;
    }

    public void setTypeFinancialCentre(String typeFinancialCentre) {
        TypeFinancialCentre = typeFinancialCentre;
    }

    public String getDateFinancialCentre() {
        return DateFinancialCentre;
    }

    public void setDateFinancialCentre(String dateFinancialCentre) {
        DateFinancialCentre = dateFinancialCentre;
    }

    public String getPeriodToFinancialCentre() {
        return PeriodToFinancialCentre;
    }

    public void setPeriodToFinancialCentre(String periodToFinancialCentre) {
        PeriodToFinancialCentre = periodToFinancialCentre;
    }

    public String getPeriodFromFinancialCentre() {
        return PeriodFromFinancialCentre;
    }

    public void setPeriodFromFinancialCentre(String periodFromFinancialCentre) {
        PeriodFromFinancialCentre = periodFromFinancialCentre;
    }
}
