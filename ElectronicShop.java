
public class ElectronicShop {
	String name;
	String mobileNo;
	double price;
	double discount;
	double total;
	ElectronicShop(String name,String mobileNo,int price)
	{
		this.name=name;
		this.mobileNo=mobileNo;
		this.price=price;
	}
	
	public static void main(String[] args) {
		ElectronicShop e=new ElectronicShop( "Monisha","8876789879",50000);
		System.out.println(e.name);
		System.out.println(e.mobileNo);
		System.out.println(e.price);
		e.discount();
		e.total();
		
		ElectronicShop e1=new ElectronicShop( "kavi","9876789879",100000);
		System.out.println(e1.name);
		System.out.println(e1.mobileNo);
		System.out.println(e1.price);
		e1.discount();
		e1.total();
	}
	
	void discount() {
	if(price<=25000)
	{
	discount=price*5/100;	
	}else if(price>25001 && price<=50000)
	{
		discount=price*7.5/100;
	}else if(price>50001 && price<=100000)
	{
		discount=price*10.0/100;
	}else if(price>100000)
	{
		discount=price*15.0/100;
	}
		System.out.println(discount);
	
	
	}
	void total() {
		total=price-discount;
		System.out.println(total);
		
	}
}



