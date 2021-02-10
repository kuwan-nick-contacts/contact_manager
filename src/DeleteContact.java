import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteContact {
    Scanner deleteScanner = new Scanner(System.in);

    List<String> lines = Files.readAllLines(Paths.get("data", "contactlist.txt"));
    List<String> newList = new ArrayList<>();

for (String line : lines) {
        if (line.equals("milk")) {
            newList.add("cream");
            continue;
        }
        newList.add(line);
    }

Files.write(Paths.get("data", "contactlist.txt"), newList);
}
