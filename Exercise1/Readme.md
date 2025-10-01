## Exercise 1 — Design Patterns (Individual Patterns)

This module demonstrates classic GoF design patterns across behavioral, creational, and structural categories. Each pattern includes a small demo you can run directly from your IDE.

### Prerequisites
- **JDK**: 8 or higher
- **IDE**: IntelliJ IDEA (recommended) or any Java-capable IDE


### How to Run (IDE)
1. Open the `Exercise1` project in your IDE.
2. Navigate to the desired demo class.
3. Right‑click the file and choose “Run …”.

If your IDE asks for a module or SDK, point it to your installed JDK.

---

### Behavioral Patterns

#### Memento
Folder: `src/behavioralDesignPattern/memento`
- Purpose: Capture and restore an object state without exposing its internals.
- Classes: `TextEditor` (Originator), `Memento`, `History` (Caretaker)
- Run: `MementoDemo.java`

#### State
Folder: `src/behavioralDesignPattern/state`
- Purpose: Let an object alter its behavior when its internal state changes.
- Classes: `Order` (Context), `OrderState` (State) with `NewOrderState`, `PackedState`, `ShippedState`, `DeliveredState`, `CancelledState`
- Run: `StateDemo.java`

### Creational Patterns

#### Factory Method
Folder: `src/creationalDesignPattern/factory`
- Purpose: Define an interface for creating objects while letting subclasses decide which class to instantiate.
- Classes: `DatabaseConnection` (Product), `MySQLConnection`, `MongoDBConnection` (Concrete Products);
  `DatabaseConnectionFactory` (Creator), `MySQLDatabaseConnectionFactory`, `MongoDBConnectionFactory` (Concrete Creators)
- Run: `FactoryDemo.java`

#### Singleton
Folder: `src/creationalDesignPattern/singleton`
- Purpose: Ensure a class has a single instance and provide a global access point.
- Classes: `ConfigManager` (Singleton), `ConfigDemo` (Client)
- Run: `ConfigDemo.java`

### Structural Patterns

#### Composite
Folder: `src/structuralDesignPattern/composite`
- Purpose: Compose objects into tree structures to represent part‑whole hierarchies; treat individual objects and compositions uniformly.
- Classes: `MenuComponent` (Component), `MenuItem` (Leaf), `Menu` (Composite)
- Run: `CompositeDemo.java`

#### Decorator
Folder: `src/structuralDesignPattern/decorator`
- Purpose: Attach additional responsibilities to objects dynamically.
- Classes: `Text` (Component), `PlainText` (Concrete Component), `TextDecorator` (Decorator),
  `BoldDecorator`, `ItalicDecorator`, `UnderlinedDecorator` (Concrete Decorators)
- Run: `DecoratorDemo.java`

### Running from Command Line (optional)
If you prefer the command line, ensure all sources are compiled to an output directory and then run the desired demo. Because package declarations may vary, the simplest route is using your IDE. If you already have compiled classes in `out/production/Exercise1`, you can run using your IDE’s run configuration with that output path on the classpath.



