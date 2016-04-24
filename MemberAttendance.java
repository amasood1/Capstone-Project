import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import com.toedter.calendar.JCalendar;
import java.awt.Button;
import java.awt.font.TextAttribute;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

public class MemberAttendance implements PropertyChangeListener, ActionListener{

    JFrame frmCrossconnect2;
    JCalendar calendar;
    JEditorPane infoPane;
   /* private JTextField textField;
    private JTextField textField_2;
*/
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MemberAttendance window = new MemberAttendance();
                    window.frmCrossconnect2.setVisible(true);
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
    public MemberAttendance() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frmCrossconnect2 = new JFrame();
        frmCrossconnect2.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\amina\\Documents\\crossconnect-Recovered.png"));
        frmCrossconnect2.setBackground(new Color(255, 255, 255));
        frmCrossconnect2.getContentPane().setForeground(Color.BLUE);
        frmCrossconnect2.getContentPane().setBackground(Color.WHITE);
        frmCrossconnect2.setTitle("CROSSCONNECT");
        frmCrossconnect2.setBounds(100, 100, 768, 600);
        frmCrossconnect2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCrossconnect2.getContentPane().setLayout(null);

        JLabel lblMember = new JLabel("     MEMBER ATTENDANCE");
        lblMember.setVerticalAlignment(SwingConstants.TOP);
        lblMember.setHorizontalAlignment(SwingConstants.LEFT);
        lblMember.setForeground(new Color(105, 105, 105));
        lblMember.setBackground(new Color(0, 0, 139));
        lblMember.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblMember.setBounds(0, 0, 752, 17);
        frmCrossconnect2.getContentPane().add(lblMember);

        JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE TEMPLE OF  PENTECOST");
        lblWelcomeToThe.setForeground(new Color(0, 0, 139));
        lblWelcomeToThe.setBackground(Color.CYAN);
        lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeToThe.setBounds(0, 24, 752, 14);
        frmCrossconnect2.getContentPane().add(lblWelcomeToThe);

        JLabel lblNewLabel = new JLabel("Member ID:");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setForeground(new Color(0, 0, 205));
        lblNewLabel.setBounds(370, 52, 67, 14);
        frmCrossconnect2.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Name:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setForeground(new Color(0, 0, 205));
        lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
        lblNewLabel_1.setBounds(224, 52, 46, 14);
        frmCrossconnect2.getContentPane().add(lblNewLabel_1);

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
                //  Member.main(args);
                frmCrossconnect2.dispose();
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
        frmCrossconnect2.getContentPane().add(lblMemInfo);

        JLabel lblAttendance = new JLabel("Contributions");
        lblAttendance.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAttendance.setForeground(new Color(30, 144, 255));
        lblAttendance.setBackground(Color.WHITE);
        lblAttendance.setBounds(24, 74, 144, 20);
        lblAttendance.addMouseListener(new MouseAdapter() {
            Font original;

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = null;
                MemberContribution.main(args);
                frmCrossconnect2.dispose();
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
        frmCrossconnect2.getContentPane().add(lblAttendance);

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
                //  EventSchedule.main(args);
                frmCrossconnect2.dispose();
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
        frmCrossconnect2.getContentPane().add(lblEventCal);

        JLabel lblContribution = new JLabel("Ministries");
        lblContribution.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblContribution.setForeground(new Color(30, 144, 255));
        lblContribution.setBackground(Color.WHITE);
        lblContribution.setBounds(24, 124, 144, 20);
        lblContribution.addMouseListener(new MouseAdapter() {
            Font original;

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = null;
                ministries.main(args);
                frmCrossconnect2.dispose();
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
        frmCrossconnect2.getContentPane().add(lblContribution);

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
                // ChurchDirectory.main(args);
                frmCrossconnect2.dispose();
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
        frmCrossconnect2.getContentPane().add(lblChurchDir);
        JLabel lblSelectAYear = new JLabel("Make a Selection");
        lblSelectAYear.setBounds(224, 102, 103, 14);
        frmCrossconnect2.getContentPane().add(lblSelectAYear);

        calendar = new JCalendar();
        calendar.setBounds(274, 127, 198, 153);
        frmCrossconnect2.getContentPane().add(calendar);
        JDayChooser getD = calendar.getDayChooser();
        JMonthChooser getM = calendar.getMonthChooser();
        JYearChooser getY = calendar.getYearChooser();
        getD.addPropertyChangeListener(this);
        getM.addPropertyChangeListener(this);
        getY.addPropertyChangeListener(this);



        JButton btnExit = new JButton("EXIT");
        btnExit.setForeground(new Color(0, 0, 0));
        btnExit.setBackground(new Color(30, 144, 255));
        btnExit.setBounds(370, 480, 70, 22);
        btnExit.setActionCommand("EXIT");
        frmCrossconnect2.getContentPane().add(btnExit);
        btnExit.addActionListener(this);


        JLabel lblSelectAYear_1 = new JLabel("Select a year for full year attendance record");
        lblSelectAYear_1.setBounds(509, 102, 233, 14);
        frmCrossconnect2.getContentPane().add(lblSelectAYear_1);

        JYearChooser yearChooser = new JYearChooser();
        yearChooser.setBounds(659, 127, 67, 20);
        frmCrossconnect2.getContentPane().add(yearChooser);

        infoPane = new JEditorPane();
        infoPane.setFont(new Font("Tahoma", Font.BOLD, 12));
        infoPane.setForeground(new Color(30, 144, 255));
        infoPane.setBackground(Color.WHITE);
        infoPane.setText("");
        infoPane.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(infoPane);
        scrollPane.setBounds(145, 280, 510, 170);
        frmCrossconnect2.getContentPane().add(scrollPane);
    }

    public void propertyChange(PropertyChangeEvent e) {
        JDayChooser dc = calendar.getDayChooser();
        JMonthChooser mc = calendar.getMonthChooser();
        JYearChooser yc = calendar.getYearChooser();
        String date = "";
        date = date + yc.getYear() + "-";
        if(mc.getMonth() < 9)
        {
           date = date + "0" + (mc.getMonth()+1) + "-";
        }
        else
        {
            date = date + (mc.getMonth()+1) + "-";
        }
        if(dc.getDay() < 10)
        {
            date = date +"0" + dc.getDay();
        }
        else
        {
            date = date + dc.getDay();
        }

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con= DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
            Statement s=con.createStatement();
            //use s.executeQuery("SQL statement"); to execute statements on the database
            String query = "SELECT * FROM Event";
            ResultSet rs = s.executeQuery(query);
            String datetime = "";
            String obtainedDate = "";
            String obtainedTime = "";
            String infoMessage = "";
            boolean hasEvent = false;
            infoPane.setText("");
            while(rs.next())
            {
                datetime = rs.getString("Start_Date_Time");
                obtainedDate = datetime.substring(0, 10);
                obtainedTime = datetime.substring(11,16);
                if(obtainedDate.equals(date))
                {
                    hasEvent = true;
                    infoMessage = infoMessage + rs.getString("Event_Name") + " at " + obtainedTime + "\n\tNumber of attendees: ";
                    if(rs.getString("Attendance")== null)
                    {
                        infoMessage = infoMessage + "N/A \n\tNumber of guests: " ;
                    }
                    else
                    {
                        infoMessage = infoMessage + rs.getString("Attendance") + "\n\tNumber of guests: ";
                    }
                    if(rs.getString("Num_Guests")==null)
                    {
                        infoMessage = infoMessage + "N/A\n\tTotal tithes: ";
                    }
                    else
                    {
                        infoMessage = infoMessage + rs.getString("Num_Guests") + "\n\tTotal tithes: ";
                    }
                    if(rs.getString("Total_Tithe")==null)
                    {
                        infoMessage = infoMessage + "N/A\n\tTotal offerings: ";
                    }
                    else
                    {
                        String tithe = rs.getString("Total_Tithe");
                        infoMessage = infoMessage + tithe.substring(0, tithe.length() - 2) + "\n\tTotal offerings: ";
                    }
                    if(rs.getString("Total_Offering")==null)
                    {
                        infoMessage = infoMessage + "N/A\n";
                    }
                    else
                    {
                        String tithe = rs.getString("Total_Offering");
                        infoMessage = infoMessage + tithe.substring(0, tithe.length()-2) + "\n";
                    }
                }
            }
            if(hasEvent == false)
            {
                infoMessage = "No events planned on this day";
            }
            infoPane.setText(infoMessage);

        } catch (Exception ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent e)
    {
        if("EXIT".equals(e.getActionCommand()))
        {
            System.exit(0);
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
}