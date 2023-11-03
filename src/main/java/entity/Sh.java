package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "shop")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Sh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_shop", referencedColumnName = "id")
    private Contact_shop contact_shop;
    //contancy_shop_id

    @Column(name = "number", nullable = false)
    private int number;

    @Column(name ="email", nullable = false)
    private String email;

    @Column(name = "tg_chat", nullable = false)
    private String tg_chat;

    @Column(name = "tg_channel", nullable = false)
    private String tg_channel;

    @Column(name = "whatsapp", nullable = false)
    private int whatsapp;
/*
    @Column(name = "work_schedule", nullable = false)
    private work_schedule

 */




}
