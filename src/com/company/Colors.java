package com.company;

public enum Colors {
    BLUE ("Синий"),
    WHITE("Белый"),
    BLACK("Чёрный"),
    SILVER("Серый");

    private String colorRus;

    Colors(String colorRus){
        this.colorRus = colorRus;
    }
    public String getColorRus(){
        return colorRus;
    }

}
