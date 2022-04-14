package Study.Assignment1B.Question2;

/**
 *
 * @Author: Cho
 * @Date: 2022/04/13/23:43
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student Cho = new Student();
        Cho.enterBasicInfo(Cho);
        Student Owen = new Student();
        Owen.enterBasicInfo(Owen);
        Student Jason = new Student();
        Jason.enterBasicInfo(Jason);

        Student.averageCal();
        Student.passCal();
        Student.getAllData();
    }
}
