
public class Imm2 {

	public static void main(String[] args) {
		foo tFoo=new foo(1);
		System.out.println(tFoo.getI()+"\n");
		foo modify = tFoo.modify(1);
		System.out.println(modify.getI());
		System.out.println(tFoo==modify);
		System.out.println(modify);
	}
}
final class foo
{
	private final int i;

	public foo(int i) {
		this.i = i;
	}

	public foo modify(int j) {
		if (this.i==j) {
			return this;
		}
		return new foo(j);
		// TODO Auto-generated method stub
		
	}

	public int getI() {
		return i;
	}
 	
}
