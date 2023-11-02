package com.spicetech.sbms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spicetech.sbms.Model.Bus;
import com.spicetech.sbms.Repository.BusRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {

    private final BusRepository busRepository;

    @Autowired
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public Bus createBus(Bus bus) {
        return busRepository.save(bus);
    }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public Bus getBusById(Long busId) {
        Optional<Bus> optionalBus = busRepository.findById(busId);
        if (optionalBus.isPresent()) {
            return optionalBus.get();
        } else {
            throw new SbmsException("Bus with ID " + busId + " not found");
        }
    }


    public void deleteBusById(Long busId) {
        if (busRepository.existsById(busId)) {
            busRepository.deleteById(busId);
        } else {
            throw new SbmsException("Bus with ID " + busId + " not found");
        }
    }
}
