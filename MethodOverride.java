
class A1 {								//Super
	public void SameMethod(){
		System.out.println("Class A");
	}
}

class B1 extends A1{						//Sub
	public void SameMethod(){			//created same method as in Super class 
		System.out.println("Class B");
	}	
}

public class MethodOverride{
	public static void main (String a[]) {
		B1 obj = new B1();
		obj.SameMethod();				//Method Overriding
	}
}