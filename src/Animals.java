public class Animals {
    private String name;

    private String species;

    public Animals(String name) {
        this.name = name;
    }

    public Animals(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public Animals(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void roar(){
        System.out.println("I am " + name + ", hear me roar!");
    }
}
