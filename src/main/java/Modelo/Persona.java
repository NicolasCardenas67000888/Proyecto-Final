/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mikev_6wadxan
 */
public class Persona {
    private String nom,tel,correo;

    public Persona(String nom, String tel, String correo) {
        this.nom = nom;
        this.tel = tel;
        this.correo = correo;
    }
    public Persona(){
        this.nom="";
        this.tel="";
        this.correo="";
        
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return   "\n Nombre:" + nom + "\n Telefono:" + tel + "\n Correo:" + correo ;
    }
    
    
    
}
