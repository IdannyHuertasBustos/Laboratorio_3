package Modelo.XMLDom;

import Modelo.Core.Empleado;
import Modelo.EmpleadoTabbleModel;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Map;

public class CreadorXMLEmpleado {
    public static final String xmlFilePath = "Empleados.xml";
       public static  void creaXML(EmpleadoTabbleModel modelo){
          try {
            File myfile = new File(xmlFilePath);
            myfile.delete();
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
              Element root = document.createElement("Empleados");
              document.appendChild(root);
              for(Map.Entry<Integer, Empleado> empleado: modelo.getListaDeEmpleados().entrySet()){
                  // employee element
                  Element employee = document.createElement("Empleado");
                  Empleado emp = empleado.getValue();
                  root.appendChild(employee);

                  // set an attribute to staff element
                  Attr attr = document.createAttribute("cedula");
                  attr.setValue(emp.getCedula());
                  employee.setAttributeNode(attr);

                  //you can also use staff.setAttribute("id", "1") for this

                  // firstname element
                  Element nombre = document.createElement("nombre");
                  nombre.appendChild(document.createTextNode(emp.getNombre()));
                  employee.appendChild(nombre);

                  // lastname element
                  Element telefono = document.createElement("telefono");
                  telefono.appendChild(document.createTextNode(emp.getTelefono()));
                  employee.appendChild(telefono);

                  // email element
                  Element salario = document.createElement("salario");
                  salario.appendChild(document.createTextNode(emp.getSalario_base()));
                  employee.appendChild(salario);

                  // department elements
                  Element zonaje = document.createElement("Zonaje");
                  zonaje.appendChild(document.createTextNode(emp.getZonaje()));
                  employee.appendChild(zonaje);
              }


            // create the xml file
            //transform the DOM Object to an XML File
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));

            // If you use
            // StreamResult result = new StreamResult(System.out);
            // the output will be pushed to the standard output ...
            // You can use that for debugging

            transformer.transform(domSource, streamResult);

            System.out.println("Done creating XML File");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
