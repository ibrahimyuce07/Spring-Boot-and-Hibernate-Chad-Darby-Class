package com.hibernate.demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.persistence.PersistenceException;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import java.awt.Panel;
import javax.swing.JTabbedPane;
import java.awt.Window.Type;

public class SwingGUI {

	private JFrame ekleFormu;
	private JTextField nameTextField;
	private JTextField surnameTextField;
	private JTextField mailTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingGUI window = new SwingGUI();
					window.ekleFormu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ekleFormu = new JFrame();
		ekleFormu.setTitle("User Form");
		ekleFormu.setBounds(100, 100, 719, 471);
		ekleFormu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ekleFormu.getContentPane().setLayout(null);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 14));
		nameTextField.setToolTipText("input username");
		nameTextField.setBounds(288, 31, 224, 37);
		ekleFormu.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		surnameTextField = new JTextField();
		surnameTextField.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 14));
		surnameTextField.setToolTipText("input username");
		surnameTextField.setColumns(10);
		surnameTextField.setBounds(288, 78, 224, 37);
		ekleFormu.getContentPane().add(surnameTextField);
		
		mailTextField = new JTextField();
		mailTextField.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 14));
		mailTextField.setToolTipText("input username");
		mailTextField.setColumns(10);
		mailTextField.setBounds(288, 125, 224, 37);
		ekleFormu.getContentPane().add(mailTextField);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(181, 31, 97, 37);
		ekleFormu.getContentPane().add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 14));
		lblLastName.setBounds(181, 81, 97, 31);
		ekleFormu.getContentPane().add(lblLastName);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Source Code Pro Medium", Font.PLAIN, 14));
		lblEmail.setBounds(181, 125, 97, 37);
		ekleFormu.getContentPane().add(lblEmail);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
				Session session = factory.getCurrentSession();
				
				
				try {
					String name = nameTextField.getText();
					String surname = surnameTextField.getText();
					String mail = mailTextField.getText();
					System.out.println("Creating new student object...");
					Student tempStudent = new Student(name, surname, mail);
					
					session.beginTransaction();
					System.out.println("Saving the student...");
					session.save(tempStudent);			
					session.getTransaction().commit();
					System.out.println("Done!");
					

					
					JTextArea txtrFds = new JTextArea();
					txtrFds.setBackground(UIManager.getColor("Panel.background"));
					txtrFds.setEditable(false);
					txtrFds.setFont(new Font("Arial", Font.PLAIN, 14));
					txtrFds.setBounds(181, 265, 361, 142);
					ekleFormu.getContentPane().add(txtrFds);
					
					
					txtrFds.setText("### USER SAVED ###\n"
							+ "\nName: \t" +name
							+ "\nSurname: \t"+surname
							+ "\nEmail: \t"+mail);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
					
				}finally {
					
					factory.close();
				}
	
			}
		});
		btnSubmit.setFont(new Font("Source Serif Pro", Font.PLAIN, 14));
		btnSubmit.setBounds(347, 202, 113, 37);
		ekleFormu.getContentPane().add(btnSubmit);
		
		
		
		
	}
}
