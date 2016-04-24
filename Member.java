import java.awt.EventQueue;
import java.util.Date;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;

import com.sun.mail.smtp.SMTPMessage;

import java.awt.Font;
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
import javax.mail.internet.AddressException;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.awt.Choice;
import java.awt.List;
import java.awt.TextField;
import javax.swing.JEditorPane;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class Member implements ActionListener {

	JFrame frmCrossconnect;
	private JTextField memberID;
	private JTextField familyID;
	private JTextField memberName;
	private JTextField birthDate;
	private JTextField age;
	private JTextField MaritalStatus;
	private JTextField memberStatus;
	private JTextField joinDate;
	private JTextField leaveDate;
	private JTextField address;
	private JTextField homePhone;
	private JTextField cellPhone;
	private JTextField email;
	private JTextField city;
	private JTextField zip;
	private Button add;
	private Button update;
	private Button delete;
	private Button exit;
	private Choice familyMembers;
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

		memberID = new JTextField();
		memberID.setBounds(442, 49, 86, 20);
		frmCrossconnect.getContentPane().add(memberID);
		memberID.setColumns(10);

		familyID = new JTextField();
		familyID.setBounds(578, 95, 86, 20);
		frmCrossconnect.getContentPane().add(familyID);
		familyID.setColumns(10);

		memberName = new JTextField();
		memberName.setBounds(274, 49, 86, 20);
		frmCrossconnect.getContentPane().add(memberName);
		memberName.setColumns(10);

		birthDate = new JTextField();
		birthDate.setBounds(319, 95, 86, 20);
		frmCrossconnect.getContentPane().add(birthDate);
		birthDate.setColumns(10);

		age = new JTextField();
		age.setBounds(319, 131, 86, 20);
		frmCrossconnect.getContentPane().add(age);
		age.setColumns(10);

		MaritalStatus = new JTextField();
		MaritalStatus.setBounds(319, 173, 86, 20);
		frmCrossconnect.getContentPane().add(MaritalStatus);
		MaritalStatus.setColumns(10);

		memberStatus = new JTextField();
		memberStatus.setBounds(578, 173, 86, 20);
		frmCrossconnect.getContentPane().add(memberStatus);
		memberStatus.setColumns(10);

		joinDate = new JTextField();
		joinDate.setBounds(319, 217, 86, 20);
		frmCrossconnect.getContentPane().add(joinDate);
		joinDate.setColumns(10);

		leaveDate = new JTextField();
		leaveDate.setBounds(578, 217, 86, 20);
		frmCrossconnect.getContentPane().add(leaveDate);
		leaveDate.setColumns(10);

		address = new JTextField();
		address.setBounds(224, 304, 440, 23);
		frmCrossconnect.getContentPane().add(address);
		address.setColumns(10);

		homePhone = new JTextField();
		homePhone.setBounds(319, 380, 92, 20);
		frmCrossconnect.getContentPane().add(homePhone);
		homePhone.setColumns(10);

		cellPhone = new JTextField();
		cellPhone.setBounds(496, 380, 96, 20);
		frmCrossconnect.getContentPane().add(cellPhone);
		cellPhone.setColumns(10);

		email = new JTextField("email123@host.com");
		email.setBounds(319, 418, 152, 20);
		frmCrossconnect.getContentPane().add(email);
		email.setColumns(10);

		familyMembers = new Choice();
		familyMembers.setBounds(578, 134, 86, 20);
		frmCrossconnect.getContentPane().add(familyMembers);
		familyMembers.add("0");
		familyMembers.add("1");
		familyMembers.add("2");
		familyMembers.add("3");
		familyMembers.add("4");
		familyMembers.add("5+");

		JLabel lblFamilyMembers = new JLabel("Family Members:");
		lblFamilyMembers.setBounds(477, 134, 116, 14);
		frmCrossconnect.getContentPane().add(lblFamilyMembers);

		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(271, 338, 46, 14);
		frmCrossconnect.getContentPane().add(lblCity);

		JLabel lblZipcode = new JLabel("Zipcode:");
		lblZipcode.setBounds(452, 338, 46, 14);
		frmCrossconnect.getContentPane().add(lblZipcode);

		city = new JTextField();
		city.setBounds(319, 338, 86, 20);
		frmCrossconnect.getContentPane().add(city);
		city.setColumns(10);

		zip = new JTextField();
		zip.setBounds(496, 338, 86, 20);
		frmCrossconnect.getContentPane().add(zip);
		zip.setColumns(10);

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
		        frmCrossconnect.dispose();
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
		frmCrossconnect.getContentPane().add(lblMemInfo);

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
		        frmCrossconnect.dispose();
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
		frmCrossconnect.getContentPane().add(lblAttendance);

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
		        frmCrossconnect.dispose();
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
		frmCrossconnect.getContentPane().add(lblEventCal);

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
		        frmCrossconnect.dispose();
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
		frmCrossconnect.getContentPane().add(lblContribution);

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
		        frmCrossconnect.dispose();
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
		frmCrossconnect.getContentPane().add(lblChurchDir);

		add = new Button("ADD");
		add.setForeground(new Color(0, 0, 0));
		add.setBackground(new Color(30, 144, 255));
		add.setBounds(224, 470, 70, 22);
		frmCrossconnect.getContentPane().add(add);
		add.addActionListener(this);

		update = new Button("UPDATE");
		update.setForeground(new Color(0, 0, 0));
		update.setBackground(new Color(30, 144, 255));
		update.setBounds(367, 470, 70, 22);
		frmCrossconnect.getContentPane().add(update);
		update.addActionListener(this);

		delete = new Button("DELETE");
		delete.setForeground(new Color(0, 0, 0));
		delete.setBackground(new Color(30, 144, 255));
		delete.setBounds(511, 470, 70, 22);
		frmCrossconnect.getContentPane().add(delete);
		delete.addActionListener(this);

		exit = new Button("MAIN");
		exit.setForeground(new Color(0, 0, 0));
		exit.setBackground(new Color(30, 144, 255));
		exit.setBounds(367, 510, 70, 22);
		frmCrossconnect.getContentPane().add(exit);
		exit.addActionListener(this);
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

		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		else if(e.getSource()==update)
		{
			String infoString="";
			infoString+="Member ID: "+memberID.getText()+"\n";
			infoString+="Member Name: "+memberName.getText()+"\n";
			infoString+="Date Of Birth: "+birthDate.getText()+"\n";
			infoString+="Family ID: "+familyID.getText()+"\n";
			infoString+="Family Members: "+familyMembers.getSelectedItem()+"\n";
			infoString+="Age: "+age.getText()+"\n";
			infoString+="Marital Status: "+MaritalStatus.getText()+"\n";
			infoString+="Member Status: "+memberStatus.getText()+"\n";
			infoString+="Join Date: "+joinDate.getText()+"\n";
			infoString+="Leave Date: "+leaveDate.getText()+"\n";
			infoString+="Address: "+address.getText()+"\n";
			infoString+="City: "+city.getText()+"\n";
			infoString+="Zip code: "+zip.getText()+"\n";
			infoString+="Home Phone: "+homePhone.getText()+"\n";
			infoString+="Cell Phone: "+cellPhone.getText()+"\n";
			infoString+="Email: "+email.getText()+"\n";

			sendEmail(infoString,"Update",email.getText());

		}
		else if(e.getSource()==add)
		{
			String infoString="";
			infoString+="Member ID: "+memberID.getText()+"\n";
			infoString+="Member Name: "+memberName.getText()+"\n";
			infoString+="Date Of Birth: "+birthDate.getText()+"\n";
			infoString+="Family ID: "+familyID.getText()+"\n";
			infoString+="Family Members: "+familyMembers.getSelectedItem()+"\n";
			infoString+="Age: "+age.getText()+"\n";
			infoString+="Marital Status: "+MaritalStatus.getText()+"\n";
			infoString+="Member Status: "+memberStatus.getText()+"\n";
			infoString+="Join Date: "+joinDate.getText()+"\n";
			infoString+="Leave Date: "+leaveDate.getText()+"\n";
			infoString+="Address: "+address.getText()+"\n";
			infoString+="City: "+city.getText()+"\n";
			infoString+="Zip code: "+zip.getText()+"\n";
			infoString+="Home Phone: "+homePhone.getText()+"\n";
			infoString+="Cell Phone: "+cellPhone.getText()+"\n";
			infoString+="Email: "+email.getText()+"\n";

			sendEmail(infoString,"Add",email.getText());
		}
		else if(e.getSource()==delete)
		{
			String infoString="";
			infoString+="Member ID: "+memberID.getText()+"\n";
			infoString+="Member Name: "+memberName.getText()+"\n";
			infoString+="Date Of Birth: "+birthDate.getText()+"\n";
			infoString+="Family ID: "+familyID.getText()+"\n";
			infoString+="Family Members: "+familyMembers.getSelectedItem()+"\n";
			infoString+="Age: "+age.getText()+"\n";
			infoString+="Marital Status: "+MaritalStatus.getText()+"\n";
			infoString+="Member Status: "+memberStatus.getText()+"\n";
			infoString+="Join Date: "+joinDate.getText()+"\n";
			infoString+="Leave Date: "+leaveDate.getText()+"\n";
			infoString+="Address: "+address.getText()+"\n";
			infoString+="City: "+city.getText()+"\n";
			infoString+="Zip code: "+zip.getText()+"\n";
			infoString+="Home Phone: "+homePhone.getText()+"\n";
			infoString+="Cell Phone: "+cellPhone.getText()+"\n";
			infoString+="Email: "+email.getText()+"\n";

			sendEmail(infoString,"Delete",email.getText());
		}



	}
	public static void sendEmail(String body,String requestType,String email){
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
			message.setSubject(requestType+" request");
			message.setText("A request has been made to add a user with the following credentials to the system:\n "+body);

			Transport.send(message);
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
			Transport.send(message);
			System.out.println(requestType+" request sent to Admin");
			JOptionPane.showMessageDialog(null, requestType+" request sent to Admin");


		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	    }
	}

