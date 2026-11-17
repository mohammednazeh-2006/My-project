import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Products p1 = new Products("iPhone",20.3,45);
        Products p2 = new Products("Sam",31.4,4);
        Products p3 = new Products("Nokia",27.8,75);
        Products p4 = new Products("Hawawi",70.3,25);
        Products p5 = new Products("Redmi",28.9,61);

        Employee e1 = new Employee("Ahmed","MArketing","7564542",25, 12000);
        Employee e2 = new Employee("Ebrahiem", "SElling","765568",78, 2000);
        Employee e3 = new Employee("younis","Managing","746462", 21, 4500);
        Employee e4 = new Employee("mohamed","Advertising","75758", 26, 7400);

        System.out.println("Enter customar name : ");
        String customarname = scanner.next();

        System.out.println("Enter customar phone : ");
        String customarphone = scanner.next();
        
        System.out.println("Enter customar id : ");
        int customarid = scanner.nextInt();

        Customar c1 = new Customar(customarname, customarphone, customarid);
       // c1.getdetails();

        System.out.println("Customar name : " + c1.getname());
        System.out.println("Customar phone : " + c1.getphone());
        System.out.println("Customar id : " + c1.getid());

            System.out.println("==========================");
            System.out.println("      === WELCOME ====");
            System.out.println("==========================");

        boolean running = true;

        while (running)
            {
               System.out.println("Choice a service ,please");
               System.out.println("View to see the products");
               System.out.println("Sell for selling a product");
               System.out.println("Query for employees information");
              // System.out.println("Stocked to display the whole products");
               System.out.println("Exit");
               System.out.println("Choice here ,please : ");

             String choice = scanner.next();

             switch (choice) {
        
                 case "Sell":

                    System.out.println("*** Products list ***");
                    System.out.println("1." + p1.getname() + " Price : " + p1.getprice() + " $ " + " Quantity : " + p1.getstock());
                    System.out.println("2." + p2.getname() + " Price : " + p2.getprice() + " $ " + " Quantity : " + p2.getstock());
                    System.out.println("3." + p3.getname() + " Price : " + p3.getprice() + " $ " + " Quantity : " + p3.getstock());
                    System.out.println("4." + p4.getname() + " Price : " + p4.getprice() + " $ " + " Quantity : " + p4.getstock());
                    System.out.println("5." + p5.getname() + " Price : " + p5.getprice() + " $ " + " Quantity : " + p5.getstock());

                    System.out.println("Select the number of the chosen product : ");
                    int pronum = scanner.nextInt();

                    System.out.println("Select the Quantity of the chosen product : ");
                    int Quantity = scanner.nextInt();
                    
                    Products product = null;

                      if (pronum == 1)
                        {
                            product = p1;
                        }
                      else if (pronum == 2)
                        {
                            product = p2;
                        }
                      else if(pronum == 3)
                        {
                            product = p3;
                        }
                      else if(pronum == 4)
                        {
                            product = p4;
                        }
                      else if(pronum == 5)                   
                        {
                            product = p5;
                        }
                      else
                        {
                            System.out.println("Invalid product number!! ");
                        }

                      if(product != null)
                          {
                            if(product.getstock() >= Quantity)
                                 {
                                    Invoice invoice = new Invoice(c1, product, Quantity);
                                    invoice.printinvoice();
                                 }  
                              else
                                 {
                                   System.out.println("Sorry , this Quantity isn't available ");
                                 }
                           }     
                 break;

                 case "View":
                    System.out.println("=========================");
                    System.out.println("** Products list: **");
                    p1.displayinfo();
                    p2.displayinfo();
                    p3.displayinfo();
                    p4.displayinfo();
                    p5.displayinfo();
                    System.out.println("=========================");
                    break;

                 case "Query":

                    System.out.println("Enter the password : ");
                    int password = scanner.nextInt();
                    
                    if(password == 123)
                    {
                        System.out.println("=====================");
                        System.out.println("** Employees are: **");
                        e1.getdetails();
                        System.out.println("===============");
                        e2.getdetails();
                        System.out.println("===============");
                        e3.getdetails();
                        System.out.println("===============");
                        e4.getdetails();
                        System.out.println("=====================");
                    }
                    else
                    {
                        System.out.println("Wrong password");
                    }
                    
                    break;

                 case "Exit":
                    System.out.println("Thanks for using our service");
                       running = false;
                     break;
                 default:
                    System.out.println("Error , The servise does not exist");
                    break;
            }

    }

    scanner.close();

}
}
