package peaksoft.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import peaksoft.forEntities.BaseEntity;

import java.util.List;

import static jakarta.persistence.CascadeType.REMOVE;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@ToString
@SequenceGenerator(name = "base_id_gen", sequenceName = "user_seq", allocationSize = 1)
public class User extends BaseEntity {
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;

//*********************************************

    @OneToMany(cascade = {REMOVE}, mappedBy = "user")
    private List<Post> posts;
//*********************************************
    @OneToMany(cascade = {REMOVE}, mappedBy = "user")
    private List<Comment> comments;
//*********************************************
    @ManyToOne(cascade = {REMOVE})
    private Image image;


}
