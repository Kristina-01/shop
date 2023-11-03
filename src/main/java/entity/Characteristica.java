package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "characteristica")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Characteristica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    //что-то еще

}
