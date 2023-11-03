package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "gallery")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;






}
