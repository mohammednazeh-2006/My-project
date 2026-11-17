public class Employee extends Person{
    private double salary;
    private String workdepart;

    public Employee(String name, String workdepart, String phone ,int id ,double salary){
        super(name,phone, id);
        this.salary=salary;
        this.workdepart=workdepart;

    }

    @Override
    public void getdetails(){

        System.out.println("Employee : " + name);
        System.out.println("Work in : " + workdepart);
        System.out.println("Phone : " + phone);
        System.out.println("Employee id : " + id);
        System.out.println("Salary: " + salary + "$");

       
    }
}