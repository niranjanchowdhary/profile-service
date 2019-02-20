package org.gigiid.profiles.repository;

import org.gigiid.profiles.model.CandidateProfile;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends ReactiveMongoRepository<CandidateProfile,String> {


}
