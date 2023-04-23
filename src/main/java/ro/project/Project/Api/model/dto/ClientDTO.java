package ro.project.Project.Api.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClientDTO implements Serializable {

    private String name;
    private String address;
    private String email;
    private long id;

}
