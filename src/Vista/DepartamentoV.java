package Vista;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class DepartamentoV  extends JPanel{
    public DepartamentoV(){
        CardLayout g= new CardLayout();
        this.setLayout(g);
        JPanel p1= new JPanel();
        JPanel p2= new JPanel();
        JLabel nom=new JLabel("Nombre:");
        JTextField ingreso= new JTextField();
        ingreso.setPreferredSize(new Dimension(60,30));
        JButton buscar=new JButton("Buscar");
        JButton agregar=new JButton("Agregar");
        JButton editar=new JButton("Editar");
        p1.add(nom);
        p1.add(ingreso);
        p1.add(buscar);
        p1.add(agregar);
        p1.add(editar);
        JTable table = new JTable();
        p2.add(table);
        this.add("Fist",p1);
        this.add("Second",p2);




    }



}
