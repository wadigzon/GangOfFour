The Gang of Four (GoF) design patterns refer to a set of 23 classic software design patterns introduced in the book
"Design Patterns: Elements of Reusable Object-Oriented Software." The book was written by Erich Gamma, Richard Helm,
Ralph Johnson, and John Vlissides, often referred to as the "Gang of Four." These design patterns are categorized into
three main groups: Creational, Structural, and Behavioral.

Here is the full list of the Gang of Four design patterns:

### Creational Design Patterns (5):
1. **Singleton Pattern:** Ensures a class has only one instance and provides a global point of access to it.

2. **Factory Method Pattern:** Defines an interface for creating an object, but leaves the choice of its type to the
subclasses, creating instances of the appropriate subclass.

3. **Abstract Factory Pattern:** Provides an interface for creating families of related or dependent objects without
specifying their concrete classes.

4. **Builder Pattern:** Separates the construction of a complex object from its representation, allowing the same
construction process to create various representations.

5. **Prototype Pattern:** Creates new objects by copying an existing object, known as the prototype.

### Structural Design Patterns (6):
6. **Adapter Pattern:** Allows the interface of an existing class to be used as another interface.

7. **Bridge Pattern:** Separates an object’s abstraction from its implementation so that the two can vary independently.

8. **Composite Pattern:** Composes objects into tree structures to represent part-whole hierarchies, allowing clients to
treat individual objects and compositions of objects uniformly.

9. **Decorator Pattern:** Attaches additional responsibilities to an object dynamically. Decorators provide a flexible
alternative to subclassing for extending functionality.

10. **Facade Pattern:** Provides a simplified interface to a set of interfaces in a subsystem, making the subsystem
easier to use.

11. **Flyweight Pattern:** Minimizes memory usage or computational expenses by sharing as much as possible with related
objects.
 
12. **Proxy Pattern:** Provides a surrogate or placeholder for another object to control access to it.

### Behavioral Design Patterns (12):
13. **Chain of Responsibility Pattern:** Passes requests along a chain of handlers.

14. **Command Pattern:** Encapsulates a request as an object, thereby allowing for parameterization of clients with different requests, queuing of requests, and logging of the parameters.

15. **Interpreter Pattern:** Defines a grammar for interpreting the sentences in a language and provides an interpreter for the language.

16. **Iterator Pattern:** Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

17. **Mediator Pattern:** Defines an object that encapsulates how a set of objects interact, promoting loose coupling by keeping objects from referring to each other explicitly.

18. **Memento Pattern:** Captures and externalizes an object's internal state so that the object can be restored to this state later.

19. **Observer Pattern:** Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

20. **State Pattern:** Allows an object to alter its behavior when its internal state changes.

21. **Strategy Pattern:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.

22. **Template Method Pattern:** Defines the skeleton of an algorithm in the superclass but lets subclasses alter specific steps of the algorithm without changing its structure.

23. **Visitor Pattern:** Represents an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

These design patterns provide general solutions to recurring problems in software design and are widely used in object-oriented programming.