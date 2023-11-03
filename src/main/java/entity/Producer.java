package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "producer")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;


}
