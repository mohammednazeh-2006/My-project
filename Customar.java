public class Customar extends Person {
   // private String phone;

    public Customar(String name,String phone,int id){
        super(name, phone, id);
      //  this.phone=phone;

    }

   public void getdetails(){
        System.out.println("Custumar : " + name);
        System.out.println("Phone : " + phone);
        System.out.println(" id : " + id);



   }

    public String getname(){
        return name;
    }

    public String getphone(){
        return phone;
    }

    public int getid(){
        return id;
    }
}
