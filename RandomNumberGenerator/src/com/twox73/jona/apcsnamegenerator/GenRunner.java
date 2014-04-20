/**
 * @author Jon Ausherman
 * @date Apr 16, 2014
 * @version 6.0
 */
package com.twox73.jona.apcsnamegenerator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class GenRunner extends JFrame {

	
	public static void main(String[] args) {
		//some sort of loop would be used here but i'm not testing the user portion
		//here you can add escape statements and what have you
		final ArrayList<String> gen = new ArrayList<String>();
		Scanner scn = new Scanner(System.in);
		String name = "";
		String dummy = "";
		
		//GUI controlls
		final JFrame genFrame = new JFrame("Random Name Generator");
		JPanel txP = new JPanel();
		JPanel btP = new JPanel();
		
		//Objects to be added to txP
		JLabel genLable = new JLabel("What do you want to do?");
		
		//objects to be added to btP
		JButton addUserName = new JButton("Add a Name");
		JButton genRanUserName = new JButton("Generate from my list");
		JButton genRanDefName = new JButton("Genderate from the default list");
		
		//exti controls
		genFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adds buttons to the JPanels
		txP.add(genLable);
		btP.add(addUserName);
		btP.add(genRanUserName);
		btP.add(genRanDefName);
		
		//adds Jpanels to the JFrame
		genFrame.add(txP, BorderLayout.CENTER);
		genFrame.add(btP, BorderLayout.SOUTH);
		
		//creates the border around the JFrame
		genFrame.pack();
		//makes the JFrame visible
		genFrame.setVisible(true);
		//centers the JFrame
		genFrame.setLocationRelativeTo(null);
		
		//adds the user's name to the array list
		addUserName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gen.add(JOptionPane.showInputDialog("Input a name"));
				
			}
		});
		
		
		
	
		final RandomNameGenorator nameList = new RandomNameGenorator(gen);
		
		genRanUserName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(genFrame, nameList.getRanMyName() +"\n" +nameList.getRanMyPhone());
				
			}
		});
		
		genRanDefName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(genFrame, nameList.getRanDefName() +"\n"+nameList.getRanDefPhone());
				
			}
		});
		
		
		
	}

}
