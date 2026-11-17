public class Products {

    private String name;
    private double price;
    private int stock;
    public static int totalproducts = 0;

    public Products(String name,double price,int stock){
     this.name=name;
     this.price=price;
     this.stock=stock;   
     totalproducts++;
    }

    public String getname(){
        return name;
    }

    public double getprice(){
        return price;
    }

     public int getstock(){
        return stock;
    }

    public void setname(String name){
        this.name=name;
    }

    // public void setprice(double price){
    //     if(price > 0)
    //         {
    //          this.price=price;  
    //         }
    // }

   

    public void setstock(int stock){
        this.stock=stock;
    }

    public void displayinfo(){
        System.out.println("Product : " + name);
        System.out.println("Price : " + price + "$");
        System.out.println("Stocked : " + stock);
    }

}
