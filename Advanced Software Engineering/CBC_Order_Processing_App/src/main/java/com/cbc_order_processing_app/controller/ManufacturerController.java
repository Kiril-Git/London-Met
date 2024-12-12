package com.cbc_order_processing_app.controller;

import com.cbc_order_processing_app.model.entity.Manufacturer;
import com.cbc_order_processing_app.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerRepository ManufacturerRepository;

    public List<Manufacturer> getAllManufacturers() {
        return ManufacturerRepository.findAll();
    }

    @PostMapping
    public Manufacturer addManufacturer(@RequestBody Manufacturer manufacturer) {
        return ManufacturerRepository.save(manufacturer);
    }

}
