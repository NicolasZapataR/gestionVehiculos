package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ejecutarPrograma();
       
    }

    public static void ejecutarPrograma(){

        Empresa empresa = new Empresa("Localiza");

        Vehiculo Auto1 = new Auto("vki-775", "Hyundai", 2009, 2008, 4);
        Vehiculo Auto2 = new Auto("gfv-198", "Kia", 2022, 2021, 4);

        Vehiculo camioneta1 = new Camioneta("kdn-123", "nissan", 2015, 2015, 1500);
        Vehiculo camioneta2 = new Camioneta("sqe-150", "mazda", 2018, 2017, 2500);

      //  Vehiculo moto = new Moto("ivi-97d", "kymko", 2017, 2016, AUTOMATICA);
       // Vehiculo moto2 = new Moto("kuj-39f", "honda", 2024, 2023, MANUAL);

       empresa.agregarVehiculo(Auto1);
       empresa.agregarVehiculo(Auto2);
       empresa.agregarVehiculo(camioneta1);
       empresa.agregarVehiculo(camioneta2);
       

       Cliente cliente1 = new Cliente("Nicolas", "001", "1234", "san Diego");
       Cliente cliente2 = new Cliente("Johanna","002" , "12345", "el cielo");

       empresa.agregarCliente(cliente1);
       empresa.agregarCliente(cliente2);


       




       

       




    }


}
