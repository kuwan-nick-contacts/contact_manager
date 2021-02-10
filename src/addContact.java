import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class addContact {
    private static String firstName;
    private static String lastName;
    private  static String phoneNumber;
    public static void main(String[] args) throws IOException {
        Scanner addCon= new Scanner(System.in);
        System.out.println("Please enter Name.");
        String added= addCon.nextLine();
        String[] array =added.split(" ");
        added.split(" ");

Contact newC = new Contact();
newC.setFirstName(firstName=array[0]);
newC.setLastName(lastName=array[1]);
newC.setPhoneNumber(phoneNumber=array[2]);
//        System.out.println(newC.getFirstName());
//        System.out.println(newC.getPhoneNumber());
//        System.out.println(newC.getLastName());





        System.out.println(Arrays.toString(added.split(" ")));
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
