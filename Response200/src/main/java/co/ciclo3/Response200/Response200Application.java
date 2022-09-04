package co.ciclo3.Response200;

import co.ciclo3.Response200.entity.Empleado;
import co.ciclo3.Response200.entity.Empresa;
import co.ciclo3.Response200.entity.MovimientoDinero;
import co.ciclo3.Response200.entity.Rol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.Soundbank;

@SpringBootApplication
public class Response200Application {

	public static void main(String[] args) {SpringApplication.run(Response200Application.class, args);}
	/*
		Empresa kokakola = new Empresa(1143784239, "KokaKola", "Calle 100 # 82 - 34", 3356798, 1250000);
		System.out.println(kokakola);
		Empleado empleado = new Empleado(123321, "Cirilo", "cirilo@mintic.com", "KokaKola", new Rol(2, "vendedor", true));
		System.out.println(empleado);
		MovimientoDinero movimiento = new MovimientoDinero(01, -250000, "Pago proovedor", kokakola, empleado);
		System.out.println(kokakola);
		System.out.println(movimiento);
	*/

}
