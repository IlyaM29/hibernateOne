package ru.gb.hiberOne;

public class Main {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
            System.out.println(productDao.findAll());

            productDao.save(new Product("Orange", 29));
            System.out.println(productDao.findAll());

            productDao.deleteByID(5L);
            System.out.println(productDao.findAll());

            productDao.update(4L, "Orange");
            System.out.println(productDao.findAll());

            Product product = productDao.findById(1L);
            product.setCost(12);
            productDao.saveOrUpdate(product);
            System.out.println(productDao.findAll());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
