package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "producer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
