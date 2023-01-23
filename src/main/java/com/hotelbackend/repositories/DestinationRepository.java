package com.hotelbackend.repositories;

import com.hotelbackend.entities.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {

    @Query("select d from Destination d where d.price <= ?1 ")
    List<Destination> findByPrice(long price);

    @Query("select d from Destination d where  d.saison like %?1%")
    List<Destination> findBySaison(String saison);
}
