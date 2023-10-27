package isp.lab2;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
        if((number%2==0&&number/2==1)||(number%3==0&&number/3==1)){
            return true;}
        if(number%2==0 || number==1) {
            return false;
        }
        for(int d=3;d<=(int)Math.sqrt(number);d+=2)
        {

                if(number%d==0)
                {
                    return false;
                }
            }
        return true;
    }


    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
       int sum=0;
       while(number>0){
           sum=sum+number%10;
           number=number/10;
       }
       return sum;
    }

    /**
     * This method should extract the prime numbers from a given interval
     * using isPrimeNumber(final int number) method defined above
     * NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)
        int[] nrPrime = new int[b-a+1];
      int i=0;
       while(a<=b)
       {
           if(isPrimeNumber(a)) {
               nrPrime[i] = a;
               System.out.println(a);
               i++;
           }

           a++;
       }


   return Arrays.copyOf(nrPrime,i);
    }

    /**
     * This method should calculate the geometric mean of the given prime numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
    public static double calculateGeometricMean(int[] primeNumbers) {
        int p=1;
     for(int i=0;i<primeNumbers.length;i++)
     {
         p=p*primeNumbers[i];
     }
        double mean = Math.pow(p, ((double) 1 / primeNumbers.length));
     return mean;
    }

    /**
     * This method should calculate the number of prime numbers which
     * have the sum of digits an even number
     * NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
   public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
        int nr=0;
        for(int i=0;i<primeNumbers.length;i++){
            if(calculateSumOfDigits(primeNumbers[i])%2==0)
                nr++;
        }
        return nr;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti a si b (a<b):");
        int a= scanner.nextInt();
        int b= scanner.nextInt();


        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
