import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // 1. zadatak
        System.out.println("    1st Assignment");

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
        System.out.println("\n" + "    2nd Assignment");

        int[] yourNumberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] positionOfNumber = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eight", "Ninth", "Tenth", "Eleventh", "Twelfth", "Fourteenth", "Fifteenth"};

        for (int i = 0; i < yourNumberArray.length; i++)
            for (int j = 0; j < positionOfNumber.length; j++) {
                if (i == j)
                    System.out.println(positionOfNumber[j] + " number in array: " + yourNumberArray[i]);
            }

            // 3. zadatak
        System.out.println("\n" + "    3rd Assignment");

        System.out.println("Enter the number of elements in the array: ");

        int element = reader.nextInt();
        int[] enteredArray = new int[element];

        for (int i = 0; i < enteredArray.length; i++) {
            System.out.println("Enter the number you want to be in the array: ");

            int entry = reader.nextInt();
            enteredArray[i] = entry;
        }
        for (int i = enteredArray.length - 1; i >= 0; i--) {
            System.out.print(enteredArray[i] + " ");
        }

            // 4. zadatak
        Scanner input = new Scanner(System.in);

        System.out.println("\n" + "    4th Assignment");

        System.out.println("Write a word you want to check: ");
        String word = input.nextLine().toLowerCase();
        char[] wordChars = word.toCharArray();

        boolean palindrome = true;
        for (int i = 0; i < wordChars.length / 2; i++)
            if (wordChars[i] != wordChars[wordChars.length - 1 - i]) {
                    palindrome = false;
                    break;
                }

        if (palindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

            // 5. zadatak
        System.out.println("\n" + "    5th Assignment");

        Scanner range = new Scanner(System.in);

        System.out.println("Please enter the lowest number in the range: ");
        int lowNumber = range.nextInt();

        System.out.println("Please enter the highest number in the range: ");
        int highNumber = range.nextInt();

        int[] numbersArray = new int[highNumber - lowNumber];

        for (int i = 1; i < numbersArray.length; i++) {
            numbersArray[i] = lowNumber + i;
        }

        String numbersDivisibleByTwoOutput = "Even numbers for the range are: ";

        for (int i = 1; i < numbersArray.length; i++)
            if (numbersArray[i] % 2 == 0) {
                numbersDivisibleByTwoOutput += numbersArray[i] + " ";
            }
        System.out.println(numbersDivisibleByTwoOutput);

            // 6. zadatak
        System.out.println("\n" + "    6th Assignment");

        String[] randomArray = {"Hello", "this", "is"};
        String[] randomSecondArray = {"my", "random"};
        String[] randomThirdArray = {"array", "Bye"};

        String[] overallArray = new String[randomArray.length + randomSecondArray.length + randomThirdArray.length];

        int positionOfElement = 0;
        for (String stringElement : randomArray) {
            overallArray[positionOfElement++] = stringElement;
        }
        for (String stringElement : randomSecondArray) {
            overallArray[positionOfElement++] = stringElement;
        }
        for (String stringElement : randomThirdArray) {
            overallArray[positionOfElement++] = stringElement;
        }

        System.out.println(Arrays.toString(overallArray));

            // 7. zadatak
        System.out.println("\n" + "    7th Assignment");

        int[] numArray1 = {2, 3, 4};
        int[] numArray2 = {8, 7, 4, 3, 2};

        int largerArray;

        if (numArray1.length > numArray2.length) {
            largerArray = numArray1.length;
        } else {
            largerArray = numArray2.length;
        }

        int [] numArraySum = new int[largerArray];

        for (int i = 0; i < numArraySum.length; i++) {
            if (i < numArray1.length && i < numArray2.length) {
                numArraySum[i] = numArray1[i] + numArray2[i];
            } else if (i < numArray1.length) {
                numArraySum[i] = numArray1[i];
            } else {
                numArraySum[i] = numArray2[i];
            }
        }
        System.out.println(Arrays.toString(numArraySum));


            // 8. Zadatak
        System.out.println("\n" + "    8th Assignment");

        String[] stringArray = {"www", "hygge", "try", "lol"};
        String [] wordsWithVowel = new String[stringArray.length];

        int numWordsWithVowel = 0;

        for (int i = 0; i < stringArray.length; i++) {
            boolean containsVowel = false;
            for (int j = 0; j < stringArray[i].length(); j++) {
                char stringChar = stringArray[i].charAt(j);
                if (stringChar == 'a' || stringChar == 'e' || stringChar == 'i' || stringChar == 'o' || stringChar == 'u') {
                    containsVowel = true;
                    break;
                }
            }
            if (containsVowel) {
                wordsWithVowel[numWordsWithVowel] = stringArray[i];
                numWordsWithVowel++;
            }
        }
        for (int i = 0; i < stringArray.length; i++) {
            boolean isFiltered = false;
            for (int j = 0; j < numWordsWithVowel; j++) {
                if (stringArray[i].equals(wordsWithVowel[j])) {
                    isFiltered = true;
                    break;
                }
            }
            if (!isFiltered) {
                System.out.print(stringArray[i] + " ");
            }
        }

            // 9. Zadatak
        System.out.println("\n" + "    9th Assignment");

        int [] arrayToSum1 = {1, 2, 3};
        int [] arrayToSum2 = {1, 1, 1};

        int sumOfElements = 0;
        for (int i = 0; i < arrayToSum1.length; i++) {
            for (int j = 0; j < arrayToSum2.length; j++) {
                sumOfElements += arrayToSum1[i] + arrayToSum2[j];
            }
        }
        System.out.println("Total sum of two arrays is: " + sumOfElements);
        }
    }