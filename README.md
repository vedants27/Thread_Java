# Thread_Java

## Description ##

This project is a **Java multithreading demonstration** that utilizes the `Thread` class to concurrently execute three independent tasks:
- Printing even numbers
- Printing odd numbers
- Printing characters from A to Z
Each task runs in a separate thread, showcasing the basics of **concurrent programming in Java**. 

## Features ##

1. **EvenThread** – Prints even numbers from 0 to 10.
2. **OddThread** – Prints odd numbers from 1 to 9.
3. **CharThread** – Prints uppercase letters from A to Z.
4. **Multithreading** – Each operation is executed on a separate thread using `Thread` class.
5. **Code Modularity** – Each task is defined in its own Java class and method.

## How to Run the Program ##

1. Clone the Repository  
```bash
git clone https://github.com/vedants27/Thread_Java.git
cd Thread_Java
```

2. Compile the Java Files:  
```bash
javac Main.java
```

3. Run the Program:  
```bash
java Main
```

## Code Structure ##

```
Thread_Java
│
├── Main.java         # Starts all three threads: Even, Odd, Character
├── EvenThread.java   # Prints even numbers from 0 to 10
├── OddThread.java    # Prints odd numbers from 1 to 9
├── CharThread.java   # Prints characters A to Z
└── README.md         # Project documentation
```

## Methods and Their Descriptions ##

### 1. EvenThread.java
- **printEvenNumbers()**: Prints even numbers from 0 to 10 with a delay.
- **run()**: Calls `printEvenNumbers()` when thread starts.

### 2. OddThread.java
- **printOddNumbers()**: Prints odd numbers from 1 to 9 with a delay.
- **run()**: Calls `printOddNumbers()` when thread starts.

### 3. CharThread.java
- **printCharacters()**: Prints characters A to Z with a delay.
- **run()**: Calls `printCharacters()` when thread starts.

### 4. Main.java
- **main()**: Creates instances of all thread classes and starts them simultaneously.



## How It Works: ##

<li>All thread classes extend the Thread class.</li>

<li>Each thread overrides the run() method and executes its respective function.</li>

<li>Threads are started from the Main class and run concurrently.</li>



## Example Output ##
```
EvenThread: 0
OddThread: 1
CharThread: A
EvenThread: 2
OddThread: 3
CharThread: B
...
CharThread: Z
```


