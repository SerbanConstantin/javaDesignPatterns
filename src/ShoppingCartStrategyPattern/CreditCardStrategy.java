package ShoppingCartStrategyPattern;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNr;
    private String CVV;

    public CreditCardStrategy(String name, String cardNr, String CVV) {
        this.name = name;
        this.cardNr = cardNr;
        this.CVV = CVV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNr() {
        return cardNr;
    }

    public void setCardNr(String cardNr) {
        this.cardNr = cardNr;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    @Override
    public void pay(double amount) {

        System.out.println(amount + " Suma a fost platita cu Credit" );

    }


}

