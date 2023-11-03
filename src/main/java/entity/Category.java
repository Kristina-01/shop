package entity;

import lombok.*;
//import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "category")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name="nested_categories_id")
    private Integer nested_categories_id;

    @Column(name="name", length = 100, nullable = false, unique = true)
    private String name;

    @Column(name = "count_product", nullable = false)
    private int count_poduct;

    @Column(name = "count_nested_categories", nullable = false)
    private int count_nested_categories;

   // @OneToMany(mappedBy ="category")
    //private List<CategoryAndProduct> cAp= new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "category_product",
            joinColumns = {@JoinColumn(name = "category_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id", referencedColumnName = "id")}
    )
    private Set<Product> products = new HashSet<>();
}
