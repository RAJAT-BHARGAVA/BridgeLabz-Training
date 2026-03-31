import java.util.ArrayList;
import java.util.Scanner;

// custom exception
class ExamTimeExpiredException extends Exception {
    ExamTimeExpiredException(String msg) {
        super(msg);
    }
}

// evaluation interface
interface EvaluationStrategy {
    int evaluate(Question q, String answer);
}

// objective evaluation
class ObjectiveEvaluation implements EvaluationStrategy {
    public int evaluate(Question q, String answer) {
        if (q.correctAnswer.equalsIgnoreCase(answer))
            return q.marks;
        return 0;
    }
}

// descriptive evaluation
class DescriptiveEvaluation implements EvaluationStrategy {
    public int evaluate(Question q, String answer) {
        if (answer.length() > 10)
            return q.marks;
        return q.marks / 2;
    }
}

// question class
class Question {
    int id;
    String question;
    String correctAnswer;
    int marks;
    boolean objective;

    Question(int id, String question, String correctAnswer, int marks, boolean objective) {
        this.id = id;
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.marks = marks;
        this.objective = objective;
    }
}

// student class
class Student {
    int rollNo;
    String name;
    int score = 0;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

// exam class
class Exam {
    String examName;
    int timeLimit; // in minutes
    ArrayList<Question> questions = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    Exam(String examName, int timeLimit) {
        this.examName = examName;
        this.timeLimit = timeLimit;
    }

    void addQuestion(Question q) {
        questions.add(q);
    }

    void enrollStudent(Student s) {
        students.add(s);
    }
}

// main system
public class OnlineExaminationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Exam exam = new Exam("Java Test", 30);

        exam.addQuestion(new Question(1, "What is JVM?", "Java Virtual Machine", 5, true));
        exam.addQuestion(new Question(2, "Explain OOP concepts", "", 10, false));

        Student student = new Student(101, "Rajat");
        exam.enrollStudent(student);

        long startTime = System.currentTimeMillis();
        EvaluationStrategy evaluator;

        try {
            for (Question q : exam.questions) {

                long currentTime = System.currentTimeMillis();
                long minutesUsed = (currentTime - startTime) / 60000;

                if (minutesUsed >= exam.timeLimit) {
                    throw new ExamTimeExpiredException("Exam time expired");
                }

                System.out.println("\nQ" + q.id + ": " + q.question);
                System.out.print("Answer: ");
                String ans = sc.nextLine();

                if (q.objective)
                    evaluator = new ObjectiveEvaluation();
                else
                    evaluator = new DescriptiveEvaluation();

                int marks = evaluator.evaluate(q, ans);
                student.score += marks;
            }

            System.out.println("\nExam Finished");
            System.out.println("Student: " + student.name);
            System.out.println("Total Score: " + student.score);

        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
