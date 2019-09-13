import javax.swing.*;

public class Uppgift2 {
	public static void main(String[] args) {
		
		String name = "Rasmus Gillberg";
		String address = "Kvarnvagen 7";
		String number = "0702925281";
		String all = (name + "\n" + address + "\n" + number);
		
		JOptionPane.showMessageDialog(null, all);

	}
}