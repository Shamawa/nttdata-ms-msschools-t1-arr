package com.nttdata.mst1centroeducativo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nttdata.mst1centroeducativo.persistence.CentroEducativo;

/**
 * 
 * @author Alexandra Rodríguez
 *
 */
@Service
public class CentroEducativoServiceImpl implements CentroEducativoServiceI {

	@Value
	private String applicationName;

	@Value
	private String port;

	public CentroEducativo getCentroEducativoInfo() {
		final CentroEducativo resultado = new CentroEducativo;
	
	resultDto.setSchoolsInfo(applicatioName);
	resultDto.setPort(port);
	
	return null;
}

}
