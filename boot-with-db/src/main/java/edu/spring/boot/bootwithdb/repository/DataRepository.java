package edu.spring.boot.bootwithdb.repository;


import edu.spring.boot.bootwithdb.entity.DomainObject;

import java.util.Set;

public interface DataRepository<V extends DomainObject> {

    void persist(V object);

    void delete(V object);

    Set<String> getRandomData();

}
