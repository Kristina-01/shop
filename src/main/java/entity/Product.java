package entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "product")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false,  length = 100)
    private String name;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "characteristica")
    Characteristica characteristica = new Characteristica();

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "markdown", nullable = false)
    private boolean markdown;

    @Column(name = "sale", nullable = false)
    private boolean sale;

    @Column(name = "discount")
    private int discount;

    @Column(name = "vender_code", nullable = false)
    private int vender_code;

    @Column(name = "count", nullable = false)
    private int count;

    @OneToOne
    @JoinColumn(name = "producer_id", nullable = false)
    private Producer producer;



    //надо поправить в ER(связь) - 1 производитель:множество товаров

    /*
    variabiluty
     */


    @ManyToMany(mappedBy = "products")
    private Set<Category> categories = new HashSet<>();



}
