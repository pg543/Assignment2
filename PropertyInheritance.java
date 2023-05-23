
class A {								//Super
	public void ClassA(){
		System.out.println("Class A");
	}
}

class B extends A{						//childSub
	public void ClassB(){			
		System.out.println("Class B");
	}	
}

class C extends B{						//grandSub
	public void ClassC(){			//created same method as in Super class 
		System.out.println("Class B");
	}
	
	public void Substraction() {
		int firstNum = 5;
		int secondNum = 2;
		firstNum = firstNum - secondNum;
		System.out.println("firstNum: " + firstNum);
	}
}

public class PropertyInheritance {
	public static void main (String a[]) {
		C obj = new C();
		obj.ClassA();
		obj.ClassB();
		obj.ClassC();
		obj.Substraction();
	}
	

}



