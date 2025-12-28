public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    Person(){}
    Person(String name,int age){
        this.age=age;
        this.name=name;
    }
}
