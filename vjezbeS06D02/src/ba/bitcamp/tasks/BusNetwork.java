package ba.bitcamp.tasks;

public class BusNetwork extends Network implements Functionable {

	public BusNetwork(String networkName) {
		super(networkName);
	}

	@Override
	public boolean isFunctioning() {
		int counter = 0; 
		for (int i = 0; i < computers.length; i++) {
				if (computers[i] =) {
					
			}
		}
		return false;
	}

	@Override
	public void addComputer(Computer c) {
		if (c instanceof Server) {
			throw new IllegalArgumentException(
					"Servers cannot be on this network.");
		} else if (c instanceof Client) {
			Client c1 = (Client) c;
			ArrayManipulation.extendArray(this.computers);
			ArrayManipulation
					.shrinkArray(this.computers, this.computers.length);
			c1.connect(c);
		}
	}

	@Override
	public void removeComputer(Computer c) {
		if (c instanceof Server) {
			throw new IllegalArgumentException(
					"Servers cannot be on this network.");
		} else if (c instanceof Client) {
			Client c1 = (Client) c;
			for (int i = 0; i < computers.length; i++) {
				if (computers[i] == c) {
					System.out.println("Computer: " + c + " is on network!");
					ArrayManipulation.shrinkArray(this.computers, this.computers.length);
					c1.disconnect();
				} else {
					throw new IllegalArgumentException(
							"Computer is not on this network.");
				}
			}
		}
	}

}
