package com.app.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.placement.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}
