package EarthBois;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class jFrame extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	
	public jFrame() {
		super("Danny");
		setSize(600, 600);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton maleButton = new JButton("Male");
		maleButton.addActionListener(this);
		JButton femaleButton = new JButton("Female");
		maleButton.addActionListener(this);
		JTextArea("bam");
		add(maleButton);
		add(femaleButton);
	}

	private void JTextArea(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("button clicked");
	}
}
