package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    private boolean extraCheese;
    private boolean extraToppings;
    boolean isTakeAway;
    boolean isBillCreated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
            toppings=70;
        }
        else{
            this.price=400;
            toppings=120;
        }

        this.bill="Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese){
            this.price+=80;
            extraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppings){
            this.price+=70;
            extraToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price+=20;
            isTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated){
            if(extraCheese){
                this.bill+="Extra Cheese Price = 80\n";
            }
            if(extraToppings){
                this.bill+="Extra Toppings Added: " + this.toppings+"\n";
            }
            if(isTakeAway){
                this.bill+="Paperbag Added: 20\n";
            }
            this.bill+=this.price;
            isBillCreated=true;
            return this.bill;
        }
        return "";
    }
}
