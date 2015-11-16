package predavanjaS13D05;



public abstract class Model {
	private String tableName;

	public String findByPk(Integer num) {
		String s = "";
		return s += "SELECT * FROM" + tableName + "WHERE id = " + num;
	}
	
	public String findByAttribut(String s1, String s2) {
		String s = "";
		return s+= "SELECT  s1 FROM" + tableName + "WHERE s1 = s2";
		
	}

}
