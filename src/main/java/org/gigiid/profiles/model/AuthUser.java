package org.gigiid.profiles.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document("user_auth")
public class AuthUser extends  BaseModel{
    @Indexed
    private String email;
    private String password;
    private String mobileNumber;
}
