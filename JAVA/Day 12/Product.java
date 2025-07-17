package polyformorphismclasswithprivatemembers;

public class Product {

	private int productid;
	private String name;
	private double price;
											//setter
	public void setproductid(int a)
	{
		productid = a;
	}
	
	public void setname(String n)
	{
		name = n;
	}
	
	public void setprice(double p)
	{
		price = p;
	}
												//getter
	
	public int  getproductid()
	{
        return productid;
	}
	
	public String getname()
	{
          return name;
	}
	
	public double getprice() {
		return price;
	}
	
	public void display()
	{
		System.out.println("Product  ID is :"+productid);
		System.out.println("Name  is :"+name);
		System.out.println("Price  is :"+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product obj = new Product();
		obj.setproductid(12);
		obj.setname("Sunny");
		obj.setprice(233.12);
		
		obj.display();
	}

}
