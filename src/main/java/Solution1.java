
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        System.out.println("Enter the third string:");
        String str3 = scanner.nextLine();

        String concatenated = str1 + str2 + str3;
        String upperCase = concatenated.toUpperCase();
        String replaced = upperCase.replace('A', '@');

        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Uppercase String: " + upperCase);
        System.out.println("Replaced String: " + replaced);

        String[] strings = {str1, str2, str3};

        System.out.println("Original Strings:");
        for (String s : strings) {
            System.out.println(s);
        }

        strings[1] = "Updated String";

        System.out.println("Updated Strings:");
        for (String s : strings) {
            System.out.println(s);
        }

        strings[2] = null;

        System.out.println("Strings after Deletion:");
        for (String s : strings) {
            System.out.println(s);
        }

        String newString = "Newly Created String";
        strings[2] = newString;

        System.out.println("Strings after Creation:");
        for (String s : strings) {
            System.out.println(s);
        }

        scanner.close();
    }
}
