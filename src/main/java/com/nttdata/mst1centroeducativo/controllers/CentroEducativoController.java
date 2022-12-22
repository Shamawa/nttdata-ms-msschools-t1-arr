package com.nttdata.mst1centroeducativo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.mst1centroeducativo.persistence.CentroEducativo;


@RestController("getSchoolsInfo")
public class CentroEducativoController {
	

	private CentroEducativoServiceI centroEducativoService;
	
	@Autowired
	public CentroEducativo sendAppDataInfo() {
		
		// Llamamos al servicio
		return centroEducativoService.getSchoolsInfo();
	}

}
