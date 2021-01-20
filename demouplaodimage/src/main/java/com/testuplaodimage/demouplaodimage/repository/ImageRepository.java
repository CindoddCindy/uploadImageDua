package com.testuplaodimage.demouplaodimage.repository;

import java.util.Optional;

import com.testuplaodimage.demouplaodimage.model.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageModel, Long> {
    Optional<ImageModel> findByName(String name);
}
