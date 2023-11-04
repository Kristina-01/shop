package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "gallery")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private String imagine;

    @Column(name = "main_imagine")
    private String mainImagine;

    private String video;
}
