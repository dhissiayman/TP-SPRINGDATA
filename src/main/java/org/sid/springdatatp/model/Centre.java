package org.sid.springdatatp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "centres")
public class Centre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom_centre;
    private String adresse;

    @OneToMany(mappedBy = "centre")
    private List<Etudiant> etudiants;
}