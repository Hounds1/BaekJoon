package clear;

import java.util.Arrays;
import java.util.Scanner;

public class b2161 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        int[] deck = new int[range];

        for (int i = 0; i < range; i++) {
            deck[i] = i + 1;
        }

        while (deck.length != 1) {
            find(deck);
            deck = drop(deck);
            deck = shuffle(deck);
        }

        System.out.print(deck[0]);
    }

    public static int[] drop(int[] deck) {
        return Arrays.copyOfRange(deck, 1, deck.length);
    }

    public static int[] shuffle(int[] deck) {
        int range = deck.length;
        int[] newDeck = new int[range];

        int temp = deck[0];

        for (int i = 1; i < range; i++) {
            newDeck[i - 1] = deck[i];
        }

        newDeck[range - 1] = temp;

        return newDeck;
    }

    public static void find(int[] deck) {
        System.out.print(deck[0] + " ");
    }
}
