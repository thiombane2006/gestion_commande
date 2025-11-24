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

    @Column(nullable = false, unique = true) // unique = true veut dire que l'email sera unique
    private String email;

    private Profile profile;
}
