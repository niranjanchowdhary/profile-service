package org.gigiid.profiles.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.Id;

@Data
public abstract class BaseModel {
    @Id
    private String id;
}
