package Controlador;

import Modelo.Core.Empleado;
import Modelo.EmpleadoTabbleModel;
import Modelo.XMLDom.CreadorXMLEmpleado;
import Vista.AgregarEmpleado;
import Vista.EmpleadoV;
import Vista.PantallaPrincipal;

import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Controlador {
        private EmpleadoV emV;
        private AgregarEmpleado ventaAgrega;
        private EmpleadoTabbleModel modelo_empleado;

    public Controlador() {
        this.emV = new EmpleadoV();
        this.ventaAgrega = new AgregarEmpleado();
        activaEventos();
        HashMap<String, Empleado> lista_Emp = new HashMap<>();// esto va a desaparecer cuando carguemos los empleados del xml
        Empleado emp1 =  new Empleado("7020130819","Idanny Huertas","8888-8888","1500 000","1.0");
        Empleado emp2 =  new Empleado("111111111","Rodrigo Chaves ","8888-444","1500 000","2.0");
        modelo_empleado = new EmpleadoTabbleModel();
        modelo_empleado.addEmpleado(emp1);
        modelo_empleado.addEmpleado(emp2);
        this.emV.getTable().setModel(modelo_empleado);



    }
    public void activaEventos(){
        AgregarEmpleadoEvent();
        ComfirmarAgregar();
    }
    public void AgregarEmpleadoEvent(){
        emV.getAdd().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            VisibleAgregarEmpleado();
            }
        });

    }
    public void startApplication() {
        // View the application's GUI

        PantallaPrincipal view = new PantallaPrincipal(this.emV);
        view.setVisible(true);
    }
    public static boolean guardaXMLEmpleados(TableModel model){
        EmpleadoTabbleModel modelo = (EmpleadoTabbleModel)model;
        CreadorXMLEmpleado.creaXML(modelo);
        return true;

    }
    public static EmpleadoTabbleModel buscar(String nombre,TableModel model){
        EmpleadoTabbleModel e= (EmpleadoTabbleModel) model;
        EmpleadoTabbleModel resultado= new EmpleadoTabbleModel();

        HashMap<Integer, Empleado> dos= e.getListaDeEmpleados();
        for(Map.Entry<Integer,Empleado> empleado: dos.entrySet()){
                if(empleado.getValue().getNombre().contains(nombre)){
                    resultado.addEmpleado(empleado.getValue());
                }

        }

            return resultado ;
    }
    public void VisibleAgregarEmpleado(){
            ventaAgrega.setVisible(true);
    }
    public void ComfirmarAgregar(){
        this.ventaAgrega.getAgrega().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String cedula = ventaAgrega.getCed().getText();
                String nombre = ventaAgrega.getNom().getText();
                String telefono = ventaAgrega.getTel().getText();
                String salario = ventaAgrega.getSal().getText();
                String zonaje = ventaAgrega.getZona().getText();
                Empleado temp = new Empleado(cedula,nombre,telefono,salario,zonaje);
                EmpleadoTabbleModel emp = new EmpleadoTabbleModel();
                for(Map.Entry<Integer,Empleado> em: modelo_empleado.getListaDeEmpleados().entrySet()){
                    emp.addEmpleado(em.getValue());
                }
                emp.addEmpleado(temp);
               emV.getTable().setModel(emp);
                ventaAgrega.setVisible(false);

            }
        });

    }

}
