package com.cycsystems.studentcontrol.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cycsystems.studentcontrol.constant.ViewConstant;

@Controller
public class FichaIngresoController {

	private final Log LOG = LogFactory.getLog(FichaIngresoController.class);
	
	@GetMapping("/fichaingreso")
	public String showFichaIngreso() {
		LOG.info("METHOD: showFichaIngreso()");
		LOG.info("Returning to FichaIngreso view");
		return ViewConstant.FICHA_INGRESO;
	}
}
