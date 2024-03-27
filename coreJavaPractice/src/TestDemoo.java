
public class TestDemoo {
	int a;
	int b;
	public TestDemoo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public TestDemoo(TestDemoo testDemoo) {
		
		testDemoo.a=a;
		testDemoo.b=b;
	}
	
   @Override
	public String toString() {
		return "TestDemoo [a=" + a + ", b=" + b + "]";
	}
public static void main(String[] args) {
	TestDemoo testDemoo=new TestDemoo(1,2);
	TestDemoo tesDemo=new TestDemoo(testDemoo);
	System.out.println(testDemoo);
	System.out.println(tesDemo);
}
}
