package com.example.t5springbootintroductionlab;

import com.example.t5springbootintroductionlab.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class runner implements CommandLineRunner {


    @Autowired
    private CategoryService categoryService;

    @Override

    public void run(String... args) throws Exception {
      //  String intput = Choose();

     String output =    this.categoryService.addCategory("n");
        System.out.println(output);

    }

    private String Choose() {
        System.out.println("Hi");
        System.out.println("Choose option from:");
        System.out.println("1 - for Add Category");
        System.out.println("2 - for Add Town");
        System.out.println("3 - for Add Shop");
        System.out.println("4 - for Add Seller");
        System.out.println("5 - for Add Product");
        System.out.println("6 - for Set seller new manager");
        System.out.println("7 - for Distributing product in shop");
        System.out.println("8 - for Showing all sellers in shop");
        System.out.println("9 - for Showing all products in shop");

        String input = new Scanner(System.in).nextLine();
        System.out.println(input);


        return input;
    }
}
