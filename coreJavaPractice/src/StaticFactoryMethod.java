
public class StaticFactoryMethod {

	private StaticFactoryMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		StaticFactoryMethod method = StaticFactoryMethod.getObject();
		StaticFactoryMethod method2 = StaticFactoryMethod.getObject();
		System.out.println(" " + method + " " + method2);
	}

	private static StaticFactoryMethod getObject() {
		// TODO Auto-generated method stub
		return new StaticFactoryMethod();
	}

}
