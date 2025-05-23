public class Student {
    // Private attributes
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // Using setter to validate grade
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade with validation
    public void setGrade(int grade) {
        // Ensuring grade is within 0 to 100
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0; // Sets to 0 if outside valid range
        }
    }
}