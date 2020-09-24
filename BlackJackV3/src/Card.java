public class Card {

    private String symbol;
    private String number;

    final String[] NUMBERS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    final String[] SYMBOLS = {"♣", "♥", "♠", "♦"};

    public Card() {
        String randomNumber = NUMBERS[(int) Math.floor(Math.random() * NUMBERS.length)];
        String randomSymbol = SYMBOLS[(int) Math.floor(Math.random() * SYMBOLS.length)];
        this.number = randomNumber;
        this.symbol = randomSymbol;
    }

    public String getNumber() {
        return this.number;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public String toString() {
        return this.number + "_" + this.symbol ;
    }
}