//Write a java program to check weather a given number is Armstrong number or not.
//Note:
//An Armstrong number of a three-digit number is a number in which the sum of the cube of
// the digits is equal to the number itself. Hence 153 is an Armstrong number

public class q10 {

    public static void main(String[] args) {

        int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}