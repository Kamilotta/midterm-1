import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1) Enter a sentence: ");
        Scanner scan = new Scanner(System.in);
        String sent = scan.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < sent.length(); i++) {
            if (Character.isLetter(sent.charAt(i))) {
                if (Character.toUpperCase(sent.charAt(i)) == 'A' ||
                        Character.toUpperCase(sent.charAt(i)) == 'E' ||
                        Character.toUpperCase(sent.charAt(i)) == 'I' ||
                        Character.toUpperCase(sent.charAt(i)) == 'O' ||
                        Character.toUpperCase(sent.charAt(i)) == 'U') {
                    vowels++;
                } else
                    consonants++;
            }
        }

        System.out.println("The number of vowels " + vowels);
        System.out.println("The number of consonants  " + consonants);

        System.out.println("\n-----------------------------");


        int[] count = new int[10];
        int num;

        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < 100; i++) {
            num = (int) (Math.random() * 10);
            for (int j = 0; j < 10; j++) {
                if (num == j)
                    count[j] = count[j] + 1;
            }
        }

        System.out.println("2) Count of randomly generated numbers: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Count of " + i + " is " + count[i]);
        }
        System.out.println("\n-----------------------------");




        int[] numbers = new int[10];

        System.out.print("3) Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scan.nextInt();


        System.out.println("The minimum number is " +
                numbers[indexOfSmallestElement(numbers)] + " index " +
                indexOfSmallestElement(numbers));
        System.out.println("\n-----------------------------");



        double[][] matrix = new double[4][4];
        System.out.println("4) Enter values of 4x4 matrix row by row : ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        }

        System.out.printf("Sum of the elements in long diagonal is %.1f",
                sumLongDiagonal(matrix));
        System.out.println("\n-----------------------------");


        System.out.println("Enter a phrase:  " );
        String phrase = scan.nextLine();
        abbreviatePhrase(phrase);

    }


   public static void abbreviatePhrase(String name)
    {
        if (name.length() == 0)
            return;
        String words[] = name.split(" ");
        for(String word : words) {
            System.out.print(Character.toUpperCase(word.charAt(0)) + " ");
        }
    }

    public static double sumLongDiagonal(double[][] mat) {
        double sum = 0.0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }
        return sum;
    }





    public static int indexOfSmallestElement(int[] array) {
        if (array.length <= 1)
            return 0;

        int min = array[0];
        int minimumIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minimumIndex = i;
            }
        }
        return minimumIndex;

    }


}