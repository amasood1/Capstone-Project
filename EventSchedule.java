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
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
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
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
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

public class EventSchedule implements ActionListener {

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
    private Button buttonDelete;
    private Button buttonAdd;
    private Button buttonView;
    private Button buttonUpdate;
    private Button buttonExit;
    private Button buttonSend;
    private JTextField eventID;
    public static String userid = "";
    public static String username = "";
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        if(args.length > 0)
        {
            userid = args[0];
            username = args[1];
        }
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

        JLabel lblMemInfo = new JLabel("Member Information");
        lblMemInfo.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblMemInfo.setForeground(new Color(30, 144, 255));
        lblMemInfo.setBackground(Color.WHITE);
        lblMemInfo.setBounds(24, 49, 144, 20);
        lblMemInfo.addMouseListener(new MouseAdapter() {
            Font original;
            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = {userid, username};
                Member.main(args);
                frmCrossconnect9.dispose();
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
        frmCrossconnect9.getContentPane().add(lblMemInfo);

        JLabel lblAttendance = new JLabel("Attendance");
        lblAttendance.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAttendance.setForeground(new Color(30, 144, 255));
        lblAttendance.setBackground(Color.WHITE);
        lblAttendance.setBounds(24, 74, 144, 20);
        lblAttendance.addMouseListener(new MouseAdapter() {
            Font original;

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = {userid, username};
                MemberAttendance.main(args);
                frmCrossconnect9.dispose();
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
        frmCrossconnect9.getContentPane().add(lblAttendance);

        JLabel lblEventCal = new JLabel("Ministries");
        lblEventCal.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblEventCal.setForeground(new Color(30, 144, 255));
        lblEventCal.setBackground(Color.WHITE);
        lblEventCal.setBounds(24, 99, 144, 20);
        lblEventCal.addMouseListener(new MouseAdapter() {
            Font original;

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = {userid, username};
                ministries.main(args);
                frmCrossconnect9.dispose();
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
        frmCrossconnect9.getContentPane().add(lblEventCal);

        JLabel lblContribution = new JLabel("Contributions");
        lblContribution.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblContribution.setForeground(new Color(30, 144, 255));
        lblContribution.setBackground(Color.WHITE);
        lblContribution.setBounds(24, 124, 144, 20);
        lblContribution.addMouseListener(new MouseAdapter() {
            Font original;

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = {userid, username};
                MemberContribution.main(args);
                frmCrossconnect9.dispose();
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
        frmCrossconnect9.getContentPane().add(lblContribution);

        JLabel lblChurchDir = new JLabel("Church Directory");
        lblChurchDir.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblChurchDir.setForeground(new Color(30, 144, 255));
        lblChurchDir.setBackground(Color.WHITE);
        lblChurchDir.setBounds(24, 149, 144, 20);
        lblChurchDir.addMouseListener(new MouseAdapter() {
            Font original;

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = {userid, username};
                ChurchDirectory.main(args);
                frmCrossconnect9.dispose();
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
        frmCrossconnect9.getContentPane().add(lblChurchDir);

        // Buttons
        buttonAdd = new Button("ADD");
        buttonAdd.setForeground(Color.BLACK);
        buttonAdd.setBackground(new Color(30, 144, 255));
        buttonAdd.setBounds(639, 146, 70, 22);
        frmCrossconnect9.getContentPane().add(buttonAdd);
        buttonAdd.addActionListener(this);

        buttonUpdate = new Button("UPDATE");
        buttonUpdate.setForeground(Color.BLACK);
        buttonUpdate.setBackground(new Color(30, 144, 255));
        buttonUpdate.setBounds(639, 181, 70, 22);
        frmCrossconnect9.getContentPane().add(buttonUpdate);
        buttonUpdate.addActionListener(this);

        buttonDelete = new Button("DELETE");
        buttonDelete.setForeground(Color.BLACK);
        buttonDelete.setBackground(new Color(30, 144, 255));
        buttonDelete.setBounds(639, 226, 70, 22);
        frmCrossconnect9.getContentPane().add(buttonDelete);
        buttonDelete.addActionListener(this);

        buttonExit = new Button("EXIT");
        buttonExit.setForeground(Color.BLACK);
        buttonExit.setBackground(new Color(30, 144, 255));
        buttonExit.setBounds(639, 310, 70, 22);
        frmCrossconnect9.getContentPane().add(buttonExit);
        buttonExit.addActionListener(this);

        buttonSend = new Button("SEND REQUEST ");
        buttonSend.setForeground(new Color(0, 0, 0));
        buttonSend.setBackground(new Color(30, 144, 255));
        buttonSend.setBounds(626, 266, 91, 22);
        frmCrossconnect9.getContentPane().add(buttonSend);
        buttonSend.addActionListener(this);

        buttonView = new Button("VIEW");
        buttonView.setForeground(new Color(0, 0, 0));
        buttonView.setBackground(new Color(30, 144, 255));
        buttonView.setBounds(639, 111, 70, 22);
        frmCrossconnect9.getContentPane().add(buttonView);
        buttonView.addActionListener(this);

        //1. Member Name
        JLabel lblNewLabel_1 = new JLabel("Name: " + username);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setForeground(new Color(0, 0, 205));
        lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
        lblNewLabel_1.setBounds(224, 52, 100, 14);
        frmCrossconnect9.getContentPane().add(lblNewLabel_1);

       /* tfMemberName = new JTextField();
        tfMemberName.setBounds(494, 49, 86, 20);
        frmCrossconnect9.getContentPane().add(tfMemberName);
        tfMemberName.setColumns(10);
*/
        // 2. Member ID
        JLabel lblNewLabel = new JLabel("ID: " + userid);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setForeground(new Color(0, 0, 205));
        lblNewLabel.setBounds(446, 52, 120, 14);
        frmCrossconnect9.getContentPane().add(lblNewLabel);

       /* tfMemberID = new JTextField();
        tfMemberID.setBounds(274, 49, 86, 20);
        frmCrossconnect9.getContentPane().add(tfMemberID);
        tfMemberID.setColumns(10);
*/
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
        frmCrossconnect9.getContentPane().add(choiceEventType);
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
        tfEventManagerName.setBounds(201, 312, 86, 20);
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

        eventID=new JTextField("1");
        eventID.setBounds(391,350,86,20);
        frmCrossconnect9.getContentPane().add(eventID);
        eventID.setColumns(10);

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

        if(e.getSource()==buttonAdd) // SQL ADD
        {

            try {
                JOptionPane.showMessageDialog(null, "Information could not be added.");
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

                s.execute("DELETE FROM [Event] WHERE Event_ID='"+eventID.getText()+"'");
                JOptionPane.showMessageDialog(null, "Event has been removed.");


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

                JOptionPane.showMessageDialog(null, "Information could not be updated.");


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

                JOptionPane.showMessageDialog(null, "Unable to view information currently.");


            } catch (Exception x) {
                // TODO Auto-generated catch block
                x.printStackTrace();
            }
        }
        else if(e.getSource()==buttonExit)
        {
            String[] args = {userid, username};
            AdministratorMain.main(args);
            frmCrossconnect9.dispose();
        }
        else if(e.getSource()==buttonSend)
        {
            String emailString="Member_Name:\nMemberID:\nDay:\nMonth:\nEvent Type:\nGuest Number:\nRoom Number:";

            Member.sendEmail(emailString, "Event", "jrdaughtridge@gmail.com");
            JOptionPane.showMessageDialog(null, "Request sent to Admin");

        }
    }
}