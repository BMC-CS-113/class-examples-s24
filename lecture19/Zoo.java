public class Zoo {
    private int size; //number of animals
    private int maxCapacity;
    private Animal[] animals;

    public Zoo() {
        size = 0;
        maxCapacity = 100;
        animals = new Animal[maxCapacity];
    }

    public void addAnimal(Animal a) {
        if (size == maxCapacity) {
            System.out.println("You can't add any more animals..");
            return;
        }
        animals[size] = a;
        size++;
    }

    public void removeAnimal(Animal a) {
        for (int i=0; i<size; i++) {
            if (a.getName().equals(animals[i].getName())) {
                animals[i] = null;
                break;
            }
        }
    }

    public int numSmallAnimals() {
        int numSmall = 0; 

        for (int i=0; i<size; i++)  {
            if (animals[i].getWeight() < 5) {
                numSmall += 1;
            }
        }

        return numSmall;
    }

}
