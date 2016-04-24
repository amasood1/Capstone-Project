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
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
	private JTextField tfMemberName;
	private JTextField tfMemberID;
	private JTextArea textDateEntry;
	private JDateChooser dateChooser;
	private JMonthChooser monthChooser;
	private Choice choiceEventType;
	private JTextField tfGuestNum;
	private Choice choiceRoomNum;
	private JTextField tfEventManagerName;
	private JTextField tfEventManagerContact;
	private JTextField tfEventTime;

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
		
		JEditorPane dtrpnMainGuestInformation = new JEditorPane();
		dtrpnMainGuestInformation.setText("Main \r\n\r\nMember  Information\r\n\r\n Ministries\r\n\r\n Guest Information\r\n\r\n PR Management\r\n\r\n");
		dtrpnMainGuestInformation.setForeground(new Color(30, 144, 255));
		dtrpnMainGuestInformation.setFont(new Font("Tahoma", Font.BOLD, 12));
		dtrpnMainGuestInformation.setBackground(Color.WHITE);
		dtrpnMainGuestInformation.setBounds(10, 79, 160, 512);
		frmCrossconnect9.getContentPane().add(dtrpnMainGuestInformation);
		
		// Buttons
		Button buttonAdd = new Button("ADD");
		buttonAdd.setForeground(Color.BLACK);
		buttonAdd.setBackground(new Color(30, 144, 255));
		buttonAdd.setBounds(639, 146, 70, 22);
		frmCrossconnect9.getContentPane().add(buttonAdd);
		
		Button buttonUpdate = new Button("UPDATE");
		buttonUpdate.setForeground(Color.BLACK);
		buttonUpdate.setBackground(new Color(30, 144, 255));
		buttonUpdate.setBounds(639, 181, 70, 22);
		frmCrossconnect9.getContentPane().add(buttonUpdate);
		
		Button buttonDelete = new Button("DELETE");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(new Color(30, 144, 255));
		button_2.setBounds(639, 226, 70, 22);
		frmCrossconnect9.getContentPane().add(buttonDelete);
		
		Button buttonExit = new Button("EXIT");
		buttonExit.setForeground(Color.BLACK);
		buttonExit.setBackground(new Color(30, 144, 255));
		buttonExit.setBounds(639, 310, 70, 22);
		frmCrossconnect9.getContentPane().add(buttonExit);	
		
		Button buttonSend = new Button("SEND REQUEST ");
		buttonSend.setForeground(new Color(0, 0, 0));
		buttonSend.setBackground(new Color(30, 144, 255));
		buttonSend.setBounds(626, 266, 91, 22);
		frmCrossconnect9.getContentPane().add(buttonSend);
		
		Button buttonView = new Button("VIEW");
		buttonView.setForeground(new Color(0, 0, 0));
		buttonView.setBackground(new Color(30, 144, 255));
		buttonView.setBounds(639, 111, 70, 22);
		frmCrossconnect9.getContentPane().add(buttonView);
		
		//1. Member Name
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(224, 52, 46, 14);
		frmCrossconnect9.getContentPane().add(lblNewLabel_1);
		
		tfMemberName = new JTextField();
		tfMemberName.setBounds(494, 49, 86, 20);
		frmCrossconnect9.getContentPane().add(tfMemberName);
		tfMemberName.setColumns(10);
		
		// 2. Member ID
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBounds(446, 52, 38, 14);
		frmCrossconnect9.getContentPane().add(lblNewLabel);
		
		tfMemberID = new JTextField();
		tfMemberID.setBounds(274, 49, 86, 20);
		frmCrossconnect9.getContentPane().add(tfMemberID);
		tfMemberID.setColumns(10);
		
		// 3. Date Entry
		JLabel lblEnterMemberName = new JLabel("Select the date for the event ");
		lblEnterMemberName.setBounds(188, 95, 172, 14);
		frmCrossconnect9.getContentPane().add(lblEnterMemberName);
		
		textDateEntry = new JTextArea();
		textDateEntry.setBounds(494, 154, 4, 22);
		frmCrossconnect9.getContentPane().add(textDateEntry);
		
		// 4. Date Chooser
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(196, 113, 91, 20);
		frmCrossconnect9.getContentPane().add(dateChooser);
		
		// 5. Month Chooser
		JLabel lblSelectTheMonth = new JLabel("Select the month for the event");
		lblSelectTheMonth.setBounds(391, 95, 189, 14);
		frmCrossconnect9.getContentPane().add(lblSelectTheMonth);
		
		monthChooser = new JMonthChooser();
		monthChooser.setBounds(400, 113, 98, 20);
		frmCrossconnect9.getContentPane().add(monthChooser);
		
		// 6. Event Type
		JLabel lblEventType = new JLabel("Event Type");
		lblEventType.setBounds(188, 154, 82, 14);
		frmCrossconnect9.getContentPane().add(lblEventType);
		
		choiceEventType = new Choice();
		choiceEventType.setBounds(196, 183, 91, 20);
		frmCrossconnect9.getContentPane().add(choice);
		choiceEventType.add("Birthday");
		choiceEventType.add("Wedding");
		choiceEventType.add("Charity");
		
		// 7. Number of Guests
		JLabel lblNumberOfGuets = new JLabel("Number of guests");
		lblNumberOfGuets.setBounds(188, 224, 117, 14);
		frmCrossconnect9.getContentPane().add(lblNumberOfGuets);
		
		tfGuestNum = new JTextField();
		tfGuestNum.setBounds(201, 244, 86, 20);
		frmCrossconnect9.getContentPane().add(tfGuestNum);
		tfGuestNum.setColumns(10);
		
		// 8. Room Number
		JLabel lblRoomNumber = new JLabel("Room Number: ");
		lblRoomNumber.setBounds(391, 224, 117, 14);
		frmCrossconnect9.getContentPane().add(lblRoomNumber);		
		
		choiceRoomNum = new Choice();
		choiceRoomNum.setBounds(391, 244, 107, 20);
		frmCrossconnect9.getContentPane().add(choiceRoomNum);
		
		choiceRoomNum.add("Room 1: Accomodates 15 people");
		choiceRoomNum.add("Room 2: Accomodates 25 people");
		choiceRoomNum.add("Room 3: Accomodates 50 people");
		
		// 9. Event Manager Name
		JLabel lblEventManagerName = new JLabel("Event Manager Name:");
		lblEventManagerName.setBounds(188, 294, 130, 14);
		frmCrossconnect9.getContentPane().add(lblEventManagerName);
		
		tfEventManagerName = new JTextField();
		textField_3.setBounds(201, 312, 86, 20);
		frmCrossconnect9.getContentPane().add(tfEventManagerName);
		tfEventManagerName.setColumns(10);
		
		// 10. Event Manager Contact
		JLabel lblEventManagerContact = new JLabel("Event Manager Contact");
		lblEventManagerContact.setBounds(391, 294, 139, 14);
		frmCrossconnect9.getContentPane().add(lblEventManagerContact);
		
		tfEventManagerContact = new JTextField();
		tfEventManagerContact.setBounds(391, 312, 86, 20);
		frmCrossconnect9.getContentPane().add(tfEventManagerContact);
		tfEventManagerContact.setColumns(10);
		
		// 11. Time of Event
		JLabel lblTimeOfEvent = new JLabel("Time of Event");
		lblTimeOfEvent.setBounds(391, 159, 93, 14);
		frmCrossconnect9.getContentPane().add(lblTimeOfEvent);
		
		tfEventTime = new JTextField();
		tfEventTime.setBounds(391, 183, 86, 20);
		frmCrossconnect9.getContentPane().add(tfEventTime);
		tfEventTime.setColumns(10);
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
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==buttonAdd) // SQL ADD
		{
			System.out.println("Member Name:" + tfMemberName.getText());
			System.out.println("Member ID:" + tfMemberID.getText());
			System.out.println("Date:" + dateChooser.getDateFormatString());
			System.out.println("Month:" + monthChooser.getDateFormatString());
			System.out.println("Event Type:" + choiceEventType.getSelectedItem());
			System.out.println("Guest Num:" + tfGuestNum.getText());
			System.out.println("Room Num:" + choiceRoomNum.getSelectedItem());
			System.out.println("Event Manager Name:" + tfEventManagerName.getText());
			System.out.println("Event Manager Contact:" + tfEventManagerContact.getText());
			System.out.println("Event Time:" + tfEventTime.getText());
			
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
				Statement s=con.createStatement();
				
				String queryString="'"+tfMemberName.getText()+"','"+tfMemberID.getText()+"','"+
				dateChooser.getDateFormatString()+"','"+monthChooser.getDateFormatString()+"','"+
				choiceEventType.getSelectedItem()+"','"+tfGuestNum.getText()+"','"+
				choiceRoomNum.getSelectedItem()+"','"+tfEventManagerName.getText()+"','"+
				tfEventManagerContact.getText()+"','"+tfEventTime.getText()+"'";
				
				System.out.println(queryString);	
				s.execute("INSERT INTO [Events](Event_ID,Member_Name,Member_ID,Day,Month,Event_Type,Guest_Num,Room_Num,Contact_Name,Contact_Contact,Event_Time)"
					+ "VALUES("+queryString+",'"+d+"','NC')");
				
				
			} catch (Exception x) {
				// TODO Auto-generated catch block
				x.printStackTrace();
			}
		}
		else if(e.getSource()==buttonDelete) // SQL Delete
		{
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
				Statement s=con.createStatement();

				s.execute("DELETE FROM [Events] WHERE Event_ID='"+eventID.getText()+"'");
				
				
			} catch (Exception x) {
				// TODO Auto-generated catch block
				x.printStackTrace();
		}
		}
		else if(e.getSource()==buttonUpdate) // SQL Update
		{
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
				Statement s=con.createStatement();

				String queryString="Member_Name=" + tfMemberName.getText()+","+
								   "Member_ID=" + tfMemberID.getText()+","+
								   "Day=" + dateChooser.getDateFormatString()+","+
								   "Month=" + monthChooser.getDateFormatString()+","+
								   "Event_Type=" + choiceEventType.getSelectedItem()+","+
								   "Guest_Num=" + tfGuestNum.getText()+","+
						           "Room_Num=" + choiceRoomNum.getSelectedItem()+","+
								   "Manager_Name=" + tfEventManagerName.getText()+","+
						           "Manager_Contact=" + tfEventManagerContact.getText()+","+
								   "Event_Time=" + tfEventTime.getText();
				
				// 
				s.execute("UPDATE [Events]" + queryString + "WHERE Event_ID='"+eventID.getText()+"'");
				
				
			} catch (Exception x) {
				// TODO Auto-generated catch block
				x.printStackTrace();
		}
		}
		else if(e.getSource()==buttonView)
		{
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
				Statement s=con.createStatement();

				ResultSet rs = s.execute("SELECT FROM [Events] WHERE Event_ID='"+eventID.getText()+"'");
				
				tfMemberName.setText(rs.getObject("Member_Name"));
				tfMemberID.setText((String)rs.getObject("Member_ID"));
				dateChooser.setDateFormatString((String)rs.getObject("Date"));
				monthChooser.setDateFormatString((String)rs.getObject("Month"));
				choiceEventType.select((String)rs.getObject("Event_Type"));
				tfGuestNum.setText((String)rs.getObject("Guest_Num"));
				choiceRoomNum.select((String)rs.getObject("Room_Num"));
				tfEventManagerName.setText((String)rs.getObject("Manager_Name"));
				tfEventManagerContact.setText((String)rs.getObject("Manager_Contact"));
				tfEventTime.setText((String)rs.getObject("Event_Time"));
				
				
			} catch (Exception x) {
				// TODO Auto-generated catch block
				x.printStackTrace();
		}
		}
		else if(e.getSource()==buttonExit)
		{
			String[] args = null;
			AdministratorMain.main(args);
			frmCrossconnect9.dispose();
		}
	}
}
