package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Reserva{

    private Vehiculo vehiculo;
    private int dias;
    private double valor;

    private Collection <Vehiculo> listaVehiculosEnRenta;

    public Reserva(Vehiculo vehiculo, int dias, double valor){

        this.vehiculo=vehiculo;
        this.dias=dias;
        this.valor=valor;

        listaVehiculosEnRenta = new LinkedHashSet<>();

    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Collection<Vehiculo> getListaVehiculosEnRenta() {
        return listaVehiculosEnRenta;
    }

    public void setListaVehiculosEnRenta(Collection<Vehiculo> listaVehiculosEnRenta) {
        this.listaVehiculosEnRenta = listaVehiculosEnRenta;
    }

    
    
}
