/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.PersonDTO;
import dtos.RenameMeDTO;
import entities.Person;
import entities.RenameMe;
import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        PersonDao fe = PersonDao.getInstance(emf);
//        fe.create(new PersonDTO(new Person("First 1", 1)));
//        fe.create(new PersonDTO(new Person("First 2", 2)));
//        fe.create(new PersonDTO(new Person("First 3", 3)));
    }
    
    public static void main(String[] args) {
        populate();
    }
}
