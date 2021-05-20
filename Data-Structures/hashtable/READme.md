# Code Challenge: Class 30
# Hash Table Implementation

## Hashtables
 A hash table (hash map) is a data structure that implements an associative array abstract data type, a structure that can map keys to values. A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found.
## Challenge
- **Implement a `Hashtable` with the following methods** :

- `add` : this method takes in both the key and value. This method should hash the key and add the key and value pair to the table.
- `git` : this method named that takes in the key and returns the value from key/value pair.
- `contains` : this method takes in the key and returns a boolean, indicating if the key exists in the table already.
- `hash` : this method takes in an arbitrary key and returns an index in the collection.
## Approach & Efficiency

- for all methods the Time Complexity : O(n) 
- for `contains` ,`git` , `hash` methods the Space Complexity : O(1) 
- for `add` method the Space Complexity : O(1) 
## API
- `add`
Takes in a key and a value, hashes the key and adds the pair to the index for that hash. 
- `contains`
Takes in a key and returns true if that key is already in the table, false if not. 
- `git`
Takes in a key and returns that value associated with it in the table. Will throw a NoSuchElementException if the key is not in the table.
- `hash` : 
Takes in an arbitrary key and returns an index in the collection.