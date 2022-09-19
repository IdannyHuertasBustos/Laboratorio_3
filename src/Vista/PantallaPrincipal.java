package Vista;

import javax.swing.*;
import javax.swing.table.TableModel;

public class PantallaPrincipal extends JFrame{

    private JPanel empleado;
    public PantallaPrincipal(TableModel empleados) {

        // Create and set up the window.
        super("Laboratorio3");

        // Display the window.
        this.setSize(500, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set grid layout for the frame


        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        // add tab with title
       tabbedPane.addTab("Empleado", new EmpleadoV(empleados));

        // add tab with title and icon
        Icon icon = new ImageIcon("icon.gif");
        //tabbedPane.addTab("Departamento", icon, new);
        tabbedPane.addTab("Departamento", new DepartamentoV());
        // add tab with title, icon and tooltip
        String tooltip = "This is a tab";
        tabbedPane.addTab("Acerca de:", icon, new JLabel("This is tab 3"), tooltip);



        this.getContentPane().add(tabbedPane);

    }
}