package com.app.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.app.placement.entity.PlacementSchedule;
import com.app.placement.service.PlacementScheduleService;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class PlacementScheduleController {

    @Autowired
    private PlacementScheduleService placementScheduleService;

    @GetMapping
    public List<PlacementSchedule> getAllSchedules() {
        return placementScheduleService.getAllSchedules();
    }

    @PostMapping
    public PlacementSchedule addSchedule(@RequestBody PlacementSchedule schedule) {
        return placementScheduleService.addSchedule(schedule);
    }
    
    @GetMapping("/{id}")
    public PlacementSchedule getPlacementScheduleById(@PathVariable Long id) {
        return placementScheduleService.getPlacementScheduleById(id);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<PlacementSchedule> updatePlacementSchedule(
            @PathVariable Long id, 
            @RequestBody PlacementSchedule updatedPlacementSchedule) {
    	    PlacementSchedule updated = placementScheduleService.updatePlacementSchedule(id, updatedPlacementSchedule);
              return ResponseEntity.ok(updated);
              
    }

    
}
