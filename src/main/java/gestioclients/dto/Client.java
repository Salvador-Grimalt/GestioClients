/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioclients.dto;

import java.util.Date;

/**
 *
 * @author salva
 */
public class Client {
    private String nom;
    private String cognoms;
    private Date dataAlta;
    private String provincia;

    public Client(String nom, String cognoms, Date dataAlta, String provincia) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.dataAlta = dataAlta;
        this.provincia = provincia;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String[] toArrayString(){
        String[] s = new String[4];
        s[0] = nom;
        s[1] = cognoms;
        s[2] = dataAlta.toString();
        s[3] = provincia;
        return s;
    }
}
