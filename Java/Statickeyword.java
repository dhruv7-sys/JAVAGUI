class Student{
    String name;
    Static String school;

    public static void changeSchool() {
        school = "newschool";
    }

}

public class Statickeyword {
    public static void main(String[] args) {
        Student.school = "BVB";
        Student s1 = new Student();
        s1.name = "dhruv";
        System.out.println(s1.school);
    }
}
