package ma.xproce.inventoryservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Creator")
@AllArgsConstructor
@NoArgsConstructor
@Getter  @Setter

public class Creator {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;


    @OneToMany
    private List<Video> videos;



}
