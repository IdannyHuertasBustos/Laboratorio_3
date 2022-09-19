package Controlador;

import Modelo.Core.Empleado;
import Modelo.EmpleadoTabbleModel;
import Modelo.XMLDom.CreadorXMLEmpleado;
import Vista.PantallaPrincipal;

import javax.swing.table.TableModel;
import java.util.HashMap;
import java.util.Map;

public class Controlador {

    public void startApplication() {
        // View the application's GUI

        HashMap<String, Empleado> lista_Emp = new HashMap<>();
        Empleado emp1 =  new Empleado("7020130819","Idanny Huertas","8888-8888","1500 000","1.0");
        Empleado emp2 =  new Empleado("111111111","Rodrigo Chaves ","8888-444","1500 000","2.0");
        EmpleadoTabbleModel modelo_empleado = new EmpleadoTabbleModel();
        modelo_empleado.addEmpleado(emp1);
        modelo_empleado.addEmpleado(emp2);
        PantallaPrincipal view = new PantallaPrincipal(modelo_empleado);
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
}
