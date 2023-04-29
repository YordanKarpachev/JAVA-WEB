package com.example.springfundamentals.cats;

import com.example.springfundamentals.cats.model.Dto.CreateOwnerDTO;
import com.example.springfundamentals.cats.service.OwnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatDemo implements CommandLineRunner {

    private OwnerService ownerService;

    public CatDemo(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {

        CreateOwnerDTO ownerDTO = new CreateOwnerDTO();
        ownerDTO.setOwnerName("Peter");
        ownerDTO.setCatNames(List.of("chinchiua", "georg", "Rex"));
        ownerService.createOwner(ownerDTO);
    }
}
