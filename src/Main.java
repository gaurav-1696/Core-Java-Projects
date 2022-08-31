public class Main {
    public static void main(String[] args) {
        Pizza basePizza=new Pizza(true );
       basePizza.addExtraCheese();
       basePizza.addExtraTopping();
       basePizza.takeAway();
       basePizza.getBill();


       DeluxePizza dp=new DeluxePizza(false);
       dp.takeAway();
       dp.getBill();
    }
}
