package GradedStudentsLab;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Student {
   private String firstName;
    private String lastName;
    private Double[] examScores;

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = testScores;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double[] getExamScores() {

        return examScores;
    }
    public void getNumberOdExamsTaken(){

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setExamScores(int examNUmber,double newScore) {

    }
    public double getAverageExamScore(){

        return 0;
    }

    public double addExamScore(double examScore){
      return examScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + Arrays.toString(examScores) +
                '}';
    }
}
