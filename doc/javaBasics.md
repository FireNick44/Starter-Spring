# Starter Java

## What is java?

Java is a (OOP) programming language that translates human-readable code into binary instructions that computers can
execute. It provides a rich set of keywords, symbols, and conventions that make it accessible to developers.

OOP = object-oriented programming <br>
Means that every class represents an object

## Setup

### JDK (Java Development Kit)

The JDK is essential for developing Java applications. It includes the Java compiler, libraries, and tools needed to
write, compile, and run Java programs.

### IDE

I use IntelliJ IDEA as my preferred IDE, especially for its integration with the Spring framework.

<details>
<summary>More about IntelliJ</summary>

IntelliJ IDEA offers powerful tools and features that enhance the Java development experience. While it's a commercial
software, it offers various options for users:

- **Free Trial:** You can start with a free trial to explore all the features that IntelliJ IDEA has to offer. The trial
  period allows you to evaluate the IDE and see how it aligns with your development needs.

- **Free Test Mode for Students:** IntelliJ IDEA provides a "free test mode" for students, allowing them to use the IDE
  with certain features enabled for educational purposes. This provides students with access to professional development
  tools as they learn and build their programming skills.

You can download IntelliJ IDEA and learn more about the available options
here: [IntelliJ IDEA Download](https://www.jetbrains.com/idea/download/)

IntelliJ IDEA's tight integration with Spring makes it an excellent choice for developing Spring applications,
simplifying tasks like dependency management, configuration, and code generation. As you explore the world of Java and
Spring development, IntelliJ IDEA can be a valuable tool in your toolkit.

</details>

## Language basic

### Hello World:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

As you can see, we need a class to even create a "function" in java.
The main method, if present, is automatically called when you run the Java program.
(it serves as the entry point of the program.)

### Types

```java
public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte myByte = 10;
        short myShort = 1000;
        int myInt = 100000;
        long myLong = 1000000000L; //'L' suffix for long
        float myFloat = 3.14f;     //'f' suffix for float
        double myDouble = 3.14159;
        char myChar = 'A';
        boolean myBoolean = true;

        // Reference Data Types
        String myString = "Hello, World!";
        /*
         *  String is not a primitv data type, its a Object,
         *  therefore more advanced "things" can be done to it,
         *  for example something like this:
         *  myString.toUpperCase()
         */

        // Output values
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);
    }
}
```

### Data structures:

- #### ArrayList
  "a dynamic array-like structure that allows to store and manipulate a collection of elements"
  ```java
  import java.util.ArrayList;

  ArrayList<Integer> numbers = new ArrayList<>();
  numbers.add(1);
  numbers.add(2);
  numbers.add(3);

  int secondNumber = numbers.get(1); //starting with 0!!! ;)
  ```

- #### LinkedList:
  " a doubly-linked list implementation that provides efficient insertion and deletion operations, especially in the
  middle of the list" (Not so memory-efficient)
  ```java
  import java.util.LinkedList;

  LinkedList<String> names = new LinkedList<>();
  names.add("Tom");
  names.add("Bob");
  names.add("Ben");

  String firstName = names.getFirst(); // Accessing first element
  ```

- #### Stack & Queue:
  ```java
  import java.util.Stack;
  import java.util.Queue;
  import java.util.LinkedList;

  Stack<Integer> stack = new Stack<>();
  stack.push(1);
  stack.push(2);
  int poppedItem = stack.pop(); // Removing and getting the last added item

  Queue<String> queue = new LinkedList<>();
  queue.add("Alice");
  queue.add("Bob");
  String dequeuedItem = queue.poll(); // Removing and getting the first added item
  ```

  | Feature                | Stack                                  | Queue                                |
     |------------------------|----------------------------------------|--------------------------------------|
  | Order                  | Last-In-First-Out (LIFO)                | First-In-First-Out (FIFO)            |
  | Main Operations       | `push` (add to top), `pop` (remove top) | `add` (enqueue), `poll` (dequeue)    |
  | Additional Operation  | `peek` (view top element)              | `peek` (view front element)          |
  | Example Use Cases     | Expression evaluation, undo history    | Task scheduling, print queue         |
  | Data Structure        | Typically implemented using arrays or linked lists | Typically implemented using linked    lists or arrays |

    - Stack: (LIFO) Last-In-First-Out  !
    - Queue: (FIFO) First-In-First-Out !

- #### Note
  There are more, but with the ones above, you can make a lot of things already.

### Function calls:

```java
public class FunctionCall {
    public static void main(String[] args) {
        System.out.println("I'm writen inside the main method.");
        anotherMethod();
    }

    public static void anotherMethod() {
        System.out.println("And I'm writen inside anotherMethod.");
    }
}
```

### More:

There are other logical concepts that have a similar syntax to languages, like JavaScript, C, and others

```java
public class LogicExamples {
    public static void main(String[] args) {
        //ternary operator
        //condition ? if_true : if_false.
        int age = 18;
        System.out.println(age >= 18 ? "You are an adult." : "You are not yet an adult.");


        //loop for objects/arrays
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        //calc
        int a = 5, b = 3;
        int sum = a + b, product = a * b;
        double quotient = (double) a / b;
        System.out.println("Sum: " + sum + " | Product: " + product + " | Quotient: " + quotient);

        //if with and / or
        boolean isJavaFun = true, isCodingEasy = false;
        String message =
                (isJavaFun && isCodingEasy) ? "Java is fun and coding is easy." :
                        (isJavaFun || isCodingEasy) ? "Either Java is fun or coding is easy." :
                                "Neither Java is fun nor coding is easy.";
        System.out.println(message);
    }
}

//some snippets:
for(int i=1;i<=5;i++){ /*...*/ }
        while(condition){ /*...*/ }
        try{ /*...*/ }catch(Exception e){
        //...
        }

```