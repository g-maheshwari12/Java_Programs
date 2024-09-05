import java.io.*;
public class Palindrome_FileHandling
{
    public static void main(String[] args) 
	{
        String fileName = "myfile.txt";
        int Count = Palindromes(fileName);
        System.out.println("Number of palindromes in the file: " +Count);
    }

    private static int Palindromes(String fileName) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split line into words

                for (String word : words) {
                    if (isPalindrome(word))
                        count++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return count;
    }

    private static boolean isPalindrome(String word) {
        word = word.toLowerCase(); // Convert word to lowercase for case-insensitive comparison
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
