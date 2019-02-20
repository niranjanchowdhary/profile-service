package org.gigiid.profiles.repository;

import org.gigiid.profiles.model.AuthUser;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AuthRepository extends ReactiveMongoRepository<AuthUser,String> {
}
