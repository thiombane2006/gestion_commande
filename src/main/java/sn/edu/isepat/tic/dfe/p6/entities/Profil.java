package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Profil {
    @Id
    private Long id;

    @Column(nullable = false)
    private String bio;
    private String telephone;
    private String photo;
}
