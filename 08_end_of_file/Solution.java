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

/*
// Submitted version
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        
        while (scanner.hasNextLine()) {
            counter++;
            System.out.println(counter + " " + scanner.nextLine());
        }
        
        scanner.close();
    }
}
*/
