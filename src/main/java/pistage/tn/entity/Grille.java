package pistage.tn.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Grille implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long grilleId;
    @Enumerated(EnumType.STRING)
    private TacheType tacheType;
    @Enumerated(EnumType.STRING)
    private SatisfactionType satisfactionType;

}
