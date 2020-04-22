package com.space.service;

import com.space.model.Ship;
import com.space.model.ShipType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface ShipService {
    Page<Ship> getShipsList(Specification<Ship> specification, Pageable sortedBy);
    Integer getShipsCount(Specification<Ship> specification);
    Ship createShip(Ship ship);
    Ship getShip(Long id);
    Long checkId(String id);
    Ship updateShip(Long id, Ship ship);
    void deleteShip(Long id);

    Specification<Ship> selectByName(String name);
    Specification<Ship> selectByPlanet(String planet);
    Specification<Ship> selectByShipType(ShipType shipType);
    Specification<Ship> selectByProdDate(Long after, Long before);
    Specification<Ship> selectByUse(Boolean isUsed);
    Specification<Ship> selectBySpeed(Double minSpeed, Double maxSpeed);
    Specification<Ship> selectByCrewSize(Integer minCrewSize, Integer maxCrewSize);
    Specification<Ship> selectByRating(Double minRating, Double maxRating);
}