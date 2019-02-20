package org.gigiid.profiles.model;

import lombok.Data;

import java.util.List;
@Data
public class UserProfessionalDetails {
    private int totalExperience;
    private List<String> keySkills;
    private UploadDocument uploadDocument;
    private String profileHeadLine;
}
