import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimal = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];


    }


    public void DisplayZoo() {
        System.out.println("My Zoo name is:" + name + ",city is :" + city + "nmbr:" + nbrCages);

    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public Boolean addAnimal(Animal animal) {
        if (nbrAnimal > nbrCages) {
            return false;
        }
        animals[nbrAnimal] = animal;
        nbrAnimal++;
        return true;
    }

    public int searchAnimal(Animal animalToFind) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i].equals(animalToFind)) {
                return i;
            }

        }
        return -1;


    }
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i].equals(animal)) {
                for (int j = i; j < nbrAnimal - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[nbrAnimal - 1] = null;
                nbrAnimal--;
                return true;
            }
        }
        return false;
    }
}





