/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author brecinosm
 */
public class Cliente extends Persona {
    
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    @Override
    protected String [] crear(){
    
        String datos[] = new String [6];
        datos[0] = getNit();
        datos[1] = getNombres();
        datos[2] = getApellidos();
        datos[3] = getDireccion();
        datos[4] = getTelefono();
        datos[5] = getFecha_nacimiento();
        
        return datos;
        
    }       
}
