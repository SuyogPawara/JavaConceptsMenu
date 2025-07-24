import java.util.Scanner;

// Encapsulation Example
class Student {
    private String name;
    private int age;

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showData() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Inheritance and Polymorphism Example
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Abstraction Example
abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle = πr²");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle = length × breadth");
    }
}

public class JavaConceptsMenu {

    static Scanner sc = new Scanner(System.in);

    // 1. Decision Making
    static void decisionMaking() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("Positive number");
        else if (num < 0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");

        System.out.print("Enter grade (A/B/C): ");
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            default: System.out.println("Invalid grade");
        }
    }

    // 2. Polymorphism
    static void polymorphismDemo() {
        Animal a;
        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
    }

    // 3. Exception Handling
    static void exceptionHandling() {
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    // 4. Loop Demo
    static void loopDemo() {
        System.out.println("For Loop (1 to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nWhile Loop (5 to 1):");
        int j = 5;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println();
    }

    // 5. Array Demo
    static void arrayDemo() {
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("You entered:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 6. Inheritance Demo
    static void inheritanceDemo() {
        Dog dog = new Dog();
        dog.sound();
    }

    // 7. Abstraction Demo
    static void abstractionDemo() {
        Shape shape;
        shape = new Circle();
        shape.area();
        shape = new Rectangle();
        shape.area();
    }

    // 8. Encapsulation Demo
    static void encapsulationDemo() {
        Student s = new Student();
        sc.nextLine(); // clear buffer
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        s.setData(name, age);
        s.showData();
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Java Concepts Menu ===");
            System.out.println("1. Decision Making");
            System.out.println("2. Polymorphism");
            System.out.println("3. Exception Handling");
            System.out.println("4. Loops");
            System.out.println("5. Arrays");
            System.out.println("6. Inheritance");
            System.out.println("7. Abstraction");
            System.out.println("8. Encapsulation");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: decisionMaking(); break;
                case 2: polymorphismDemo(); break;
                case 3: exceptionHandling(); break;
                case 4: loopDemo(); break;
                case 5: arrayDemo(); break;
                case 6: inheritanceDemo(); break;
                case 7: abstractionDemo(); break;
                case 8: encapsulationDemo(); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}
