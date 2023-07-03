package com.guruguruzom.catalogservice.service;

import com.guruguruzom.catalogservice.entity.CatalogEntity;
import org.springframework.stereotype.Service;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
