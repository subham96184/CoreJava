
 class SingletonDemo {

	private static SingletonDemo singletonDemo = null;

	private SingletonDemo() {}

	public static SingletonDemo getSingletonDemo() {

		if (singletonDemo == null) {
			singletonDemo = new SingletonDemo();
		}
		return singletonDemo;
	}
}
class SingletonDemoTest
{
	public static void main(String[] args) {
		

		int hashCode = SingletonDemo.getSingletonDemo().hashCode();
		int hashCode2 = SingletonDemo.getSingletonDemo().hashCode();
		
		System.out.println(hashCode==hashCode2);
	}

}
