interface Bank{
	float rateOfinterest();
}
class ICICI implements Bank{
	public float rateOfinterest(){
		return 9.15f;
	}
}
class CITI  implements Bank{
	public float rateOfinterest(){
		return 8.1f;
	}
}
class InterfaceDemo{
	public static void main(String args[]){
		Bank b=new ICICI();
		System.out.println("ROI : "+b.rateOfinterest());
	}
}
