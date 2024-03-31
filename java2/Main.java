import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "John", "123 Street, City"));
        students.add(new Student(102, "Alice", "456 Avenue, Town"));
        students.add(new Student(103, "Bob", "789 Road, Village"));
        students.add(new Student(104, "Eve", "321 Lane, Hamlet"));
        students.add(new Student(105, "Charlie", "654 Boulevard, County"));
        students.add(new Student(106, "Diana", "987 Square, District"));
        students.add(new Student(107, "Frank", "135 Circle, Municipality"));
        students.add(new Student(108, "Grace", "246 Oval, Territory"));
        students.add(new Student(109, "Henry", "369 Crescent, State"));
        students.add(new Student(110, "Ivy", "579 Park, Province"));

        System.out.println("Unsorted:");
        printStudents(students);

        MergeSort.mergeSort(students);

        System.out.println("\nSorted by roll number:");
        printStudents(students);
    }

    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
