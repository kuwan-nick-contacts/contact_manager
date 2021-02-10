import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class searchContacts {


    public static void main(String[] args) throws IOException {
        Scanner searchContacts= new Scanner(System.in);
        System.out.println("Enter a name to search");
        String nameSearch=searchContacts.nextLine();
        Path contactPath = Paths.get("contactList.txt");
        List<String> contactList = Files.readAllLines(contactPath);
        int linecount= 0;
        String line;
        boolean noMatches = true;
        System.out.println(contactList);
        if (contactList.contains(nameSearch)){
            System.out.println("found");
        }
//        while ((line = searchContacts.nextLine()) != null) {
//            if(Arrays.asList(contactPath).contains(nameSearch)){
//                System.out.println(Arrays.asList(contactPath));
//            }
//            // Increment the count and find the index of the word.
//            linecount++;
//            int indexFound = line.indexOf(nameSearch.toLowerCase());
//            System.out.println(nameSearch);
//            // If greater than -1, means we found a match.
//            if (indexFound > -1) {
//                System.out.println("\nContact was FOUND\n"
//                        + "\nContact " + linecount + ": " + line);
//                noMatches = false;
//            }



//            System.out.println((i + 1) + ": " + contactList.get(i));
    }
//
//
    }

