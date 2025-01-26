package com.app.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.placement.entity.PlacementSchedule;
import com.app.placement.repository.PlacementScheduleRepository;

import java.util.List;

@Service
public class PlacementScheduleService {

    @Autowired
    private PlacementScheduleRepository placementScheduleRepository;

    public List<PlacementSchedule> getAllSchedules() {
        return placementScheduleRepository.findAll();
    }

    public PlacementSchedule addSchedule(PlacementSchedule schedule) {
        return placementScheduleRepository.save(schedule);
    }
    
    public PlacementSchedule getPlacementScheduleById(Long id) {
        return placementScheduleRepository.findById(id).orElse(null);
    }
    
    public PlacementSchedule updatePlacementSchedule(Long id, PlacementSchedule updatedPlacementSchedule) {
        return placementScheduleRepository.findById(id).map(placementSchedule -> {
        	placementSchedule.setQualification(updatedPlacementSchedule.getQualification());
        	placementSchedule.setYear(updatedPlacementSchedule.getYear());
        	placementSchedule.setDate(updatedPlacementSchedule.getDate());
            return placementScheduleRepository.save(placementSchedule);
        }).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }
}
