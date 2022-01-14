package chapter7;

import java.util.Arrays;
import java.util.Random;

//revisit this program; did not understand where the binary search method gets executed

public class LotteryTicket {
    private static final int LENGTH = 6; //constant variable
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String args[]){
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    /* create a Lottery Quick Pick application that will generate a lottery ticket with 6 random numbers,
    between 1 and 69.  */

    public static int[] generateNumbers(){
        int[] ticket = new int[6];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++){
            int randomNumber;
            //ticket[i] = random.nextInt(MAX_TICKET_NUMBER)+1;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static void printTicket(int ticket[]){
        for (int i = 0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

    // the following is a Javadoc
    /**
     *
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearch Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearch){
        //coming up, an enhanced for loop ->
        for (int value : array){
            if (value == numberToSearch){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearch){
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearch);
        if(index >= 0){
            return true;
        }
        else return false;
    }

}
