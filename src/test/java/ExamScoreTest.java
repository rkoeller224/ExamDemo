import GradedStudentsLab.Classroom;
import GradedStudentsLab.Student;
import org.junit.Test;

import java.util.Arrays;


public class ExamScoreTest {

    @Test
    public void getExamScores(){
        // : given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName,lastName,examScores);

        //When
        Double[] output = student.getExamScores();

        //then
        System.out.println(Arrays.toString(output));
    }
@Test
    public void addExamScore(){
    String firstName = "leon";
    String lastName = "hunter";
    Double[] examScores = { };
    Student student = new Student(firstName,lastName,examScores);

    student.addExamScore(100.0);
    Double[] output = student.getExamScores();

    System.out.println(Arrays.toString(output));
}
@Test
    public void setExamScoreTest(){
        String firstName = "leon";
        String lastName = "Hunter";
        Double[] examScores = {100.00 };
        Student student = new Student(firstName,lastName,examScores);

        student.setExamScores(1,150.0);
        Double[] output = student.getExamScores();

    System.out.println(Arrays.toString(output));
}

@Test
    public void getAverageExamScoreTest() {
    Double[] s1Scores = {100.0, 150.0};
    Double[] s2Scores = {225.0, 25.0};

    Student s1 = new Student("Student", "one", s1Scores);
    Student s2 = new Student("student", "two", s2Scores);

    Student[] students = new Student[]{s1, s2};
    Classroom classroom = new Classroom(students);

    int total = 0;


    for (Classroom clas:students) {

    }
//    for (int i = 0; i < students.length; i++) {
//        total = total + students[i];
//        double average = total / students.length;
//        System.out.println(average);
//    }
}










@Test
    public void OverrideTest(){
        String firstName = "leon";
        String lastName = "hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName,lastName,examScores);

        String output = student.toString();

    System.out.println(output);
}
@Test
    public void addStudentTest(Student student){
        int maxNumberOdStudents = 1;

         Double[] s1Scores = {100.0, 150.0};
         Double[] s2Scores = {225.0, 25.0};

         Student s1 = new Student("Student", "one", s1Scores);
         Student s2 = new Student("student", "two", s2Scores);

        Classroom classroom = new Classroom (maxNumberOdStudents);
        Double[] examScores = {100.0,150.0,250.0, 0.0};
        Student student1 = new Student("leon","hunter",examScores);

        Student[] prnEnrollment = classroom.getStudents(s1);
        classroom.getStudents(s1);
        Student[] postEnrollment = classroom.getStudents(s1);

        String preEnrollmentAsString = Arrays.toString(postEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

    System.out.println("=================================");
    System.out.println(preEnrollmentAsString);
    System.out.println("==================================");
    System.out.println(postEnrollmentAsString);

}
}
