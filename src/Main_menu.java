import java.util.Scanner;

public class Main_menu extends viewContacts {

    public static void main(String[] args) {
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
            viewContacts viewContacts;
            viewContacts = new viewContacts();
        }else if(menuOption==2){
        new addContact();
    }else if(menuOption==3){
        new searchContacts();
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
