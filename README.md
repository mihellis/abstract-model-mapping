The purpose of this article is to demonstrate a way to map child classes of an abstract parent wi Model Mapper. 

Why I need parent Class?????
A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.

But the idea is more simple!
In my example I want to have an endpoint that someone like a director of a circus performance 
would be able to post/create a performance with all acts included... Acts are a List of Circus skills
like Clowns, Unicyclists and Trapeze performers. Thus, I want to use polymorphism in order to mirroring real-world relationships in an intuitive way and to avoid 
writing extra code.

There is a mismatch!!!
Interface, class, inheritance and polymorphism
Under an object-oriented paradigm, objects have interfaces that together provide the only access to the internals of that object. The relational model, on the other hand, utilizes derived relation variables (views) to provide varying perspectives and constraints to ensure integrity. Similarly, essential OOP concepts for classes of objects, inheritance and polymorphism, are not supported by relational database systems.
[https://en.wikipedia.org/wiki/Object%E2%80%93relational_impedance_mismatch]

How to deal with the mismatch
I will use the Performance class as an entity with a joined table strategy.


[https://dzone.com/articles/introduction-spring-data-jpa-inheritance-rest-app]

https://medium.com/analytics-vidhya/jpa-hibernate-entity-inheritance-1f6aa7ea2eea