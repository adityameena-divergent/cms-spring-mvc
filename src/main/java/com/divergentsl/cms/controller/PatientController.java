package com.divergentsl.cms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.divergentsl.cms.entity.Patient;
import com.divergentsl.cms.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	
	@RequestMapping(path = "/patientmenu", method = RequestMethod.GET)
	public String patientMenu() {
		return "PatientMenu";
	}
	
	
	@RequestMapping(path = "/patientinsert", method = RequestMethod.GET)
	public String insertPatient() {
		return "PatientInsert";
	}
	
	
	
	@RequestMapping(value = "/patientlist", method = RequestMethod.GET)
	public ModelAndView listPatient() {
		ModelAndView mv = new ModelAndView("PatientList");
		
		mv.addObject("allPatient", patientService.findAll());
		return mv;
	}
	
	@RequestMapping(path = "/patientsearch", method = RequestMethod.GET)
	public ModelAndView searchById(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView("PatientSearch");
		int patientId = 0;
		if(request.getParameter("patientid") != null)
			 patientId = Integer.parseInt(request.getParameter("patientid"));
		
		
		Patient patient = this.patientService.find(patientId);
		
		
		if(patient != null) {
			mv.addObject("patient", patient);
			mv.addObject("id", patient.getId());
		}
		return mv;
	}
	
	@RequestMapping(path = "/patientinsert", method = RequestMethod.POST)
	public String patientInsert(HttpServletRequest request, HttpServletResponse response) {
		
		int patientId = Integer.parseInt(request.getParameter("patient_id"));
		String patientName = request.getParameter("patient_name");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		int weight = Integer.parseInt(request.getParameter("weight"));
		int contactNumber = Integer.parseInt(request.getParameter("contact_number"));
		String address = request.getParameter("address");
				
		this.patientService.insert(patientId, patientName, gender, age, weight, contactNumber, address);
		
		return "PatientInsert";
	}
	
	
	@RequestMapping(path = "/patientdelete", method = RequestMethod.GET)
	public ModelAndView deletePatient(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("PatientList");
		
		this.patientService.remove(id);
		
		mv.addObject("allPatient", patientService.findAll());
		return mv;
	}
	
	@RequestMapping(path = "/patientupdate", method = RequestMethod.GET)
	public ModelAndView updatePatient(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("PatientUpdate");
		mv.addObject("patient", this.patientService.find(id));
		return mv;
	}
	
	@RequestMapping(path = "/patientupdate", method = RequestMethod.POST)
	public String updatePatientUtil(HttpServletRequest request, HttpServletResponse response) {
		
		int patientId = Integer.parseInt(request.getParameter("patient_id"));
		String patientName = request.getParameter("patient_name");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		int weight = Integer.parseInt(request.getParameter("weight"));
		int contactNumber = Integer.parseInt(request.getParameter("contact_number"));
		String address = request.getParameter("address");
		
		this.patientService.update(patientId, patientName, gender, age, weight, contactNumber, address);
		
		return "PatientMenu";
	}
	
	
}
