package ro.project.Project.Api.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="users")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name = "name")
        private String name;
        @Column(name = "address")
        private String address;
        @Column(name = "email")
        private String email;

}
