package com.shyam.test.couchbase.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shyam.test.couchbase.resource.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepo extends CrudRepository<User, Integer>{

}
