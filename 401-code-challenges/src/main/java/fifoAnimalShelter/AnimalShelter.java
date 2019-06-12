package fifoAnimalShelter;

import stacksandqueues.Queue;

public class AnimalShelter {
    private Queue<Animal> dogQueue = new Queue<>();
    private Queue<Animal> catQueue = new Queue<>();

    public void enqueue(Animal animal) throws IllegalArgumentException {
        if (animal.type.equals("dog")) {
            dogQueue.enqueue(animal);
        } else if (animal.type.equals("cat")) {
            catQueue.enqueue(animal);
        } else {
            System.out.println("Invalid animal type, animal was not stored.");
            throw new IllegalArgumentException("Invalid animal type, animal was not stored.");
        }
    }

    public Animal dequeue(String pref) {
        if (pref.equals("dog")) {
            if (dogQueue.getFront() != null) {
                return dogQueue.dequeue();
            } else {
                System.out.println("There are no dogs currently in the shelter!");
                return null;
            }
        } else if (pref.equals("cat")) {
            if (catQueue.getFront() != null) {
                return catQueue.dequeue();
            } else {
                System.out.println("There are no cats currently in the shelter!");
                return null;
            }
        } else {
            System.out.println("Invalid animal type");
            return null;
        }
    }

}
