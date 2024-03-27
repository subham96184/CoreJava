import java.util.HashMap;
import java.util.Map;

public class ImmutableWithList {

	public static void main(String[] args) {
		
		Map<String, String> st=new HashMap<>();
		st.put("subham", "Novalue");
	  StudentN nStudent=new StudentN(1, st);
	  
	  System.out.println(nStudent.getMetaData());
	  
	  st.put("ss", "jean");
	  System.out.println(nStudent.getMetaData());

	}

}

final class StudentN
{
	final private int id;
	private Map<String,String> metaData;
	public StudentN(int id, Map<String, String> metaData) {
	
		this.id = id;
		
		Map<String, String> tempMap=new HashMap<>();
		for (Map.Entry<String, String> entry : metaData.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();	
			tempMap.put(key, val);
		}
		this.metaData = tempMap;
	}
	public int getId() {
		return id;
	}
	public Map<String, String> getMetaData() {
		Map<String, String> map=new HashMap<>();
		for (Map.Entry<String, String> entry : this.metaData.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();	
			map.put(key, val);
		}
		return map;
	}
	
}