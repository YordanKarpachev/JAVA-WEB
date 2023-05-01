package com.example.t5springbootintroductionlab.services;

import com.example.t5springbootintroductionlab.entities.Category;
import com.example.t5springbootintroductionlab.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public String addCategory(String name) {
        try {

            Category category = new Category(name);
            this.categoryRepository.save(category);
        } catch (RuntimeException e){
            return e.getMessage();
        }

        return name + System.lineSeparator() + "Successfully added category";

    }
}
