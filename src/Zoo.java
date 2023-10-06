import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    private final int NBR_CAGES;

    int nbrAnimal = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        NBR_CAGES = nbrCages;

        this.animals = new Animal[NBR_CAGES];


    }


    public void DisplayZoo() {
        System.out.println("My Zoo name is:" + name + ",city is :" + city + "nmbr:" + NBR_CAGES);

    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + NBR_CAGES +
                '}';
    }

    public Boolean addAnimal(Animal animal) {
        if (nbrAnimal > NBR_CAGES) {
            return false;
        }
        animals[nbrAnimal] = animal;
        nbrAnimal++;
        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i].equals(animal)) {
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
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimal > z2.nbrAnimal) {
            return z1;
        } else {
            return z2;
        }
    }


    public static boolean isZooFull(Zoo zoo) {
        return zoo.nbrAnimal >= zoo.NBR_CAGES;
    }




}








