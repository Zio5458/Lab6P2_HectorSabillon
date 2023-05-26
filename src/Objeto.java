
import java.awt.Color;


public class Objeto {
    
    protected Color color;
    protected String desc;
    protected String marca;
    protected String tam;
    protected Personal persona;

    public Objeto(Color color, String desc, String marca, String tam, Personal persona) {
        this.color = color;
        this.desc = desc;
        this.marca = marca;
        this.tam = tam;
        this.persona = persona;
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
        return marca + " - " + tam;
    }
    
    
    
}
