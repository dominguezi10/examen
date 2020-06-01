/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import Adapter.Carro;
import Adapter.CarroAdapter;
import Adapter.CarroAutomatico;
import Adapter.CarroMecanico;
import Builder.CasaBuilder;
import Builder.CasaModerna;
import Builder.CasaTradicional;
import Builder.ConstruccionDirector;
import Factory.Prenda;
import Factory.Talla;
import Factory.Tienda;
import Factory.Tipo;
import Observer.Noticiero;
import Observer.Subcriptor;
import Singleton.BaseMilitar;
import Singleton.Comando;
import State.Clima;
import State.Frio;
import State.LLuvioso;
import State.Nublado;
import State.Soleado;
import State.State;

/**
 *
 * @author Ingrid
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-----> Ejemplo Singleton <-----");
        System.out.println("Caso de Uso: BASE MILITAR");
        BaseMilitar base = BaseMilitar.getInstance();
        base.toString();
        //comando de las base Militar
        
        base.AgregarComando("Comando Sur", 1523, "Florida", "Hérnan Córtes");
        base.AgregarComando("Comando Unificado", 4101, "New Mexico", "Andres Sierra");
        base.AgregarComando("Comando Central", 6357, "Houston", "Angel Godoy");
        System.out.println("");
        base.Comandos();
        
        
        System.out.println("\n-----> Ejemplo Factory <-----");
        System.out.println("-->Caso de Uso: Fabrica de Ropa");
        Prenda prenda1  = new Tienda().CrearPrenda(Tipo.Blusa, Talla.S);  
        Prenda prenda2  = new Tienda().CrearPrenda(Tipo.Camisa_Formal, Talla.L);
        Prenda prenda3  = new Tienda().CrearPrenda(Tipo.Falda, Talla.S);
        Prenda prenda4  = new Tienda().CrearPrenda(Tipo.Pantalon, Talla.M);
        Prenda prenda5  = new Tienda().CrearPrenda(Tipo.Short, Talla.X);
        Prenda prenda6  = new Tienda().CrearPrenda(Tipo.Vestido, Talla.X);
        System.out.println("Prendas creadas:");
        System.out.println(prenda1.Salida());
        System.out.println(prenda2.Salida());
        System.out.println(prenda3.Salida());
        System.out.println(prenda4.Salida());
        System.out.println(prenda5.Salida());
        System.out.println(prenda6.Salida());
        
        System.out.println("\n-----> Ejemplo Builder <-----");
        System.out.println("Caso de Uso: Constructora - Casas");
        ConstruccionDirector director = new ConstruccionDirector();
        CasaBuilder tradicional = new CasaTradicional();
        CasaBuilder moderna = new CasaModerna();
        director.serCasaBuilder(tradicional);
        director.ConstruirCasa();
        System.out.println("--> Casa Tradicional \n"+ director.getCasa());
        
        System.out.println("");
        director.serCasaBuilder(moderna);
        director.ConstruirCasa();
        System.out.println("--> Casa Moderna \n"+ director.getCasa());
        
        System.out.println("\n-----> Ejemplo  Observer <-----");
        System.out.println("Caso de Uso: Noticiero Online");
        Noticiero noticiero = new Noticiero();
        Subcriptor subcriptor = new Subcriptor("dominguezi10");
        Subcriptor subcriptor2 = new Subcriptor("Jess_hn");
        noticiero.NuevoObserver(subcriptor);
        noticiero.NuevoObserver(subcriptor2);
        noticiero.CrearNoticia("Muerte de dos jóves", "27/05/2020", "Dos jóvenes murieron.");
        
        System.out.println("\n-----> Ejemplo  Adapter <-----");
        System.out.println("Caso de Uso: Carros");
        System.out.println("Se cuentan con 3 tipo de carros.");
        Carro mecanico = new CarroMecanico();
        Carro automatico = new CarroAutomatico();
        Carro carroModerno = new CarroAdapter();
        
        mecanico.Encender();
        automatico.Encender();
        carroModerno.Encender();
        
        System.out.println("\n-----> Ejemplo  State <-----");
        System.out.println("Caso de Uso: Estados del Clima");
        State lluvioso = new LLuvioso();
        State soleado = new Soleado();
        State nublado = new Nublado();
        State frio = new Frio();
        Clima clima = new Clima(soleado);
        clima.VerEstadoClima();
        System.out.println("Cambio de clima");
        clima.setEstado(nublado);
        clima.VerEstadoClima();
        System.out.println("Cambio de clima");
        clima.setEstado(lluvioso);
        clima.VerEstadoClima();
        System.out.println("Cambio de clima");
        clima.setEstado(frio);
        clima.VerEstadoClima();
        
        
    }
    
}
