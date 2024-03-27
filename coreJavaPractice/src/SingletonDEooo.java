
public class SingletonDEooo {

	public static void main(String[] args) {
		Raj objecRaj=Raj.getObjecRaj();
		 Raj objecRaj2 = Raj.getObjecRaj();
		 System.out.println(objecRaj==objecRaj2);
		
	}
}

class Raj
{
	private static Raj raj=null;
	private Raj()
	{
		
	}
	public static Raj getObjecRaj() {
		if (raj==null) {
			return raj=new Raj();
		}
		return raj;
	}
	}
