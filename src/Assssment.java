import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Assssment {
    public static int half(int num) {
        return num / 2;
    }
    public static String shout(String string) {
        return string.toUpperCase()+"!!!";
    }

    public static ArrayList<Animals>removeCat(ArrayList<Animals>animals) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getSpecies().equals("Felis catus")) {
                animals.remove(i);


            }
        }
        return animals;
    }

            public static void main (String[]args){
                System.out.println(half(20));
                System.out.println(shout("shout"));

                Animals cat = new Animals();

                cat.setName("tom");
                cat.setSpecies("Felis catus");
//        System.out.println(cat.getName());
//        System.out.println(cat.getSpecies());
                Animals mouse = new Animals("jerry", "rat");
                Animals dog = new Animals();
                dog.setName("spike");
                dog.setSpecies("Canine");
//        System.out.println(dog.getName());

                ArrayList<Animals> animalsList = new ArrayList<>();
                animalsList.add(cat);
                animalsList.add(mouse);
                animalsList.add(dog);

                for (int i = 0; i < animalsList.size(); i++) {
                    System.out.println(animalsList.get(i).getName());
                }
                removeCat(animalsList);
                for (int i = 0; i < animalsList.size(); i++) {
                    System.out.println(animalsList.get(i).getName());
                }
                }
            }



