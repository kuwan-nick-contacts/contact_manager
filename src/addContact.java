import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class addContact {
    public static void main(String[] args) throws IOException {
        Scanner addCon= new Scanner(System.in);
        System.out.println("Please enter Name and Phone number.");
        String added= addCon.nextLine();
//        Path filepath=Paths.get("data","contactList.txt");
//                Files.write(filepath, addCon, StandardOpenOption.APPEND);
//
//        );
        Path filePath = Paths.get("contactList.txt");
        List<String> contact = Arrays.asList(
                added
        );
        Files.write(filePath,contact ,StandardOpenOption.APPEND);

    }
}
