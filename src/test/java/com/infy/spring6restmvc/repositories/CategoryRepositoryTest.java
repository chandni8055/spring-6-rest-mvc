package com.infy.spring6restmvc.repositories;

import com.infy.spring6restmvc.entities.Beer;
import com.infy.spring6restmvc.entities.Category;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


    @SpringBootTest
    class CategoryRepositoryTest {
        @Autowired
        CategoryRepository categoryRepository;

        @Autowired
        BeerRepository beerRepository;
        Beer testBeer;

        @BeforeEach
        void setUp() {
            testBeer = beerRepository.findAll().get(0);
        }

        @Transactional
        @Test
        void testAddCategory() {
            Category savedCat = categoryRepository.save(Category.builder()
                    .description("Ales")
                    .build());

            testBeer.addCategory(savedCat);
            Beer saveBeer = beerRepository.save(testBeer);

            System.out.println(saveBeer.getBeerName());

        }
    }