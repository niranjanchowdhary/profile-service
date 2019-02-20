package org.gigiid.profiles.service;

import org.gigiid.profiles.model.CandidateProfile;
import org.gigiid.profiles.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    @Override
    public Mono<CandidateProfile> createProfile(CandidateProfile request) {
        return profileRepository.save(request);
    }

    @Override
    public Mono<CandidateProfile> updateProfile(CandidateProfile request) {
        return this.profileRepository.insert(request);
    }

}
