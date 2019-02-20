package org.gigiid.profiles.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "candidate_profiles")
public class CandidateProfile extends BaseModel {
    @Indexed
    //@Email
    public String email;
    @JsonIgnore
    private String password;
    private UserPersonalDetails userPersonalDetails;
    private UserProfessionalDetails userProfessionalDetails;

    public CandidateProfile() {
    }
}
