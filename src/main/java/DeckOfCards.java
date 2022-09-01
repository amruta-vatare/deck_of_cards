import java.util.Random;

public class DeckOfCards {
    //suit
    //("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
    //"9", "10", "Jack", "Queen", "King", "Ace").

    static String [] Clubs = {"2","3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
    static String [] Diamonds = {"2","3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
    static String [] Hearts = {"2","3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
    static String [] Spades = {"2","3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};

    static String [][] deck = {Clubs,Diamonds,Hearts,Spades};
    static String [][]newDeck;

    public static void distributeCards(){
       newDeck = deck;
        for (int i = 1;i<5;i++){
            System.out.println("Player "+i);
            for(int j = 1;j<10;j++){
                getCard();
            }
            System.out.println();
            System.out.println("_________________________");
        }
    }

    public static void getCard() {
        Random r = new Random();
        int suits = r.nextInt(4);
        int ranks = r.nextInt(13);

        if(newDeck[suits][ranks] == null){
            getCard();
        }else{
            System.out.print(newDeck[suits][ranks]+" ");
            newDeck[suits][ranks] = null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Deck of Cards");
        distributeCards();

    }
}
