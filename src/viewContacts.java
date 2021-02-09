import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class viewContacts {
    public static void main(String[] args) throws IOException {


//        List<String> contactList = Arrays.asList("coffee", "milk", "sugar");
        Path contactPath = Paths.get("contactList.txt");
        List<String> contactList = Files.readAllLines(contactPath);
        for (int i = 0; i < contactList.size(); i += 1) {
            System.out.println((i + 1) + ": " + contactList.get(i));
        }
    }
}
