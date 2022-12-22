package com.nttdata.mst1centroeducativo.services;

import org.springframework.stereotype.Service;

import com.nttdata.mst1centroeducativo.persistence.CentroEducativo;

/**
 * 
 * @author Alexandra Rodríguez
 *
 */
@Service
public interface CentroEducativoServiceI {

	public CentroEducativo getSchoolsInfo();
}
