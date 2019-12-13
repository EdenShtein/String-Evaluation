package test;

public class MainTrain {

	public static void main(String[] args) {
		if(Q3.calc("3+5")!=8)
			System.out.println("wrong implementation to Q3 test1 (-10)"); // -10
		if(Q3.calc("3.5+5.5")!=9)
			System.out.println("wrong implementation to Q3 test2 (-10)"); // -10
		if(Q3.calc("(3+5)*4-12")!=20)
			System.out.println("wrong implementation to Q3 test3 (-10)"); // -10
		if(Q3.calc("3+5*4-12")!=11)
			System.out.println("wrong implementation to Q3 test4 (-10)"); // -10
		if(Q3.calc("7.5*(4.3+(6-12.3))/(0-3.0)")!=5)
			System.out.println("wrong implementation to Q3 test5 (-10)"); // -10
		System.out.println("done");
	}

}
