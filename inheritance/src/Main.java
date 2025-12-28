public class Main {
    public static void main(String [] args){
        Employee james = new Employee("james", "13/10/2004", "14/10/2024");
        james.endDate="10/10/2062";
        System.out.println(james);

        SalariedEmployee umesh=new SalariedEmployee("umesh","13/10/2004","13/10/2013",3500 );
        umesh.endDate="10/10/2062";
        System.out.println(umesh);
        System.out.println(umesh.collectPay());
        System.out.println(umesh.retire("13/10/2087"));

        SalariedEmployee paras=new SalariedEmployee("paras","13/10/2004","13/10/2013",3500 );
        paras.endDate="10/10/2062";
        System.out.println(paras);
        System.out.println(paras.collectPay());
        System.out.println(paras.retire("13/10/2087"));
    }
}