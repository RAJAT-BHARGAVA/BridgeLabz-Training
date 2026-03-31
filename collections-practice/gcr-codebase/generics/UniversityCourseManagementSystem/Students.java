
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Students {

    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();


        students.add(new Student(101, "Rajat", 85));
        students.add(new Student(102, "Aman", 45));
        students.add(new Student(103, "Neha", 72));
        students.add(new Student(104, "Pavan", 38));
        students.add(new Student(105, "Rahul", 90));

        List<Student> evenSortedMarks = students.stream()
                .filter(s -> s.marks % 2 == 0).sorted(Comparator.comparingInt(s -> s.marks)).collect(Collectors.toList());


        for (Student student : evenSortedMarks) {
            System.out.println(student);
        }
    }
}
