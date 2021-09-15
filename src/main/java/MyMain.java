import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        // REPLACE WITH YOUR CODE
        double curval = 0;
        int countval = 0;
        for (int i = 0; i < binary.length(); i++) {
            int charac = Integer.parseInt(binary.substring(binary.length() - i-1,binary.length() - i));
            curval = curval + charac*Math.pow(2,countval);
            countval++;
        }
        return (int) curval;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return 0;
        }
        String output = "";
        while (decimal != 0) {
            output = decimal %(2) + output;
            decimal = (decimal - (decimal%2)) / 2;
        }
        return output;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format:");
        String scan1 = scan.nextLine();
        System.out.println("That is equal to the decimal value: "+binaryToDecimal(scan1));
        System.out.println("Type in a number in decimal format");
        int scan2 = scan.nextInt();
        System.out.print("That is equal to the binary value: "+decimalToBinary(scan2));
        // YOUR CODE HERE
    }
}
