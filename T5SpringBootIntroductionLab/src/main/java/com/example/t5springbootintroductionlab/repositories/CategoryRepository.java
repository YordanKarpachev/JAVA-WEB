package com.example.t5springbootintroductionlab.repositories;

import com.example.t5springbootintroductionlab.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}
