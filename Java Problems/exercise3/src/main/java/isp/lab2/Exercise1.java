package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    public int[] RandomClass(){
   Random random = new Random();
   int randomNumber=random.nextInt(9)+2;
        System.out.println(randomNumber);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti "+ randomNumber+ " numere:");
        int[] a = new int[randomNumber];
        for (int i=0;i<randomNumber;i++)
        {
            System.out.println("a["+i+"]: ");
            a[i]= scanner.nextInt();

        }
        return a;

    }

    public void Mean(int[] a)
    {
        int s=0;
        for (int i=0;i< a.length;i++)
        {
            s=s+a[i];
        }
        int mean=s/a.length;
        System.out.println("Media="+mean);

    }



    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers

    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        throw new UnsupportedOperationException();
    }*/

    public static void main(String[] args) {
       Exercise1 ex1=new Exercise1();
       int[] a = ex1.RandomClass();
       ex1.Mean(a);

       /* int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));*/
    }


}
