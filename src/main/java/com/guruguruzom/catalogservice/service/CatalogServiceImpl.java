package com.guruguruzom.catalogservice.service;

import com.guruguruzom.catalogservice.entity.CatalogEntity;
import com.guruguruzom.catalogservice.repository.CatalogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@RequiredArgsConstructor
@Service
public class CatalogServiceImpl implements  CatalogService{

    private final CatalogRepository catalogRepository;
    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {

        return catalogRepository.findAll();
    }
}
