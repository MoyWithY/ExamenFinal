package com.example.demo.controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto2.UsuarioRegistroDTO;
import com.example.demo.servicio4.UsuarioServicio;

import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import pe.edu.cibertec.web.bd.MySqlDataSource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping ("/registro")
public class RegistroUsuarioControlador {
	
	public UsuarioServicio usuarioServicio;

	public RegistroUsuarioControlador(UsuarioServicio usuarioServicio) {
		super();
		this.usuarioServicio = usuarioServicio;
	}
	
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
		
	}
	
	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}
	
	
	@PostMapping
	public String registrarCuentaDeUsuario (@ModelAttribute ("usuario") UsuarioRegistroDTO registroDTO ){
		//TODO: process POST request
		usuarioServicio.guardar(registroDTO);

		return "redirect:/registro?exito";
	}
	
	
	@GetMapping({"usuarios","/"})
	public String listarUsuarios(Model modelo ) {
		
		modelo.addAttribute("usuariosControl",	usuarioServicio.listar());
		return "redirect:/registro/usuarios"; //nos retorna al archivo html estudiantes 
	}
	
	
	
	@RequestMapping(value = "/usuarioReport", method = RequestMethod.GET)
	public void UsuarioReporte(HttpServletResponse response) throws JRException, IOException {
		System.out.println("generando reporte ");
		InputStream is = this.getClass().getResourceAsStream("/Cherry_Landscape_Table_Based.jasper");
		
	

		Map<String, Object> params = new HashMap<String, Object>();
		
		

		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(is);
		

		Connection con = MySqlDataSource.getMySQLConnection();
		
		
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params,con);
		
		
		response.setContentType("application/x-pdf");
		
		response.setHeader("Content-disposition", "inline; filename=usuario-report.pdf");
		
		OutputStream outputStream = response.getOutputStream();
		
			JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
	}
}
