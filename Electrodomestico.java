package proyectounidad4;

public class Electrodomestico {
    private String id;
    private String marca;
    private String modelo;
    private double precio;

    public Electrodomestico() {
        id = "sin id";
        marca = "sin marca";
        modelo = "sin modelo";
        precio = 0;
    }

    public Electrodomestico(String id, String marca, String modelo, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "Id: " + id + 
                "\nMarca: " + marca + 
                "\nModelo: " + modelo + 
                "\nPrecio: " + precio;
    }
    
}