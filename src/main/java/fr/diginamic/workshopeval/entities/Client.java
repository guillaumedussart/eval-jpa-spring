package fr.diginamic.workshopeval.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "client")

public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prenom",length = 50)
    private String firstName;

    @Column(name = "nom",length = 50)
    private String lastName;

    @Column(name = "login",length = 50)
    private String login;

    @Column(name = "passwd",length = 200)
    private String password;

    public Client() {
    }

    public Client(String firstName, String lastName, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    /**
     * get field @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

      *
      * @return id @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     */
    public Long getId() {
        return this.id;
    }

    /**
     * set field @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

      *
      * @param id @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get field @Column(name = "prenom",length = 50)
     *
     * @return firstName @Column(name = "prenom",length = 50)

     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * set field @Column(name = "prenom",length = 50)
     *
     * @param firstName @Column(name = "prenom",length = 50)

     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get field @Column(name = "nom",length = 50)
     *
     * @return lastName @Column(name = "nom",length = 50)

     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * set field @Column(name = "nom",length = 50)
     *
     * @param lastName @Column(name = "nom",length = 50)

     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get field @Column(name = "login",length = 50)
     *
     * @return login @Column(name = "login",length = 50)

     */
    public String getLogin() {
        return this.login;
    }

    /**
     * set field @Column(name = "login",length = 50)
     *
     * @param login @Column(name = "login",length = 50)

     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * get field @Column(name = "passwd",length = 200)
     *
     * @return password @Column(name = "passwd",length = 200)

     */
    public String getPassword() {
        return this.password;
    }

    /**
     * set field @Column(name = "passwd",length = 200)
     *
     * @param password @Column(name = "passwd",length = 200)

     */
    public void setPassword(String password) {
        this.password = password;
    }
}
