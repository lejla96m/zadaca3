import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // 1. zadatak
        Scanner reader = new Scanner(System.in);
        System.out.println("How many elements will contain your array?");
        int index = reader.nextInt();
        int[] userArray = new int[index];
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Enter the number");
            int userNumber = reader.nextInt();
            userArray[i] = userNumber;
        }
        for (int i = userArray.length - 1; i >= 0; i--) {
            if (userArray[i] % 2 == 0) {
                System.out.println(userArray[i] + " is even number");
            } else {
                System.out.println(userArray[i] + " is odd number.");
            }
            if (userArray[i] > 10) {
                System.out.println(userArray[i] + " is greater than 10.");
            }
        }

            // 2. zadatak
        int[] yourArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 1; i++) {
            System.out.println("First number in array: " + yourArray[i]);
            if (i + 1 < yourArray.length) {
                System.out.println("Second number in array: " + yourArray[i + 1]);
            }
            if (i + 2 < yourArray.length) {
                System.out.println("Third number in array: " + yourArray[i + 2]);
            }
            if (i + 3 < yourArray.length) {
                System.out.println("Fourth number in array: " + yourArray[i + 3]);
            }
            if (i + 4 < yourArray.length) {
                System.out.println("Fifth number in array: " + yourArray[i + 4]);
            }
            if (i + 5 < yourArray.length) {
                System.out.println("Sixth number in array: " + yourArray[i + 5]);
            }
            if (i + 6 < yourArray.length) {
                System.out.println("Seventh number in array: " + yourArray[i + 6]);
            }
            if (i + 7 < yourArray.length) {
                System.out.println("Eight number in array: " + yourArray[i + 7]);
            }
            if (i + 8 < yourArray.length) {
                System.out.println("Ninth number in array: " + yourArray[i + 8]);
            }
            if (i + 9 < yourArray.length) {
                System.out.println("Tenth number in array: " + yourArray[i + 9]);
            }
        }  // da se koristi do 15 elemenata u nizu ??

            // 3. zadatak
        System.out.println("Enter the number of elements in the array: ");
        int element = reader.nextInt();
        int[] enteredArray = new int[element];
        for (int i = 0; i < enteredArray.length; i++) {
            System.out.println("Enter the number you want to be in the array: ");
            int entry = reader.nextInt();
            enteredArray[i] = entry;
            }
        for (int i = enteredArray.length - 1; i >= 0; i--) {
            System.out.println(enteredArray[i]);
            }

            // 4. zadatak
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Write a word you want to check: ");
        String word = input.nextLine();
        char[] wordChars = word.toCharArray();
        for (int i = wordChars.length - 1; i >= 0; i--)
            for (int j = 0; j < wordChars.length; i++)
                if (wordChars[i] == wordChars[j]) {
            System.out.println(word + " is palindrome.");
                 } else {
                    System.out.println(word + " is not palindrome.");
                        } //ispise tacno ali se srusi ArrayIndexOutOfBoundsException why ?? */

            // 5. zadatak
        Scanner range = new Scanner(System.in);
        System.out.println("Please enter lower number in range: ");
        int lowNumber = range.nextInt();
        System.out.println("Please enter larger number in range: ");
        int largeNumber = range.nextInt();
        int[] numbersArray = new int[largeNumber - lowNumber];
        for (int i = 1; i < numbersArray.length; i++) {
            numbersArray[i] = lowNumber + i;
            }
        for (int i = 1; i < numbersArray.length; i++)
            if (numbersArray[i] % 2 == 0) {
                System.out.println("Even numbers for range: " + lowNumber + " to " + largeNumber + " are: " + numbersArray[i]);
            }

            // 6. zadatak
        String[] randomArray = {"Hello", "this", "is"};
        String[] randomSecondArray = {"my", "random"};
        String[] randomThirdArray = {"array", "Bye"};
        String[] overallArray = new String[randomArray.length + randomSecondArray.length + randomThirdArray.length];
        int position = 0;
        for (String strElement : randomArray) {
                overallArray[position++] = strElement;
            }
        for (String strElement : randomSecondArray) {
                overallArray[position++] = strElement;
            }
        for (String strElement : randomThirdArray) {
                overallArray[position++] = strElement;
            }
        System.out.println(Arrays.toString(overallArray));

            // 7. zadatak
        int [] numArr1 = {2, 3, 4};
        int [] numArr2 = {8, 7, 4, 3, 2};
        int [] numArrSum = new int [Math.max(numArr1.length, numArr2.length)];
        for (int i = 0; i < numArrSum.length; i++) {
            if (i < numArr1.length && i < numArr2.length) {
                numArrSum[i] = numArr1[i] + numArr2[i];
            } else if (i < numArr1.length) {
                numArrSum[i] = numArr1[i];
            } else {
                numArrSum[i] = numArr2[i];
            }
        }
        for (int i = 0; i < numArrSum.length; i++) {
            System.out.println(numArrSum[i]);
        }

            // 8. Zadatak
     /*   String[] stringArr = {"This", "strings", "are", "gone"};
        char [] vowel = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < stringArr.length; i++)
            if (stringArr[i].contains(vowel) = false) */ // couldn't solve :(

            // 9. Zadatak
        int [] arrToSum1 = {1, 2, 3};
        int [] arrToSum2 = {1,1,1};
        int sumOfElements = 0;
        for (int i = 0; i < arrToSum1.length; i++) {
            for (int j = 0; j < arrToSum2.length; j++) {
                sumOfElements += arrToSum1[i] + arrToSum2[j];
            }
        }
        System.out.println("Total sum of two arrays is: " + sumOfElements);
        }
    }