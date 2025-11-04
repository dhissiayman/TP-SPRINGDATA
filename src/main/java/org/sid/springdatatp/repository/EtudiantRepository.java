package org.sid.springdatatp.repository;

import org.sid.springdatatp.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="etudiants")
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}