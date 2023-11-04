package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "contact_shop")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactShop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(mappedBy = "contact_shop")
    private Shop shop;
}
