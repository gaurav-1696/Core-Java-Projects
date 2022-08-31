public class Pizza {
    private int price;
    private boolean veg;
    private int addExtraCheesePrice=100;
    private int extraToppingPrice=150;
    private int backPackPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingAdded=false;
    private boolean isOptedForTakeAway=false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            System.out.println("Pizza Type: Veg");
            this.price = 300;
        } else {
            System.out.println("Pizza Type: Non-Veg");
            this.price = 400;
        }
        basePizzaPrice=this.price;
    }

    public void addExtraCheese()
    {
        isExtraCheeseAdded=true;
        this.price+=addExtraCheesePrice;

    }

    public void addExtraTopping()
    {
        isExtraToppingAdded=true;
        this.price+=extraToppingPrice;
    }

    public void takeAway()
    {
         isOptedForTakeAway=true;
        this.price+=backPackPrice;
    }

    public void getBill()
    {
        String bill="";
        System.out.println("Pizza: Rs."+basePizzaPrice);
        if(isExtraCheeseAdded)
        {
            bill+="Extra Cheese added: Rs."+addExtraCheesePrice+"\n";
        }
        if(isExtraToppingAdded)
        {
            bill+="Extra Topping added: Rs."+extraToppingPrice+"\n";
        }
        if(isOptedForTakeAway)
        {
            bill+="Take Away: Rs."+backPackPrice+"\n";
        }
        bill+="Total Bill: Rs."+this.price+"\n";
        System.out.println(bill);
        System.out.println("Thank you visit again!");
    }


}
