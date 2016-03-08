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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class Member {

	JFrame frmCrossconnect;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
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
	//protected Object frmCrossconnect2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Member window = new Member();
					window.frmCrossconnect.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Member() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrossconnect = new JFrame();
		frmCrossconnect.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\amina\\Documents\\crossconnect-Recovered.png"));
		frmCrossconnect.setBackground(new Color(255, 255, 255));
		frmCrossconnect.getContentPane().setForeground(Color.BLUE);
		frmCrossconnect.getContentPane().setBackground(Color.WHITE);
		frmCrossconnect.setTitle("CROSSCONNECT");
		frmCrossconnect.setBounds(100, 100, 768, 600);
		frmCrossconnect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrossconnect.getContentPane().setLayout(null);
		
		JLabel lblMember = new JLabel("     MEMBER HOME");
		lblMember.setVerticalAlignment(SwingConstants.TOP);
		lblMember.setHorizontalAlignment(SwingConstants.LEFT);
		lblMember.setForeground(Color.GRAY);
		lblMember.setBackground(new Color(0, 0, 139));
		lblMember.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMember.setBounds(0, 0, 752, 17);
		frmCrossconnect.getContentPane().add(lblMember);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE TEMPLE OF  PENTECOST");
		lblWelcomeToThe.setForeground(new Color(0, 0, 139));
		lblWelcomeToThe.setBackground(Color.WHITE);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setBounds(0, 24, 752, 14);
		frmCrossconnect.getContentPane().add(lblWelcomeToThe);
		
		JLabel lblNewLabel = new JLabel("Member ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBounds(370, 52, 67, 14);
		frmCrossconnect.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(224, 52, 46, 14);
		frmCrossconnect.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date of Birth:");
		lblNewLabel_2.setBounds(238, 98, 79, 14);
		frmCrossconnect.getContentPane().add(lblNewLabel_2);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(274, 134, 46, 14);
		frmCrossconnect.getContentPane().add(lblAge);
		
		JLabel lblMaritalStatus = new JLabel("Marital Status:");
		lblMaritalStatus.setBounds(225, 176, 92, 14);
		frmCrossconnect.getContentPane().add(lblMaritalStatus);
		
		JLabel lblMemberStatus = new JLabel("Member Status:");
		lblMemberStatus.setBounds(485, 176, 92, 14);
		frmCrossconnect.getContentPane().add(lblMemberStatus);
		
		JLabel lblDateOfJoining = new JLabel("Date of Joining:");
		lblDateOfJoining.setBounds(224, 220, 104, 14);
		frmCrossconnect.getContentPane().add(lblDateOfJoining);
		
		JLabel lblDateOfLeaving = new JLabel("Date of Leaving:");
		lblDateOfLeaving.setBounds(485, 220, 96, 14);
		frmCrossconnect.getContentPane().add(lblDateOfLeaving);
		
		JLabel lblFamilyId = new JLabel("Family ID:");
		lblFamilyId.setBounds(509, 98, 84, 14);
		frmCrossconnect.getContentPane().add(lblFamilyId);
		
		JLabel lblContactInformation = new JLabel("Contact Information");
		lblContactInformation.setBounds(224, 265, 137, 14);
		frmCrossconnect.getContentPane().add(lblContactInformation);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(224, 279, 79, 14);
		frmCrossconnect.getContentPane().add(lblAddress);
		
		JLabel lblHomeTelephone = new JLabel("Home Phone:");
		lblHomeTelephone.setBounds(234, 383, 102, 14);
		frmCrossconnect.getContentPane().add(lblHomeTelephone);
		
		JLabel lblCellPhone = new JLabel("Cell Phone:");
		lblCellPhone.setBounds(432, 383, 96, 14);
		frmCrossconnect.getContentPane().add(lblCellPhone);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(274, 421, 46, 14);
		frmCrossconnect.getContentPane().add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(442, 49, 86, 20);
		frmCrossconnect.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(578, 95, 86, 20);
		frmCrossconnect.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(274, 49, 86, 20);
		frmCrossconnect.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(319, 95, 86, 20);
		frmCrossconnect.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(319, 131, 86, 20);
		frmCrossconnect.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(319, 173, 86, 20);
		frmCrossconnect.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(578, 173, 86, 20);
		frmCrossconnect.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(319, 217, 86, 20);
		frmCrossconnect.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(578, 217, 86, 20);
		frmCrossconnect.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(224, 304, 440, 23);
		frmCrossconnect.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(319, 380, 92, 20);
		frmCrossconnect.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(496, 380, 96, 20);
		frmCrossconnect.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(319, 418, 152, 20);
		frmCrossconnect.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		Choice choice = new Choice();
		choice.setBounds(578, 134, 86, 20);
		frmCrossconnect.getContentPane().add(choice);
		
		JLabel lblFamilyMembers = new JLabel("Family Members:");
		lblFamilyMembers.setBounds(477, 134, 116, 14);
		frmCrossconnect.getContentPane().add(lblFamilyMembers);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(271, 338, 46, 14);
		frmCrossconnect.getContentPane().add(lblCity);
		
		JLabel lblZipcode = new JLabel("Zipcode:");
		lblZipcode.setBounds(452, 338, 46, 14);
		frmCrossconnect.getContentPane().add(lblZipcode);
		
		textField_13 = new JTextField();
		textField_13.setBounds(319, 338, 86, 20);
		frmCrossconnect.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(496, 338, 86, 20);
		frmCrossconnect.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JEditorPane dtrpnAttendance = new JEditorPane();
		dtrpnAttendance.setFont(new Font("Tahoma", Font.BOLD, 12));
		dtrpnAttendance.setForeground(new Color(30, 144, 255));
		dtrpnAttendance.setBackground(Color.WHITE);
		dtrpnAttendance.setText(" Attendance\r\n\r\n Contributions\r\n\r\n Event Calendar\r\n\r\n Ministries\r\n\r\n Church Directory\r\n");
		dtrpnAttendance.setBounds(24, 49, 190, 512);
		frmCrossconnect.getContentPane().add(dtrpnAttendance);
		
		Button button = new Button("ADD");
		button.setForeground(new Color(0, 0, 0));
		button.setBackground(new Color(30, 144, 255));
		button.setBounds(224, 470, 70, 22);
		frmCrossconnect.getContentPane().add(button);
		
		Button button_1 = new Button("UPDATE");
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setBackground(new Color(30, 144, 255));
		button_1.setBounds(367, 470, 70, 22);
		frmCrossconnect.getContentPane().add(button_1);
		
		Button button_2 = new Button("DELETE");
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setBackground(new Color(30, 144, 255));
		button_2.setBounds(511, 470, 70, 22);
		frmCrossconnect.getContentPane().add(button_2);
		
		Button button_3 = new Button("EXIT");
		button_3.setForeground(new Color(0, 0, 0));
		button_3.setBackground(new Color(30, 144, 255));
		button_3.setBounds(367, 510, 70, 22);
		frmCrossconnect.getContentPane().add(button_3);
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
