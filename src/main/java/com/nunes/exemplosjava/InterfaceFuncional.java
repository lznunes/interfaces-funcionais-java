package com.nunes.exemplosjava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InterfaceFuncional {

	public static void main(String[] args) {
		SpringApplication.run(InterfaceFuncional.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			DisplayFunction displayFunction = string ->
			// DisplayFunction displayFunction = new DisplayFunction()
			//{
			//	@Override
			//	public void mostrar(String string){
					System.out.println("Ola, " + string);
			//	}
			//};
			displayFunction.mostrar("Luiz!");

			DisplayFunction displayFunction1 = string ->
					System.out.println("Voce tem " + string);
			displayFunction1.mostrar("43" + " anos");
		};

	}
}

@FunctionalInterface
interface DisplayFunction{
	void mostrar(String string);
}

