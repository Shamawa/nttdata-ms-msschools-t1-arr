package com.nttdata.mst1centroeducativo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.mst1centroeducativo.persistence.CentroEducativo;

@SpringBootApplication
public class MsT1CentroEducativoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsT1CentroEducativoApplication.class, args);
		
		CentroEducativo CentroEducativo1 = new CentroEducativo();
	}

}
