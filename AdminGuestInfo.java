import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextPane;
import javax.swing.JToolBar;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.ScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;
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

public class AdminGuestInfo implements ActionListener, Printable {

	JFrame frmCrossconnect8;
	private JTextField adminID;
	private JTextField adminName;
	private JTextField memberName;
	private JTextField userID;
	private JTextField age;
	private JTextField familyMembers;
	private JTextField maritalStatus;
	private JTextField joinDate;
	private JTextField address;
	private JTextField city;
	private JTextField zip;
	private JTextField homePhone;
	private JTextField cellPhone;
	private JTextField email;
	private JTextField txtAppliedFor;
	private Choice choice;
	private Button button;
	private Button button_1;
	private Button button_2;
	private Button button_3;
	private Button button_4;
	private Button button_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminGuestInfo window = new AdminGuestInfo();
					window.frmCrossconnect8.setVisible(true);
					//AdministratorMain.main(args);
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
	public AdminGuestInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrossconnect8 = new JFrame();
		frmCrossconnect8.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\amina\\Documents\\crossconnect-Recovered.png"));
		frmCrossconnect8.setBackground(new Color(255, 255, 255));
		frmCrossconnect8.getContentPane().setForeground(Color.BLUE);
		frmCrossconnect8.getContentPane().setBackground(Color.WHITE);
		frmCrossconnect8.setTitle("CROSSCONNECT");
		frmCrossconnect8.setBounds(100, 100, 768, 600);
		frmCrossconnect8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrossconnect8.getContentPane().setLayout(null);

		JLabel lblMember = new JLabel("  ADMINISTRATOR GUEST INFORMATION PAGE");
		lblMember.setVerticalAlignment(SwingConstants.TOP);
		lblMember.setHorizontalAlignment(SwingConstants.LEFT);
		lblMember.setForeground(Color.GRAY);
		lblMember.setBackground(new Color(0, 0, 139));
		lblMember.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMember.setBounds(0, 0, 752, 17);
		frmCrossconnect8.getContentPane().add(lblMember);

		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE TEMPLE OF  PENTECOST");
		lblWelcomeToThe.setForeground(new Color(0, 0, 139));
		lblWelcomeToThe.setBackground(Color.CYAN);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setBounds(0, 24, 752, 14);
		frmCrossconnect8.getContentPane().add(lblWelcomeToThe);

		JLabel lblNewLabel = new JLabel("Administrator ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBounds(370, 52, 114, 14);
		frmCrossconnect8.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(224, 52, 46, 14);
		frmCrossconnect8.getContentPane().add(lblNewLabel_1);

		adminID = new JTextField();
		adminID.setBounds(494, 49, 86, 20);
		frmCrossconnect8.getContentPane().add(adminID);
		adminID.setColumns(10);

		adminName = new JTextField();
		adminName.setBounds(274, 49, 86, 20);
		frmCrossconnect8.getContentPane().add(adminName);
		adminName.setColumns(10);

		JLabel lblMemInfo = new JLabel("Member Information");
		lblMemInfo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMemInfo.setForeground(new Color(30, 144, 255));
		lblMemInfo.setBackground(Color.WHITE);
		lblMemInfo.setBounds(24, 49, 144, 20);
		lblMemInfo.addMouseListener(new MouseAdapter() {
		    Font original;
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        String[] args = null;
		     Member.main(args);
		        frmCrossconnect8.dispose();
		    }
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        original = e.getComponent().getFont();
		        Map attributes = original.getAttributes();
		        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		        e.getComponent().setFont(original.deriveFont(attributes));
		    }
		    @Override
		    public void mouseExited(MouseEvent e) {
		        e.getComponent().setFont(original);
		    }
		});
		frmCrossconnect8.getContentPane().add(lblMemInfo);

		JLabel lblAttendance = new JLabel("Attendance");
		lblAttendance.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAttendance.setForeground(new Color(30, 144, 255));
		lblAttendance.setBackground(Color.WHITE);
		lblAttendance.setBounds(24, 74, 144, 20);
		lblAttendance.addMouseListener(new MouseAdapter() {
		    Font original;

		    @Override
		    public void mouseClicked(MouseEvent e) {
		        String[] args = null;
		       MemberAttendance.main(args);
		        frmCrossconnect8.dispose();
		    }

		    @Override
		    public void mouseEntered(MouseEvent e) {
		        original = e.getComponent().getFont();
		        Map attributes = original.getAttributes();
		        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		        e.getComponent().setFont(original.deriveFont(attributes));
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        e.getComponent().setFont(original);
		    }
		});
		frmCrossconnect8.getContentPane().add(lblAttendance);

		JLabel lblEventCal = new JLabel("Event Calendar");
		lblEventCal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEventCal.setForeground(new Color(30, 144, 255));
		lblEventCal.setBackground(Color.WHITE);
		lblEventCal.setBounds(24, 99, 144, 20);
		lblEventCal.addMouseListener(new MouseAdapter() {
		    Font original;

		    @Override
		    public void mouseClicked(MouseEvent e) {
		        String[] args = null;
		       EventSchedule.main(args);
		        frmCrossconnect8.dispose();
		    }

		    @Override
		    public void mouseEntered(MouseEvent e) {
		        original = e.getComponent().getFont();
		        Map attributes = original.getAttributes();
		        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		        e.getComponent().setFont(original.deriveFont(attributes));
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        e.getComponent().setFont(original);
		    }
		});
		frmCrossconnect8.getContentPane().add(lblEventCal);

		JLabel lblContribution = new JLabel("Contributions");
		lblContribution.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContribution.setForeground(new Color(30, 144, 255));
		lblContribution.setBackground(Color.WHITE);
		lblContribution.setBounds(24, 124, 144, 20);
		lblContribution.addMouseListener(new MouseAdapter() {
		    Font original;

		    @Override
		    public void mouseClicked(MouseEvent e) {
		        String[] args = null;
		        MemberContribution.main(args);
		        frmCrossconnect8.dispose();
		    }

		    @Override
		    public void mouseEntered(MouseEvent e) {
		        original = e.getComponent().getFont();
		        Map attributes = original.getAttributes();
		        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		        e.getComponent().setFont(original.deriveFont(attributes));
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        e.getComponent().setFont(original);
		    }
		});
		frmCrossconnect8.getContentPane().add(lblContribution);

		JLabel lblChurchDir = new JLabel("Church Directory");
		lblChurchDir.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChurchDir.setForeground(new Color(30, 144, 255));
		lblChurchDir.setBackground(Color.WHITE);
		lblChurchDir.setBounds(24, 149, 144, 20);
		lblChurchDir.addMouseListener(new MouseAdapter() {
		    Font original;

		    @Override
		    public void mouseClicked(MouseEvent e) {
		        String[] args = null;
		        ChurchDirectory.main(args);
		        frmCrossconnect8.dispose();
		    }

		    @Override
		    public void mouseEntered(MouseEvent e) {
		        original = e.getComponent().getFont();
		        Map attributes = original.getAttributes();
		        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		        e.getComponent().setFont(original.deriveFont(attributes));
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        e.getComponent().setFont(original);
		    }
		});
		frmCrossconnect8.getContentPane().add(lblChurchDir);

		JLabel label = new JLabel("Name:");
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(224, 120, 46, 14);
		frmCrossconnect8.getContentPane().add(label);

		memberName = new JTextField();
		memberName.setColumns(10);
		memberName.setBounds(274, 117, 86, 20);
		frmCrossconnect8.getContentPane().add(memberName);

		userID = new JTextField();
		userID.setColumns(10);
		userID.setBounds(494, 117, 86, 20);
		frmCrossconnect8.getContentPane().add(userID);

		JLabel label_2 = new JLabel("User ID");
		label_2.setBounds(405, 120, 79, 14);
		frmCrossconnect8.getContentPane().add(label_2);

		age = new JTextField();
		age.setColumns(10);
		age.setBounds(274, 156, 86, 20);
		frmCrossconnect8.getContentPane().add(age);

		JLabel label_4 = new JLabel("Age:");
		label_4.setBounds(241, 159, 46, 14);
		frmCrossconnect8.getContentPane().add(label_4);

		maritalStatus = new JTextField();
		maritalStatus.setColumns(10);
		maritalStatus.setBounds(274, 193, 86, 20);
		frmCrossconnect8.getContentPane().add(maritalStatus);

		JLabel label_5 = new JLabel("Family Members:");
		label_5.setBounds(392, 159, 104, 14);
		frmCrossconnect8.getContentPane().add(label_5);

		familyMembers=new JTextField();
		familyMembers.setColumns(10);
		familyMembers.setBounds(494, 159, 85, 20);
		frmCrossconnect8.getContentPane().add(familyMembers);

		JLabel label_6 = new JLabel("Marital Status:");
		label_6.setBounds(195, 196, 92, 14);
		frmCrossconnect8.getContentPane().add(label_6);

		joinDate = new JTextField();
		joinDate.setColumns(10);
		joinDate.setBounds(274, 229, 86, 20);
		frmCrossconnect8.getContentPane().add(joinDate);

		JLabel label_7 = new JLabel("Member Status:");
		label_7.setBounds(392, 196, 92, 14);
		frmCrossconnect8.getContentPane().add(label_7);

		JLabel lblEnterMemberName = new JLabel("Enter member name or ID: ");
		lblEnterMemberName.setBounds(188, 95, 172, 14);
		frmCrossconnect8.getContentPane().add(lblEnterMemberName);

		JLabel label_8 = new JLabel("Date of Joining:");
		label_8.setBounds(177, 232, 93, 14);
		frmCrossconnect8.getContentPane().add(label_8);

		JLabel label_10 = new JLabel("Contact Information");
		label_10.setBounds(198, 310, 137, 14);
		frmCrossconnect8.getContentPane().add(label_10);

		JLabel label_11 = new JLabel("Address:");
		label_11.setBounds(198, 335, 79, 14);
		frmCrossconnect8.getContentPane().add(label_11);

		address = new JTextField();
		address.setColumns(10);
		address.setBounds(198, 360, 440, 23);
		frmCrossconnect8.getContentPane().add(address);

		JLabel label_12 = new JLabel("City:");
		label_12.setBounds(224, 394, 46, 14);
		frmCrossconnect8.getContentPane().add(label_12);

		city = new JTextField();
		city.setColumns(10);
		city.setBounds(274, 391, 86, 20);
		frmCrossconnect8.getContentPane().add(city);

		JLabel label_13 = new JLabel("Zipcode:");
		label_13.setBounds(428, 394, 46, 14);
		frmCrossconnect8.getContentPane().add(label_13);

		zip = new JTextField("27597");
		zip.setColumns(10);
		zip.setBounds(494, 394, 86, 20);
		frmCrossconnect8.getContentPane().add(zip);

		JLabel label_14 = new JLabel("Home Phone:");
		label_14.setBounds(186, 422, 102, 14);
		frmCrossconnect8.getContentPane().add(label_14);

		homePhone = new JTextField("55555555");
		homePhone.setColumns(10);
		homePhone.setBounds(268, 419, 92, 20);
		frmCrossconnect8.getContentPane().add(homePhone);

		JLabel label_15 = new JLabel("Cell Phone:");
		label_15.setBounds(418, 422, 96, 14);
		frmCrossconnect8.getContentPane().add(label_15);

		cellPhone = new JTextField("5555555");
		cellPhone.setColumns(10);
		cellPhone.setBounds(484, 419, 96, 20);
		frmCrossconnect8.getContentPane().add(cellPhone);

		JLabel label_16 = new JLabel("Email:");
		label_16.setBounds(224, 447, 46, 14);
		frmCrossconnect8.getContentPane().add(label_16);

		email = new JTextField();
		email.setColumns(10);
		email.setBounds(268, 444, 152, 20);
		frmCrossconnect8.getContentPane().add(email);

		button = new Button("ADD");
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(30, 144, 255));
		button.setBounds(639, 79, 70, 22);
		frmCrossconnect8.getContentPane().add(button);
		button.addActionListener(this);

		button_1 = new Button("UPDATE");
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(new Color(30, 144, 255));
		button_1.setBounds(639, 128, 70, 22);
		frmCrossconnect8.getContentPane().add(button_1);
		button_1.addActionListener(this);

		button_2 = new Button("DELETE");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(new Color(30, 144, 255));
		button_2.setBounds(639, 175, 70, 22);
		frmCrossconnect8.getContentPane().add(button_2);
		button_2.addActionListener(this);

		button_3 = new Button("MAIN");
		button_3.setForeground(Color.BLACK);
		button_3.setBackground(new Color(30, 144, 255));
		button_3.setBounds(639, 310, 70, 22);
		frmCrossconnect8.getContentPane().add(button_3);
		button_3.addActionListener(this);


		button_4 = new Button("PRINT");
		button_4.setForeground(new Color(0, 0, 0));
		button_4.setBackground(new Color(30, 144, 255));
		button_4.setBounds(639, 224, 70, 22);
		button_4.addActionListener(null);
		frmCrossconnect8.getContentPane().add(button_4);
		button_4.addActionListener(this);

		JLabel lblMinistriesEnrolledIn = new JLabel("Ministry of Interest:");
		lblMinistriesEnrolledIn.setBounds(170, 268, 110, 14);
		frmCrossconnect8.getContentPane().add(lblMinistriesEnrolledIn);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(494, 154, 4, 22);
		frmCrossconnect8.getContentPane().add(textArea);

		choice = new Choice();
		choice.setBounds(294, 267, 130, 20);
		frmCrossconnect8.getContentPane().add(choice);
		choice.add("The Bridge");
		choice.add("Drama");
		choice.add("Home Bible Study");
		choice.add("TOP Kids");
		choice.add("Mission 14:23");
		choice.add("IMPACT Student Ministries");
		choice.add("Mother's Morning out");


		txtAppliedFor = new JTextField();
		txtAppliedFor.setText("Applied For");
		txtAppliedFor.setBounds(494, 193, 86, 20);
		frmCrossconnect8.getContentPane().add(txtAppliedFor);
		txtAppliedFor.setColumns(10);

		button_5 = new Button("SEND EMAIL");
		button_5.setBackground(new Color(30, 144, 255));
		button_5.setForeground(new Color(0, 0, 0));
		button_5.setBounds(639, 268, 70, 22);
		frmCrossconnect8.getContentPane().add(button_5);
		button_5.addActionListener(this);





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
public void actionPerformed(ActionEvent e) {

		if(e.getSource()==button)
		{

			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
				Statement s=con.createStatement();
				String queryString="'"+userID.getText()+"','"+memberName.getText()+"','lname','"+address.getText()+"','"+city.getText()+"','"+zip.getText()+"','"+homePhone.getText()+"','"+cellPhone.getText()+"','"+email.getText()+
						"','"+maritalStatus.getText()+"',"+"'password'";
				System.out.println(queryString);
				Date d=new Date (3,3,1994);
				s.execute("INSERT INTO [Users](User_ID,First_Name,Last_name,Address,City,Zip,Phone1,Phone2,Email,Marital_Status,Password,Gender,DOB,State)"
					+ "VALUES("+queryString+",'?'"+",'"+d+"','NC')");


			} catch (Exception x) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Error: User with this ID already exists");
		}
		}
		else if(e.getSource()==button_1)
		{
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
				Statement s=con.createStatement();
				String queryString="'"+userID.getText()+"','"+memberName.getText()+"','lname','"+address.getText()+"','"+city.getText()+"','"+zip.getText()+"','"+homePhone.getText()+"','"+cellPhone.getText()+"','"+email.getText()+
						"','"+maritalStatus.getText()+"',"+"'password'";
				System.out.println(queryString);
				Date d=new Date (3,3,1994);
				s.execute("INSERT INTO [Users](User_ID,First_Name,Last_name,Address,City,Zip,Phone1,Phone2,Email,Marital_Status,Password,Gender,DOB,State)"
					+ "VALUES("+queryString+",'?'"+",'"+d+"','NC')");


			} catch (Exception x) {

		}
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
				Statement s=con.createStatement();

				s.execute("DELETE FROM [Users] WHERE User_ID='"+userID.getText()+"'");
				JOptionPane.showMessageDialog(null, "User information has been update");

			} catch (Exception x) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Error, user was not updated.");
		}
		}
		else if(e.getSource()==button_2)
		{
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
				Statement s=con.createStatement();

				s.execute("DELETE FROM [Users] WHERE User_ID='"+userID.getText()+"'");
				JOptionPane.showMessageDialog(null, "User has been deleted.");

			} catch (Exception x) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Error, user was not deleted.");
		}
		}
		else if(e.getSource()==button_3)
		{

			String[] args = null;
			AdministratorMain.main(args);
			frmCrossconnect8.dispose();
		}
		else if(e.getSource()==button_4)
		{
			PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(this);
            boolean ok = job.printDialog();
            if (ok) {
                try {
                    job.print();
                } catch (PrinterException ex) {
                }
            }
		}
		else if(e.getSource()==button_5)
		{
		String body="";
		body+="\nAdminID:"+adminID.getText();
		body+="\nMemberName:"+memberName.getText();
		body+="\nAdminName:"+adminName.getText();
		body+="\nDateOfBirth:"+userID.getText();
		body+="\nAge:"+age.getText();
		body+="\nFamily Members: "+familyMembers.getText();
		body+="\nMarital Status:"+maritalStatus.getText();
		body+="\nJoin Date :"+joinDate.getText();
		body+="\nAddress :"+address.getText();
		body+="\nCity:"+city.getText();
		body+="\nZip Code:"+zip.getText();
		body+="\nHome Phone:"+homePhone.getText();
		body+="\nCell Number:"+cellPhone.getText();
		body+="\nEmail Address:"+email.getText();
			sendEmail(body,"jrdaughtridge@my.waketech.edu");
		}


	}
public static void sendEmail(String body,String email){
	Properties props = new Properties();
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.socketFactory.port", "465");
	props.put("mail.smtp.socketFactory.class",
			"javax.net.ssl.SSLSocketFactory");
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.port", "465");

	Session session = Session.getDefaultInstance(props,
		new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("jrdaughtridge@gmail.com","jr5d13nc");
			}
		});

	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("jrdaughtridge@gmail.com"));
		message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("jrdaughtridge@my.waketech.edu"));
		message.setSubject("Member Request");
		message.setText("A request has been made to add a user with the following credentials to the system:\n "+body);

		Transport.send(message);
		message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
		Transport.send(message);

		JOptionPane.showMessageDialog(null, "Request sent to Admin");


	} catch (MessagingException e) {
		throw new RuntimeException(e);
	}
    }
public int print(Graphics g, PageFormat pf, int page)
        throws PrinterException {
    if (page > 0) {
        return NO_SUCH_PAGE;
    }

    Graphics2D g2d = (Graphics2D)g;
    g2d.translate(pf.getImageableX(), pf.getImageableY());

    frmCrossconnect8.printAll(g);

    return PAGE_EXISTS;
}
}
