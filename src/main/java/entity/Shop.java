package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "shop")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_shop", referencedColumnName = "id")
    private ContactShop contact_shop;

    private int number;

    private String email;

    @Column(name = "tg_chat", nullable = false)
    private String tgChat;

    @Column(name = "tg_channel", nullable = false)
    private String tgChannel;

    @Column(name = "whatsapp", nullable = false)
    private int whatsapp;
/*
    @Column(name = "workSchedule", nullable = false)
    private workSchedul ;
 */
}
