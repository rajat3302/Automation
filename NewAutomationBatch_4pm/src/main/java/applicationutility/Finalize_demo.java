package applicationutility;

public class Finalize_demo
{

	
	public static void main(String[] args)
	{
		Finalize_demo ob= new Finalize_demo();
		System.out.println(ob.hashCode());
		//Application_utility ob1= new Application_utility();
		//System.out.println(ob1.hashCode());
		ob=null;
		System.gc();
		System.out.println("garbage collector");
	}
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("hello finallize");
		
	}
}
