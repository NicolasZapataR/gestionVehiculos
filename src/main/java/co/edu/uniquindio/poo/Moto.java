package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    
    private Enum TipoCaja;

    public Moto(String placa, String marca, int modelo,int añoFabricacion, Enum tipoCaja){
        super(placa, marca, modelo, añoFabricacion);

        this.TipoCaja = TipoCaja;
    }

    public Enum getTipoCaja() {
        return TipoCaja;
    }

    public void setTipoCaja(Enum tipoCaja) {
        TipoCaja = tipoCaja;
    }

    
    
    
    public double calcularCostoRenta(int dias, double tarifaBase){

        tarifaBase=60000;
        double valor = 0;

        valor =(dias*tarifaBase );

        if(TipoCaja==TipoCaja.AUTOMATICA){
            valor=(dias*tarifaBase) + 10000 ;
        }

        return valor;





    }

    

}
