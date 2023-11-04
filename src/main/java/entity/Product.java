package entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "characteristica")
    Characteristica characteristica = new Characteristica();

    private int price;

    private boolean markdown;

    private boolean sale;

    private int discount;

    @Column(name = "vender_code")
    private int venderCode;

    private int count;

    @OneToOne
    @JoinColumn(name = "producer_id", nullable = false)
    private Producer producer;

    @ManyToMany(mappedBy = "products")
    private Set<Category> categories = new HashSet<>();
}
