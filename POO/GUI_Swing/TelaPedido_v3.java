import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JComboBox; //Dropdown
import javax.swing.JCheckBox;
//import javax.swing.*;  // importa tudo da biblioteca swing

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPedido extends JFrame{
    private JTextField txtNome, txtSabor;
    private JLabel labelResumo;
    private JComboBox<String> cbSabor;
    private JCheckBox checkBorda;

    public TelaPedido(){
        // Configurações  basicas da janela
        setTitle("Pizzaria Mario");
        setSize(500,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));

        // Cria o painel e os componentes
        JPanel painelPedido = new JPanel(new GridLayout(3,2,5,15));
        painelPedido.setBorder(BorderFactory.createEmptyBorder(20,20,10,20));

        painelPedido.add(new JLabel("Seu nome:"));
        txtNome = new JTextField();
        painelPedido.add(txtNome);

        painelPedido.add(new JLabel("Sabor da Pizza"));
        String[] opcoesSabor = {"Selecione um sabor","Pepperoni","Calabresa","Marguerita", "Frango com Catupiry"};
        cbSabor = new JComboBox<>(opcoesSabor);
        painelPedido.add(cbSabor);

        painelPedido.add(new JLabel("Adicinais:"));
        checkBorda = new JCheckBox("Borda Recheada?");
        painelPedido.add(checkBorda);

        JPanel painelBotao = new JPanel(new FlowLayout());
        JButton botaoConfirmar = new JButton("Confirmar Pedido");
        botaoConfirmar.addActionListener(e -> processarPedido()); 
        painelBotao.add(botaoConfirmar);

        // Agrupando paineis
        JPanel painelPrincipal = new JPanel(new BorderLayout());
        painelPrincipal.add(painelPedido,BorderLayout.NORTH);
        painelPrincipal.add(painelBotao,BorderLayout.CENTER);

        // Label de resumo
        labelResumo = new JLabel("Aguardando pedido...",SwingConstants.CENTER);
        labelResumo.setForeground(new Color(0,102,204)); // 0 a 255 
        labelResumo.setBorder(BorderFactory.createEmptyBorder(10,10,20,10));

        //Janela Final
        add(painelPrincipal, BorderLayout.CENTER);
        add(labelResumo, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
    }

    public void processarPedido(){
        try{
            String nome = txtNome.getText().trim();
            String sabor = txtSabor.getText().trim();

            if(nome.isEmpty() || sabor.isEmpty()){
                throw new PedidoInvalidoException("Todos os campos devem ser preenchidos");
            }
            // Sucesso
            String msg = "Pedido de "+nome+": Pizza de "+sabor;
            JOptionPane.showMessageDialog(this, "Pedido enviado com sucesso");
            labelResumo.setText("Último pedido: "+msg);
        }catch(PedidoInvalidoException e){
            JOptionPane.showConfirmDialog(this, e.getMessage(),"Erro de pedido", JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            JOptionPane.showConfirmDialog(this, e.getMessage(),"Erros nos dados", JOptionPane.ERROR_MESSAGE);
        }
    }
}

class PedidoInvalidoException extends Exception{
    public PedidoInvalidoException(String msg){
        super(msg);
    }
}
