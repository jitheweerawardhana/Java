package org.example.studetn_management_system.utill;

import org.example.studetn_management_system.entity.Student;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class GetSessionFactory {
    public org.hibernate.SessionFactory getSessionFactory() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().build();

        try{
            return new MetadataSources(registry)
                    .addAnnotatedClass(Student.class)
                    .buildMetadata().buildSessionFactory();
        }
        catch(Exception e){
            StandardServiceRegistryBuilder.destroy(registry);
        }
        return null;
    }
}
