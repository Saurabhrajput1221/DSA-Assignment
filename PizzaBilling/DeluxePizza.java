package PizzaBilling;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(isVeg){
            this.cheesePrice = 80;
            this.toppingPrice = 70;

        }else{
            this.cheesePrice = 80;
            this.toppingPrice = 120;
        }
    }
}
