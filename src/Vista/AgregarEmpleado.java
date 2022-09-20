package Vista;

import javax.swing.*;
import java.awt.*;

public class AgregarEmpleado extends JFrame {
     private JPanel VentanaAgregar;

    public AgregarEmpleado() throws HeadlessException {

        super("Agregar Empleado");
        VentanaAgregar = new JPanel();
        this.setSize(new Dimension(800,800));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(VentanaAgregar);
        this.getContentPane().setLayout(new GridLayout(6,2));
        cedula = new JLabel("Cedula");
        VentanaAgregar.add(cedula);
        ced = new JTextField();
        ced.setPreferredSize(new Dimension(70,30));
        VentanaAgregar.add(ced);
         nombre = new JLabel("Nombre");
        VentanaAgregar.add(nombre);
        nom = new JTextField();
        nom.setPreferredSize(new Dimension(70,30));
        VentanaAgregar.add(nom);
        telefono = new JLabel("Telefono");
        VentanaAgregar.add(telefono);
        tel = new JTextField();
        tel.setPreferredSize(new Dimension(70,30));
        VentanaAgregar.add(tel);
        salario = new JLabel("Salario");
        VentanaAgregar.add(salario);
        sal = new JTextField();
        sal.setPreferredSize(new Dimension(70,30));
        VentanaAgregar.add(sal);
        zonaje = new JLabel("Zonaje");
        VentanaAgregar.add(zonaje);
        zona = new JTextField();
        zona.setPreferredSize(new Dimension(70,30));
        VentanaAgregar.add(zona);
        agrega =new JButton("Agregar");
        cancelar = new JButton("Cancelar");
        VentanaAgregar.add(agrega);
        VentanaAgregar.add(cancelar);

    }

    public JPanel getVentanaAgregar() {
        return VentanaAgregar;
    }

    public void setVentanaAgregar(JPanel ventanaAgregar) {
        VentanaAgregar = ventanaAgregar;
    }

    public static JLabel getCedula() {
        return cedula;
    }

    public static void setCedula(JLabel cedula) {
        AgregarEmpleado.cedula = cedula;
    }

    public static JLabel getNombre() {
        return nombre;
    }

    public static void setNombre(JLabel nombre) {
        AgregarEmpleado.nombre = nombre;
    }

    public static JLabel getTelefono() {
        return telefono;
    }

    public static void setTelefono(JLabel telefono) {
        AgregarEmpleado.telefono = telefono;
    }

    public static JLabel getSalario() {
        return salario;
    }

    public static void setSalario(JLabel salario) {
        AgregarEmpleado.salario = salario;
    }

    public static JLabel getZonaje() {
        return zonaje;
    }

    public static void setZonaje(JLabel zonaje) {
        AgregarEmpleado.zonaje = zonaje;
    }

    public static JTextField getCed() {
        return ced;
    }

    public static void setCed(JTextField ced) {
        AgregarEmpleado.ced = ced;
    }

    public static JTextField getNom() {
        return nom;
    }

    public static void setNom(JTextField nom) {
        AgregarEmpleado.nom = nom;
    }

    public static JTextField getTel() {
        return tel;
    }

    public static void setTel(JTextField tel) {
        AgregarEmpleado.tel = tel;
    }

    public static JTextField getSal() {
        return sal;
    }

    public static void setSal(JTextField sal) {
        AgregarEmpleado.sal = sal;
    }

    public static JTextField getZona() {
        return zona;
    }

    public static void setZona(JTextField zona) {
        AgregarEmpleado.zona = zona;
    }

    public static JButton getAgrega() {
        return agrega;
    }
    public static void setAgrega(JButton agrega) {
        AgregarEmpleado.agrega = agrega;
    }

    public static JButton getCancelar() {
        return cancelar;
    }

    public static void setCancelar(JButton cancelar) {
        AgregarEmpleado.cancelar = cancelar;
    }

    private static JButton agrega;
     private static JButton cancelar;
     private static JLabel cedula;
    private static JLabel nombre;
    private static JLabel telefono;
    private static JLabel salario;
    private static JLabel zonaje;
    private static JTextField ced;
    private static JTextField nom;
    private static JTextField tel;
    private static JTextField sal;
    private static JTextField zona;




}
