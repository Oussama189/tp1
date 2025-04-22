package com.example.tp1repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tp1.entity.Produit;



public interface ProduitRepository extends JpaRepository<Produit, Long> {
	

}
