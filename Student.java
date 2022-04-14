package Study.Assignment1B.Question2;

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
    //using array create static array to record data
    static Student[] studentsArray = new Student[Student.numOfStudent()];
    static int count = -1;


    public Student() {
        count++;
    }
    /**
     * A static method that include the number of students
     * @return the number of students
     */
    public static int numOfStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the number of students");
        return sc.nextInt();
    }
    /**
     * A method which include student information through keyboard input
     * @param student
     */
    public void enterBasicInfo(Student student){
        //array insert student in Student type
        studentsArray[count] = student;
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
        //Iterate over the static array and calculate the average score
        for(int i=0; i<studentsArray.length; i++){
            result = result+studentsArray[i].studentMark;
        }
        System.out.println("The average mark of student is "+Math.round(result/studentsArray.length*100)/100.0);
    }

    /**
     * A method that counts how many student pass or fail the exam
     */
    public static void passCal(){
        int countPass = 0;
        //Iterate through the static array and calculate the pass rate
        for (int i=0; i<studentsArray.length; i++){
            if(studentsArray[i].studentMark >= 50)
                countPass++;
        }
        System.out.println("The number of student who pass the test is "+countPass);
        System.out.println("The number of student who didn't pass the test is "+(studentsArray.length-countPass));
    }

    /**
     * A method that could acquire all data of students
     */
    public static void getAllData(){
        //Iterate over the static array and get the data using the overridden toString method
        for(int i=0; i<studentsArray.length; i++){
            System.out.println(studentsArray[i].toString());
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
