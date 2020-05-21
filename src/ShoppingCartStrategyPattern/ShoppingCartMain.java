package ShoppingCartStrategyPattern;


    public class ShoppingCartMain {

        public static void main(String[] args) {
            ShoppingCart cart = new ShoppingCart();

            Item item1 = new Item(10, "1234");
            Item item2 = new Item(40, "5678");

            cart.addItem(item1);
            cart.addItem(item2);


            cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));


            cart.pay(new CreditCardStrategy("Marian Andrei", "1234567890123456", "786"));
        }

}
