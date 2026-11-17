abstract public class Person {

      protected String name;
      protected String phone;
      protected int id;

    public Person(String name,String phone,int id){
        this.name=name;
        this.phone=phone;
        this.id=id;

    }

   abstract void getdetails();
      
    

}