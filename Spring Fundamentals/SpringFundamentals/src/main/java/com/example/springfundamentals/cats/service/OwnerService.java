package com.example.springfundamentals.cats.service;


import com.example.springfundamentals.cats.model.Dto.CreateOwnerDTO;

public interface OwnerService {

    void createOwner(CreateOwnerDTO createOwnerDTO);
}
