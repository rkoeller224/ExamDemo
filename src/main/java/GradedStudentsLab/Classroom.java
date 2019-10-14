package GradedStudentsLab;

public class Classroom {
    Student[] students;
    int maxNUmberOfStudents;


    public Classroom(int maxNUmberOfStudents){
        this.maxNUmberOfStudents = maxNUmberOfStudents;
    }
    public Classroom(Student[] student){

    }
    public Classroom(){
        Student[] students = new Student[30];
    }
    public Student[] getStudents(Student s1){
        return students;
    }
}
