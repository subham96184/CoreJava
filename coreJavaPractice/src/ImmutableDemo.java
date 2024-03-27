import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ImmutableDemo {

	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<>();
		map.put("1", "subham");
		map.put("2", "subhamAchar");
		
		Student student=new Student("nahe", 122, map);
		
		System.out.println( student.getMetadata());
		System.out.println( student.getRegNo());
		System.out.println( student.getName());
		
		map.put("3","ssss");
		System.out.println( student.getMetadata());
	
	}

}

final class Student
{
	private final String name;
    private final int regNo;
    private final Map<String, String> metadata ;
    
	public Student(String name, int regNo, Map<String, String> metadata) {
		this.name = name;
		this.regNo = regNo;
		
		Map<String, String> tempMap=new HashMap<>();
		
		for(Map.Entry<String, String> entry : metadata.entrySet())
		{
			tempMap.put(entry.getKey(), entry.getValue());
		}
		
		this.metadata = tempMap;
	}
    public String getName() {
		return name;
	}
	public int getRegNo() {
		return regNo;
	}
	public Map<String, String> getMetadata() {
		 Map<String, String> tempMap = new HashMap<>();
		for(Map.Entry<String, String> entry : this.metadata.entrySet())
		{
		
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
    
}