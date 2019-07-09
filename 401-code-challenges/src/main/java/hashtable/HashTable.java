package hashtable;

public class HashTable {

    protected Node[] map;

    public HashTable(int size) {
        map = new Node[size];
    }

    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for (int i = 0 ; i < letters.length ; i++) {
            hashValue += letters[i];
        }
        hashValue = (hashValue * 69) % map.length;
        return hashValue;
    }

    public void add(String key, String value) {

        int hashKey = hash(key);

        if (this.map[hashKey] == null) {
            map[hashKey] = new Node(key, value);
        } else {
            Node temp = map[hashKey];
            map[hashKey] = new Node(key, value);
            map[hashKey].setNext(temp);
        }
    }

    public boolean contains(String key) {
        int hashKey = hash(key);

        return (this.map[hashKey] != null);
    }

    public String get(String key) {
        int hashKey = hash(key);

        if (!this.contains(key)) {
            return null;
        } else {
            Node currentNode = map[hashKey];
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    return currentNode.getValue();
                } else
                    currentNode = currentNode.getNext();
            }
            return null;
        }
    }


}