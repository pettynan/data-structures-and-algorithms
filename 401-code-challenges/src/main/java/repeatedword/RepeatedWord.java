package repeatedword;

import hashtable.HashTable;

// REGEX from https://stackoverflow.com/questions/11726023/split-string-into-individual-words-java

public class RepeatedWord {

    public String repeatedWord(String sentence) {
        HashTable hashTable = new HashTable(16);

        String[] words = sentence.split("\\W+");

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            if (hashTable.get(lowercaseWord) == null) {
                hashTable.add(lowercaseWord, lowercaseWord);
            } else {
                return word;
            }
        }

        return null;
    }
}
