public class Invoice {

    private Customar customar;
    private Products product;
    private int quantitysold;
    private double totalprice;

        public Invoice( Customar customar, Products product, int quantitysold ){

            this.customar=customar;
            this.product=product;
            this.quantitysold=quantitysold;
            this.totalprice=product.getprice() * quantitysold;
            product.setstock(product.getstock() - quantitysold);

        }

        public void printinvoice(){

           System.out.println("   ---invoice---");
            System.out.println("Custumar name : " + customar.getname());
            System.out.println("Custumar phone : " + customar.getphone());
            System.out.println("Custumar id : " + customar.getid());
           
            System.out.println("Product bought : " + product.getname());
            System.out.println("Quantity sold : " + quantitysold);
            System.out.println("Total price : " + totalprice + "$");
            System.out.println("=============================");

        }

}
