package com.spicetech.sbms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spicetech.sbms.Model.Bus;
import com.spicetech.sbms.Model.School;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

    void deleteBusById(Long busId);

    @Override
    List<Bus> findAll();


}
