package com.nttdata.mst1centroeducativo.persistence;


/**
 * 
 * @author Alexandra Rodríguez
 *
 */
public class CentroEducativo {
	
	private String centroEducativoName;
	
	private String port;

	public String getCentroEducativoName() {
		return centroEducativoName;
	}

	public void setCentroEducativoName(String centroEducativoName) {
		this.centroEducativoName = centroEducativoName;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public CentroEducativo(String centroEducativoName, String port) {
		super();
		this.centroEducativoName = centroEducativoName;
		this.port = port;
	}

	@Override
	public String toString() {
		return "CentroEducativo [centroEducativoName=" + centroEducativoName + ", port=" + port + "]";
	}
	
	
	

}
