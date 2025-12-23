The program allows you to:
• Create CD objects containing album information
• Store CDs inside a dynamically resizing collection
• Display the full collection with total cost
• Remove the most recently added CD
• Interact with the collection through a menu‑driven console interface
This project is ideal for beginners learning how classes interact and how arrays can be used to manage collections of objects.

Class Breakdown:
1. `CD.java`
Represents a single CD with:
• Title
• Artist
• Number of tracks
• Cost
Includes getters, setters, and a formatted toString() method.
---
2. `CDCollection.java`
Manages an array of CD objects. Features include:
• Adding CDs
• Automatically resizing the array when full
• Removing the last CD added
• Tracking the total cost of the collection
• Printing the entire collection in a readable format
---
3. `DriverCD.java`
The main program that:
• Creates a CD collection
• Adds sample CDs
• Prints the collection
• Allows the user to remove CDs or view the total cost
• Loops until the user chooses to exit
