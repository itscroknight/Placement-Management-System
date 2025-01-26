package com.app.placement.entity;

import jakarta.persistence.*;

@Entity
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String hallTicketNumber;
    private String certificatePath;
    
    
    
 // Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getHallTicketNumber() {
		return hallTicketNumber;
	}
	public void setHallTicketNumber(String hallTicketNumber) {
		this.hallTicketNumber = hallTicketNumber;
	}
	public String getCertificatePath() {
		return certificatePath;
	}
	public void setCertificatePath(String certificatePath) {
		this.certificatePath = certificatePath;
	}

    
    
}
