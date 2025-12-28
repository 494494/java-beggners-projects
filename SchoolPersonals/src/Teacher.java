public class Teacher extends Person {
    private String subject;

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}'+ super.toString();
    }
    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
}
