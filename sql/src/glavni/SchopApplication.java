package glavni;

import glavni.modals.Product;
import glavni.modals.Purchase;
import glavni.modals.User;

import java.math.BigDecimal;

import org.avaje.agentloader.AgentLoader;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;

public class SchopApplication {

	static {
		AgentLoader.loadAgentFromClasspath("avaje-ebeanorm-agent",
				"debug=1;packages=glavni.modals.**");
	}

	private static EbeanServer server = Ebean.getServer("h2");

	public static void main(String[] args) {

		// kreiranje novog zapisa o korisniku u bazu
		User first = new User();
		first.setFullName("Kristina Pupavac");
		first.setEmail("kristina.pupavac@bitcamp.ba");
		first.setBalance(new BigDecimal(0));
		
		//System.out.println(first.getId());
		
		//Ebean.save(first);
		//System.out.println(first.getId());
		
		Product monitor = new Product();
		monitor.setTittle("Monitor, Dell 28\"");
		monitor.setPrice(new BigDecimal("399.99"));
		monitor.setQuantity(0);
		
		//Ebean.save(monitor);
		
		//System.out.println(monitor.getId());
		
		Purchase firstUserPurchuaseMonitor = new Purchase();
		firstUserPurchuaseMonitor.setUser(first);
		firstUserPurchuaseMonitor.setProduct(monitor);
		
		first.setBalance(first.getBalance().subtract(monitor.getPrice()));
		monitor.setQuantity(monitor.getQuantity() -1);
		
		Ebean.save(firstUserPurchuaseMonitor);
		System.out.println(monitor.getId());
		System.out.println(first.getId());
		System.out.println(firstUserPurchuaseMonitor.getId());
	}

}
