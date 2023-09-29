
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("camine", "snoopy", 2, true);
        Zoo myzo = new Zoo("friguia", "souse", 20);
        myzo.DisplayZoo();

        System.out.println(myzo.addAnimal(dog));

        Animal animalToFind = new Animal("Felidae", "Lion", 5, true);
        int animalIndex = myzo.searchAnimal(animalToFind);
        if (animalIndex != -1) {
            System.out.println("L'animal a été trouvé à l'indice : " + animalIndex);
        } else {
            System.out.println("L'animal n'a pas été trouvé.");
        }
        boolean removed = myzo.removeAnimal(dog);
        if (removed) {
            System.out.println("dog a été retiré du zoo.");
        } else {
            System.out.println("dog n'a pas été trouvé dans le zoo.");
        }


    }
    }



   





