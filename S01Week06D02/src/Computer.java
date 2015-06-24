import java.util.Arrays;

public abstract class Computer {
	public String name;
	public MACAddress mac;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param mac
	 */
	public Computer(String name, char[] mac) {
		super();
		this.name = name;
		this.mac = new MACAddress(mac);
	}

	/**
	 * Second constructor
	 */
	public Computer() {
		this.name = "Computer1";

		char[] arr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
				'b' };
		this.mac = new MACAddress(arr);
	}

	/**
	 * Getting Computer name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets Computer MAC address
	 * 
	 * @return
	 */
	public String getMac() {
		return mac.toString();
	}

	/**
	 * INNER NON STATIC CLASS MAC ADDRESS
	 */
	class MACAddress {
		// 0123456789ab
		private char[] mac;

		public MACAddress(char[] mac) {
			this.mac = mac;
		}

		// 01:23:45:67:89:ab
		public String toString() {
			String s = "";
			for (int i = 0; i < mac.length; i++) {
				if (i % 2 != 0 && i < mac.length - 1) {
					s += mac[i] + ":";
				} else {
					s += mac[i];
				}
			}
			return s;
		}

		public boolean equals(Object other) {
			if (this.mac == other) {
				return true;
			} else {
				return false;
			}
		}

		/*
		 * @Override public boolean equals(Object obj) { if (this == obj) {
		 * return true; } if (obj == null) { return false; } if (!(obj
		 * instanceof Computer)) { return false; } Computer other = (Computer)
		 * obj; if (!array.equals(mac, other.mac)) { return false; } if (name ==
		 * null) { if (other.name != null) { return false; } } else if
		 * (!name.equals(other.name)) { return false; } return true; }
		 */
	}
}