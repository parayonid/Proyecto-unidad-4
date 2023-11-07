package proyectounidad4;

public class Microondas extends Electrodomestico implements Gama  {
private int Potencia;
private int Consumodeenergia;
private String Medidas;
Microondas(){
    super();
    this.Potencia = 0;
    this.Consumodeenergia = 0;
    this.Medidas = "";

}
Microondas(int Potencia, int Consumodeenergia, String Medidas, String id, String marca, String modelo, double precio){
    super(id, marca, modelo, precio);
    this.Potencia= Potencia;
    this.Consumodeenergia = Consumodeenergia;
    this.Medidas= Medidas;

}
public int getPotencia(){
    return Potencia;
}
public void setPotencia(int Potencia){
    this.Potencia = Potencia;
}
public int getConsumodeenergia(){
    return Consumodeenergia;
}
public void setConsumodeenergia(int Consumodeenergia){
    this.Consumodeenergia = Consumodeenergia;
}
public String getMedidas(){
    return Medidas;
}
public void setMedidas(String Medidas){
    this.Medidas = Medidas;
}
public String TipoGama(){
if(Potencia < 1000){
    return "baja";
}else if(Potencia<=1500){
    return "media";

}else{
   return "alta";

}

    }
@Override
public String toString(){
    return "\nElectrodomestico tipo microondas: "
    +super.toString()+
    "Potencia: " + Potencia + 
    "\nConsumo de energia: " + Consumodeenergia + 
    "\nMedidas: " + Medidas+
    "\nTipo de gama: " +TipoGama();

    
}
}


