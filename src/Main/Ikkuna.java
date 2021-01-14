package Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ikkuna {

	private JFrame Frame;
	private JTextField txtNimi;
	private JTextField txtIkä;
	
	
	ArrayList<String> tiedot = new ArrayList<String>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ikkuna window = new Ikkuna();
					window.Frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ikkuna() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Frame = new JFrame();
		Frame.setTitle("Varausj\u00E4rjestelm\u00E4");
		Frame.setBounds(100, 100, 495, 339);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Varausj\u00E4rjestelm\u00E4");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 26));
		lblNewLabel.setBounds(104, 11, 266, 33);
		Frame.getContentPane().add(lblNewLabel);
		
		
		/**
		 * 
		 * Varaajan nimi
		 * 
		 */
		
		
		txtNimi = new JTextField();
		txtNimi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nimi = txtNimi.getText();
				tiedot.add("\n" + "Nimi: " + nimi);
			}
		});
		
		txtNimi.setBounds(62, 185, 79, 20);
		Frame.getContentPane().add(txtNimi);
		txtNimi.setColumns(10);
		
		
		
		/**
		 * 
		 * Mink� lipun haluaa varata
		 * 
		 */
		
		
		JLabel lblNewLabel_1 = new JLabel("Lippujen m\u00E4\u00E4r\u00E4");	
		lblNewLabel_1.setBounds(121, 55, 106, 14);
		Frame.getContentPane().add(lblNewLabel_1);
		
		
		JRadioButton Elokuva = new JRadioButton("Elokuvalippu");
		Elokuva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String liput = "Elokuva";
				tiedot.add("Valittu lippu: " + liput + "\r");
			}
		});
		Elokuva.setBounds(6, 51, 109, 23);
		Frame.getContentPane().add(Elokuva);
		
		
		JRadioButton Lento = new JRadioButton("Lentolippu");
		Lento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String liput = "Lento";
				tiedot.add("Valittu lippu: " + liput + "\r");
			}
		});
		Lento.setBounds(6, 77, 109, 23);
		Frame.getContentPane().add(Lento);
		
		
		JRadioButton Juna = new JRadioButton("Junalippu");
		Juna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String liput = "Juna";
				tiedot.add("Valittu lippu: " + liput + "\r");
			}
		});
		Juna.setBounds(6, 103, 109, 23);
		Frame.getContentPane().add(Juna);
		
		
		JRadioButton Teatteri = new JRadioButton("Teatterilippu");
		Teatteri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String liput = "Teatteri";
				tiedot.add("Valittu lippu: " + liput + "\r");
			}	
		});
		Teatteri.setBounds(6, 128, 109, 23);
		Frame.getContentPane().add(Teatteri);
		
		
		ButtonGroup mikäLippu = new ButtonGroup();
		mikäLippu.add(Elokuva);
		mikäLippu.add(Lento);
		mikäLippu.add(Juna);
		mikäLippu.add(Teatteri);
		
		
		
		/**
		 * 
		 * Kuinka monta lippua haluaa.
		 * 
		 */
		
	
		
		JSlider slider = new JSlider();	
		slider.setBackground(UIManager.getColor("Button.background"));
		slider.setMinimum(1);
		slider.setMaximum(5);
		slider.setMinorTickSpacing(1);
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setSnapToTicks(true);
		
		
		
		slider.addChangeListener(new ChangeListener() {
			private boolean valueIsAdjusting() {
		        return slider.getValueIsAdjusting();
		    }
			public void stateChanged(ChangeEvent e) {
				int maara = slider.getValue();
				
				if (!valueIsAdjusting()) tiedot.add("Lippujen määrä: " + maara);
			}
		});		
		
		slider.setBounds(139, 80, 31, 84);
		Frame.getContentPane().add(slider);
		
		
		
		
		
		JLabel label = new JLabel("5");
		label.setBounds(129, 81, 12, 14);
		Frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("1");
		label_1.setBounds(129, 147, 12, 14);
		Frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nimi");
		lblNewLabel_2.setBounds(15, 188, 31, 14);
		Frame.getContentPane().add(lblNewLabel_2);
		
		
		/**
		 * 
		 * Varaajan ik�.
		 * 
		 */
		
		
		txtIkä = new JTextField();
		txtIkä.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ika = txtIkä.getText();
				tiedot.add("Ikä: " + ika + "\n");
			}
		});
		  
		
		
		txtIkä.setBounds(62, 216, 79, 20);
		Frame.getContentPane().add(txtIkä);
		txtIkä.setColumns(10);
		
		
		
		JLabel lblIk = new JLabel("Ik\u00E4");
		lblIk.setBounds(15, 219, 31, 14);
		Frame.getContentPane().add(lblIk);
		
		
		
		
		
		JTextArea TulostaVaraukset = new JTextArea();
		TulostaVaraukset.setBounds(195, 167, 250, 97);
		Frame.getContentPane().add(TulostaVaraukset);
		
		JLabel lblVarauksenTiedot = new JLabel("Varauksen Tiedot");
		lblVarauksenTiedot.setBounds(270, 132, 141, 14);
		Frame.getContentPane().add(lblVarauksenTiedot);
		
		
		/**
		 * 
		 * Tekee asiakkaasta premium jäsenyyden.
		 * 
		 */
		
		
		JRadioButton VipLippu = new JRadioButton("Vip Lippu");
		VipLippu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiedot.add("\n" + "Premium asiakas");
				
			}
		});
		
		
		VipLippu.setBounds(233, 51, 109, 23);
		Frame.getContentPane().add(VipLippu);
		
		
		/**
		 * 
		 * Tulostaa tallennetut tiedot.
		 */
		
		
		JRadioButton TulostaTiedot = new JRadioButton("N\u00E4yt\u00E4 Tallennetut tiedot");
		TulostaTiedot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
	            TulostaVaraukset.setText(""+ tiedot);
			}
		});
		TulostaTiedot.setBounds(233, 77, 195, 23);
		Frame.getContentPane().add(TulostaTiedot);
		
		
		/**
		 * 
		 * Sulkee sovelluksen.
		 */
		
		
		JRadioButton Lopeta = new JRadioButton("Lopeta");
		Lopeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.dispatchEvent(new WindowEvent(Frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		Lopeta.setBounds(233, 103, 109, 23);
		Frame.getContentPane().add(Lopeta);
		
		ButtonGroup lopetus = new ButtonGroup();
		lopetus.add(Lopeta);
		lopetus.add(TulostaTiedot);
	}
}
