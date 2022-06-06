package kodlamaio.rentacar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.rentacar.entities.concretes.Car;

public interface  CarDao extends JpaRepository<Car, Integer>{

}
