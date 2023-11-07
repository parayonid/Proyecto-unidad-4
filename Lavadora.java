package proyectounidad4;

public class Lavadora extends Electrodomestico implements Gama{
    private int capacidadCarga;
    private float consumoAgua;
    private int ciclosLavado;

    public Lavadora() {
        super();
        capacidadCarga = 0;
        consumoAgua = 0;
        ciclosLavado = 0;
    }

    public Lavadora(int capacidadCarga, float consumoAgua, int ciclosLavado, String id, String marca, String modelo, double precio) {
        super(id, marca, modelo, precio);
        this.capacidadCarga = capacidadCarga; 
        this.consumoAgua = consumoAgua;
        this.ciclosLavado = ciclosLavado;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public float getConsumoAgua() {
        return consumoAgua;
    }

    public void setConsumoAgua(float consumoAgua) {
        this.consumoAgua = consumoAgua;
    }

    public int getCiclosLavado() {
        return ciclosLavado;
    }

    public void setCiclosLavado(int ciclosLavado) {
        this.ciclosLavado = ciclosLavado;
    }

    @Override
    public String toString() {
        return "\nElectrodomestico tipo lavadora: " + 
                "\n"+super.toString()+
                "\nCapacidad de carga: " + capacidadCarga + 
                "\nConsumo de agua: " + consumoAgua + 
                "\nCiclos de lavado: " + ciclosLavado+
                "\nTipo de gama: "+TipoGama();
    }

    @Override
    public String TipoGama() {
        if(capacidadCarga <=10 && ciclosLavado <=3){
            return "baja";
        }else if(capacidadCarga<=15 || ciclosLavado <=5){
            return "media";
        }else{
            return "alta";
        }
    }
    
    
    
}