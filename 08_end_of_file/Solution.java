import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            list.add(line);
             if (line.contains("end-of-file")) {
                break;
            } 
        }

        scanner.close();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + " " + list.get(i));
        } 

    }
}

