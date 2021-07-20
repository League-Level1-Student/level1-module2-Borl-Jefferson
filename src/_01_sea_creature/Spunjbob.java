package _01_sea_creature;

import javax.swing.JOptionPane;

public class Spunjbob {
public static void main(String[] args) {
	
SeaCreature sb = new SeaCreature("SpongeBob");
	sb.eat();
	sb.laugh();
	SeaCreature p = new SeaCreature("Patrick");
	String pn = p.getName();
	System.out.println(pn);
	p.eat();
	for (int j = 0; j < 5; j++) {
		
	
	p.laugh();
	}
	SeaCreature s = new SeaCreature("Squidward");
	String sn = s.getName();
	System.out.println(sn);
	s.eat();
	for (int i = 0; i < 5; i++) {
		
	
	s.laugh();
	}
}

}