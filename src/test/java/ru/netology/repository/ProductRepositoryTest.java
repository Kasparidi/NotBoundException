package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.TShirt;
import ru.netology.manager.ProductManager;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    ProductRepository productRepository = new ProductRepository();

    Product first = new Book(1, "War and Peace", 1, "Tolstoy", 111, 2010);
    Product second = new Book(2, "Madam Bovary", 2, "Flaubert", 222, 2011);
    Product third = new TShirt(3,"Reebok", 3, "white", "M");
    Product forth = new TShirt(4, "Adidas", 4, "blue", "S");

    @BeforeEach
    public void SetUp () {
        productRepository.save(first);
        productRepository.save(second);
        productRepository.save(third);
        productRepository.save(forth);
    }

    @Test
    void removeById() {
        int idToRemove = 3;
        productRepository.removeById(idToRemove);
        Product[] actual = productRepository.findAll();
        Product[] expected = new Product[] {first, second, forth};
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeByIdIfNotExist() {
        int idToRemove = 5;
        productRepository.removeById(idToRemove);
        Product[] actual = productRepository.findAll();
        Product[] expected = new Product[] {first, second, third, forth};
        assertArrayEquals(expected, actual);
    }
}