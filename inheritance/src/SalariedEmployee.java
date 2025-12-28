public class SalariedEmployee extends Employee {
    private double annualSaliry;
    private boolean isretired;

    public SalariedEmployee(String name, String birthDate,String hireDate, double annualSaliry) {
        super(name, birthDate, hireDate);
        this.annualSaliry = annualSaliry;
    }
    public boolean retire(String date){
        terminate(date);
        return isretired=true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSaliry=" + annualSaliry +
                "} " + super.toString();
    }

    @Override
    public double collectPay() {
        return annualSaliry/26;
    }
}
