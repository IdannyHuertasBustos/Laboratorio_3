package Modelo.Core;

public class Empleado {
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(String salario_base) {
        this.salario_base = salario_base;
    }

    public String getZonaje() {
        return zonaje;
    }

    public void setZonaje(String zonaje) {
        this.zonaje = zonaje;
    }

    private  String  cedula;
    private String nombre;
    private String telefono;
    private  String salario_base;

    private String zonaje;

    public Empleado(String cedula, String nombre, String telefono, String salario_base,String zonaje) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario_base = salario_base;
        this.zonaje = zonaje;
    }


       /* public double Salario_Total(){

    }*/

}