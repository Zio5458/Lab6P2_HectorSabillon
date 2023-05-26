
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hdann
 */
public class obj_Hogar extends Objeto {
    
    private String lugar;
    private String instrucciones;
    private int garantia;

    public obj_Hogar(String lugar, String instrucciones, int garantia, Color color, String desc, String marca, String tam, Personal persona) {
        super(color, desc, marca, tam, persona);
        this.lugar = lugar;
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public Personal getPersona() {
        return persona;
    }

    public void setPersona(Personal persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "obj_Hogar{" + "lugar=" + lugar + ", instrucciones=" + instrucciones + ", garantia=" + garantia + '}';
    }
    
    
    
}
