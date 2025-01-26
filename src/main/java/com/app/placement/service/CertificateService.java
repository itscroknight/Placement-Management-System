package com.app.placement.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.placement.entity.Certificate;
import com.app.placement.repository.CertificateRepository;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    public Certificate getCertificateById(Long id) {
        return certificateRepository.findById(id).orElse(null);
    }

    public Certificate addCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }
    
    public void deleteCertificate(Long id) {
        if (certificateRepository.existsById(id)) {
            certificateRepository.deleteById(id);
        } else {
            throw new RuntimeException("Certificate not found with id: " + id);
        }
    }
    
    public Certificate updateCertificate(Long id, Certificate updatedCertificate) {
        return certificateRepository.findById(id).map(certificate -> {
            certificate.setStudentName(updatedCertificate.getStudentName());
            certificate.setHallTicketNumber(updatedCertificate.getHallTicketNumber());
            certificate.setCertificatePath(updatedCertificate.getCertificatePath());
            return certificateRepository.save(certificate);
        }).orElseThrow(() -> new RuntimeException("Certificate not found with id: " + id));
    }
    
    
}
