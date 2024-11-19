package sdetdsalgo;

public class PrintTest {
public static void main(String[] args) {
	System.out.println("hi this is the first push");
        System.out.println("hi this is the second push");
        
        
       
        PrintTest ps = new PrintTest();
        ps.Calculate();
}


	public void Calculate() {
		Calculator cal = new Calculator();
		cal.FirstNumber = 10;
		cal.SecondNumber = 15;
		cal.Addition();
		System.out.println("The Result of Addition is :" + cal.Result);
	}
}
