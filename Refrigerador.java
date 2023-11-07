package proyectounidad4;


    public class Refrigerador extends Electrodomestico implements Gama {

    private int NoPuertas;
    private int MetrosCubicos;
    private int PiesCapacidad;

    public Refrigerador() {
        super();
        NoPuertas = 0;
        MetrosCubicos = 0;
        PiesCapacidad = 0;

    }

    public Refrigerador(int NoPuertas, int MetrosCubicos, int PiesCapacidad,String id, String marca, String modelo, double precio) {
        super(id,marca,modelo,precio);
        this.NoPuertas = NoPuertas;
        this.MetrosCubicos = MetrosCubicos;
        this.PiesCapacidad = PiesCapacidad;
    }

    public int getNoPuertas() {
        return NoPuertas;
    }

    public void setNoPuertas(int NoPuertas) {
        this.NoPuertas = NoPuertas;
    }

    public int getMetrosCubicos() {
        return MetrosCubicos;
    }

    public void setMetrosCubicos(int MetrosCubicos) {
        this.MetrosCubicos = MetrosCubicos;
    }

    public int getPiesCapacidad() {
        return PiesCapacidad;
    }

    public void setPiesCapacidad(int PiesCapacidad) {
        this.PiesCapacidad = PiesCapacidad;
    }

    @Override
    public String toString() {
        return "\nElectrodomestico tipo refrigerador: "+super.toString()+ "Numero de puertas" + NoPuertas + "\nMetros Cubicos"+ MetrosCubicos +"\nNumero de Pies y Capacidad" + PiesCapacidad+"\nTipo de Gama:" +TipoGama();
    }

    @Override
    public String TipoGama() {
        if (NoPuertas == 2 && MetrosCubicos <= 10) {
            return "Baja";

        } else if (NoPuertas == 2 && MetrosCubicos <= 13) {
            return "Media";
        } else {
            return "Alta";
        }
    }

}

