# [Stacks and Queues](https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/fifoAnimalShelter)
https://github.com/pettynan/data-structures-and-algorithms/tree/master/401-code-challenges/src/main/java/fifoAnimalShelter
## Challenge
Create an AnimalShelter class, which stores cats and dogs using enqueue(animal), and returns the longest-staying cat or dog with dequeue(animal).

## Approach & Efficiency
AnimalShelter uses two separate internal queues, catQueue and dogQueue, to keep track of the order in which cats and dogs arrived to the shelter.

All methods have a constant big O for space and time.

## API
    enqueue - Takes an animal object as an input, stores it if it is a cat or a dog, and returns an exception if the animal is neither a cat nor a dog.
    dequeue - Takes a string as an input, returns the next dog if string is "dog", returns the next cat if string is "cat", else returns null and prints a message.