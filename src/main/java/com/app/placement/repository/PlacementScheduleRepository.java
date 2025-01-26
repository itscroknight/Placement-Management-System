package com.app.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.placement.entity.PlacementSchedule;

public interface PlacementScheduleRepository extends JpaRepository<PlacementSchedule, Long> {
}
