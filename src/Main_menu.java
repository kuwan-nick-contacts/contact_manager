import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main_menu  {

    public static void viewContacts() throws IOException {
        Path contactPath = Paths.get("contactList.txt");
        List<String> contactList = Files.readAllLines(contactPath);
        for (int i = 0; i < contactList.size(); i += 1) {
            System.out.println((i + 1) + ": " + contactList.get(i));

        }
    }
    public static class addContact {
       public String firstName;
        public String lastName;
        public String phoneNumber;



    }

    public static void main(String[] args) throws IOException {
        System.out.println("What would you like to do?\n" +
                "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5): " );
        Scanner menu = new Scanner(System.in);
        Integer menuOption= menu.nextInt();
        if (menuOption<=0|| menuOption>5){
            System.out.println("invalid selection");
            main(args);
        }else if(menuOption==1){

             viewContacts();
        }else if(menuOption==2){
            String firstName;
            String lastName;
            String phoneNumber;
            Scanner addCon= new Scanner(System.in);
            System.out.println("Please enter Contact info.");
            String added= addCon.nextLine();
            String[] array =added.split(" ");
            added.split(" ");
            Contact newC = new Contact();
            newC.setFirstName(firstName=array[0]);
            newC.setLastName(lastName=array[1]);
            newC.setPhoneNumber(phoneNumber=array[2]);
            System.out.println(Arrays.toString(added.split(" ")));
            Path filePath = Paths.get("contactList.txt");
            List<String> contact = Arrays.asList(
                    added
            );
            Files.write(filePath,contact , StandardOpenOption.APPEND);


        }else if(menuOption==3){
            Scanner searchContacts= new Scanner(System.in);
            System.out.println("Enter a name to search");
            String nameSearch=searchContacts.nextLine();
            Path contactPath = Paths.get("contactList.txt");
            List<String> contactList = Files.readAllLines(contactPath);
            String line;
            boolean noMatches = true;
            for (int linecount = 0; linecount < contactList.size(); linecount++){
                if(contactList.get(linecount).contains(nameSearch)){
                    System.out.println(contactList.get(linecount));
                }
            }
        }else if(menuOption==4){
            new DeleteContact();
        }else  if (menuOption==5){
        System.exit(0);
    }

//1. View contacts.
//2. Add a new contact.
//3. Search a contact by name.
//4. Delete an existing contact.
//5. Exit.
//Enter an option (1, 2, 3, 4 or 5):
    }

}
