package com.example.ExamPrep;

import com.example.ExamPrep.entities.Category;
import com.example.ExamPrep.entities.ShipEnums;
import com.example.ExamPrep.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final CategoryRepository categoryRepository;

    public Runner(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(this.categoryRepository.count() == 0){
            for (ShipEnums value : ShipEnums.values()) {
                Category category = new Category();
                category.setName(value);
                category.setDescription(value.name());
                this.categoryRepository.save(category);
            }
        }

    }
}
