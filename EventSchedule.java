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
import javax.swing.JComboBox;
import java.awt.TextArea;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.JMenuBar;

public class EventSchedule {

	JFrame frmCrossconnect9;
	private JTextField textField;
	private JTextField textField_2;
	private Choice choice;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventSchedule window = new EventSchedule();
					window.frmCrossconnect9.setVisible(true);
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
	public EventSchedule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrossconnect9 = new JFrame();
		frmCrossconnect9.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\amina\\Documents\\crossconnect-Recovered.png"));
		frmCrossconnect9.setBackground(new Color(255, 255, 255));
		frmCrossconnect9.getContentPane().setForeground(Color.BLUE);
		frmCrossconnect9.getContentPane().setBackground(Color.WHITE);
		frmCrossconnect9.setTitle("CROSSCONNECT");
		frmCrossconnect9.setBounds(100, 100, 768, 600);
		frmCrossconnect9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrossconnect9.getContentPane().setLayout(null);

		JLabel lblMember = new JLabel("     EVENT SCHEDULE");
		lblMember.setVerticalAlignment(SwingConstants.TOP);
		lblMember.setHorizontalAlignment(SwingConstants.LEFT);
		lblMember.setForeground(Color.GRAY);
		lblMember.setBackground(new Color(0, 0, 139));
		lblMember.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMember.setBounds(0, 0, 752, 17);
		frmCrossconnect9.getContentPane().add(lblMember);

		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE TEMPLE OF  PENTECOST");
		lblWelcomeToThe.setForeground(new Color(0, 0, 139));
		lblWelcomeToThe.setBackground(Color.CYAN);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setBounds(0, 24, 752, 14);
		frmCrossconnect9.getContentPane().add(lblWelcomeToThe);

		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBounds(446, 52, 38, 14);
		frmCrossconnect9.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(224, 52, 46, 14);
		frmCrossconnect9.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(494, 49, 86, 20);
		frmCrossconnect9.getContentPane().add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(274, 49, 86, 20);
		frmCrossconnect9.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JEditorPane dtrpnMainGuestInformation = new JEditorPane();
		dtrpnMainGuestInformation.setText("Main \r\n\r\nMember  Information\r\n\r\n Ministries\r\n\r\n Guest Information\r\n\r\n PR Management\r\n\r\n");
		dtrpnMainGuestInformation.setForeground(new Color(30, 144, 255));
		dtrpnMainGuestInformation.setFont(new Font("Tahoma", Font.BOLD, 12));
		dtrpnMainGuestInformation.setBackground(Color.WHITE);
		dtrpnMainGuestInformation.setBounds(10, 79, 160, 512);
		frmCrossconnect9.getContentPane().add(dtrpnMainGuestInformation);
		
		JLabel lblEnterMemberName = new JLabel("Select the date for the event ");
		lblEnterMemberName.setBounds(188, 95, 172, 14);
		frmCrossconnect9.getContentPane().add(lblEnterMemberName);
		
		Button button = new Button("ADD");
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(30, 144, 255));
		button.setBounds(639, 146, 70, 22);
		frmCrossconnect9.getContentPane().add(button);
		
		Button button_1 = new Button("UPDATE");
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(new Color(30, 144, 255));
		button_1.setBounds(639, 181, 70, 22);
		frmCrossconnect9.getContentPane().add(button_1);
		
		Button button_2 = new Button("DELETE");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(new Color(30, 144, 255));
		button_2.setBounds(639, 226, 70, 22);
		frmCrossconnect9.getContentPane().add(button_2);
		
		Button button_3 = new Button("EXIT");
		button_3.setForeground(Color.BLACK);
		button_3.setBackground(new Color(30, 144, 255));
		button_3.setBounds(639, 310, 70, 22);
		frmCrossconnect9.getContentPane().add(button_3);
		
		
		
		Button button_4 = new Button("SEND REQUEST ");
		button_4.setForeground(new Color(0, 0, 0));
		button_4.setBackground(new Color(30, 144, 255));
		button_4.setBounds(626, 266, 91, 22);
		frmCrossconnect9.getContentPane().add(button_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(494, 154, 4, 22);
		frmCrossconnect9.getContentPane().add(textArea);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(196, 113, 91, 20);
		frmCrossconnect9.getContentPane().add(dateChooser);
		
		JLabel lblSelectTheMonth = new JLabel("Select the month for the event");
		lblSelectTheMonth.setBounds(391, 95, 189, 14);
		frmCrossconnect9.getContentPane().add(lblSelectTheMonth);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(400, 113, 98, 20);
		frmCrossconnect9.getContentPane().add(monthChooser);
		
		JLabel lblEventType = new JLabel("Event Type");
		lblEventType.setBounds(188, 154, 82, 14);
		frmCrossconnect9.getContentPane().add(lblEventType);
		
		choice = new Choice();
		choice.setBounds(196, 183, 91, 20);
		frmCrossconnect9.getContentPane().add(choice);
		choice.add("Birthday");
		choice.add("Wedding");
		choice.add("Charity");
		
		JLabel lblNumberOfGuets = new JLabel("Number of guests");
		lblNumberOfGuets.setBounds(188, 224, 117, 14);
		frmCrossconnect9.getContentPane().add(lblNumberOfGuets);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 244, 86, 20);
		frmCrossconnect9.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRoomNumber = new JLabel("Room Number: ");
		lblRoomNumber.setBounds(391, 224, 117, 14);
		frmCrossconnect9.getContentPane().add(lblRoomNumber);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(391, 244, 107, 20);
		frmCrossconnect9.getContentPane().add(choice_1);
		
		JLabel lblEventManagerName = new JLabel("Event Manager Name:");
		lblEventManagerName.setBounds(188, 294, 130, 14);
		frmCrossconnect9.getContentPane().add(lblEventManagerName);
		
		textField_3 = new JTextField();
		textField_3.setBounds(201, 312, 86, 20);
		frmCrossconnect9.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEventManagerContact = new JLabel("Event Manager Contact");
		lblEventManagerContact.setBounds(391, 294, 139, 14);
		frmCrossconnect9.getContentPane().add(lblEventManagerContact);
		
		textField_4 = new JTextField();
		textField_4.setBounds(391, 312, 86, 20);
		frmCrossconnect9.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTimeOfEvent = new JLabel("Time of Event");
		lblTimeOfEvent.setBounds(391, 159, 93, 14);
		frmCrossconnect9.getContentPane().add(lblTimeOfEvent);
		
		textField_5 = new JTextField();
		textField_5.setBounds(391, 183, 86, 20);
		frmCrossconnect9.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		Button button_5 = new Button("VIEW");
		button_5.setForeground(new Color(0, 0, 0));
		button_5.setBackground(new Color(30, 144, 255));
		button_5.setBounds(639, 111, 70, 22);
		frmCrossconnect9.getContentPane().add(button_5);
		choice_1.add("Room 1: Accomodates 15 people");
		choice_1.add("Room 2: Accomodates 25 people");
		choice_1.add("Room 3: Accomodates 50 people");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

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
	public Choice getChoice() {
		return choice;
	}
}
