public class modulus {

    static int modInverse(int a) {
        int modulo = 35;
        a = a % modulo;

        for (int x = 1; x < modulo; x++) {
            if ((a * x) % modulo == 1)
                return x;
        }
        return  0;
    }

    public static void main(String[] args) {
        //Compute the multiplicative inverses for the values 1 to 34 mod 35
        //this is the program for question one, it was a bit confusing at first but
        //I think this outlines the modulo 35 with numbers 1 to 34 we want to do
        //without requiring the extended Euclidean algorithm first

        int[] numList = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34};

        for (int i = 0; i < 34; i++) {
            int startNum = 1;
            if (modInverse(numList[i]) != 0) {
                System.out.println("The number with a inverse is : " + (i + 1));
                System.out.println("The numbers inverse is: " + modInverse(numList[i]));
            }else{
                System.out.println("THE NUMBER HAS NO SOLUTION! " + (i + 1));
                System.out.println("Since " + i + " and modulo 35 " + "are not COPRIME");
            }
        }
    }
}
