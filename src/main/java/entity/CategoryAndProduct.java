package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "categoryAndProduct")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CategoryAndProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

   // @ManyToOne
    //@JoinColumn(name = "category", referencedColumnName = "id")
    //private Category category;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;



}
