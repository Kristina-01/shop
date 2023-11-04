package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "characteristica")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Characteristica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
