import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.print.*;
import java.util.Map;

public class ministries implements Printable, ActionListener, ItemListener{

    JFrame frmCrossconnect4;
    ArrayList<String> minNames = new ArrayList<>();
    ArrayList<String> minDescriptions = new ArrayList<>();
    JTextArea txtDescription = new JTextArea();
    public static String username = "";
    public static int userid = 0;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        if(args != null)
        {
            userid = Integer.parseInt(args[0]);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ministries window = new ministries();
                    window.frmCrossconnect4.setVisible(true);
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
    public ministries() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        //connect to database and get ministry data
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
            Statement s=con.createStatement();
            //use s.executeQuery("SQL statement"); to execute statements on the database
            String query = "SELECT * FROM Ministry";
            ResultSet rs = s.executeQuery(query);

            while(rs.next())
            {
                minNames.add(rs.getString("Ministry_Name"));
                minDescriptions.add(rs.getString("Description"));
            }

            String nameQuery = "SELECT First_Name, Last_Name FROM [Users] WHERE User_ID="+userid;
            // ResultSet urs = s.executeQuery(nameQuery);
           /* while(urs.next())
            {
                username = urs.getString("First_Name");
                username.concat(" " + urs.getString("Last_Name"));
            }*/

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        frmCrossconnect4 = new JFrame();
        frmCrossconnect4.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\amina\\Documents\\crossconnect-Recovered.png"));
        frmCrossconnect4.setBackground(new Color(255, 255, 255));
        frmCrossconnect4.getContentPane().setForeground(Color.BLUE);
        frmCrossconnect4.getContentPane().setBackground(Color.WHITE);
        frmCrossconnect4.setTitle("CROSSCONNECT");
        frmCrossconnect4.setBounds(100, 100, 768, 600);
        frmCrossconnect4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCrossconnect4.getContentPane().setLayout(null);

        JLabel lblMember = new JLabel("     CHURCH MINISTRIES");
        lblMember.setVerticalAlignment(SwingConstants.TOP);
        lblMember.setHorizontalAlignment(SwingConstants.LEFT);
        lblMember.setForeground(new Color(105, 105, 105));
        lblMember.setBackground(new Color(0, 0, 139));
        lblMember.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblMember.setBounds(0, 0, 752, 17);
        frmCrossconnect4.getContentPane().add(lblMember);

        JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE TEMPLE OF  PENTECOST");
        lblWelcomeToThe.setForeground(new Color(0, 0, 139));
        lblWelcomeToThe.setBackground(new Color(64, 224, 208));
        lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeToThe.setBounds(0, 24, 752, 17);
        frmCrossconnect4.getContentPane().add(lblWelcomeToThe);

        JLabel lblMemId = new JLabel("Member ID: " + userid);
        lblMemId.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblMemId.setForeground(new Color(30, 144, 255));
        lblMemId.setBounds(370, 52, 120, 14);
        frmCrossconnect4.getContentPane().add(lblMemId);

        JLabel lblName = new JLabel("Name: " + username);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblName.setForeground(new Color(30, 144, 255));
        lblName.setBackground(Color.LIGHT_GRAY);
        lblName.setBounds(224, 52, 100, 14);
        frmCrossconnect4.getContentPane().add(lblName);
/*
        txtID = new JTextField();
        txtID.setBounds(442, 49, 86, 20);
        frmCrossconnect4.getContentPane().add(txtID);
        txtID.setColumns(10);

        txtName = new JTextField();
        txtName.setBounds(274, 49, 86, 20);
        frmCrossconnect4.getContentPane().add(txtName);
        txtName.setColumns(10);
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
                String[] args = null;
              //  Member.main(args);
                frmCrossconnect4.dispose();
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
        frmCrossconnect4.getContentPane().add(lblMemInfo);

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
                frmCrossconnect4.dispose();
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
        frmCrossconnect4.getContentPane().add(lblAttendance);

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
                frmCrossconnect4.dispose();
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
        frmCrossconnect4.getContentPane().add(lblEventCal);

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
                frmCrossconnect4.dispose();
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
        frmCrossconnect4.getContentPane().add(lblContribution);

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
                frmCrossconnect4.dispose();
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
        frmCrossconnect4.getContentPane().add(lblChurchDir);


        JLabel lblSelectAYear = new JLabel("Select a ministry for detailed information: ");
        lblSelectAYear.setBounds(224, 101, 236, 14);
        frmCrossconnect4.getContentPane().add(lblSelectAYear);



     /*   JButton btnBack = new JButton("BACK");
        btnBack.setForeground(new Color(0, 0, 0));
        btnBack.setBackground(new Color(30, 144, 255));
        btnBack.setBounds(261, 376, 70, 22);
        btnBack.setActionCommand("BACK");
        frmCrossconnect4.getContentPane().add(btnBack);
        btnBack.addActionListener(this);

        JButton btnForward = new JButton("FORWARD");
        btnForward.setForeground(new Color(0, 0, 0));
        btnForward.setBackground(new Color(30, 144, 255));
        btnForward.setBounds(480, 376, 70, 22);
        btnForward.setActionCommand("FORWARD");
        frmCrossconnect4.getContentPane().add(btnForward);
        btnForward.addActionListener(this);
*/
        JButton btnExit = new JButton("EXIT");
        btnExit.setForeground(new Color(0, 0, 0));
        btnExit.setBackground(new Color(30, 144, 255));
        btnExit.setBounds(377, 411, 70, 22);
        btnExit.setActionCommand("EXIT");
        frmCrossconnect4.getContentPane().add(btnExit);
        btnExit.addActionListener(this);


        JButton btnPrint = new JButton("PRINT");
        btnPrint.setForeground(new Color(0, 0, 0));
        btnPrint.setBackground(new Color(30, 144, 255));
        btnPrint.setBounds(377, 376, 70, 22);
        btnPrint.setActionCommand("PRINT");
        frmCrossconnect4.getContentPane().add(btnPrint);
        btnPrint.addActionListener(this);

        Choice choice = new Choice();
        choice.setBounds(466, 95, 131, 20);
        for(int i = 0; i < minNames.size(); i++)
        {
            choice.addItem(minNames.get(i));
        }
        choice.addItemListener(this);
        frmCrossconnect4.getContentPane().add(choice);


        txtDescription.setBounds(224, 137, 348, 219);
        txtDescription.setText(minDescriptions.get(0));
        txtDescription.setLineWrap(true);
        txtDescription.setWrapStyleWord(true);
        txtDescription.setEditable(false);
        frmCrossconnect4.getContentPane().add(txtDescription);



    }

    public void itemStateChanged(ItemEvent evt)
    {
        String iName = evt.getItem().toString();
        String iDescription = "";
        int place = 0;
        for(int i = 0; i < minNames.size(); i++)
        {
            if(minNames.get(i) == iName)
            {
                place = i;
            }
        }
        iDescription = minDescriptions.get(place);
        txtDescription.setText(iDescription);

    }

    public void actionPerformed(ActionEvent e)
    {
        if("EXIT".equals(e.getActionCommand()))
        {
            System.exit(0);
        }
        if("PRINT".equals(e.getActionCommand()))
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

        frmCrossconnect4.printAll(g);

        return PAGE_EXISTS;
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