package org.example.hibernate;

import org.example.hibernate.model.Item;
import org.example.hibernate.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Configuration config = new Configuration().addAnnotatedClass(Person.class)
                .addAnnotatedClass(Item.class);

        SessionFactory sF = config.buildSessionFactory();
        Session session = sF.getCurrentSession();

        try {
            session.beginTransaction();



//            Person person = new Person("Test", 30);
//            Item newItem = new Item("Item from Hibernate 2", person);
//            person.setItems(new ArrayList<>(Collections.singletonList(newItem)));
//
//            session.save(person);
//
//            session.save(newItem);
//            Person person = session.get(Person.class, 2);
//
//            Item newItem = new Item("Item from Hibernate", person);
//
//            person.getItems().add(newItem);
//
//            session.save(newItem);

//            Item item = session.get(Item.class, 5);
//            System.out.println(item);
//
//            Person person = item.getOwner();
//            System.out.println(person);

//            Person person = session.get(Person.class, 3);
//            System.out.println(person);
//
//            List<Item> items = person.getItems();
//
//            for (Item item : items) {
//                System.out.println(item);
//            }
            session.getTransaction().commit();
        } finally {
            sF.close();
        }
    }
}
