import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String args[]) {
		Microwave bob = new Microwave();
		
		
		String pcornFlvr = JOptionPane.showInputDialog(null, "What flavor would you like your popcorn to be, in minutes");
		String input1 = JOptionPane.showInputDialog(null, "How long do you want your popcorn to be cooked?");
		int cookTime = Integer.parseInt(input1); 
		
		Popcorn poppy = new Popcorn(pcornFlvr);
		
		bob.putInMicrowave(poppy);
		bob.setTime(cookTime);	
		bob.startMicrowave();
		
	}
}
