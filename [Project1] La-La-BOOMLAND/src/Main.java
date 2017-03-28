import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("La-La-Boomland");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(400, 150);
		myFrame.setSize(350, 410);
	
		MyPanel myPanel = new MyPanel();
		myFrame.add(myPanel);

		MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
		myFrame.addMouseListener(myMouseAdapter);
		
	
		myFrame.setVisible(true);
		
		
		Boomland.newGame();
		
		
		String Title = "Leyenda" + "<br>"
		+ "Color1 = 1" + "<br>"
		+ "Color1 = 1" + "<br>"
		+ "Color1 = 1" + "<br>"
		+ "Color1 = 1" + "<br>"
		+ "Color1 = 1" + "<br>"
		+ "Color1 = 1" + "<br>"
		+ "Color1 = 1" + "<br>"
		+ "Color1 = 1" + "<br>";
	
		JLabel Legend = new JLabel ("<html><div style='text-align: center;'>" + Title + "</div></html>");
		
		
		JFrame myLegend = new JFrame("La-La-Legend");
		myLegend.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myLegend.setLocation(800, 150);
		myLegend.setSize(250, 310);
		myLegend.add(Legend);
		myLegend.setVisible(true);
	
		
		
	}

	
	
	
	
}