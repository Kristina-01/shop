package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "contact_shop")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Contact_shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne(mappedBy = "contact_shop")
    private Sh shop;


}
