package Dev;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

public class Framer extends JFrame {

	int god_num = 0;

	JFrame bigFrame;

	JMenuBar mBar;

	// 1 Menu
	JMenu menu;

	// MenuItem-1
	JMenuItem open;
	JMenuItem close;

	JPanel low = new JPanel();

	JButton rice;
	JButton light;
	JButton shower;
	JButton dong;
	JButton play;
	JButton medi;
	JButton setting;

	JPanel left = new JPanel();

	JTextArea display;
    JScrollPane scroll;
    
	TitledBorder title;
	JTextArea textArea;

	int energy_i = 0;
	int hungry_i = 1000;
	int active_i = 0;
	int dirty_i = 1000;
	int smart_i = 0;
	int sick_i = 1000;
	int happy_i = 1000;

	String content = "청    결: " + dirty_i + "/1000\n포만감 : " + hungry_i
			+ "/1000\n활동성 : " + active_i + "/1000\n지    식 : " + smart_i
			+ "/1000\n체    력 : " + energy_i + "/1000\n건    강 : " + sick_i
			+ "/1000\n기    분 : " + happy_i + "/1000";

	JLayeredPane center = new JLayeredPane();
	// JPanel center = new JPanel();

	ArrayList ilist = new ArrayList<Image>();

//	Image backgroundImage = Toolkit.getDefaultToolkit().getImage(
	//		"C:/Users/Ohdokeun/Desktop/img/back.jpg");
	Image backgroundImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/back.jpg");
	Image happyDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/happy_dog.png");
	Image babDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/bab_dog.png");
	Image dongDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/dong_dog.png");
	Image goodDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/good_dog.png");
	Image hakDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/hak_dog.png");
	Image hungryDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/hungry_dog.png");
	Image zzzDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/zzz_dog.png");
	Image yakDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/yak_dog.png");
	Image sickDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/sick_dog.png");
	Image loveDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/love_dog.png");
	Image handDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/hand_dog.png");
	Image gaDogImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/ga_dog.png");
	Image panImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/dogback.jpg");
	Image dongImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/dong1.png");
	Image activeImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/active.jpg");
	Image smartImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/smart.jpg");
	Image skullImage = Toolkit.getDefaultToolkit().getImage(
			"C:/Users/Ohdokeun/Desktop/img/skull.png");

	JPanel frontp2;

	JFrame ricejFrame = new JFrame("밥");
	JFrame playJFrame = new JFrame("놀이");

	JPanel ddong = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(dongImage, 0, 0, 100, 100, this);
		}
	};

	public Framer(String title) {
		super(title);

		bigstruct();
		menu();
		action();
		button();
		scene();
		data();
	}

	public void bigstruct() {

		low.setLayout(new FlowLayout());
		// center.setLayout();
		// left.setLayout();

	}

	public void menu() {

		mBar = new JMenuBar();
		menu = new JMenu("File");

		open = new JMenuItem("Open");
		close = new JMenuItem("Exit");

		menu.add(open);
		menu.addSeparator();
		menu.add(close);

		mBar.add(menu);

		setJMenuBar(mBar);
	}

	// do action field
	public void action() {

		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.print("close");

			}
		}); // example menuitem action

	}

	public void button() {
		rice = new JButton(new ImageIcon(
				"C:/Users/Ohdokeun/Desktop/img/eat.png"));
		light = new JButton(new ImageIcon(
				"C:/Users/Ohdokeun/Desktop/img/light.png"));
		shower = new JButton(new ImageIcon(
				"C:/Users/Ohdokeun/Desktop/img/shower.png"));
		dong = new JButton(new ImageIcon(
				"C:/Users/Ohdokeun/Desktop/img/dong.png"));
		play = new JButton(new ImageIcon(
				"C:/Users/Ohdokeun/Desktop/img/play.png"));
		medi = new JButton(new ImageIcon(
				"C:/Users/Ohdokeun/Desktop/img/medi.png"));
		setting = new JButton(new ImageIcon(
				"C:/Users/Ohdokeun/Desktop/img/setting.png"));

		rice.setBorderPainted(false);
		light.setBorderPainted(false);
		shower.setBorderPainted(false);
		dong.setBorderPainted(false);
		play.setBorderPainted(false);
		medi.setBorderPainted(false);
		setting.setBorderPainted(false);

		low.setBorder(BorderFactory.createLineBorder(Color.black, 3));

		low.add(rice);
		low.add(light);
		low.add(shower);
		low.add(dong);
		low.add(play);
		low.add(medi);
		low.add(setting);

		rice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

				// TODO Auto-generated method stub
				JPanel eatJPanel = new JPanel();
				eatJPanel.setLayout(new FlowLayout());
				JButton lemon = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/lemon.png"));
				JButton chicken = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/chicken.png"));
				JButton noddle = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/noddle.png"));
				JButton cho = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/cho.png"));
				JButton coke = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/coke.png"));
				JButton pizza = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/pizza.png"));

				eatJPanel.add(lemon);
				eatJPanel.add(chicken);
				eatJPanel.add(noddle);
				eatJPanel.add(cho);
				eatJPanel.add(coke);
				eatJPanel.add(pizza);

				lemon.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						eat(20, 50);

					}
				});

				chicken.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						eat(20, 50);

					}
				});

				noddle.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						eat(20, 50);
					}
				});

				cho.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						eat(20, 50);
					}
				});
				coke.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						eat(20, 50);
					}
				});
				pizza.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						eat(20, 50);
					}
				});

				ricejFrame.add(eatJPanel);
				ricejFrame.setSize(250, 350);
				ricejFrame.setLocationRelativeTo(null);
				ricejFrame.setVisible(true);

			}
		});

		light.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				god_num++;
				scene();
//				active_i+=500;
			//	display.setText("testsdfsafasfafafdafa");
			}
		});

		shower.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				changeImage(gaDogImage);
				dirty_i += 500;
				if (dirty_i > 1000) {
					dirty_i = 1000;
				}
				textArea.setText(content);
//				smart_i+=500;
			}
		});

		dong.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				dirty_i += 50;
				if (dirty_i > 1000) {
					dirty_i = 1000;
				}
				textArea.setText(content);
				ddong.setVisible(false);

			}
		});
		play.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

				JPanel playJPanel = new JPanel();
				playJPanel.setLayout(new FlowLayout());
				JButton base = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/base.png"));
				JButton bike = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/bike.png"));
				JButton run = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/run.png"));
				JButton tennis = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/tennis.png"));
				JButton com = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/com.png"));
				JButton work = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/work.png"));
				JButton science = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/science.png"));
				JButton apha = new JButton(new ImageIcon(
						"C:/Users/Ohdokeun/Desktop/img/apha.png"));

				playJPanel.add(base);
				playJPanel.add(bike);
				playJPanel.add(run);
				playJPanel.add(tennis);
				playJPanel.add(com);
				playJPanel.add(work);
				playJPanel.add(science);
				playJPanel.add(apha);

				base.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						workPlay(1, 100, 1, 100);
					}
				});

				bike.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						workPlay(1, 50, 3, 100);

					}
				});

				run.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						workPlay(1, 30, 4, 100);
					}
				});

				tennis.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						workPlay(1, 70, 2, 100);
					}
				});
				com.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						workPlay(0, 40, 2, 100);
					}
				});
				work.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						workPlay(0, 50, 1, 100);
					}
				});
				science.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						workPlay(0, 20, 3, 100);
					}
				});
				apha.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						workPlay(0, 10, 5, 100);

					}
				});

				playJFrame.add(playJPanel);
				playJFrame.setSize(250, 400);
				playJFrame.setLocationRelativeTo(null);
				playJFrame.setVisible(true);
			}
		});
		medi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				sick_i += 300;
				textArea.setText(content);
			}
		});

		setting.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

				JFrame pop = new JFrame("설정");
				pop.setSize(300, 300);
				pop.setLocationRelativeTo(null);
				pop.setVisible(true);

				/*
				 * ClearTextArea pop1 = new ClearTextArea(); pop1.setSize( 300,
				 * 300 ); pop1.setLocationRelativeTo( null ); pop1.setVisible(
				 * true );
				 */
			}
		});
	}

	public void paintComponent(Graphics page) {
		super.paintComponents(page);
		page.drawImage(panImage, 0, 0, null);
	}

	public void data() {

		display = new JTextArea ( 10, 5 );
//		display.setText("dfsf\nsfsdf\n\ndsfsd\n\n\n\n\n\nsfsfd\n\n\n\n\n\n\n\nsdsdsfs");
	    display.setEditable ( false ); // set textArea non-editable
	    Font font1 = new Font("Serif", Font.BOLD,15);
		display.setFont(font1);
	    scroll = new JScrollPane ( display );
	    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
	    
		textArea = new JTextArea(5, 5);
		textArea.setText(content);
		// textArea.setSelectionColor(Color.BLUE);
		textArea.setBounds(3, 3, 300, 200);
		textArea.setEditable(false);

		Font font = new Font("Serif", Font.BOLD, 18);
		textArea.setFont(font);
		textArea.setForeground(Color.blue);
		textArea.setOpaque(false);

		left.add(textArea);
		left.add(scroll);
		
		TitledBorder title = BorderFactory.createTitledBorder("Status");
		left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
		left.setBorder(title);
		JButton apha = new JButton(new ImageIcon(
				"C:/Users/Ohdokeun/Desktop/img/apha.png"));

		// left.setBorder(BorderFactory.createLineBorder(Color.black,3));
		// left.setOpaque(false);
		// left.setVisible(false);
	}

	public void scene() {

		// ilist.add(backgroundImage);
		// 1.행복한 개
		ilist.add(happyDogImage);
		// 2.밥 달라는 개
		ilist.add(babDogImage);
		// 3. 똥 싸는 개
		ilist.add(dongDogImage);
		// 4. 기분 좋은 개
		ilist.add(goodDogImage);
		// 5. 헥헥 개
		ilist.add(hakDogImage);
		// 6. 배고픈 개
		ilist.add(hungryDogImage);
		// 7. 잠자는 개
		ilist.add(zzzDogImage);
		// 8. 약올리는 개
		ilist.add(yakDogImage);
		// 9. 아픈 개
		ilist.add(sickDogImage);
		// 10. 사랑스러운 개
		ilist.add(loveDogImage);
		// 11. 손 하는 개
		ilist.add(handDogImage);
		// 12. 옆모습 개
		ilist.add(gaDogImage);

		JPanel firpage = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(backgroundImage, 0, 0, 750, 500, this);

			}
		};

		frontp2 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage((Image) ilist.get(god_num), 0, 0, 300, 300, this);
			}
		};

		firpage.setBounds(0, 0, 800, 800);
		frontp2.setBounds(180, 130, 500, 480);
		// ddong.setBounds(val, 250, 150, 150);
		// ddong.setVisible(true);

		JProgressBar bar = new JProgressBar();

		center.add(firpage, new Integer(1));
		center.add(frontp2, new Integer(2));
		// center.add(ddong, new Integer(2));
		add(center);

	}

	public void eat(int energy, int hungry) {
		energy_i = energy_i + energy;
		hungry_i = hungry_i + hungry;
		if (hungry_i > 1000) {

			hungry_i = 1000;
		}
		if (energy_i > 1000) {

			energy_i = 1000;
		}
		textArea.setText(content);
		god_num = 4;
		scene();
		// ricejFrame.dispose();
		// setDefaultCloseOperation(ricejFrame.EXIT_ON_CLOSE);
	}

	public void workPlay(int par, int happy, int move, int energy) {
		
		
		int nos = 0;
		if ((energy_i - energy) < 0) {
			nos = 1;
			System.out.println("체력부족");
			display.setText("체력이 부족합니다.");
		}
		if (nos == 0) {
			energy_i -= energy;

			if (par == 0) {
				smart_i += move;
			} else if (par == 1) {
				active_i += move;

			}

			happy_i += happy;
			textArea.setText(content);
		}
	}

	public void changeImage(final Image img) {

		frontp2 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(img, 0, 0, 300, 300, this);
			}
		};
		frontp2.setBounds(180, 130, 500, 480);
		center.add(frontp2, new Integer(2));
		add(center);
	}

}