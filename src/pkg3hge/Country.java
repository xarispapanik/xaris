/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3hge;

/**
 *
 * @author kstam
 */
public class Country {
    private String Name;
    private String ISOcode;


    public Country(String Name, String ISOcode) {
        this.Name = Name;
        this.ISOcode = ISOcode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getISOcode() {
        return ISOcode;
    }

    public void setISOcode(String ISOcode) {
        this.ISOcode = ISOcode;
    }
    
}
