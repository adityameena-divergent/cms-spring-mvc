package com.divergentsl.cms.service;

import java.util.List;

import com.divergentsl.cms.entity.Patient;

public interface PatientService {
	
	
	public void insert(int patientId, String patientName, String gender, int age, int weight, int contactNumber, String address);
	
	public List<Patient> findAll();

	public Patient find(int patientId);
	
	public void remove(int patientId);
	
	public void update(int patientId, String patientName, String gender, int age, int weight, int contactNumber, String address);
	
}
