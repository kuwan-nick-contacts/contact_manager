import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class searchContacts {


    public static void main(String[] args) throws IOException {
        Scanner searchContacts= new Scanner(System.in);
        System.out.println("Enter a name to search");
        String nameSearch=searchContacts.nextLine();
        Path contactPath = Paths.get("contactList.txt");
        List<String> contactList = Files.readAllLines(contactPath);
        for (int i = 0; i < contactList.size(); i += 1) {
            if(nameSearch==)
            System.out.println((i + 1) + ": " + contactList.get(i));
    }
//
//
    }
}
