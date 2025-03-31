import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Demonstrating Student class encapsulation(Question 1 a)
        // Creating a student with valid grade
        Student student1 = new Student("Alice", 85);
        System.out.println("Student 1: " + student1.getName() + ", Grade: " + student1.getGrade());

        // Creating a student with invalid grade (above 100)
        Student student2 = new Student("Bob", 150);
        System.out.println("Student 2: " + student2.getName() + ", Grade: " + student2.getGrade());

        // Demonstrating setters
        student1.setGrade(92);
        System.out.println("Updated Student 1: " + student1.getName() + ", Grade: " + student1.getGrade());

        student2.setGrade(75);
        System.out.println("Updated Student 2: " + student2.getName() + ", Grade: " + student2.getGrade());

        // Creating an instance of MathOperations
        MathOperations math = new MathOperations();
        // First multiplication (two numbers)
        System.out.println("Testing multiply method with two parameters:");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int result1 = math.multiply(num1, num2);
        System.out.println("Multiply(" + num1 + ", " + num2 + ") = " + result1);

        // Second multiplication (three numbers)
        System.out.println("\nTesting multiply method with three parameters:");
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        int result2 = math.multiply(num1, num2, num3);
        System.out.println("Multiply(" + num1 + ", " + num2 + ", " + num3 + ") = " + result2);

        scanner.close();
        // Demonstrating polymorphism with Animal classes(Question 1 b)
        // Demonstrating polymorphism
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.print("Dog sound: ");
        dog.makeSound();

        System.out.print("Cat sound: ");
        cat.makeSound();

    }
}