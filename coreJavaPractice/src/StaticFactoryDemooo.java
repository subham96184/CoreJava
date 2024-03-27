
public class StaticFactoryDemooo {

	public static void main(String[] args) {
		
		StaticFactoryDemooo instance = StaticFactoryDemooo.getInstance();
	}

	public static StaticFactoryDemooo getInstance() {
		return new StaticFactoryDemooo();
	}
}
