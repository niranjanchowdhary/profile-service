package org.gigiid.profiles.resource;

import org.gigiid.profiles.model.CandidateProfile;
import org.gigiid.profiles.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class CandidateProfileResource {

    @Autowired
    ProfileService profileService;

    @PostMapping("/profile/v1")
    public Mono<CandidateProfile> createProfile(@RequestBody CandidateProfile request) {
        return this.profileService.createProfile(request);
    }

    @PutMapping("/profile/update")
    public Mono<CandidateProfile> updateProfile(@RequestBody CandidateProfile profile){
        return this.profileService.updateProfile(profile);
    }


}
