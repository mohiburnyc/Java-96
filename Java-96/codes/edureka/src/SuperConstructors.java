class A2{	
	A2(){
		System.out.println("in A2 class constructor");
	}
}

class B2 extends A2{
	B2(int n){
		System.out.println("in B2 class constructor");
	}
}

public class SuperConstructors {
	public static void main(String[] args) {
		B2 obj = new B2(10);
	}
}