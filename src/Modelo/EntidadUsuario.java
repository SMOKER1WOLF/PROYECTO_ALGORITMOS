/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ANTHONY
 */
public class EntidadUsuario {
    private int id;
    private String DNI;
    private String nomb;
    private String apllP;
    private String apllM;
    private String correo;
    private String psw;
    private String tlf;
    private String distrito;
    private String direccion;

    public EntidadUsuario() {
    }

    public EntidadUsuario(int id, String DNI, String nomb, String apllP, String apllM, String correo, String psw, String tlf, String distrito, String direccion) {
        this.id = id;
        this.DNI = DNI;
        this.nomb = nomb;
        this.apllP = apllP;
        this.apllM = apllM;
        this.correo = correo;
        this.psw = psw;
        this.tlf = tlf;
        this.distrito = distrito;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getApllP() {
        return apllP;
    }

    public void setApllP(String apllP) {
        this.apllP = apllP;
    }

    public String getApllM() {
        return apllM;
    }

    public void setApllM(String apllM) {
        this.apllM = apllM;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
