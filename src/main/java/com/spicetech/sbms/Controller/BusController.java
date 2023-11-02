package com.spicetech.sbms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spicetech.sbms.Model.Bus;
import com.spicetech.sbms.Service.BusService;
import com.spicetech.sbms.Service.SbmsException;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/buses")
public class BusController {

    private final BusService busService;

    @Autowired
    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping
    public ResponseEntity<Bus> createBus(@RequestBody Bus bus) {
        try {
            Bus createdBus = busService.createBus(bus);
            return new ResponseEntity<>(createdBus, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<Bus>> getAllBuses() {
        try {
            List<Bus> buses = busService.getAllBuses();
            return new ResponseEntity<>(buses, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long id) {
        try {
            Bus bus = busService.getBusById(id);
            return new ResponseEntity<>(bus, HttpStatus.OK);
        } catch (SbmsException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/{busId}")
    public ResponseEntity<Bus> deleteBusById(@PathVariable("busId") Long busId) {
        try {
            busService.deleteBusById(busId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (SbmsException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

