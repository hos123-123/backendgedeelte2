package com.hotelbackend;

import com.hotelbackend.entities.Destination;
import com.hotelbackend.entities.Hotel;
import com.hotelbackend.repositories.DestinationRepository;
import com.hotelbackend.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelBackEndApplication implements CommandLineRunner {

    @Autowired
    HotelRepository hotelRepository;
    @Autowired
    DestinationRepository destinationRepository;

    public static void main(String[] args) {
        SpringApplication.run(HotelBackEndApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        hotelRepository.save(new Hotel(0,"Agate Hôtel","paris","The hotel Agate is in the Nation/Bastille district of Paris near the metro station Nation, which offers direct access to the main tourist sites.","paris1","winter",3,100));
        hotelRepository.save(new Hotel(0,"Campanile Hotel Paris Bercy Village","paris","This modern Campanile is located in the Bercy district of Paris, just 2 minutes from the shops, cinema and restaurants of Bercy Village. It offers soundproofed accommodations with satellite TV.","paris2","winter",4,150));
        hotelRepository.save(new Hotel(0,"Amadeus Hotel","paris","The Amadeus Hotel enjoys a peaceful and pleasant location in Paris. It welcomes you in the 12th district, between the Gare de Lyon and the Nation metro station.","paris3","winter",2,200));

        hotelRepository.save(new Hotel(0,"London Hotel","London","descriprion","london1","summer",4,120));
        hotelRepository.save(new Hotel(0,"Laferia Hotel","London","descriprion","london2","summer",5,140));
        hotelRepository.save(new Hotel(0,"Serius Hotel","London","descriprion","london3","summer",3,140));

        hotelRepository.save(new Hotel(0,"Pod Times Square","New York","Located 400 metres from Restaurant Row in New York City, Pod Times Square offers a restaurant as well as a bar. Guests enjoy free Wi-Fi throughout the property.","newYork1","summer",4,140));
        hotelRepository.save(new Hotel(0,"The New Yorker","New York","The upscale Wyndham New Yorker Hotel features an art-deco design, a downtown location and a 24-hour restaurant. Times Square is less than a mile away and Pen Station is 162 yards away.","newYork2","summer",5,190));
        hotelRepository.save(new Hotel(0,"Hyatt Place New York City","New York","Hyatt Place New York City/Times Square offers air-conditioned rooms with flat-screen satellite TV in New York's Hell's Kitchen neighborhood","newYork3","summer",5,200));

        destinationRepository.save(new Destination(0,"Paris","Paris, the capital of France, is a great European city and a world center of art, fashion, gastronomy and culture.","parisPic","summer",1000));
        destinationRepository.save(new Destination(0,"Nice","Nice is the capital of the Alpes-Maritimes department on the French Riviera. It is located on the pebbled coastline of the Baie des Anges","nicePic","summer",800));
        destinationRepository.save(new Destination(0,"Lille","Lille is the capital of Hauts-de-France, a region in the north of France. It is located near the Belgian border","lillePic","winter",700));
        destinationRepository.save(new Destination(0,"Lyon","Lyon, a French city in the historic Rhône-Alpes region, is located at the junction of the Rhône and Saône rivers","lyonPic","winter",700));
        destinationRepository.save(new Destination(0,"Barcelona","Barcelona, the cosmopolitan capital of the Spanish region of Catalonia, is renowned for its art and architecture","barcelonaPic","spring",1200));
        destinationRepository.save(new Destination(0,"Madrid","Located in the center of Spain, Madrid, its capital, is a city with elegant boulevards and vast, well-kept parks such as the Retiro","madridPic","spring",800));

    }
}
