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
import javax.swing.JTextArea;

public class ChurchDirectory {

	JFrame frmCrossconnect5;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		JLabel lblNewLabel = new JLabel("Member ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBounds(370, 52, 67, 14);
		frmCrossconnect5.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(224, 52, 46, 14);
		frmCrossconnect5.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(442, 49, 86, 20);
		frmCrossconnect5.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(274, 49, 86, 20);
		frmCrossconnect5.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JEditorPane dtrpnAttendance = new JEditorPane();
		dtrpnAttendance.setFont(new Font("Tahoma", Font.BOLD, 12));
		dtrpnAttendance.setForeground(new Color(30, 144, 255));
		dtrpnAttendance.setBackground(Color.WHITE);
		dtrpnAttendance.setText(" Member Information\r\n\r\n Attendance\r\n\r\n Event Calendar\r\n\r\n Contributions\r\n\r\n Ministries\r\n");
		dtrpnAttendance.setBounds(24, 49, 190, 512);
		frmCrossconnect5.getContentPane().add(dtrpnAttendance);
		
		
		
		Button button = new Button("BACK");
		button.setForeground(new Color(0, 0, 0));
		button.setBackground(new Color(30, 144, 255));
		button.setBounds(274, 462, 70, 22);
		frmCrossconnect5.getContentPane().add(button);
		
		Button button_3 = new Button("EXIT");
		button_3.setForeground(new Color(0, 0, 0));
		button_3.setBackground(new Color(30, 144, 255));
		button_3.setBounds(473, 462, 70, 22);
		frmCrossconnect5.getContentPane().add(button_3);
		
		
		
		Button button_1 = new Button("SEND E-MAIL");
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setBackground(new Color(30, 144, 255));
		button_1.setBounds(362, 462, 86, 22);
		frmCrossconnect5.getContentPane().add(button_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(234, 121, 348, 325);
		frmCrossconnect5.getContentPane().add(textArea);
		
		JLabel lblChurchcontactsDirectory = new JLabel("Church Contacts Directory");
		lblChurchcontactsDirectory.setBounds(234, 96, 161, 14);
		frmCrossconnect5.getContentPane().add(lblChurchcontactsDirectory);
		
				
		
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
