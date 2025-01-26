package com.app.placement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.placement.entity.Certificate;
import com.app.placement.service.CertificateService;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @GetMapping("/{id}")
    public Certificate getCertificate(@PathVariable Long id) {
        return certificateService.getCertificateById(id);
    }

    @PostMapping
    public Certificate addCertificate(@RequestBody Certificate certificate) {
        return certificateService.addCertificate(certificate);
    }
    
    @DeleteMapping("/{id}")
    public void deleteCertificate(@PathVariable Long id) {

         certificateService.deleteCertificate(id);
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Certificate> updateCertificate(
            @PathVariable Long id, 
            @RequestBody Certificate updatedCertificate) {
              Certificate updated = certificateService.updateCertificate(id, updatedCertificate);
              return ResponseEntity.ok(updated);
              
    }
    
    
    
    


    
}
