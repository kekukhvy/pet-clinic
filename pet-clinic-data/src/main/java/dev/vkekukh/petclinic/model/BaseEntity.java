package dev.vkekukh.petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -3536184336360152188L;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
