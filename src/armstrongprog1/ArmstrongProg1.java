package armstrongprog1;

public class ArmstrongProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, a=0, temp, n=153;
		
		temp=n;
		
		while(n>0)
		{
			i = n % 10;
			n = n / 10;
			a = a + (i*i*i);
		}
		if(temp==a)
			System.out.print("armstrong number");
		else
			System.out.println("not armstrong");

	}

}
