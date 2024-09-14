package application;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Calculadora1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResultado;

	
	
	private JTextField txtMemoria;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora1 frame = new Calculadora1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	int operacao,aux, p;
	double valor1, valor2,valor3, resultado = 0;
	boolean setBoto = true;
	/**
	 * Create the frame.
	 */
	public Calculadora1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 480);
		setLocationRelativeTo(null);
		setTitle("Calculadora Padrão");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(0, 0, 0));
		
		AbstractAction actionEsc = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);

			}
			
		};
		
		txtMemoria = new JTextField();
		txtMemoria.setBackground(new Color(255, 255, 255));
		txtMemoria.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMemoria.setEditable(false);
		txtMemoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMemoria.setColumns(10);
		txtMemoria.setBorder(null);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setText("0");
		txtResultado.setBorder(null);
		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		
		JButton button0 = new JButton("0");
		button0.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction action0 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 button0.doClick();

			}
			
		};
		
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtResultado.getText().equals("0")) {
					 txtResultado.setText("0");
					 } else {
					 txtResultado.setText(txtResultado.getText() + "0");
					 }
			}
		});
		
		JButton button1 = new JButton("1");
		button1.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction action1 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 button1.doClick();

			}
			
		};
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (txtMemoria.getText().contains("=")) {
					 txtMemoria.setText("");
					 txtResultado.setText("");
					 }
					 if (txtResultado.getText().equals("0")) {
					 txtResultado.setText("1");
					 } else {
					 txtResultado.setText(txtResultado.getText() + "1");
					 }
			}
		});
		
		JButton button2 = new JButton("2");
		button2.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction action2 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 button2.doClick();

			}
			
		};
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMemoria.getText().contains("=")) {
					txtMemoria.setText("");
					 txtResultado.setText("");
					 }

					 if (txtResultado.getText().equals("0")) {
					 txtResultado.setText("2");
					 } else {
					 txtResultado.setText(txtResultado.getText() + "2");
					 }

			}
		});
		
		JButton button3 = new JButton("3");
		button3.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction action3 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 button3.doClick();

			}
			
		};
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMemoria.getText().contains("=")) {
					 txtMemoria.setText("");
					 txtResultado.setText("");
					 }

					 if (txtResultado.getText().equals("0")) {
					 txtResultado.setText("3");
					 } else {
					 txtResultado.setText(txtResultado.getText() + "3");
					 }

			}
		});
		
		JButton button4 = new JButton("4");
		button4.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction action4 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				 button4.doClick();

			}
			
		};
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMemoria.getText().contains("=")) {
					 txtMemoria.setText("");
					 txtResultado.setText("");
					 }

					 if (txtResultado.getText().equals("0")) {
					 txtResultado.setText("4");
					 } else {
					 txtResultado.setText(txtResultado.getText() + "4");
					 }

			}
		});
		
		JButton button5 = new JButton("5");
		button5.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction action5 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				button5.doClick();
			}
			
		};
		
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMemoria.getText().contains("=")) {
					 txtMemoria.setText("");
					 txtResultado.setText("");
					 }

					 if (txtResultado.getText().equals("0")) {
					 txtResultado.setText("5");
					 } else {
					 txtResultado.setText(txtResultado.getText() + "5");
					 }

			}
		});
		
		JButton button6 = new JButton("6");
		button6.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction action6 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				button6.doClick();
			}
			
		};
		
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMemoria.getText().contains("=")) {
					 txtMemoria.setText("");
					 txtResultado.setText("");
					 }

					 if (txtResultado.getText().equals("0")) {
					 txtResultado.setText("6");
					 } else {
					 txtResultado.setText(txtResultado.getText() + "6");
					 }

			}
		});
		
		
		JButton button7 = new JButton("7");
		button7.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction action7 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				button7.doClick();

			}
			
		};
		
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMemoria.getText().contains("=")) {
					 txtMemoria.setText("");
					 txtResultado.setText("");
					 }

					 if (txtResultado.getText().equals("0")) {
					 txtResultado.setText("7");
					 } else {
					 txtResultado.setText(txtResultado.getText() + "7");
					 }
			}
		});
		
		JButton button8 = new JButton("8");
		button8.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction action8 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button8.doClick();
			}
			
		};
		
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMemoria.getText().contains("=")) {
					 txtMemoria.setText("");
					 txtResultado.setText("");
					 }

					 if (txtResultado.getText().equals("0")) {
					 txtResultado.setText("8");
					 } else {
					 txtResultado.setText(txtResultado.getText() + "8");
					 }

			}
		});
		
		JButton button9 = new JButton("9");
		button9.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction action9 = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				button9.doClick();
			}
			
		};
		
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMemoria.getText().contains("=")) {
					 txtMemoria.setText("");
					 txtResultado.setText("");
					 }

					 if (txtResultado.getText().equals("0")) {
					 txtResultado.setText("9");
					 } else {
					 txtResultado.setText(txtResultado.getText() + "9");
					 }
			}
		});
		
		JButton buttonPont = new JButton(".");
		buttonPont.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		buttonPont.setVerticalAlignment(SwingConstants.TOP);
		buttonPont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtResultado.getText().contains(".")) {
					 txtResultado.setText(txtResultado.getText() + ".");
				}}
		});
		
		JButton buttonMM = new JButton("+/_");
		buttonMM.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		buttonMM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor3 = -Math.abs(Double.parseDouble(txtResultado.getText()));
		        txtResultado.setText(formatarNumero(valor3));
			}
		});
		
		JButton buttonSoma = new JButton("+");
		buttonSoma.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction actionMais = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buttonSoma.doClick();
			}
			
		};
		
		buttonSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 operacao = 1;
				 valor1 = Double.parseDouble(txtResultado.getText());
				 txtResultado.setText("0");
				 txtMemoria.setText(formatarNumero(valor1) + " + ");
				 p = 0;
			}
		});
		
		JButton buttonSub = new JButton("-");
		buttonSub.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction actionSub = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buttonSub.doClick();
			}
			
		};
		
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = 2;
				valor1 = Double.parseDouble(txtResultado.getText());
				 txtResultado.setText("0");
				 txtMemoria.setText(formatarNumero(valor1) + " - ");
				 p = 0;
			}
		});
		
		JButton buttonMult = new JButton("X"); //Botão de vezes
		buttonMult.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction actionX = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buttonMult.doClick();
			}
			
		};
		
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = 3;
				 valor1 = Double.parseDouble(txtResultado.getText());
				 txtResultado.setText("0");
				 txtMemoria.setText(formatarNumero(valor1) + " * ");
				 p = 0;
			}
		});
		
		JButton buttonDivisao = new JButton("\u00F7");
		buttonDivisao.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction actionDiv = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buttonDivisao.doClick();
			}
			
		};
		
		buttonDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 operacao = 4;
				 valor1 = Double.parseDouble(txtResultado.getText());
				 txtResultado.setText("0");
				 txtMemoria.setText(formatarNumero(valor1) + " / ");
				 p = 0;
			}
		});
		
		JButton buttonPorcentagem = new JButton("%");
		
		buttonPorcentagem.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction actionPer = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				buttonPorcentagem.doClick();

			}
			
		};
		
		buttonPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(valor1 == 0) {
					txtResultado.setText("0");
					txtMemoria.setText("0");
				}else if(valor1>0) {
					aux = operacao;
					operacao = 5;
					valor3 = Double.parseDouble(txtResultado.getText());
					if(aux == 4) {
						if(valor3 == 0) {
							txtResultado.setText("0");
							txtMemoria.setText(txtMemoria.getText()+txtResultado.getText());
						}else if(valor3 < 0) {
							double c = -(valor3/100);
							txtResultado.setText(formatarNumero(c));
							txtMemoria.setText(txtMemoria.getText()+txtResultado.getText());
						}else {
							double c = valor3/100;
							txtResultado.setText(formatarNumero(c));
							txtMemoria.setText(txtMemoria.getText()+txtResultado.getText());
						}	
					}else if(aux ==3) {
						double c = valor3/100;
						txtResultado.setText(formatarNumero(c));
						txtMemoria.setText(txtMemoria.getText()+txtResultado.getText());
					}else if(aux < 3 && aux > 0) {
						double c = valor1*(valor3/100);
						txtResultado.setText(formatarNumero(c));
						txtMemoria.setText(txtMemoria.getText()+txtResultado.getText());
					}
				}
				
			}
		});
		
		p = 0;
		
		JButton buttonIgual = new JButton("=");
		buttonIgual.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction actionEnter = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buttonIgual.doClick();
			}
			
		};
		
		AbstractAction actionIgual = new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonIgual.doClick();
			}
			
		};
		
		buttonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p == 0) {
					valor2 = Double.parseDouble(txtResultado.getText());
					
					 p++;
					 System.out.println(p);
				 }else {
					 valor1 = Double.parseDouble(txtResultado.getText());
				 }
				
				 if (operacao == 1) { //soma
					 txtMemoria.setText(txtMemoria.getText() + formatarNumero(valor2) + " = ");
					 resultado = valor1 + valor2;
					 txtResultado.setText(formatarNumero(resultado));
				 } else if (operacao == 2) { //subtração
					 txtMemoria.setText(txtMemoria.getText() + formatarNumero(valor2) + " = ");
					 resultado = valor1 - valor2;
					 txtResultado.setText(formatarNumero(resultado));
				 } else if (operacao == 3) { //multiplicação
					 txtMemoria.setText(txtMemoria.getText() + formatarNumero(valor2) + " = ");
				 resultado = valor1 * valor2;
				 txtResultado.setText(formatarNumero(resultado));
				 } else if (operacao == 4) { //divisão
					 txtMemoria.setText(txtMemoria.getText() + formatarNumero(valor2) + " = ");
					 if (valor2 != 0) {
						 resultado = valor1 / valor2;
						 txtResultado.setText(formatarNumero(resultado));
					 }else {
					 JOptionPane.showMessageDialog(null, "Não pode dividir por zero!", "Erro",
						JOptionPane.WARNING_MESSAGE);
				 }
				 }else if(operacao == 5) {
					 txtMemoria.setText(txtMemoria.getText() + " = ");
					 if(aux == 1) {
					 resultado = valor1 + valor2;
					 txtResultado.setText(formatarNumero(resultado));
					 }else if(aux == 2) {
						 resultado = valor1 - valor2;
						 txtResultado.setText(formatarNumero(resultado));
					 }else if(aux == 3) {
						 resultado = valor1 * valor2;
						 txtResultado.setText(formatarNumero(resultado));
					 }else if(aux == 4) {
						 if (valor2 != 0) {
							 resultado = valor1 / valor2;
							 txtResultado.setText(formatarNumero(resultado));
							 } else {
							 JOptionPane.showMessageDialog(null, "Não pode dividir por zero!", "Erro",
							JOptionPane.WARNING_MESSAGE);
							 }
					 }
				 }
				 else{ //Caso só tenha um valor "EX: 5= ... 5"
					 resultado = Double.parseDouble(txtResultado.getText());
					 txtMemoria.setText(formatarNumero(resultado) + "=");
					 if (txtMemoria.getText().contains("=")) {
						 	System.out.println("Cai no if");
						 }
				 }
				 
				 resultado = 0;
				 }	
		});
		
		JButton buttonLimpVisor = new JButton("CE");
		buttonLimpVisor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonLimpVisor.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		buttonLimpVisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("0");			}
		});
		
		
		JButton buttonApagarNum = new JButton("←");
		buttonApagarNum.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		buttonApagarNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtResultado.getText();
				if(text != "0") {
					if(text.length() > 1) {
						txtResultado.setText(text.substring(0, text.length() - 1));
					}else {
						txtResultado.setText("0");
					}
				}
		}
		});
		
		JButton buttonNulo = new JButton("↓");
		buttonNulo.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		buttonNulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Esse botão não tem funcionalidade");
			}
		});
		
		JButton buttonPow = new JButton("X\u00B2");
		buttonPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor3 = Double.parseDouble(txtResultado.getText());
				valor1 = Math.pow(valor3,2);
				txtMemoria.setText("sqt("+formatarNumero(valor3)+")");
				txtResultado.setText(formatarNumero(valor1));
				valor3 = 0;
			}
		});
		
		JButton buttonRaiz = new JButton("\u221A");
		buttonRaiz.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		buttonRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor3 = Double.parseDouble(txtResultado.getText());
				if(valor3 > 0) {
				valor1 = Math.sqrt(valor3);
				txtMemoria.setText("√("+formatarNumero(valor3)+")");
				txtResultado.setText(formatarNumero(valor1));
				valor3 =0;
				}else {
					txtMemoria.setText("√("+formatarNumero(valor3)+")");
					txtResultado.setText("Entrada Invalida!!");
					valor3 =0;
					button0.setEnabled(false);
					button1.setEnabled(false);
					button2.setEnabled(false);
					button3.setEnabled(false);
					button4.setEnabled(false);
					button5.setEnabled(false);
					button6.setEnabled(false);
					button7.setEnabled(false);
					button8.setEnabled(false);
					button9.setEnabled(false);
					buttonSub.setEnabled(false);
					buttonMult.setEnabled(false);
					buttonSoma.setEnabled(false);
					buttonIgual.setEnabled(false);
					buttonPont.setEnabled(false);
					buttonMM.setEnabled(false);
					buttonLimpVisor.setEnabled(false);
					buttonPorcentagem.setEnabled(false);
					buttonApagarNum.setEnabled(false);
					buttonPow.setEnabled(false);
					buttonRaiz.setEnabled(false);
					buttonDivisao.setEnabled(false);
					setBoto = false;
				}
				
			}
		});
		
		JButton buttonLimpMemoria = new JButton("C");
		buttonLimpMemoria.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		AbstractAction actionC = new AbstractAction() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buttonLimpMemoria.doClick();
			}
			
		};
		buttonLimpMemoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("0");
				txtMemoria.setText("");
				valor1 = 0;
				valor2 = 0;
				valor3 = 0;
				resultado = 0;
				operacao = 0;
				if(setBoto == false) {
					button0.setEnabled(true);
					button1.setEnabled(true);
					button2.setEnabled(true);
					button3.setEnabled(true);
					button4.setEnabled(true);
					button5.setEnabled(true);
					button6.setEnabled(true);
					button7.setEnabled(true);
					button8.setEnabled(true);
					button9.setEnabled(true);
					buttonSub.setEnabled(true);
					buttonMult.setEnabled(true);
					buttonSoma.setEnabled(true);
					buttonIgual.setEnabled(true);
					buttonPont.setEnabled(true);
					buttonMM.setEnabled(true);
					buttonLimpVisor.setEnabled(true);
					buttonPorcentagem.setEnabled(true);
					buttonApagarNum.setEnabled(true);
					buttonPow.setEnabled(true);
					buttonRaiz.setEnabled(true);
					buttonDivisao.setEnabled(true);
				}
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, 0, 0, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)))
					.addGap(467))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(46, 118, 58));
		panel_1_3.setOpaque(false);
		
		buttonPont.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		button0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		buttonIgual.setForeground(new Color(0, 0, 0));
		buttonIgual.setBackground(new Color(133, 196, 241));
		
		buttonIgual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		buttonMM.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_panel_1_3 = new GroupLayout(panel_1_3);
		gl_panel_1_3.setHorizontalGroup(
			gl_panel_1_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1_3.createSequentialGroup()
					.addComponent(buttonMM, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
					.addGap(16)
					.addComponent(button0, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addComponent(buttonPont, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(buttonIgual, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(3))
		);
		gl_panel_1_3.setVerticalGroup(
			gl_panel_1_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_3.createSequentialGroup()
					.addGroup(gl_panel_1_3.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonMM, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
						.addGroup(gl_panel_1_3.createSequentialGroup()
							.addGap(2)
							.addComponent(buttonIgual))
						.addComponent(buttonPont)
						.addGroup(gl_panel_1_3.createSequentialGroup()
							.addGap(1)
							.addComponent(button0)))
					.addContainerGap())
		);
		panel_1_3.setLayout(gl_panel_1_3);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(48, 118, 38));
		panel_2_1.setOpaque(false);
		buttonPow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		buttonRaiz.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		buttonDivisao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		buttonPow.setBorder(new LineBorder(new Color(214, 214, 214), 3, true));
		buttonNulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addComponent(buttonNulo, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(buttonPow, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(buttonRaiz, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(buttonDivisao, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(buttonDivisao, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(buttonRaiz))
						.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(buttonNulo, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(buttonPow)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2_1.setLayout(gl_panel_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(48, 118, 38));
		panel_2.setOpaque(false);
		buttonLimpMemoria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonPorcentagem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		buttonApagarNum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(buttonPorcentagem, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addComponent(buttonLimpVisor, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(buttonLimpMemoria, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(buttonApagarNum, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(14))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonPorcentagem, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonApagarNum)
						.addComponent(buttonLimpMemoria, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(buttonLimpVisor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(46, 118, 58));
		panel_1_2.setOpaque(false);
		
		button1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		button2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(46, 118, 58));
		panel_1_1.setOpaque(false);
		
		button4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		button5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 118, 58));
		panel_1.setOpaque(false);
		
		button7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		button8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		button9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		buttonMult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addComponent(button7, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button8, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addComponent(button9, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(buttonMult, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(button7)
						.addComponent(buttonMult)
						.addComponent(button9)
						.addComponent(button8))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		button6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonSub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
		gl_panel_1_1.setHorizontalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addComponent(button4, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addComponent(button5, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addComponent(button6, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(buttonSub, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(2))
		);
		gl_panel_1_1.setVerticalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(button4)
						.addComponent(button5)
						.addComponent(button6)
						.addComponent(buttonSub))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1_1.setLayout(gl_panel_1_1);
		button3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		buttonSoma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_panel_1_2 = new GroupLayout(panel_1_2);
		gl_panel_1_2.setHorizontalGroup(
			gl_panel_1_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addComponent(button2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addComponent(button3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(buttonSoma, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(2))
		);
		gl_panel_1_2.setVerticalGroup(
			gl_panel_1_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addGroup(gl_panel_1_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(buttonSoma, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
						.addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_1_2.setLayout(gl_panel_1_2);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1_2, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1_3, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(2)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_1_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
		);
		panel_3.setLayout(gl_panel_3);
		
		txtResultado.setEditable(false);
		txtResultado.setBackground(new Color(255, 255, 255));
		txtResultado.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtResultado, Alignment.LEADING)
						.addComponent(txtMemoria, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(txtMemoria, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtResultado, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		//Comando para mapear o teclado no painel
		InputMap inputMap = panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//Comando para identificar a tecla apertada no teclado
		inputMap.put(KeyStroke.getKeyStroke("pressed 0"), "0_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("pressed 1"), "1_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("pressed 2"), "2_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("pressed 3"), "3_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("pressed 4"), "4_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("pressed 5"), "5_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("pressed 6"), "6_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("pressed 7"), "7_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("pressed 8"), "8_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("pressed 9"), "9_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("pressed C"), "C_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("shift EQUALS"), "plusAction");
		inputMap.put(KeyStroke.getKeyStroke("MINUS"), "minusAction");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH, 0), "slashAction");
		inputMap.put(KeyStroke.getKeyStroke("pressed X"), "X_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke("shift 5"), "percentAction");
		inputMap.put(KeyStroke.getKeyStroke("ENTER"), "ENTER_PRESSED");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, 0), "equalsAction");
		inputMap.put(KeyStroke.getKeyStroke("ESCAPE"), "ESC_PRESSED");
		//Comando para pegar ações no Painel
		ActionMap actionMap = panel.getActionMap();
		//Comando para identificar qual ação é e chamala
		actionMap.put("0_PRESSED", action0);
		actionMap.put("1_PRESSED", action1);
		actionMap.put("2_PRESSED", action2);
		actionMap.put("3_PRESSED", action3);
		actionMap.put("4_PRESSED", action4);
		actionMap.put("5_PRESSED", action5);
		actionMap.put("6_PRESSED", action6);
		actionMap.put("7_PRESSED", action7);
		actionMap.put("8_PRESSED", action8);
		actionMap.put("9_PRESSED", action9);
		actionMap.put("C_PRESSED", actionC);
		actionMap.put("plusAction", actionMais);
		actionMap.put("minusAction", actionSub);
		actionMap.put("slashAction", actionDiv);
		actionMap.put("X_PRESSED", actionX);
		actionMap.put("percentAction", actionPer);
		actionMap.put("ENTER_PRESSED", actionEnter);
		actionMap.put("equalsAction", actionIgual);
		actionMap.put("ESC_PRESSED", actionEsc);

	}
	public static String formatarNumero(double numero) {
		 if (numero == (int) numero) {
		 // Se o número é inteiro (não tem parte fracionária)
		 return String.format("%d", (int) numero);
		 } else {
		 // Se o número tem parte fracionária, exibe como está
		 return String.format("%s", numero);
		 }
	}
	
}
