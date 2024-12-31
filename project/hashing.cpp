#include <iostream>
#include <list>
using namespace std;

// Hash table class
class HashTable {
    int BUCKET; // No. of buckets
    list<int> *table; // Pointer to an array containing buckets (chaining)
    
public:
    // Constructor
    HashTable(int size) {
        BUCKET = size;
        table = new list<int>[BUCKET]; // Create an array of lists
    }

    // Hash function to map values to key
    int hashFunction(int key) {
        return (key % BUCKET);
    }

    // Insert a key into the hash table
    void insert(int key) {
        int index = hashFunction(key);
        table[index].push_back(key); // Insert at the end of the chain
    }

    // Delete a key from the hash table
    void remove(int key) {
        int index = hashFunction(key);
        table[index].remove(key); // Remove the key from the chain
    }

    // Search for a key in the hash table
    bool search(int key) {
        int index = hashFunction(key);
        for (auto x : table[index]) {
            if (x == key) {
                return true; // Key found
            }
        }
        return false; // Key not found
    }

    // Display the hash table
    void display() {
        for (int i = 0; i < BUCKET; i++) {
            cout << i << ": ";
            for (auto x : table[i])
                cout << x << " -> ";
            cout << "NULL" << endl;
        }
    }
};

// Driver program to test the hash table implementation
int main() {
    int size;
    cout << "Enter the size of the hash table: ";
    cin >> size;

    HashTable ht(size); // Create a hash table of given size

    // Inserting keys into the hash table
    ht.insert(15);
    ht.insert(11);
    ht.insert(27);
    ht.insert(8);
    ht.insert(12);

    // Display the hash table
    cout << "Hash Table: " << endl;
    ht.display();

    // Search for a key
    int key;
    cout << "Enter key to search: ";
    cin >> key;
    if (ht.search(key)) {
        cout << "Key " << key << " found in the hash table." << endl;
    } else {
        cout << "Key " << key << " not found." << endl;
    }

    // Deleting a key
    cout << "Enter key to delete: ";
    cin >> key;
    ht.remove(key);

    // Display the updated hash table
    cout << "Hash Table after deletion: " << endl;
    ht.display();

return 0;
}