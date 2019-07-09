package hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HashTableTest {
    HashTable hashTable;

    @Before
    public void initializeHashTable() {
        hashTable = new HashTable(8);
        hashTable.add("Dennis", "Father");
        hashTable.add("Peter", "Reference");
        hashTable.add("Katie", "Mother");
        hashTable.add("Annie", "Sister");
        hashTable.add("Abby", "Pet");
        hashTable.add("Bailey", "Pet");
        hashTable.add("Tyler", "Friend");
        hashTable.add("Austin", "Friend");
        hashTable.add("Paprika", "Friend");
        hashTable.add("Sunny", "Friend");
        hashTable.add("Devon", "Friend");
        hashTable.add("Reina", "Friend");
        hashTable.add("Paula", "Friend");
    }


    @Test
    public void testAdd() {

        assertEquals("a node with value 'friend' should exist at the first position in the first bucket.",
                "Friend",
                hashTable.map[0].getValue());
    }

    @Test
    public void testGet() {

        assertEquals("The get method should return the value 'Friend' associated with the key 'Tyler'.",
                "Friend",
                hashTable.get("Tyler"));

    }

    @Test
    public void testGet_null() {

        assertNull("The get method should return null when called upon a key that does not exist in the hash table.",
                hashTable.get("Samantha"));
    }

    @Test
    public void testGet_collision() {
        assertEquals("The get method, when called on a key that is stored several nodes down in a bucket, should still return the proper value.",
                "Reference",
                hashTable.get("Peter"));
    }
}