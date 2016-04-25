import java.awt.EventQueue;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.Button;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;

public class ChurchDirectory implements ActionListener{

    JFrame frmCrossconnect5;
    public static String username = "";
    public static String userid = "";
    String email;
   /* private JTextField textField;
    private JTextField textField_2;*/

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
                    ChurchDirectory window = new ChurchDirectory();
                    window.frmCrossconnect5.setVisible(true);
                    //window.frmCrossconnect.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     * @wbp.parser.entryPoint
     */
    public ChurchDirectory() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmCrossconnect5 = new JFrame();
        frmCrossconnect5.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\amina\\Documents\\crossconnect-Recovered.png"));
        frmCrossconnect5.setBackground(new Color(255, 255, 255));
        frmCrossconnect5.getContentPane().setForeground(Color.BLUE);
        frmCrossconnect5.getContentPane().setBackground(Color.WHITE);
        frmCrossconnect5.setTitle("CROSSCONNECT");
        frmCrossconnect5.setBounds(100, 100, 768, 600);
        frmCrossconnect5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCrossconnect5.getContentPane().setLayout(null);

        JLabel lblMember = new JLabel("     CHURCH DIRECTORY");
        lblMember.setVerticalAlignment(SwingConstants.TOP);
        lblMember.setHorizontalAlignment(SwingConstants.LEFT);
        lblMember.setForeground(Color.GRAY);
        lblMember.setBackground(new Color(0, 0, 139));
        lblMember.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblMember.setBounds(0, 0, 752, 17);
        frmCrossconnect5.getContentPane().add(lblMember);

        JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE TEMPLE OF  PENTECOST");
        lblWelcomeToThe.setForeground(new Color(0, 0, 139));
        lblWelcomeToThe.setBackground(Color.CYAN);
        lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeToThe.setBounds(0, 24, 752, 14);
        frmCrossconnect5.getContentPane().add(lblWelcomeToThe);

        JLabel lblNewLabel = new JLabel("Member ID: " + userid);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setForeground(new Color(0, 0, 205));
        lblNewLabel.setBounds(370, 52, 100, 14);
        frmCrossconnect5.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Name: " + username);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setForeground(new Color(0, 0, 205));
        lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
        lblNewLabel_1.setBounds(224, 52, 120, 14);
        frmCrossconnect5.getContentPane().add(lblNewLabel_1);

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
                frmCrossconnect5.dispose();
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
        frmCrossconnect5.getContentPane().add(lblMemInfo);

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
                frmCrossconnect5.dispose();
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
        frmCrossconnect5.getContentPane().add(lblAttendance);

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
                frmCrossconnect5.dispose();
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
        frmCrossconnect5.getContentPane().add(lblEventCal);

        JLabel lblMinistry = new JLabel("Contributions");
        lblMinistry.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblMinistry.setForeground(new Color(30, 144, 255));
        lblMinistry.setBackground(Color.WHITE);
        lblMinistry.setBounds(24, 124, 144, 20);
        lblMinistry.addMouseListener(new MouseAdapter() {
            Font original;

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = {userid, username};
                MemberContribution.main(args);
                frmCrossconnect5.dispose();
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
        frmCrossconnect5.getContentPane().add(lblMinistry);

        JLabel lblChurchDir = new JLabel("Ministries");
        lblChurchDir.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblChurchDir.setForeground(new Color(30, 144, 255));
        lblChurchDir.setBackground(Color.WHITE);
        lblChurchDir.setBounds(24, 149, 144, 20);
        lblChurchDir.addMouseListener(new MouseAdapter() {
            Font original;

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = {userid, username};
                ministries.main(args);
                frmCrossconnect5.dispose();
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
        frmCrossconnect5.getContentPane().add(lblChurchDir);


       /* Button button = new Button("BACK");
        button.setForeground(new Color(0, 0, 0));
        button.setBackground(new Color(30, 144, 255));
        button.setBounds(274, 462, 70, 22);
        frmCrossconnect5.getContentPane().add(button);
*/
        JButton btnExit = new JButton("EXIT");
        btnExit.setForeground(new Color(0, 0, 0));
        btnExit.setBackground(new Color(30, 144, 255));
        btnExit.setBounds(358, 462, 70, 22);
        btnExit.setActionCommand("EXIT");
        frmCrossconnect5.getContentPane().add(btnExit);
        btnExit.addActionListener(this);



        JButton btnEmail = new JButton("SEND E-MAIL");
        btnEmail.setForeground(new Color(0, 0, 0));
        btnEmail.setBackground(new Color(30, 144, 255));
        btnEmail.setBounds(330, 420, 126, 22);
        btnEmail.setActionCommand("EMAIL");
        frmCrossconnect5.getContentPane().add(btnEmail);
        btnEmail.addActionListener(this);

        JLabel lblChurchcontactsDirectory = new JLabel("Church Contacts Directory");
        lblChurchcontactsDirectory.setBounds(234, 96, 161, 14);
        frmCrossconnect5.getContentPane().add(lblChurchcontactsDirectory);

        List list = new List();
        list.setBounds(234, 131, 309, 267);
        frmCrossconnect5.getContentPane().add(list);

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con= DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
            Statement s=con.createStatement();
            //use s.executeQuery("SQL statement"); to execute statements on the database
            String query = "SELECT * FROM [Users]";
            ResultSet rs = s.executeQuery(query);
            String first, last, email, phone;
            while(rs.next())
            {
                first = rs.getString("first_Name");
                last = rs.getString("Last_Name");
                email = rs.getString("Email");
                phone = rs.getString("Phone1");
                list.add((first + " " + last + ": " + email + ": "+phone));
                System.out.print(rs.getString("First_Name") + " ");
                System.out.print(rs.getString("Last_Name") + " ");
                System.out.println(rs.getString("Email"));
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

    public void actionPerformed(ActionEvent e)
    {
        if("EXIT".equals(e.getActionCommand()))
        {
            System.exit(0);
        }
        if("EMAIL".equals(e.getActionCommand()))
        {
            JFrame frame = new JFrame();
            String s = JOptionPane.showInputDialog(frame, "Enter email body:");
            sendEmail(s, "Directory", email);
        }
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
                    InternetAddress.parse(email));
            message.setSubject(requestType+" request");
            message.setText(body);

            Transport.send(message);
            System.out.println(requestType+" request sent to Admin");
            JOptionPane.showMessageDialog(null, requestType+" request sent to Admin");


        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}