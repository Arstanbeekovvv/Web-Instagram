package peaksoft.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import peaksoft.forEntities.BaseEntity;

import java.util.List;

import static jakarta.persistence.CascadeType.DETACH;

@Entity
@Table(name = "followers")
@Getter
@Setter
@NoArgsConstructor
@ToString
@SequenceGenerator(name = "base_id_gen", sequenceName = "folower_seq", allocationSize = 1)
public class Follower extends BaseEntity {
    @ElementCollection
    private List<Long> subscribers;
    @ElementCollection
    private List<Long> subscriptions;
//*********************************************
    @OneToOne(cascade = {DETACH})
    private User user;
//*********************************************



}
