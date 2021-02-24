package oops.excepHandling;

public class MainClassExc {

	public static void main(String[] args) {
		 
		try {
			
			int a = 5;
			
			int b = 0;
			
			int c = a/b;
			
			System.out.println(c);
			
			} catch (ArithmeticException e) {
				
				System.out.println(e.getMessage() +" occured, please check your code");
				
			} catch(ArrayIndexOutOfBoundsException e) {
				
			} catch(IllegalArgumentException e) {
				
			}finally {
				System.out.println("sorry for the inconvenience");
			}
			
			
			func1();
			
		}  static void func1() {
	        
			int a = 5;
			
			int b = 3;
			
			int c = a/b;
			
			System.out.println(c);
			
			try { Thread.sleep(1000);    
				
			func2();
			
		  } catch (Exception e) {
				System.out.println(e.getMessage() + " ,Handled");
			}
		}
		
		static void func2() throws ArithmeticException{
			
	      boolean isDanger = true;
			
			if(isDanger) {
				throw new ArithmeticException("Danger");
			}
		
		
	}

}
