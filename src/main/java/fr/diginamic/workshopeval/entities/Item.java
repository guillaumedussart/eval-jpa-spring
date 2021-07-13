package fr.diginamic.workshopeval.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * tem
 */
@Entity
@Table(name = "item")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code", length = 50)
    private String code;

    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "prix")
    private Double price;
    private Double totalPrice;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "panier",
            joinColumns = @JoinColumn(name = "id_item", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_client", referencedColumnName = "id")
    )
    private Collection<Client> clients;

    {
        this.clients = new ArrayList<>();
    }

    public Item() {
    }

    public Item(String code, String description, Double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public Item(String code, String description, Double price, Collection<Client> clients) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.clients = clients;
    }

    public Item(String code, String description, Double price, Double totalPrice, Collection<Client> clients) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.totalPrice = totalPrice;
        this.clients = clients;
    }

    /**
     * get field @Id
     *
     * @return id @Id
     * @GeneratedValue(strategy = GenerationType.IDENTITY)
     * @GeneratedValue(strategy = GenerationType.IDENTITY)
     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field @Id
     *
     * @param id @Id
     * @GeneratedValue(strategy = GenerationType.IDENTITY)
     * @GeneratedValue(strategy = GenerationType.IDENTITY)
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field @Column(name = "code",length = 50)
     *
     * @return code @Column(name = "code",length = 50)
     */
    public String getCode() {
        return this.code;
    }

    /**
     * set field @Column(name = "code",length = 50)
     *
     * @param code @Column(name = "code",length = 50)
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * get field @Column(name = "desc",length = 150)
     *
     * @return description @Column(name = "desc",length = 150)
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * set field @Column(name = "desc",length = 150)
     *
     * @param description @Column(name = "desc",length = 150)
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get field @Column(name = "prix")
     *
     * @return price @Column(name = "prix")
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * set field @Column(name = "prix")
     *
     * @param price @Column(name = "prix")
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * get field @ManyToMany(mappedBy = "items",fetch = FetchType.EAGER)
     *
     * @return clients @ManyToMany(mappedBy = "items",fetch = FetchType.EAGER)
     */
    public Collection<Client> getClients() {
        return this.clients;
    }

    /**
     * set field @ManyToMany(mappedBy = "items",fetch = FetchType.EAGER)
     *
     * @param clients @ManyToMany(mappedBy = "items",fetch = FetchType.EAGER)
     */
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }


    /**
     * get field
     *
     * @return totalPrice
     */
    public Double getTotalPrice() {
        return this.totalPrice;
    }

    /**
     * set field
     *
     * @param totalPrice
     */
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
