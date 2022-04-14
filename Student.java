package Study.Assignment1B.Question2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @Author: Cho
 * @Date: 2022/04/13/23:32
 * @Description:
 */
public class Student {
    /**
     * define the basic global variables in Student class(id,name,mark)
     */
    int studentID;
    String studentName;
    double studentMark;
    //using arraylist create dynamic arrays to record data
    static ArrayList<Student> studentsArray = new ArrayList<>();

    /**
     * A method which include student information through keyboard input
     * @param o
     */
    public void enterBasicInfo(Student student){
        //dynamic array insert student in Student type
        studentsArray.add(student);

        // get information from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Please,enter the student id");
        this.studentID = sc.nextInt();
        System.out.println("Please,enter the student name");
        this.studentName = sc.next();
        System.out.println("Please,enter the student mark");
        this.studentMark = sc.nextDouble();
    }

    /**
     * A method that calculate the average mark of students
     */
    public static void averageCal(){
        double result = 0.0;
        //Iterate over the dynamic array and calculate the average score
        for(Student i: studentsArray){
            result = result+i.studentMark;
        }
        System.out.println("The average mark of student is "+Math.round(result/studentsArray.size()*100)/100.0);
    }

    /**
     * A method that counts how many student pass or fail the exam
     */
    public static void passCal(){
        int countPass = 0;
        //Iterate through the dynamic array and calculate the pass rate
        for (Student i: studentsArray){
            if(i.studentMark >= 50)
                countPass++;
        }
        System.out.println("The number of student who pass the test is "+countPass);
        System.out.println("The number of student who didn't pass the test is "+(studentsArray.size()-countPass));
    }

    /**
     * A method that could acquire all data of students
     */
    public static void getAllData(){
        //Iterate over the dynamic array and get the data using the overridden toString method
        for(Student i: studentsArray){
            System.out.println(i.toString());
        }
    }

    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentMark=" + studentMark +
                '}';
    }
}
