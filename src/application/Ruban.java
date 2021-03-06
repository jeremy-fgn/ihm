package application;

import java.awt.*;
import javax.swing.*;

public class Ruban extends JPanel {
	String titreG, titreD;
	
	public Ruban(String titreG, String titreD) {
		super();
		setLayout(new BorderLayout());
		this.titreG = titreG;
		this.titreD = titreD;
		
		JLabel labelTitreG = new JLabel(titreG);
		JLabel labelTitreD = new JLabel(titreD);
		labelTitreG.setFont(labelTitreG.getFont().deriveFont(30.0f));
		labelTitreD.setFont(labelTitreD.getFont().deriveFont(30.0f));
		labelTitreG.setForeground(Color.WHITE);
		labelTitreD.setForeground(Color.WHITE);
		
		
		this.add(labelTitreG, BorderLayout.WEST);
		this.add(labelTitreD, BorderLayout.EAST);
		
		Color MyRed = new Color(220, 52, 61);
		setBackground(MyRed);
		setBorder(BorderFactory.createEmptyBorder(20, 15, 20, 15));

	}
}
