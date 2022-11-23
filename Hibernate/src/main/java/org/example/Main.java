package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            Company company = new Company();
            company.setName("Nashtech");
            Employee employee = new Employee();
            employee.setFirstName("đoán");
            employee.setLastName("xem");
            employee.setCompany(company);
            entityManager.persist(employee);
//            entityTransaction.commit();
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            if(entityTransaction.isActive())
                entityTransaction.rollback();
            entityManager.close();
            entityManagerFactory.close();
        }




    }
}