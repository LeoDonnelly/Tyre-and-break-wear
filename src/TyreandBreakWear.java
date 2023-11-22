import javax.swing.JOptionPane;

public class TyreandBreakWear {
	public static void main(String[] args) {
		
		String testspeedstring = JOptionPane.showInputDialog("Please enter the test speed (MPH):");
		
		float testspeed = Float.parseFloat(testspeedstring);
		
		while (testspeed <20) {
		    JOptionPane.showMessageDialog(null, "Sorry speed must be more than 20 MPH. Please enter again.");
			 testspeedstring = JOptionPane.showInputDialog("Please enter the test speed (MPH):");
			 testspeed = Float.parseFloat(testspeedstring);
		}
		String teststoppingstring = JOptionPane.showInputDialog("Please enter the stopping distance (M):");
		float teststopping = Float.parseFloat(teststoppingstring);
		
		while (teststopping <00) {
		    JOptionPane.showMessageDialog(null, "Sorry, Please enter a value greater than 0.");
			teststoppingstring = JOptionPane.showInputDialog("Please enter the stopping distance (M):");
			teststopping = Float.parseFloat(teststoppingstring);
		}
		if (testspeed == 20 && teststopping <= 6) {
		    JOptionPane.showMessageDialog(null, "Your car passed the brake test. Well done!");
		} else if (testspeed == 30 && teststopping <= 14) {
		    JOptionPane.showMessageDialog(null, "Your car passed the brake test. Well done!");
		} else if (testspeed == 40 && teststopping <= 24) {
		    JOptionPane.showMessageDialog(null, "Your car passed the brake test. Well done!");
		} else if (testspeed == 50 && teststopping <= 38) {
		    JOptionPane.showMessageDialog(null, "Your car passed the brake test. Well done!");
		} else if (testspeed == 60 && teststopping <= 55) {
		    JOptionPane.showMessageDialog(null, "Your car passed the brake test. Well done!");
		} else if (testspeed == 70 && teststopping <= 75) {
		    JOptionPane.showMessageDialog(null, "Your car passed the brake test. Well done!");
		} else {
		    JOptionPane.showMessageDialog(null, "Your car failed the braking distance test. "
		    		+ "Submit your car for a tyre and brake test soon");

		}

	}

}
