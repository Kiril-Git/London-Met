package com.cbc_order_processing_app.repository;

import com.cbc_order_processing_app.model.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, String> {

    
}
