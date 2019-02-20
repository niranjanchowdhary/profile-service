package org.gigiid.profiles.service;

import org.gigiid.profiles.model.AuthUser;
import reactor.core.publisher.Mono;

public interface AuthenticationService {
    public Mono<AuthUser> signup();
}
