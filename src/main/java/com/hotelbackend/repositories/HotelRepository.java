package com.hotelbackend.repositories;

import com.hotelbackend.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    @Query("select h from Hotel h where h.price < ?1 and h.location like %?2%")
    List<Hotel> findByPriceAndLocation(long price, String location);

    @Query("select h from Hotel h where h.stars = ?1 and h.location like %?2%")
    List<Hotel> findByStarsAndLocation(int stars, String location);

    @Query("select h from Hotel h where h.saison like ?1 and h.location like %?2%")
    List<Hotel> findBySaisonAndLocation(String saison, String location);
}
