package com.samar.voitures.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.samar.voitures.entities.Marque;

@RepositoryRestResource(path = "rest_marques")
@CrossOrigin("http://localhost:4200/")
public interface MarqueRepository extends JpaRepository<Marque, Long>{

}