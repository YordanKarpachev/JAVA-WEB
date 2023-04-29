package com.example.springfundamentals.cats.repository;

import com.example.springfundamentals.cats.model.entities.CatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<CatEntity, Long> {
}
