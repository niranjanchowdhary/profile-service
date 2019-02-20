package org.gigiid.profiles.service;

import org.gigiid.profiles.model.CandidateProfile;
import reactor.core.publisher.Mono;

public interface ProfileService {

    public Mono<CandidateProfile> createProfile(CandidateProfile request);

    public Mono<CandidateProfile> updateProfile(CandidateProfile request);
}
