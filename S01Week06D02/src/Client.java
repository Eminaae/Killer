
public class Client implements Connectable{
	
	public Computer pcConnected;
	public Network lanConnected;
	/**
	 * Constructor with name and MAC address
	 */
	public Client(Computer name, Network mac) {
		this.pcConnected = name;
		this.lanConnected = mac;
		
	}
	@Override
	public void connect(Computer c) {
	
		if(pcConnected != null && lanConnected != null){
			this.pcConnected = c;	
		}else
				System.out.println("Connection lost");
		
	}
	@Override
	public void connect(Network lan) {
		if(pcConnected == null && lanConnected == null){
			
		}
		
	}
	public void disconnect(Computer c) {
		if(pcConnected == null && lanConnected == null){
			this.pcConnected = c;
		}	
		
	public  void getConnect(Computer c){
		
		
		
	}
	
	public static void getDisconnect(){
		
	}
		
	}
	@Override
	public String toString() {
		String s = "";
		s += "Client pc connected" + pcConnected + "LAN Connected" + lanConnected;
		return s;
	}
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
}
