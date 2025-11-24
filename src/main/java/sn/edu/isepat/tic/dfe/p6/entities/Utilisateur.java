package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.eclipse.persistence.tools.profiler.Profile;

public class Utilisateur {
    @Id
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String email;

    private Profile profile;
}
