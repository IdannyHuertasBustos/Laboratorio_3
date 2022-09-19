package Vista;

import Controlador.Controlador;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpleadoV extends JPanel {

    public EmpleadoV(TableModel model){
        JPanel datos = new JPanel();
        datos.add(new JLabel("Nombre"));
        JTextField text = new JTextField();
        text.setPreferredSize(new Dimension(40 ,50));
        datos.add(text);
        JButton search = new JButton("Buscar");
        datos.add(search);

        JButton add = new JButton("Agregar");
        datos.add(add);
        JButton edit = new JButton("Editar");
        datos.add(edit);
        JButton save = new JButton("Guardar");
        datos.add(save);
        datos.setLayout(new GridLayout(2,3));
        this.setLayout(new BorderLayout());
        JTable table = new JTable(model);
        this.add(datos,BorderLayout.NORTH);
        this.add(new JScrollPane(table), BorderLayout.CENTER);
        search.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 table.setModel( Controlador.buscar(text.getText(),table.getModel()));
            }
        });
        save.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Controlador.guardaXMLEmpleados(table.getModel());
            }
        });
    }


}
