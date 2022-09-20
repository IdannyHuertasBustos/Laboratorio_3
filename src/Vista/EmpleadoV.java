package Vista;

import Controlador.Controlador;
import Modelo.EmpleadoTabbleModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpleadoV extends JPanel {
    private JTable table;

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public EmpleadoTabbleModel getModel() {
        return model;
    }

    public void setModel(EmpleadoTabbleModel model) {
        this.model = model;
    }

    private EmpleadoTabbleModel model;
    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    private JButton add;
    public EmpleadoV(){
        model = new EmpleadoTabbleModel();
        JPanel datos = new JPanel();
        datos.add(new JLabel("Nombre"));
        JTextField text = new JTextField();
        text.setPreferredSize(new Dimension(40 ,50));
        datos.add(text);
        JButton search = new JButton("Buscar");
        datos.add(search);

         add = new JButton("Agregar");
        datos.add(add);
        JButton edit = new JButton("Editar");
        datos.add(edit);
        JButton save = new JButton("Guardar");
        datos.add(save);
        datos.setLayout(new GridLayout(2,3));
        this.setLayout(new BorderLayout());
        table = new JTable(this.model);
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
