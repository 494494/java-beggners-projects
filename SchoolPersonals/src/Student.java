public class Student extends Person {
    private int rollno;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                "} " + super.toString();
    }
    Student(String name, int age, int rollno){
        super(name,age);
        this.rollno=rollno;
    }
}
