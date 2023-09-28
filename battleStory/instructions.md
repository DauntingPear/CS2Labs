3.7 LAB: Stories of Battle*
Introduction
This lab simulates a battle of a warrior who wields two slings against a wounded silver dragon.
A "sling" is a strip of leather that you can fold a stone into, twirl, and release the stone with deadly force
The lab will be difficult because it involves many interfaces and abstract and concrete classes for you to implement
This will test your ability to handle slightly larger projects with more complex structures
Follow the specifications below to complete the assignment
Read-only Files
Battle.java

This is a read-only file that is the executable - meaning it contains the main method and will run the rest of the program
It takes one integer as input: the seed for a random object so that you can replicate "random" results
You can enter any number to test, but if you want the attacks to have the same results, you should keep using the same number
It outputs text simulating the loading of two slings and then two attacks against the dragon, using your code in other classes
Attackable.java

An interface that defines methods to implement to make something able to be attacked
You should look at the methods, but this is read-only and need not be altered.
Attacker.java

An interface that defines methods to implement to make something into something you can attack with
You should look at the methods, but this is read-only and need not be altered.
Container.java

An interface that allows something to hold other things
Your first idea may be a backpack, but this is used in this example as a way for a sling to hold ammo
It could be used to make a backpack as well
It would be tempting to make this an abstract class, but you can only have one parent class
You should look at the methods, but this is read-only and need not be altered.
Files For You To Implement
Entity.java

An abstract class meant to mimic any physical thing in the real world for the purposes of battle
it implements Attackable so that it can be attacked
There are no abstract methods in this class, but it's meant to be a parent class only and not instantiated
Hence the class is marked as abstract, allowing child classes to be abstract as well
Six methods are provided for you and do not need to be altered:
setSeed(int seed) is a method which will set where our pseudo-random function starts
if the seed is the same, then every random number will be predictable values every time
downcastToAttacker(Entity entity) is used to see if the object attacking is an attacker
If not an attacker, the object gets a low default damage
isHit( ... ) has two overloaded methods - both return true if the entity is hit, false if it's a miss
please take a look at the logic in here so you know what's going on
receiveAttack( ... ) has two overloaded methods - both handle determining damage, reducing health, and death
please take a look at the logic in here so you know what's going on
TODO
make getters and setters for every field in this class except for "random" and "DEBUG"
"DEBUG" is a constant that can be made true to get more information about combat
override Object's toString() method
use the @Override annotation
return a string starting with "A "
if destroyed, add "(broken) "
add the name of the entity and a newline
add the description of the entity and a newline
add "It has x health left.\n" where x is replaced by the current health of the entity
Weapon.java

An abstract class that implements Attacker so that it can be used to effectively attack
It's a child of the Entity class
because you could try to attack a weapon and break it
you also inherit functionality for managing the name and description and the string representation
TODO
Implement the attack( … ) method from Attacker
this should appropriately call receiveAttack on what's being attacked and at the correct distance
Declare the rest of the methods inherited from Attacker as also abstract in this class
this is actually implicit, but do it anyway to avoid confusion
Sling.java

This class creates a regular sling weapon, by extending Weapon and implementing Container
TODO
Implement the abstract methods from Weapon:
getDamage() should return 15 for a regular sling
getHitBonus() should return 0
getHitMessage() should return "Twirling the x in a vicious arc, the ammo is released from the y with deadly force"
replace x by the name
replace y by the name
getMissMessage() should return "The x swings wildly, and the ammo careens off into the shadows";
replace x by the name
Implement the abstract methods from the Container interface
Note: the sling is a container in that it can hold one piece of ammo (like a stone)
getContainedItems( ... ) gets the backing field that holds the contents of the sling
removeItem( ... ) is to remove an item from the sling
if an entity is in the sling, remove it
addItem( ... )
if there's something already in the sling, do not add and return false
if any dimension of the entity being added is over 5, do not add and return false
the dimension is in the form of an array of integers of size three
these dimensions correspond to width, height, and depth
otherwise add and return true
getAddingMessage( ... ) when successfully adding, this message is output
returns "loads a x into the y"
replace x with the name of the added object
replace y with the name of the sling
getWithdrawingMessage( ... ) when successfully removing, this message is output
returns "takes a x from the y"
replace x with the name of the removed object
replace y with the name of the sling
getCannotAddMessage( ... ) when failing to add, this message is output
returns "cannot fit a x into the y"
replace x with the name of the not-added object
replace y with the name of the sling
isEmpty( ... ) indicates whether the sling has ammo
Add a default constructor
This should set the name to "basic sling" by default
Override the attack( ... ) method from Weapon
if there is no ammo in the sling, return false
if there is ammo, remove that ammo
then call the overriden method from the parent class
Override the toString( ... ) method from the Entity class which overrides the same method in Object
the first part of the output should be the same as in Entity
then add a line "The x contains:"
replace x with the name of the sling
list the contents of the sling
each item on this list should be of the form " A x"
replace x with the name of the contained item
those are four leading spaces
SlingOfFreezing

is a particular magical type of sling and is stronger
TODO
Override getHitBonus() to return .2 (20% more likely to hit)
Override getDamage() to return 25 (more potential damage)
Override getName() to return "sling of freezing"
Override addItem( ... ) from the Sling class to hold larger objects
preserve all logic from Sling's method EXCEPT:
allow any object with all dimensions less than or equal to 10 to be added * there are creative ways to do this without retyping logic * feel free not to override and instead alter the inherited method in Sling to be more flexible
Consider how this could be done without overrides
perhaps with a constructor?
perhaps using just modifying a simple Sling object?
Consider: how might you add magical damage types if you were to expand the project? (ice damage, for example)
I should have altered the hit message to be more magical-flavored, but it's too late now to change all the unit tests
Stone.java * Ammo for your slings

TODO
Create a default constructor that does nothing
Create a constructor with three parameters (in this order)
width, height, depth
this should actually set the dimensions for this entity
Dragon.java * A critter to attack

TODO
Create a default constructor
name should be "glistening silver dragon"
description should be "A huge dragon whose silver scales mirror its surroundings, truly a fearsome sight!"
health should be 8 (the dragon is very wounded)
damage reduction should be 1, since its scales provide some minimal armor
Final Tasks
Type in some random numbers, see the battle text that results

Think of how all the classes interact - would there be a better structure? (my time was limited, of course)

What features might you add, if you expanded upon the game?

Submit
