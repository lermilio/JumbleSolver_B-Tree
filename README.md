OVERVIEW
This project implements a jumble solver that helps unscramble words using a B-Tree or HashTable-based dictionary lookup. The program:
*Reads words from a file and stores them in a B-Tree or HashTable, mapping sorted letter sequences to valid words.
*Allows users to enter scrambled words (jumbles) and retrieves possible matches.
*Supports efficient search operations for quick lookup of scrambled words.

PROJECT GOALS
*Implement a fast word lookup using B-Trees and HashTables.
*Support single-word jumble solving.
*Optimize search and insertion performance with tree-based and hash-based structures.

FEATURES
Jumble Solving
*Sorts letters in words to create a unique key for lookup.
*Uses B-Trees and HashTables to store sorted letter sequences and retrieve matching words.
*Supports fast dictionary lookups with tree balancing and hashing.
Efficient Data Handling
*Reads words from a file and inserts them into the B-Tree or HashTable.
*Uses B-Tree indexing to balance large datasets.
*Handles collisions effectively with HashTable chaining.
User Interface
*GUI-based interface (GUI.java) for input and interaction.
*Console fallback for text-based interactions (ConsoleUI.java).

DATA STRUCTURE USED
*BTree<K, V> → Implements a balanced tree for fast word lookups.
*HashTable<K, V> → Uses hashing for quick access.
*ArrayMap<K, V> → Manages key-value pairs in memory.
*FileMap<K, V> → Stores and retrieves data from files efficiently.

IMPLEMENTATION DETAILS
Word Sorting & Storage
*sort(String word) → Sorts characters in a word alphabetically to generate a key.
*BTree<K, V> → Implements a multi-level indexed storage system.
*HashTable<K, V> → Implements a hashmap for quick word retrieval.
Jumble Solving Process
*Load dictionary into a B-Tree or HashTable.
*Sort input jumble and search for matching keys in the tree or table.
*Retrieve matching words and display results.
*Allow users to remove words dynamically and update the data structure.
Multi-Level Data Management
*Uses B-Trees to organize data into structured levels for efficient access.
*FileMap manages large datasets stored on disk.
*HashTables optimize retrieval with direct access lookups.
