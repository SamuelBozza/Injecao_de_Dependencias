package org.dio.springboot;

import org.dio.springboot.bean.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class PrimeirosPassosApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}
}


@Component
class MyApp implements CommandLineRunner {
	//Exemplos diferentes de fazer a injeção de classes com o @Component
	/*@Autowired
	private Car car;

	@Override
	public void run(String... args) throws Exception {
		car.drive();
	}

	private final VehicleService vehicleService;

	@Autowired
	public MyApp(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

	@Override
	public void run(String... args) throws Exception {
		vehicleService.performActions();
	}
	 */

	//Exemplo com o @Bean

	@Autowired
	private Toy legoSet;
	@Autowired
	private Toy legoSet2;
	@Autowired
	private Toy legoSet3;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Brincando com: " + legoSet.getName());
		System.out.println("Numero de peças lego: " + legoSet.getPieces());
		System.out.println("Brincando com: " + legoSet2.getName());
		System.out.println("Numero de peças lego: " + legoSet2.getPieces());
		System.out.println("Brincando com: " + legoSet3.getName());
		System.out.println("Numero de peças lego: " + legoSet3.getPieces());
	}
}
