package isp.lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
    Random random = new Random();
    int nr= random.nextInt(7);
        System.out.println(nr);
    return nr;
    }

    public static int enterANumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numberTried=scanner.nextInt();
        return numberTried;
    }



    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[100];
        int randomNumber = generateARandom();
        int[] numberTried = new int[10];
        int nr=0;
        for(int i=0;i<10;i++) {
            numberTried[i] = enterANumber();
            if(i>=1&&numberTried[i]!=numberTried[i-1])
                nr++;

            if(numberTried[i]>randomNumber)
                System.out.println("Too large");
                else
             System.out.println("Too small");
                if(numberTried[i]==randomNumber){
                    System.out.println("YOU WON :)))))");
                break;
            }



        }
        if(numberTried[0]!=randomNumber)
            nr++;

        System.out.println("Number of tries: "+nr);

    }
}
