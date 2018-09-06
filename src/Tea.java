import javax.swing.JOptionPane;

public class Tea {
	public static void main (String args[]) {
		
		Kettle kyle = new Kettle();
		String tFlavor = JOptionPane.showInputDialog(null, "What flavor of tea would you like? Greem, Chamomile, Mint, or Passion Fruit.");
		
		
		
		
		TeaBag bob = new TeaBag(tFlavor);
		//System.out.println(tFlavor);
		
		kyle.getWater();
		kyle.boil();
		
		Cup carl = new Cup();
		carl.makeTea(bob, kyle.getWater());
	
		
		
		
}
}