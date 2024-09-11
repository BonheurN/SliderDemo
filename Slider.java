import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderDemo extends JFrame implements ChangeListener {

	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(420,420);
		setTitle("Slider Demo");
		
		panel = new JPanel();
		
		slider = new JSlider(0,100,30);
		slider.setFont(new Font("Consolas",Font.PLAIN,15));
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.addChangeListener(this);
		slider.setOrientation(SwingConstants.VERTICAL);
		
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		
		label = new JLabel();
		label.setText("°C = "+ slider.getValue());
		label.setFont(new Font("Consolas",Font.PLAIN,20));
		
		panel.add(slider);
		panel.add(label);
		add(panel);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SliderDemo demo = new SliderDemo();

	}


	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		label.setText("°C = "+ slider.getValue());
		
	}

	
}
