package ru.gb.hiberOne;

import java.util.List;

public interface ProductDao {

    Product findById(Long id);

    List<Product> findAll();

    Product findByName(String name);

    void save(Product product);

    void update(Long id, String name);

    void deleteByID(Long id);

    void saveOrUpdate(Product product);

}
