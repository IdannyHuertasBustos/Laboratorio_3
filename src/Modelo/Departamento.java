package Modelo;

public class Departamento {

    public Departamento() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPorcentajeDeZonaje() {
        return porcentajeDeZonaje;
    }

    public void setPorcentajeDeZonaje(String porcentajeDeZonaje) {
        this.porcentajeDeZonaje = porcentajeDeZonaje;
    }

    private int codigo;
    private String nombreCorto;
    private String direccion;
    private String porcentajeDeZonaje;


    public Departamento(int codigo, String nombreCorto, String direccion, String porcentajeDeZonaje) {
        this.codigo = codigo;
        this.nombreCorto = nombreCorto;
        this.direccion = direccion;
        this.porcentajeDeZonaje = porcentajeDeZonaje;
    }
}
