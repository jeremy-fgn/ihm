package application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class ChoixMenu extends JPanel {
	
	public ChoixMenu() {
		super();
		setLayout(new GridLayout(5,1));
		setBackground(Color.RED);

		Option depot = new Option("DEPOT");
		Option retrait = new Option("RETRAIT");
		Option historique = new Option("HISTORIQUE DES TRANSACTIONS");

		this.add(depot);
		this.add(Box.createRigidArea(new Dimension(0, 0)));
		this.add(retrait);
		this.add(Box.createRigidArea(new Dimension(0, 0)));
		this.add(historique);
	}
}
