public class Calculator{
	public static int add(int a, int b){
		return a+b;
	}
	
	public static int sub(int a, int b){
		return a-b;
	}
	
	public static int mul(int a, int b){
		return a*b;
	}
	
	public static int div(int a, int b){
		return a/b;
	}
	
	
	public static void main(String[] Args){
		int a = 30, b = 10;
		
		System.out.println(Calculator.add(a,b));
		System.out.println(Calculator.sub(a,b));
	}
	
}

	