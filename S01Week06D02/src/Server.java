
public class Server extends Computer{
	public int maxLimit;
	
	/**
	 * Constructor
	 */
	public Server(String name, char[] mac, int maxLimit) {
		super(name, mac);
		this.maxLimit = maxLimit;
	}
	public int getMaxLimit(){
		return maxLimit;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Server)) {
			return false;
		}
		Server other = (Server) obj;
		if (maxLimit != other.maxLimit) {
			return false;
		}
		return true;
	}
	
	
	public String toString() {
		String s = "";
		s += "Server: " + maxLimit;
		return s;
	}
	
	
	
}