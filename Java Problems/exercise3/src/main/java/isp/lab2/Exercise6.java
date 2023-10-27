package isp.lab2;

import javax.swing.*;
import java.util.Scanner;

public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int[] numbers= new int[n];
        numbers[0]=1;
        numbers[1]=2;
        for( int i=2;i<n;i++){
            numbers[i]=numbers[i-1]*numbers[i-2];
        }
        return numbers;
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
   public static int[] generateRandomVectorRecursively(int n) {
       int[] vector=new int[n];
       vector[0]=1;
       vector[1]=2;
       generateVectorRecursively(vector,n,2);
       return vector;
   }
    private static void generateVectorRecursively(int[] vector, int n, int i) {
        if (i < n) {
            vector[i] = vector[i - 1] * vector[i - 2];
            generateVectorRecursively(vector, n, i + 1);
        }
    }

    public static void main(String[] args) {
        // TODO: print the vectors
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] vector=generateVector(n);
        for(int i=0;i<n;i++)
            System.out.println(vector[i]);
        int[] recursiv=generateRandomVectorRecursively(n);
        System.out.println("Metoda recursiva: ");
        for(int i=0;i<n;i++)
            System.out.println(recursiv[i]);
    }
}
