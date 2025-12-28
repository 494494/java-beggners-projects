    public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;
    public Worker(){}
    public Worker(String name,String birthDate){
        this.name=name;
        this.birthDate=birthDate;
    }
    public String getAge(){
        int birth=Integer.parseInt(birthDate.substring(6));
        int end=2025;
        return ""+(end-birth);
    }
    public void terminate(String endDate){
        this.endDate=endDate;
    }
    public double collectPay(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
