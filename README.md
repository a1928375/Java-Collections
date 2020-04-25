# Java-Collections

1. MovieTheater_BruteForce: Set a method to search for the seat in a movie theater by brute force.

2. MovieTheater_BinarySearch: Set a method to search for the seat in a movie theater by binary search.

3. Comporator: The concepts of comporator & comparble in the Java.

4. AdventureGame: 

        (1) Change the program to allow players to type full words, or phrases, then move to the correct location based upon their input. The player should be able to type commands such as "Go West", "run South", or just "East" and the program will move to the appropriate location if there is one.  As at present, an attempt to move in an invalid direction should print a message and remain in the same place.

        (2) Single letter commands (N, W, S, E, Q) should still be available.
        
5. ImmutableClass: 

        The challenges to work out what is wrong with the location constructor that would allow the program to compile and crash at runtime so when you identify the problem modify the code to fix it so I'll just say that again your challenge here is to work out what is wrong with the location constructor that you can see on screen line 14 that will allow the program to compile but crash on run time when you identify the problem modify the code to fix it.
        
6. HashSet: The concepts of HashSet in Java.

7. HashSetTest: 

        (1) Modify the previous HeavenlyBody example so that the HeavenlyBody class also has a "bodyType" field. This field will store the type of HeavenlyBody (such as STAR, PLANET, MOON, etc). You can include as many types as you want, but must support at least PLANET and MOON.

        (2) For each of the types that you support, subclass the HeavenlyBody class so that your program can create objects of the appropriate type. Although astronomers may shudder at this, our solar systems will allow two bodies to have the same name as long as they are not the same type of body: so you could have a star called "BetaMinor" and an asteroid also called "BetaMinor", for example.

        (3) Hint: 
        
                (i) This is much easier to implement for the Set than it is for the Map, because the Map will need a key that uses both fields.

                (ii) There is a restriction that the only satellites that planets can have must be moons. Even if you don't implement a STAR type, though, your program should not prevent one being added in the future (and a STAR's satellites can be almost every kind of HeavenlyBody).

        (4) Test cases:
                
                (i) The planets and moons that we added in the previous video should appear in the solarSystem collection and in the sets of moons for the appropriate planets.

                (ii) a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

                (iii) Attempting to add a duplicate to a Set must result in no change to the set (so the original value is not replaced by the new one).

                (iv) Attempting to add a duplicate to a Map results in the original being replaced by the new object.

                (v) Two bodies with the same name but different designations can be added to the same set.

                (vi) Two bodies with the same name but different designations can be added to the same map, and can be retrieved from the map.

8. LinkedHashMapAndTreeMap: 

        (1) Modify the program so that adding items to the shopping basket doesn'tactually reduce the stock count but, instead, reserves  the requested number of items.

        (2) You will need to add a "reserved" field to the StockItem class to store the number of items reserved. Items can continue to be added to the basket, but it should not be possible to reserve more than the available stock of any item. An item's available stock is the stock count less the reserved amount.

        (3) The stock count for each item is reduced when a basket is checked out, at which point all reserved items in the basket have their actual stock count reduced. Once checkout is complete, the contents of the basket are cleared. It should also be possible to "unreserve" items that were added to the basket by mistake.

        (4) The program should prevent any attempt to unreserve more items than were reserved for a basket. Add code to Main that will unreserve items after they have been added to the basket, as well as unreserving items that have not been added to make sure that the code can cope with invalid requests like that.

        (5) After checking out the baskets, display the full stock list and the contents of each basket that you created.
