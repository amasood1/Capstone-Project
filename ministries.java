import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.print.*;

public class ministries implements Printable, ActionListener, ItemListener{

    JFrame frmCrossconnect4;
    ArrayList<String> minNames = new ArrayList<>();
    ArrayList<String> minDescriptions = new ArrayList<>();
    JTextArea txtDescription = new JTextArea();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
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
        String username = "";
        int userid = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
            Statement s=con.createStatement();
            //use s.executeQuery("SQL statement"); to execute statements on the database
            String query = "SELECT * FROM Ministry";
            ResultSet rs = s.executeQuery(query);

           // userid = rs.getInt("[User_ID]");

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

        JLabel lblMemId = new JLabel("Member ID:" + userid);
        lblMemId.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblMemId.setForeground(new Color(30, 144, 255));
        lblMemId.setBounds(370, 52, 120, 14);
        frmCrossconnect4.getContentPane().add(lblMemId);

        JLabel lblName = new JLabel("Name:");
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
        JEditorPane dtrpnAttendance = new JEditorPane();
        dtrpnAttendance.setFont(new Font("Tahoma", Font.BOLD, 12));
        dtrpnAttendance.setForeground(new Color(30, 144, 255));
        dtrpnAttendance.setBackground(Color.WHITE);
        dtrpnAttendance.setText(" Member Information\r\n\r\n Attendance\r\n\r\n Event Calendar\r\n\r\n Contributions\r\n\r\n Church Directory\r\n");
        dtrpnAttendance.setBounds(24, 49, 190, 512);
        frmCrossconnect4.getContentPane().add(dtrpnAttendance);

        //this was a test of clicking a label. I'll get rid of it soon
       /* JLabel lblYo = new JLabel();
        lblYo.setText("pimpin");
        lblYo.setBounds(24,49,20,20);
        lblYo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frmCrossconnect4, "Page not yet implemented");
            }
        });
        frmCrossconnect4.getContentPane().add(lblYo);
*/

        JLabel lblSelectAYear = new JLabel("Select a ministry for detailed information: ");
        lblSelectAYear.setBounds(224, 101, 236, 14);
        frmCrossconnect4.getContentPane().add(lblSelectAYear);



        JButton btnBack = new JButton("BACK");
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
        if("FORWARD".equals(e.getActionCommand()))
        {

        }
        if("BACK".equals(e.getActionCommand()))
        {

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