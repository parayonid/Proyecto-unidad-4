package proyectounidad4;
import java.util.Scanner;
public class Ejemplo_Electrodomestico {
    public static void main(String[]args){
        Scanner leer= new Scanner(System.in);
Electrodomestico lav1= new Lavadora();
Electrodomestico micro1 = new Microondas();
Electrodomestico refri1 = new Refrigerador();

String[]Electrodomestico = {"la Lavadora", "el Refrigerador", "el Microondas"};
for(int i=0;i<3;i++){
    String id, marca, modelo;
    double precio;
System.out.println("Ingrese el id de "+Electrodomestico[i]);
id = leer.nextLine();
System.out.println("Ingrese la marca de "+Electrodomestico[i]);
marca = leer.nextLine();
System.out.println("Ingrese el modelo de "+Electrodomestico[i]);
modelo = leer.nextLine();
System.out.println("Ingrese el precio de "+Electrodomestico[i]);
precio = leer.nextDouble();


   switch (i) {
    case 0:
    lav1.setId(id);
    lav1.setMarca(marca);
    lav1.setModelo(modelo);
    lav1.setPrecio(precio);
    System.out.println("Ingrese la capacidad de carga");
    ((Lavadora)(lav1)).setCapacidadCarga(leer.nextInt());
    leer.nextLine();
    System.out.println("Ingrese el consumo de agua");
    ((Lavadora)(lav1)).setConsumoAgua(leer.nextFloat());
    leer.nextLine();
    System.out.println("Ingrese los ciclos de lavado");
    ((Lavadora)(lav1)).setCiclosLavado(leer.nextInt());
    leer.nextLine();

    break;
        
        
   
    case 1: 
    refri1.setId(id);
    refri1.setMarca(marca);
    refri1.setModelo(modelo);
    refri1.setPrecio(precio);
    System.out.println("Ingresa el numero de puertas");
    ((Refrigerador)(refri1)).setNoPuertas(leer.nextInt());
    leer.nextLine();
    System.out.println("Ingresa los metros cubicos");
    ((Refrigerador)(refri1)).setMetrosCubicos(leer.nextInt());
    leer.nextLine();
    System.out.println("Ingresa la capacidad en pies ");
    ((Refrigerador)(refri1)).setPiesCapacidad(leer.nextInt());
    leer.nextLine();



        break;

    case 2:
      micro1.setId(id);
    micro1.setMarca(marca);
    micro1.setModelo(modelo);
    micro1.setPrecio(precio);
    System.out.println("Ingrese la potencia");
    ((Microondas)(micro1)).setPotencia(leer.nextInt());
    leer.nextLine();
    System.out.println("Ingrese el consumo de energia");
    ((Microondas)(micro1)).setConsumodeenergia(leer.nextInt());
    leer.nextLine();
    System.out.println("Ingrese las medidas");
    ((Microondas)(micro1)).setMedidas(leer.nextLine());

        break;    
   } 
}
System.out.println(lav1.toString());
System.out.println(refri1.toString());
System.out.println(micro1.toString());



    }
}
