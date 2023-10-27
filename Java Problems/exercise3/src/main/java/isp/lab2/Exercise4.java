package isp.lab2;

public class Exercise4 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
        if((number%2==0 && number/2==1) || (number%3==0 && number/3==1)){
            return true;
        }
        if(number%2==0 || number==1){
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
     * This method should get the first(by position) odd number from the given array
     *
     * @param someNumbers the given int array
     * @return first odd number from the array
     */
    public static int firstOdd(int[] someNumbers) {
        int firstOdd=0;
        for(int i=0;i<someNumbers.length;i++) {
            if (someNumbers[i]%2!=0) {
                firstOdd = someNumbers[i];
                System.out.println("Position at: "+i);
                break;
            }
        }
     return firstOdd;
    }

    /**
     * This method should get the first(by position) even number from the given array
     *
     * @param someNumbers the given int array
     * @return first even number from the array
     */
    public static int firstEven(int[] someNumbers) {
        int firstEven=0;
        for(int i=0;i<someNumbers.length;i++) {
            if (someNumbers[i]%2==0) {
                firstEven = someNumbers[i];
                System.out.println("Position at: "+i);
                break;
            }
        }
        return firstEven;
    }

    /**
     * This method should get the first(by position) prime number from the given array
     *
     * @param someNumbers the given int array
     * @return first prime number from the array
     */
    public static int firstPrime(int[] someNumbers) {
        // TODO: Use isPrimeNumber(final int number)
        int firstPrime=0;
        for(int i=0;i<someNumbers.length;i++){
            if(isPrimeNumber(someNumbers[i])) {
                firstPrime = someNumbers[i];
                System.out.println("Position at: "+i);
                break;
            }
        }
        return firstPrime;
    }

    /**
     * Don't forget to also display the position of ech number
     */
    public static void main(String[] args) {
        int[] someNumbers = new int[]{15, 18, 13, 22, 21, 11, 57, 141, 563, 16};

        System.out.println("First odd number: " + firstOdd(someNumbers));
        System.out.println("First even number: " + firstEven(someNumbers));
        System.out.println("First prime number: " + firstPrime(someNumbers));
    }
}
