package com.lafin.catalogservice.service;

import com.lafin.catalogservice.repository.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();

}
