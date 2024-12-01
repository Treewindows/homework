package org.example.Pizza;

public class Pizza {
    private String dough ;
    private String cheese ;
    private String sauce ;
    private String sausage ;
    private String greenery ;
    private String mushrooms ;
    private String pineapples;
    private String chiken ;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setSausage(String sausage) {
        this.sausage = sausage;
    }

    public void setGreenery(String greenery) {
        this.greenery = greenery;
    }

    public void setMushrooms(String mushrooms) {
        this.mushrooms = mushrooms;
    }

    public void setPineapples(String pineapples) {
        this.pineapples = pineapples;
    }

    public void setChiken(String chiken) {
        this.chiken = chiken;
    }

    public String getDough() {
        return dough;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        if(sausage == null){
            sausage = "";
        }
        if(greenery == null){
            greenery = "";
        }
        if(chiken == null){
            chiken = "";
        }
        if(mushrooms == null){
            mushrooms = "";
        }
        if(pineapples == null){
            pineapples = "";
        }
        return String.format("Пицца состоит из: %s %s %s %s %s %s %s %s", dough,cheese,sauce,sausage,greenery,chiken,mushrooms,pineapples);
    }
}
