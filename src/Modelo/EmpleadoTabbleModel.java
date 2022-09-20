package Modelo;

import Modelo.Core.Empleado;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.HashMap;
import java.util.LinkedList;

public class EmpleadoTabbleModel implements TableModel {
    private HashMap<Integer, Empleado> ListaDeEmpleados;
    private int numeroEmpleados;
    private LinkedList Listen;

    public EmpleadoTabbleModel( HashMap<Integer, Empleado> emp) {
        this.ListaDeEmpleados = emp;
        this.numeroEmpleados = 0;
        this.Listen = new LinkedList();
    }
    public EmpleadoTabbleModel() {
        this.ListaDeEmpleados = new HashMap<Integer, Empleado>();
        this.numeroEmpleados = this.ListaDeEmpleados.size();
        this.Listen = new LinkedList();
    }

    @Override
    public int getRowCount() {
        return this.ListaDeEmpleados.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Cedula";
            case 1:
                return "Nombre";
            case 2:
                return "Telefono";
            case 3:
                return "Salario Base";
            case 4:
                return "Zonaje";
            default:
                return "error";

        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            default:
                return String.class;

        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado e1;
        e1 = (Empleado) ListaDeEmpleados.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return e1.getCedula();
            case 1:
                return e1.getNombre();
            case 2:
                return e1.getTelefono();
            case 3:
                return e1.getSalario_base();
            case 4:
                return e1.getZonaje();
            default:
                return null;

        }


    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Empleado e1;
        e1 = (Empleado) ListaDeEmpleados.get(rowIndex);
        switch (columnIndex) {
            case 0:
                e1.setCedula((String) aValue);
            case 1:
                e1.setNombre((String) aValue);
            case 2:
                e1.setTelefono((String) aValue);
            case 3:
                e1.setSalario_base((String) aValue);
            case 4:
                e1.setZonaje((String) aValue);
            default:
                break;

        }
        TableModelEvent event = new TableModelEvent(this,rowIndex,rowIndex,columnIndex);
        agregaListe(event);
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
            this.Listen.add(l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
            this.Listen.remove(l);
    }

    public void agregaListe(TableModelEvent e){

        for(int i=0; i<Listen.size();i++){
            ((TableModelListener)Listen.get(i)).tableChanged(e);

        }

    }
    public void addEmpleado(Empleado em){
            ListaDeEmpleados.put(this.numeroEmpleados++,em);
            TableModelEvent e= new TableModelEvent(this,this.getColumnCount()-1,this.getColumnCount()-1,TableModelEvent.ALL_COLUMNS,TableModelEvent.INSERT);
            this.Listen.add(e);

    }

    public HashMap<Integer, Empleado> getListaDeEmpleados() {
        return ListaDeEmpleados;
    }

    public void setListaDeEmpleados(HashMap<Integer, Empleado> listaDeEmpleados) {
        ListaDeEmpleados = listaDeEmpleados;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public LinkedList getListen() {
        return Listen;
    }

    public void setListen(LinkedList listen) {
        Listen = listen;
    }


}