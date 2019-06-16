package application;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Chargement extends JPanel {
	
	public Chargement() {
		super();
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setBackground(Color.RED);
		
		JLabel points = new JLabel(".");
		points.setForeground(Color.WHITE);
		points.setFont(new Font("Serif", Font.PLAIN,60));
		
		new Timer().scheduleAtFixedRate(new TimerTask() {
		    @Override
		    public void run(){
		    	if (points.getText().length()<7) points.setText(points.getText()+" .");
		    	else points.setText(".");
		    }
		},800L,800L);
		
		this.add(points);
	}
}