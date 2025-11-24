package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.*;
import org.eclipse.persistence.tools.profiler.Profile;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // permet d'auto-incrementer
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false, unique = true, length = 50) // unique = true veut dire que l'email sera unique
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Profil profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profil getProfile() {
        return profile;
    }

    public void setProfile(Profil profile) {
        this.profile = profile;
    }
}
