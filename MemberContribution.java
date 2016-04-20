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
import java.awt.Button;
import java.awt.font.TextAttribute;
import java.util.Map;

import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;

public class MemberContribution implements ActionListener{

    JFrame frmCrossconnect3;
    private JTextField textField;
    private JTextField textField_2;

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
                //  MemberAttendance.main(args);
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
                String[] args = {"chris"};
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

        JMonthChooser monthChooser = new JMonthChooser();
        monthChooser.setBounds(300, 96, 98, 20);
        frmCrossconnect3.getContentPane().add(monthChooser);

        JYearChooser yearChooser = new JYearChooser();
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
            JOptionPane.showMessageDialog(frmCrossconnect3, "NOT YET IMPLEMENTED");
        }
       /* if("FORWARD".equals(e.getActionCommand()))
        {

        }
        if("BACK".equals(e.getActionCommand()))
        {

        }
        */
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