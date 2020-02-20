abstract class Bank{	
	abstract int getRateofinterest();
}
class Axis extends Bank{
	int getRateofinterest(){
		return 12;	
	}
}
class HDFC extends Bank{
	int getRateofinterest(){
		return 10;
	}
}
class AbstractBank{
	public static void main(String args[]){
		Bank b;
		b=new Axis();
		System.out.println("Rate of interest is : "+b.getRateofinterest()+" %");
		b=new HDFC();
		System.out.println("Rate of interest is : "+b.getRateofinterest()+" %");
	}
}