# Java

JAVA-OOP(Object Oriented Programming)


ENCAPSULATION

-The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this,   
 you must:

	1. declare class variables/attributes as private
	2. provide public get and set methods to access and update the value of a private variable

Advantage:
   > Through this you can hide sensitive data like passwords, usernames etc. This allows us to keep the application's privacy high. 

Disadvantage:
   > It is bit difficult to manipulate the code.


INHERITANCE

-Basically INHERITANCE means attributes and methods of parent class are coming to child classes.

-In Java, it is possible to inherit attributes and methods from one class to another. We group the  "inheritance concept" into two categories:

	1. subclass (child) - the class that inherits from another class
	2. superclass (parent) - the class being inherited from

-To inherit from a class, use the extends keyword.

Advantage:
   >  It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.


POLYMORPHISM

-Basically POLYMORPHISM means "many forms" and it lets us to use a single action in different places in  different ways.

-Polymorphism occurs when we have many classes that are related to each other by inheritance. Like we  specified before; Inheritance lets us inherit attributes and methods from another class. Polymorphism  uses those methods to perform different tasks. This allows us to perform a single action in different  ways.

Advantage:
  >  It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

ABSTRACTION

-Data abstraction is the process of hiding certain details and showing only essential information to the  user. Abstraction can be achieved with either abstract classes or interfaces.The abstract keyword is a  non-access modifier, used for classes and methods:

	1. Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another            class).
	2. Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass    	   (inherited from). 
