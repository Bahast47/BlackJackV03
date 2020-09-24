import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner newCard = new Scanner(System.in);

        ArrayList<Card> playersHand = new ArrayList<Card>();
        ArrayList<Card> dealersHand = new ArrayList<Card>();


        for(int i = 0; i < 2; i++) {
            playersHand.add(new Card());
        }

        for(int i = 0; i < 1; i++) {
            dealersHand.add(new Card());
        }

        System.out.println("Your cards are: " + "\n" + "Players hand: " + playersHand);
        System.out.println("Dealers hand: " + dealersHand);

        boolean yes = true;

        while(yes) {
            System.out.println("\n" + "Would you like another card?" + "\n");
            String input = newCard.nextLine();

            if (input.equals("yes")) {

                for (int i = 0; i < 1; i++) {
                    playersHand.add(new Card());
                }
                System.out.println("\n" + "Your cards are: " + "\n" + "Players hand: " + playersHand);
                System.out.println("Dealers hand: " + dealersHand);

            } if(input.equals("no")){
                yes = false;
                System.out.println("\n" + "Your cards are: " + "\n" + "Players hand: " + playersHand);
                System.out.println("Dealers hand: " + dealersHand);
            }
        }
    }
}