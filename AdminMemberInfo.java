import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Map;
import java.awt.Choice;
import javax.swing.JEditorPane;
import java.awt.Toolkit;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;



public class AdminMemberInfo implements ActionListener, Printable {

    JFrame frmCrossconnect7;
    private JTextField adminID;
    private JTextField adminName;
    private JTextField memberName;
    private JTextField memberID;
    private JTextField dateOfBirth;
    private JTextField lastName;
    private JTextField age;
    private JTextField maritalStatus;
    private JTextField memberStatus;
    private JTextField joinDate;
    private JTextField leaveDate;
    private JTextField address;
    private JTextField city;
    private JTextField zip;
    private JTextField homePhone;
    private JTextField cellPhone;
    private JTextField email;
    private Choice choice;
    private Choice choice_1;
    private JButton button;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_4;
    public static String username = "";
    public static String userid = "";

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

        JLabel lblNewLabel = new JLabel("Administrator ID: " + userid);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setForeground(new Color(0, 0, 205));
        lblNewLabel.setBounds(370, 52, 120, 14);
        frmCrossconnect7.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Name: " + username);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setForeground(new Color(0, 0, 205));
        lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
        lblNewLabel_1.setBounds(224, 52, 100, 14);
        frmCrossconnect7.getContentPane().add(lblNewLabel_1);

       /* adminID = new JTextField();
        adminID.setBounds(494, 49, 86, 20);
        frmCrossconnect7.getContentPane().add(adminID);
        adminID.setColumns(10);

        adminName = new JTextField();
        adminName.setBounds(274, 49, 86, 20);
        frmCrossconnect7.getContentPane().add(adminName);
        adminName.setColumns(10);
*/
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
                frmCrossconnect7.dispose();
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
        frmCrossconnect7.getContentPane().add(lblMemInfo);

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
                frmCrossconnect7.dispose();
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
        frmCrossconnect7.getContentPane().add(lblAttendance);

        JLabel lblEventCal = new JLabel("Event Calendar");
        lblEventCal.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblEventCal.setForeground(new Color(30, 144, 255));
        lblEventCal.setBackground(Color.WHITE);
        lblEventCal.setBounds(24, 99, 144, 20);
        lblEventCal.addMouseListener(new MouseAdapter() {
            Font original;

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = {userid, username};
                EventSchedule.main(args);
                frmCrossconnect7.dispose();
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
        frmCrossconnect7.getContentPane().add(lblEventCal);

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
                frmCrossconnect7.dispose();
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
        frmCrossconnect7.getContentPane().add(lblContribution);

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
                frmCrossconnect7.dispose();
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
        frmCrossconnect7.getContentPane().add(lblChurchDir);

        JLabel label = new JLabel("Name:");
        label.setForeground(new Color(0, 0, 205));
        label.setFont(new Font("Tahoma", Font.BOLD, 11));
        label.setBackground(Color.LIGHT_GRAY);
        label.setBounds(224, 120, 46, 14);
        frmCrossconnect7.getContentPane().add(label);

        memberName = new JTextField("John");
        memberName.setColumns(10);
        memberName.setBounds(274, 117, 86, 20);
        frmCrossconnect7.getContentPane().add(memberName);

        JLabel label_1 = new JLabel("Member ID:");
        label_1.setForeground(new Color(0, 0, 205));
        label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        label_1.setBounds(398, 120, 67, 14);
        frmCrossconnect7.getContentPane().add(label_1);

        memberID = new JTextField("0");
        memberID.setColumns(10);
        memberID.setBounds(494, 117, 86, 20);
        frmCrossconnect7.getContentPane().add(memberID);

        JLabel label_2 = new JLabel("Date of Birth:");
        label_2.setBounds(198, 159, 79, 14);
        frmCrossconnect7.getContentPane().add(label_2);

        dateOfBirth = new JTextField();
        dateOfBirth.setColumns(10);
        dateOfBirth.setBounds(274, 156, 86, 20);
        frmCrossconnect7.getContentPane().add(dateOfBirth);

        JLabel label_3 = new JLabel("Last Name:");
        label_3.setBounds(418, 162, 84, 14);
        frmCrossconnect7.getContentPane().add(label_3);

        lastName = new JTextField("Smith");
        lastName.setColumns(10);
        lastName.setBounds(494, 156, 86, 20);
        frmCrossconnect7.getContentPane().add(lastName);

        JLabel label_4 = new JLabel("Age:");
        label_4.setBounds(242, 196, 46, 14);
        frmCrossconnect7.getContentPane().add(label_4);

        age = new JTextField();
        age.setColumns(10);
        age.setBounds(274, 193, 86, 20);
        frmCrossconnect7.getContentPane().add(age);

        JLabel label_5 = new JLabel("Gender:");
        label_5.setBounds(386, 196, 104, 14);
        frmCrossconnect7.getContentPane().add(label_5);

        JLabel label_6 = new JLabel("Marital Status:");
        label_6.setBounds(178, 232, 92, 14);
        frmCrossconnect7.getContentPane().add(label_6);

        maritalStatus = new JTextField();
        maritalStatus.setColumns(10);
        maritalStatus.setBounds(274, 229, 86, 20);
        frmCrossconnect7.getContentPane().add(maritalStatus);

        JLabel label_7 = new JLabel("Member Status:");
        label_7.setBounds(392, 232, 92, 14);
        frmCrossconnect7.getContentPane().add(label_7);

        memberStatus = new JTextField();
        memberStatus.setColumns(10);
        memberStatus.setBounds(494, 229, 86, 20);
        frmCrossconnect7.getContentPane().add(memberStatus);

        JLabel lblEnterMemberName = new JLabel("Enter member name or ID: ");
        lblEnterMemberName.setBounds(188, 95, 172, 14);
        frmCrossconnect7.getContentPane().add(lblEnterMemberName);

        JLabel label_8 = new JLabel("Date of Joining:");
        label_8.setBounds(180, 269, 93, 14);
        frmCrossconnect7.getContentPane().add(label_8);

        joinDate = new JTextField();
        joinDate.setColumns(10);
        joinDate.setBounds(274, 266, 86, 20);
        frmCrossconnect7.getContentPane().add(joinDate);

        JLabel label_9 = new JLabel("Date of Leaving:");
        label_9.setBounds(388, 269, 96, 14);
        frmCrossconnect7.getContentPane().add(label_9);

        leaveDate = new JTextField();
        leaveDate.setColumns(10);
        leaveDate.setBounds(494, 266, 86, 20);
        frmCrossconnect7.getContentPane().add(leaveDate);

        JLabel label_10 = new JLabel("Contact Information");
        label_10.setBounds(198, 310, 137, 14);
        frmCrossconnect7.getContentPane().add(label_10);

        JLabel label_11 = new JLabel("Address:");
        label_11.setBounds(198, 335, 79, 14);
        frmCrossconnect7.getContentPane().add(label_11);

        address = new JTextField("123 Nowhere Street");
        address.setColumns(10);
        address.setBounds(198, 360, 440, 23);
        frmCrossconnect7.getContentPane().add(address);

        JLabel label_12 = new JLabel("City:");
        label_12.setBounds(224, 394, 46, 14);
        frmCrossconnect7.getContentPane().add(label_12);

        city = new JTextField("Raleigh");
        city.setColumns(10);
        city.setBounds(274, 391, 86, 20);
        frmCrossconnect7.getContentPane().add(city);

        JLabel label_13 = new JLabel("Zipcode:");
        label_13.setBounds(428, 394, 46, 14);
        frmCrossconnect7.getContentPane().add(label_13);

        zip = new JTextField("27597");
        zip.setColumns(10);
        zip.setBounds(494, 394, 86, 20);
        frmCrossconnect7.getContentPane().add(zip);

        JLabel label_14 = new JLabel("Home Phone:");
        label_14.setBounds(186, 422, 102, 14);
        frmCrossconnect7.getContentPane().add(label_14);

        homePhone = new JTextField("5555555");
        homePhone.setColumns(10);
        homePhone.setBounds(268, 419, 92, 20);
        frmCrossconnect7.getContentPane().add(homePhone);

        JLabel label_15 = new JLabel("Cell Phone:");
        label_15.setBounds(418, 422, 96, 14);
        frmCrossconnect7.getContentPane().add(label_15);

        cellPhone = new JTextField("5555555");
        cellPhone.setColumns(10);
        cellPhone.setBounds(484, 419, 96, 20);
        frmCrossconnect7.getContentPane().add(cellPhone);

        JLabel label_16 = new JLabel("Email:");
        label_16.setBounds(224, 447, 46, 14);
        frmCrossconnect7.getContentPane().add(label_16);

        email = new JTextField("email@host.com");
        email.setColumns(10);
        email.setBounds(268, 444, 152, 20);
        frmCrossconnect7.getContentPane().add(email);

        JLabel attendance = new JLabel("Attendance:");
        attendance.setBounds(192, 472, 67, 14);
        frmCrossconnect7.getContentPane().add(attendance);

        button = new JButton("ADD");
        button.setForeground(Color.BLACK);
        button.setBackground(new Color(30, 144, 255));
        button.setBounds(639, 79, 70, 22);
        frmCrossconnect7.getContentPane().add(button);
        button.addActionListener(this);

        button_1 = new JButton("UPDATE");
        button_1.setForeground(Color.BLACK);
        button_1.setBackground(new Color(30, 144, 255));
        button_1.setBounds(639, 128, 70, 22);
        frmCrossconnect7.getContentPane().add(button_1);
        button_1.addActionListener(this);

        button_2 = new JButton("DELETE");
        button_2.setForeground(Color.BLACK);
        button_2.setBackground(new Color(30, 144, 255));
        button_2.setBounds(639, 175, 70, 22);
        frmCrossconnect7.getContentPane().add(button_2);
        button_2.addActionListener(this);

        button_3 = new JButton("MAIN");
        button_3.setForeground(Color.BLACK);
        button_3.setBackground(new Color(30, 144, 255));
        button_3.setBounds(639, 269, 70, 22);
        frmCrossconnect7.getContentPane().add(button_3);
        button_3.addActionListener(this);

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

        button_4 = new JButton("PRINT");
        button_4.setForeground(new Color(0, 0, 0));
        button_4.setBackground(new Color(30, 144, 255));
        button_4.setBounds(639, 224, 70, 22);
        frmCrossconnect7.getContentPane().add(button_4);
        button_4.addActionListener(this);

        JLabel lblViewReport = new JLabel("View Report");
        lblViewReport.setForeground(new Color(0, 0, 128));
        lblViewReport.setBounds(325, 495, 67, 14);
        frmCrossconnect7.getContentPane().add(lblViewReport);

        JLabel label_17 = new JLabel("View Report");
        label_17.setForeground(new Color(0, 0, 128));
        label_17.setBounds(528, 495, 67, 14);
        frmCrossconnect7.getContentPane().add(label_17);

        JLabel lblMinistriesEnrolledIn = new JLabel("Ministries Enrolled In:");
        lblMinistriesEnrolledIn.setBounds(370, 297, 130, 14);
        frmCrossconnect7.getContentPane().add(lblMinistriesEnrolledIn);

        choice_1 = new Choice();
        choice_1.setBounds(494, 196, 86, 20);
        frmCrossconnect7.getContentPane().add(choice_1);
        choice_1.add("M");
        choice_1.add("F");


        choice = new Choice();
        choice.setBounds(494, 291, 86, 20);
        frmCrossconnect7.getContentPane().add(choice);
        choice.add("The Bridge");
        choice.add("Drama");
        choice.add("Home Bible Study");
        choice.add("TOP Kids");
        choice.add("Mission 14:23");
        choice.add("IMPACT Student Ministries");
        choice.add("Mother's Morning out");


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
        //adds each field to the database, currently doesn't check to see if input is valid
        //checks for valid input should be added before submission
        if(e.getSource()==button)
        {


            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
                Statement s=con.createStatement();
                String queryString="'"+memberID.getText()+"','"+memberName.getText()+"','"+lastName.getText()+"','"+address.getText()+"','"+city.getText()+"','"+zip.getText()+"','"+homePhone.getText()+"','"+cellPhone.getText()+"','"+email.getText()+
                        "','"+maritalStatus.getName()+"'"+",'password'"+",'"+choice_1.getSelectedItem()+"'";
                System.out.println(queryString);
                Date d=new Date (3,3,1994);
                s.execute("INSERT INTO [Users](User_ID,First_Name,Last_Name,Address,City,Zip,Phone1,Phone2,Email,Marital_Status,Password,Gender,DOB,State)"
                        + "VALUES("+queryString+",'"+d+"','NC')");


                JOptionPane.showMessageDialog(null, "User has been added.");
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, "Error, user with this ID already exists.");
            }
        }
        else if(e.getSource()==button_1)
        {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
                Statement s=con.createStatement();

                s.execute("DELETE FROM [Users] WHERE User_ID='"+memberID.getText()+"'");

            } catch (Exception x) {

            }
            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
                Statement s=con.createStatement();
                String queryString="'"+memberID.getText()+"','"+memberName.getText()+"','"+lastName.getText()+"','"+address.getText()+"','"+city.getText()+"','"+zip.getText()+"','"+homePhone.getText()+"','"+cellPhone.getText()+"','"+email.getText()+
                        "','"+maritalStatus.getName()+"'"+",'password'"+",'"+choice_1.getSelectedItem()+"'";
                System.out.println(queryString);
                Date d=new Date (3,3,1994);
                s.execute("INSERT INTO [Users](User_ID,First_Name,Last_Name,Address,City,Zip,Phone1,Phone2,Email,Marital_Status,Password,Gender,DOB,State)"
                        + "VALUES("+queryString+",'"+d+"','NC')");


                JOptionPane.showMessageDialog(null, "User's information has been updated.");
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, "Error, update has failed.");
            }
        }
        else if(e.getSource()==button_2)
        {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
                Statement s=con.createStatement();

                s.execute("DELETE FROM [Users] WHERE User_ID='"+memberID.getText()+"'");
                JOptionPane.showMessageDialog(null, "User has been deleted.");

            } catch (Exception x) {
                // TODO Auto-generated catch block
                JOptionPane.showMessageDialog(null, "Error, user was not deleted.");
            }
        }
        else if(e.getSource()==button_3)
        {
            //returns to the main page
            String[] args = {userid, username};
            AdministratorMain.main(args);
            frmCrossconnect7.dispose();


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


    }
    public int print(Graphics g, PageFormat pf, int page)
            throws PrinterException {
        if (page > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        frmCrossconnect7.printAll(g);

        return PAGE_EXISTS;
    }
}