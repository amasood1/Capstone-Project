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
import java.awt.ScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;
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

public class AdministratorMain implements ActionListener {

	JFrame frmCrossconnect6;
	private JTextField textField;
	private JTextField textField_2;
	private JLabel txtSelectAnOption;
	private Button button;
	private Button button_2;
	private Button button_4;
	private Button button_5;
	private Button button_6;
	private Button button_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorMain window = new AdministratorMain();
					window.frmCrossconnect6.setVisible(true);
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
	public AdministratorMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCrossconnect6 = new JFrame();
		frmCrossconnect6.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\amina\\Documents\\crossconnect-Recovered.png"));
		frmCrossconnect6.setBackground(new Color(255, 255, 255));
		frmCrossconnect6.getContentPane().setForeground(Color.BLUE);
		frmCrossconnect6.getContentPane().setBackground(Color.WHITE);
		frmCrossconnect6.setTitle("CROSSCONNECT");
		frmCrossconnect6.setBounds(100, 100, 768, 600);
		frmCrossconnect6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrossconnect6.getContentPane().setLayout(null);

		JLabel lblMember = new JLabel("    ADMINISTRATOR MAIN");
		lblMember.setVerticalAlignment(SwingConstants.TOP);
		lblMember.setHorizontalAlignment(SwingConstants.LEFT);
		lblMember.setForeground(Color.GRAY);
		lblMember.setBackground(new Color(0, 0, 139));
		lblMember.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMember.setBounds(0, 0, 752, 17);
		frmCrossconnect6.getContentPane().add(lblMember);

		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE TEMPLE OF  PENTECOST");
		lblWelcomeToThe.setForeground(new Color(0, 0, 139));
		lblWelcomeToThe.setBackground(Color.CYAN);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setBounds(0, 24, 752, 14);
		frmCrossconnect6.getContentPane().add(lblWelcomeToThe);

		JLabel lblNewLabel = new JLabel("Administrator ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBounds(370, 52, 114, 14);
		frmCrossconnect6.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(224, 52, 46, 14);
		frmCrossconnect6.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(494, 49, 86, 20);
		frmCrossconnect6.getContentPane().add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(274, 49, 86, 20);
		frmCrossconnect6.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		button = new Button("EXIT");
		button.setForeground(new Color(0, 0, 0));
		button.setBackground(new Color(30, 144, 255));
		button.setBounds(358, 463, 99, 23);
		frmCrossconnect6.getContentPane().add(button);
		button.addActionListener(this);

		button_2 = new Button("Member Information");
		button_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setBackground(new Color(30, 144, 255));
		button_2.setBounds(309, 145, 190, 23);
		frmCrossconnect6.getContentPane().add(button_2);
		button_2.addActionListener(this);

		button_4 = new Button("Guest Information");
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		button_4.setBackground(new Color(30, 144, 255));
		button_4.setBounds(309, 183, 190, 23);
		frmCrossconnect6.getContentPane().add(button_4);
		button_4.addActionListener(this);

		button_5 = new Button("Ministries");
		button_5.setForeground(Color.BLACK);
		button_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		button_5.setBackground(new Color(30, 144, 255));
		button_5.setBounds(309, 222, 190, 23);
		frmCrossconnect6.getContentPane().add(button_5);
		button_5.addActionListener(this);

		button_6 = new Button("Event Management");
		button_6.setForeground(Color.BLACK);
		button_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		button_6.setBackground(new Color(30, 144, 255));
		button_6.setBounds(309, 266, 190, 23);
		frmCrossconnect6.getContentPane().add(button_6);
		button_6.addActionListener(this);

		button_7 = new Button("Church Directory");
		button_7.setForeground(Color.BLACK);
		button_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		button_7.setBackground(new Color(30, 144, 255));
		button_7.setBounds(309, 310, 190, 23);
		frmCrossconnect6.getContentPane().add(button_7);
		button_7.addActionListener(this);

		txtSelectAnOption = new JLabel();
		txtSelectAnOption.setText("Select an option:");
		txtSelectAnOption.setBounds(187, 114, 114, 20);
		frmCrossconnect6.getContentPane().add(txtSelectAnOption);


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

		if(e.getSource()==button)
		{
			System.exit(0);
		}

		else if(e.getSource()==button_2)
		{
			String[] args = null;
			AdminMemberInfo.main(args);
			frmCrossconnect6.dispose();
		}
		else if(e.getSource()==button_4)
		{

			String[] args = null;
			AdminGuestInfo.main(args);
			frmCrossconnect6.dispose();
		}

		else if(e.getSource()==button_5)
		{
			String[] args = null;
			ministries.main(args);
			frmCrossconnect6.dispose();


		}
		else if(e.getSource()==button_6)
		{
			String[] args = null;
			EventSchedule.main(args);
			frmCrossconnect6.dispose();
		}
		else if(e.getSource()==button_7)
		{
			String[] args=null;
			ChurchDirectory.main(args);
			frmCrossconnect6.dispose();
		}


	}
}
