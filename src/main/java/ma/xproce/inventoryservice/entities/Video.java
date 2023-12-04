package ma.xproce.inventoryservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Video")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Video {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;



    private String name;

    private String url;

    private String description;

    private String datePublication;

    @ManyToOne
    private  Creator creator;


}
