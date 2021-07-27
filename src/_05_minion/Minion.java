package _05_minion;

public class Minion {

 			private String name = "Stuart"; 
  			private int eyes = 1; 
  			private String color = "Yellow";
  			private String master = "Gru";
  			
  			public String getName() {
  				
  				return name;
  			}
  			public int getEyes() {
  				return eyes;
  			}
public String getColor() {
	return color;
}
public void setMaster(String mastername) {
	this.master = mastername;
}
public String getMaster() {
	return master;
}

Minion(String name, int eyes, String color, String master) {
	this.name = name;
			this.eyes = eyes;
			this.color = color;
					this.master = master;
}

}
