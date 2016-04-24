import java.awt.*;

import javax.swing.*;
import javax.swing.table.TableColumn;
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
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;

public class MemberContribution implements ActionListener, Printable{

    JFrame frmCrossconnect3;
    JFrame frmReport;
   // private JTextField textField;
   // private JTextField textField_2;
    JMonthChooser monthChooser = new JMonthChooser();
    JYearChooser yearChooser = new JYearChooser();
    public static String username = "";
    public static int userid = 0;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MemberContribution window = new MemberContribution();
                    window.frmCrossconnect3.setVisible(true);
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
    public MemberContribution() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmCrossconnect3 = new JFrame();
        frmCrossconnect3.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\amina\\Documents\\crossconnect-Recovered.png"));
        frmCrossconnect3.setBackground(new Color(255, 255, 255));
        frmCrossconnect3.getContentPane().setForeground(Color.BLUE);
        frmCrossconnect3.getContentPane().setBackground(Color.WHITE);
        frmCrossconnect3.setTitle("CROSSCONNECT");
        frmCrossconnect3.setBounds(100, 100, 768, 600);
        frmCrossconnect3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCrossconnect3.getContentPane().setLayout(null);

        JLabel lblMember = new JLabel("     MEMBER CONTRIBUTIONS");
        lblMember.setVerticalAlignment(SwingConstants.TOP);
        lblMember.setHorizontalAlignment(SwingConstants.LEFT);
        lblMember.setForeground(Color.GRAY);
        lblMember.setBackground(new Color(0, 0, 139));
        lblMember.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblMember.setBounds(0, 0, 752, 17);
        frmCrossconnect3.getContentPane().add(lblMember);

        JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE TEMPLE OF  PENTECOST");
        lblWelcomeToThe.setForeground(new Color(0, 0, 139));
        lblWelcomeToThe.setBackground(Color.CYAN);
        lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcomeToThe.setBounds(0, 24, 752, 14);
        frmCrossconnect3.getContentPane().add(lblWelcomeToThe);

        JLabel lblNewLabel = new JLabel("Member ID:");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setForeground(new Color(0, 0, 205));
        lblNewLabel.setBounds(370, 52, 67, 14);
        frmCrossconnect3.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Name:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setForeground(new Color(0, 0, 205));
        lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
        lblNewLabel_1.setBounds(224, 52, 46, 14);
        frmCrossconnect3.getContentPane().add(lblNewLabel_1);

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
                frmCrossconnect3.dispose();
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
        frmCrossconnect3.getContentPane().add(lblMemInfo);

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
                frmCrossconnect3.dispose();
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
        frmCrossconnect3.getContentPane().add(lblAttendance);

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
                frmCrossconnect3.dispose();
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
        frmCrossconnect3.getContentPane().add(lblEventCal);

        JLabel lblMinistry = new JLabel("Ministries");
        lblMinistry.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblMinistry.setForeground(new Color(30, 144, 255));
        lblMinistry.setBackground(Color.WHITE);
        lblMinistry.setBounds(24, 124, 144, 20);
        lblMinistry.addMouseListener(new MouseAdapter() {
            Font original;

            @Override
            public void mouseClicked(MouseEvent e) {
                String[] args = {"1234"};
                ministries.main(args);
                frmCrossconnect3.dispose();
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
        frmCrossconnect3.getContentPane().add(lblMinistry);

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
                frmCrossconnect3.dispose();
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
        frmCrossconnect3.getContentPane().add(lblChurchDir);


        JLabel lblSelectAYear = new JLabel("Select Month");
        lblSelectAYear.setBounds(224, 102, 103, 14);
        frmCrossconnect3.getContentPane().add(lblSelectAYear);



     /*   Button button = new Button("BACK");
        button.setForeground(Color.BLACK);
        button.setBackground(new Color(30, 144, 255));
        button.setBounds(307, 232, 70, 22);
        frmCrossconnect3.getContentPane().add(button);

        Button button_2 = new Button("FORWARD");
        button_2.setForeground(Color.BLACK);
        button_2.setBackground(new Color(30, 144, 255));
        button_2.setBounds(551, 232, 70, 22);
        frmCrossconnect3.getContentPane().add(button_2);
*/
        JButton btnExit = new JButton("EXIT");
        btnExit.setForeground(new Color(0, 0, 0));
        btnExit.setBackground(new Color(30, 144, 255));
        btnExit.setBounds(377, 250, 70, 22);
        btnExit.setActionCommand("EXIT");
        frmCrossconnect3.getContentPane().add(btnExit);
        btnExit.addActionListener(this);

        JLabel lblSelectAYear_1 = new JLabel("Select a year ");
        lblSelectAYear_1.setBounds(509, 102, 233, 14);
        frmCrossconnect3.getContentPane().add(lblSelectAYear_1);


        monthChooser.setBounds(300, 96, 98, 20);
        frmCrossconnect3.getContentPane().add(monthChooser);


        yearChooser.setBounds(593, 96, 47, 20);
        frmCrossconnect3.getContentPane().add(yearChooser);

        JButton btnGenReport = new JButton("GENERATE REPORT");
        btnGenReport.setForeground(Color.BLACK);
        btnGenReport.setBackground(new Color(30, 144, 255));
        btnGenReport.setBounds(337, 200, 150, 22);
        btnGenReport.setActionCommand("GENERATE");
        frmCrossconnect3.getContentPane().add(btnGenReport);
        btnGenReport.addActionListener(this);




    }

    public void actionPerformed(ActionEvent e)
    {
        if("EXIT".equals(e.getActionCommand()))
        {
            System.exit(0);
        }
        if("GENERATE".equals(e.getActionCommand()))
        {
            //JOptionPane.showMessageDialog(frmCrossconnect3, "NOT YET IMPLEMENTED");
            GenerateRoport(monthChooser.getMonth(), yearChooser.getYear());
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
       /* if("FORWARD".equals(e.getActionCommand()))
        {

        }
        if("BACK".equals(e.getActionCommand()))
        {

        }
        */
    }

    private void GenerateRoport(int month, int year)
    {
        month = month + 1;
        frmReport = new JFrame();
        frmReport.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\amina\\Documents\\crossconnect-Recovered.png"));
        frmReport.setBackground(new Color(255, 255, 255));
        frmReport.getContentPane().setForeground(Color.BLUE);
        frmReport.getContentPane().setBackground(Color.WHITE);
        frmReport.setTitle("CROSSCONNECT");
        frmReport.setBounds(100, 100, 500, 500);
        frmReport.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmReport.getContentPane().setLayout(null);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con= DriverManager.getConnection("jdbc:sqlserver://zfa6f4giy6.database.windows.net:1433;database=TOP_CC;user=CC_Admin@zfa6f4giy6;password={Cross_Connect};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30");
            Statement s=con.createStatement();
            //use s.executeQuery("SQL statement"); to execute statements on the database
            String query = "SELECT * FROM Contribution WHERE User_ID=" + 1;//userid;
            ResultSet rs = s.executeQuery(query);

            ArrayList<String> dates = new ArrayList<String>();
            ArrayList<String> don_id = new ArrayList<String>();
            ArrayList<String> description = new ArrayList<String>();
            ArrayList<String> type = new ArrayList<String>();
            System.out.println(month);
            while(rs.next())
            {
                dates.add(rs.getString("Date"));
                don_id.add(rs.getString("Donation_ID"));
            }
            for(int i = 0; i <dates.size(); i++)
            {
                //Date shown as 2016-03-27
                String check = dates.get(i);
                int checkYear = Integer.parseInt(check.substring(0, 4));
                int checkMonth = Integer.parseInt(check.substring(5,7));
                if(month!= checkMonth || year!= checkYear)
                {
                    dates.remove(i);
                    i--;
                }

            }
            for(int i = 0; i < don_id.size(); i++)
            {
                ResultSet rsd = s.executeQuery("SELECT * FROM Donation WHERE Donation_ID=" + don_id.get(i));
                while(rsd.next())
                {
                    description.add(rsd.getString("Description"));
                    type.add(rsd.getString("Donation_Type"));
                }
            }
            String data[][] = new String[dates.size()][3];
            for(int i = 0; i < dates.size(); i++)
            {
                data[i][0] = dates.get(i);
                data[i][1] = type.get(i);
                data[i][2] = description.get(i);
            }
            String[] columnNames = {"Date", "Donation Type", "Description"};
            JTable table = new JTable(data,columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setBounds(10, 30, 470, 380);
            scrollPane.setWheelScrollingEnabled(true);
            frmReport.add(scrollPane);

            JButton btnPrint = new JButton("PRINT");
            btnPrint.setForeground(new Color(0, 0, 0));
            btnPrint.setBackground(new Color(30, 144, 255));
            btnPrint.setBounds(230, 420, 70, 22);
            btnPrint.setActionCommand("PRINT");
            frmReport.getContentPane().add(btnPrint);
            btnPrint.addActionListener(this);

            frmReport.setVisible(true);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public int print(Graphics g, PageFormat pf, int page)
            throws PrinterException {
        if (page > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        frmReport.printAll(g);

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