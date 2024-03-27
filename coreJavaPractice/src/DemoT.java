
 class DemoT3 {
	public void name() {
		System.out.println("hi");
	}

}

class DemoT {
	public static void main(String[] args) {
		DemoT3 demoT = new DemoT3();
		try {
			demoT.name();
		}  finally {
			System.out.println("hi");
		}

	}
}
