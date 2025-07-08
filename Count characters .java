import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // Read character by character until '$' is found
        while (true) {
            String line = sc.nextLine();
            sb.append(line).append('\n');
            if (line.contains("$")) {
                break;
            }
        }

        String input = sb.toString();
        int letters = 0, digits = 0, spaces = 0;

        for (char ch : input.toCharArray()) {
            if (ch == '$') break;

            if (ch >= 'a' && ch <= 'z') {
                letters++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ' || ch == '\t' || ch == '\n') {
                spaces++;
            }
        }

        System.out.println(letters + " " + digits + " " + spaces);
    }
}
