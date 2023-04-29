package com.example.springfundamentals.cats.service.impl;

import com.example.springfundamentals.cats.model.Dto.CreateOwnerDTO;
import com.example.springfundamentals.cats.model.entities.CatEntity;
import com.example.springfundamentals.cats.model.entities.OwnerEntity;
import com.example.springfundamentals.cats.repository.OwnerRepository;
import com.example.springfundamentals.cats.service.OwnerService;
import org.springframework.stereotype.Service;


@Service
public class OwnerServiceImpl implements OwnerService {

    private OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void createOwner(CreateOwnerDTO createOwnerDTO) {
        OwnerEntity owner = new OwnerEntity();
        owner.setOwnerName(createOwnerDTO.getOwnerName());

        createOwnerDTO.getCatNames().forEach(a -> {
            CatEntity cat = new CatEntity();
                    cat.setCatName(a);
                    cat.setOwner(owner);
                    owner.addCat(cat);
            });
        ownerRepository.save(owner);
    }
}
