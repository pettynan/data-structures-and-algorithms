package fifoAnimalShelter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    private AnimalShelter animalShelter;

    @Before
    public void initAnimalShelter() throws Exception {
        animalShelter = new AnimalShelter();
        animalShelter.enqueue(new Dog("Bailey", "yellow lab", "blond", 4));
        animalShelter.enqueue(new Cat("Lulu", "russian blue", "black", 3));
        animalShelter.enqueue(new Dog("Abby", "golden retriever", "brown", 18));
    }

    @Test
    public void enqueue_dequeue() {

    assertEquals("The dequeued cat should have a name equal to 'Lulu'.",
            "Lulu",
            animalShelter.dequeue("cat").name);


    }

    @Test
    public void dequeueMulti() {

        animalShelter.dequeue("dog");

        assertEquals("The second dequeued dog should have a name equal to 'Abby'.",
                "Abby",
                animalShelter.dequeue("dog").name);
    }

    @Test
    public void dequeueEmpty() {
        animalShelter.dequeue("cat");

        assertNull("The second dequeue call on 'cat' should return null, since there are no cats left in the shelter.",
                animalShelter.dequeue("cat"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void rejectFish() throws Exception {
        animalShelter.enqueue(new Fish("Nemo", "clown fish", "orange and white", 14));


    }
}