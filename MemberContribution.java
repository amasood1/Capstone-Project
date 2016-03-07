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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.ScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

public class MemberContribution {

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
		frmCrossconnect3.getContentPane().setBackground(new Color(204, 204, 204));
		frmCrossconnect3.setTitle("CROSSCONNECT");
		frmCrossconnect3.setBounds(100, 100, 768, 600);
		frmCrossconnect3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrossconnect3.getContentPane().setLayout(null);
		
		JLabel lblMember = new JLabel("     MEMBER CONTRIBUTIONS");
		lblMember.setVerticalAlignment(SwingConstants.TOP);
		lblMember.setHorizontalAlignment(SwingConstants.LEFT);
		lblMember.setForeground(Color.BLACK);
		lblMember.setBackground(new Color(0, 0, 139));
		lblMember.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMember.setBounds(0, 0, 752, 17);
		frmCrossconnect3.getContentPane().add(lblMember);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE TEMPLE OF  PENTECOST");
		lblWelcomeToThe.setForeground(new Color(0, 0, 139));
		lblWelcomeToThe.setBackground(Color.CYAN);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 15));
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
		
		textField = new JTextField();
		textField.setBounds(442, 49, 86, 20);
		frmCrossconnect3.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(274, 49, 86, 20);
		frmCrossconnect3.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JEditorPane dtrpnAttendance = new JEditorPane();
		dtrpnAttendance.setFont(new Font("Tahoma", Font.BOLD, 12));
		dtrpnAttendance.setForeground(new Color(255, 255, 255));
		dtrpnAttendance.setBackground(new Color(0, 191, 255));
		dtrpnAttendance.setText(" Member Information\r\n\r\n Attendance\r\n\r\n Event Calendar\r\n\r\n Ministries\r\n\r\n Church Directory\r\n");
		dtrpnAttendance.setBounds(24, 49, 190, 512);
		frmCrossconnect3.getContentPane().add(dtrpnAttendance);
		
		JLabel lblSelectAYear = new JLabel("Select Month");
		lblSelectAYear.setBounds(224, 102, 103, 14);
		frmCrossconnect3.getContentPane().add(lblSelectAYear);
		
		
		
		Button button = new Button("BACK");
		button.setBounds(307, 232, 70, 22);
		frmCrossconnect3.getContentPane().add(button);
		
		Button button_2 = new Button("FORWARD");
		button_2.setBounds(551, 232, 70, 22);
		frmCrossconnect3.getContentPane().add(button_2);
		
		Button button_3 = new Button("EXIT");
		button_3.setBounds(426, 273, 70, 22);
		frmCrossconnect3.getContentPane().add(button_3);
		
		JLabel lblSelectAYear_1 = new JLabel("Select a year ");
		lblSelectAYear_1.setBounds(509, 102, 233, 14);
		frmCrossconnect3.getContentPane().add(lblSelectAYear_1);
		
		JMonthChooser monthChooser = new JMonthChooser();
		monthChooser.setBounds(300, 96, 98, 20);
		frmCrossconnect3.getContentPane().add(monthChooser);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(593, 96, 47, 20);
		frmCrossconnect3.getContentPane().add(yearChooser);
		
		Button button_1 = new Button("GENERATE REPORT");
		button_1.setBounds(411, 232, 103, 22);
		frmCrossconnect3.getContentPane().add(button_1);
		
				
		
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
