import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.ScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Choice;
import java.awt.List;
import java.awt.TextField;
import javax.swing.JEditorPane;
import java.awt.Toolkit;
import javax.swing.JPanel;
import com.toedter.calendar.JCalendar;
import java.awt.Button;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JLocaleChooser;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JTextArea;
import java.awt.Label;

public class AdminMemberInfo {

	JFrame frmCrossconnect7;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMemberInfo window = new AdminMemberInfo();
					window.frmCrossconnect7.setVisible(true);
					// window.frmCrossconnect.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public AdminMemberInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrossconnect7 = new JFrame();
		frmCrossconnect7.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\amina\\Documents\\crossconnect-Recovered.png"));
		frmCrossconnect7.setBackground(new Color(255, 255, 255));
		frmCrossconnect7.getContentPane().setForeground(Color.BLUE);
		frmCrossconnect7.getContentPane().setBackground(Color.WHITE);
		frmCrossconnect7.setTitle("CROSSCONNECT");
		frmCrossconnect7.setBounds(100, 100, 768, 600);
		frmCrossconnect7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrossconnect7.getContentPane().setLayout(null);

		JLabel lblMember = new JLabel("  ADMINISTRATOR MEMBER INFORMATION PAGE");
		lblMember.setVerticalAlignment(SwingConstants.TOP);
		lblMember.setHorizontalAlignment(SwingConstants.LEFT);
		lblMember.setForeground(Color.GRAY);
		lblMember.setBackground(new Color(0, 0, 139));
		lblMember.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMember.setBounds(0, 0, 752, 17);
		frmCrossconnect7.getContentPane().add(lblMember);

		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE TEMPLE OF  PENTECOST");
		lblWelcomeToThe.setForeground(new Color(0, 0, 139));
		lblWelcomeToThe.setBackground(Color.CYAN);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setBounds(0, 24, 752, 14);
		frmCrossconnect7.getContentPane().add(lblWelcomeToThe);

		JLabel lblNewLabel = new JLabel("Administrator ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBounds(370, 52, 114, 14);
		frmCrossconnect7.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(224, 52, 46, 14);
		frmCrossconnect7.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(494, 49, 86, 20);
		frmCrossconnect7.getContentPane().add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(274, 49, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JEditorPane dtrpnMainGuestInformation = new JEditorPane();
		dtrpnMainGuestInformation.setText("Main \r\n\r\n Guest Information\r\n\r\n Ministries\r\n\r\n Event Calendar\r\n\r\n PR Management\r\n\r\n");
		dtrpnMainGuestInformation.setForeground(new Color(30, 144, 255));
		dtrpnMainGuestInformation.setFont(new Font("Tahoma", Font.BOLD, 12));
		dtrpnMainGuestInformation.setBackground(Color.WHITE);
		dtrpnMainGuestInformation.setBounds(10, 79, 160, 512);
		frmCrossconnect7.getContentPane().add(dtrpnMainGuestInformation);
		
		JLabel label = new JLabel("Name:");
		label.setForeground(new Color(0, 0, 205));
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(224, 120, 46, 14);
		frmCrossconnect7.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(274, 117, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("Member ID:");
		label_1.setForeground(new Color(0, 0, 205));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(398, 120, 67, 14);
		frmCrossconnect7.getContentPane().add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(494, 117, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_3);
		
		JLabel label_2 = new JLabel("Date of Birth:");
		label_2.setBounds(198, 159, 79, 14);
		frmCrossconnect7.getContentPane().add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(274, 156, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_4);
		
		JLabel label_3 = new JLabel("Family ID:");
		label_3.setBounds(418, 162, 84, 14);
		frmCrossconnect7.getContentPane().add(label_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(494, 156, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_5);
		
		JLabel label_4 = new JLabel("Age:");
		label_4.setBounds(242, 196, 46, 14);
		frmCrossconnect7.getContentPane().add(label_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(274, 193, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_6);
		
		JLabel label_5 = new JLabel("Family Members:");
		label_5.setBounds(386, 196, 104, 14);
		frmCrossconnect7.getContentPane().add(label_5);
		
		Choice choice = new Choice();
		choice.setBounds(494, 196, 86, 20);
		frmCrossconnect7.getContentPane().add(choice);
		
		JLabel label_6 = new JLabel("Marital Status:");
		label_6.setBounds(196, 232, 92, 14);
		frmCrossconnect7.getContentPane().add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(274, 229, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_7);
		
		JLabel label_7 = new JLabel("Member Status:");
		label_7.setBounds(392, 232, 92, 14);
		frmCrossconnect7.getContentPane().add(label_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(494, 229, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_8);
		
		JLabel lblEnterMemberName = new JLabel("Enter member name or ID: ");
		lblEnterMemberName.setBounds(188, 95, 147, 14);
		frmCrossconnect7.getContentPane().add(lblEnterMemberName);
		
		JLabel label_8 = new JLabel("Date of Joining:");
		label_8.setBounds(195, 269, 104, 14);
		frmCrossconnect7.getContentPane().add(label_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(274, 266, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_9);
		
		JLabel label_9 = new JLabel("Date of Leaving:");
		label_9.setBounds(388, 269, 96, 14);
		frmCrossconnect7.getContentPane().add(label_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(494, 266, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_10);
		
		JLabel label_10 = new JLabel("Contact Information");
		label_10.setBounds(198, 310, 137, 14);
		frmCrossconnect7.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Address:");
		label_11.setBounds(198, 335, 79, 14);
		frmCrossconnect7.getContentPane().add(label_11);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(198, 360, 440, 23);
		frmCrossconnect7.getContentPane().add(textField_11);
		
		JLabel label_12 = new JLabel("City:");
		label_12.setBounds(224, 394, 46, 14);
		frmCrossconnect7.getContentPane().add(label_12);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(274, 391, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_12);
		
		JLabel label_13 = new JLabel("Zipcode:");
		label_13.setBounds(428, 394, 46, 14);
		frmCrossconnect7.getContentPane().add(label_13);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(494, 394, 86, 20);
		frmCrossconnect7.getContentPane().add(textField_13);
		
		JLabel label_14 = new JLabel("Home Phone:");
		label_14.setBounds(186, 422, 102, 14);
		frmCrossconnect7.getContentPane().add(label_14);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(268, 419, 92, 20);
		frmCrossconnect7.getContentPane().add(textField_14);
		
		JLabel label_15 = new JLabel("Cell Phone:");
		label_15.setBounds(418, 422, 96, 14);
		frmCrossconnect7.getContentPane().add(label_15);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(484, 419, 96, 20);
		frmCrossconnect7.getContentPane().add(textField_15);
		
		JLabel label_16 = new JLabel("Email:");
		label_16.setBounds(224, 447, 46, 14);
		frmCrossconnect7.getContentPane().add(label_16);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(268, 444, 152, 20);
		frmCrossconnect7.getContentPane().add(textField_16);
		
		JLabel lblAttendance = new JLabel("Attendance:");
		lblAttendance.setBounds(192, 472, 67, 14);
		frmCrossconnect7.getContentPane().add(lblAttendance);
		
		Button button = new Button("ADD");
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(30, 144, 255));
		button.setBounds(639, 79, 70, 22);
		frmCrossconnect7.getContentPane().add(button);
		
		Button button_1 = new Button("UPDATE");
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(new Color(30, 144, 255));
		button_1.setBounds(639, 128, 70, 22);
		frmCrossconnect7.getContentPane().add(button_1);
		
		Button button_2 = new Button("DELETE");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(new Color(30, 144, 255));
		button_2.setBounds(639, 175, 70, 22);
		frmCrossconnect7.getContentPane().add(button_2);
		
		Button button_3 = new Button("EXIT");
		button_3.setForeground(Color.BLACK);
		button_3.setBackground(new Color(30, 144, 255));
		button_3.setBounds(639, 269, 70, 22);
		frmCrossconnect7.getContentPane().add(button_3);
		
		JLabel lblContributions = new JLabel("Contributions:");
		lblContributions.setBounds(395, 475, 70, 14);
		frmCrossconnect7.getContentPane().add(lblContributions);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(268, 472, 98, 20);
		frmCrossconnect7.getContentPane().add(monthChooser);
		
		
		JMonthChooser monthChooser_1 = new JMonthChooser();
		monthChooser_1.setBounds(475, 469, 98, 20);
		frmCrossconnect7.getContentPane().add(monthChooser_1);
		
		JYearChooser yearChooser_1 = new JYearChooser();
		yearChooser_1.setBounds(475, 489, 47, 20);
		frmCrossconnect7.getContentPane().add(yearChooser_1);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(268, 489, 47, 20);
		frmCrossconnect7.getContentPane().add(yearChooser);
		
		Button button_4 = new Button("PRINT");
		button_4.setForeground(new Color(0, 0, 0));
		button_4.setBackground(new Color(30, 144, 255));
		button_4.setBounds(639, 224, 70, 22);
		frmCrossconnect7.getContentPane().add(button_4);
		
		JLabel lblViewReport = new JLabel("View Report");
		lblViewReport.setForeground(new Color(0, 0, 128));
		lblViewReport.setBounds(325, 495, 67, 14);
		frmCrossconnect7.getContentPane().add(lblViewReport);
		
		JLabel label_17 = new JLabel("View Report");
		label_17.setForeground(new Color(0, 0, 128));
		label_17.setBounds(528, 495, 67, 14);
		frmCrossconnect7.getContentPane().add(label_17);
		
		

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
