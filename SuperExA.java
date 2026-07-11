package Inheritance;

public class SuperExA {
		public SuperExA() {
			System.out.println("in A");
			
		}
		
	}
		
	class B extends SuperExA {
		
		public B(){
		//super();
		System.out.println("in B");
		}
		}

		class SupMain { 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       B b=new B();
	       System.out.println("in main method");

		}

	}

