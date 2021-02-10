import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DeleteContact {
    public  DeleteContact(){
    }

    public static void main(String[] args) throws IOException {


        Scanner deleteScanner = new Scanner(System.in);
        System.out.println("enter contact to delete");
        String delete = deleteScanner.nextLine();

        List<String> lines = Files.readAllLines(Paths.get( "contactList.txt"));
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.contains(delete)) {
                newList.add(" ");
                continue;
            }
            newList.add(line);
        }
        Files.write(Paths.get("contactList.txt"), newList);




    }
}
