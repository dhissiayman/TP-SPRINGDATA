package org.sid.springdatatp;

import org.sid.springdatatp.enums.Genre;
import org.sid.springdatatp.model.Centre;
import org.sid.springdatatp.model.Etudiant;
import org.sid.springdatatp.repository.CentreRepository;
import org.sid.springdatatp.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataTpApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataTpApplication.class, args);
    }
    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    CentreRepository centreRepository;
    @Override
    public void run(String... args) throws Exception {
        Centre c1 = centreRepository.save(
                Centre.builder().nom_centre("Centre EMSI Casa").adresse("Casablanca").build()
        );
        Etudiant et1=Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.Homme)
                .centre(c1)
                .build();
        etudiantRepository.save(et1);

        Etudiant et2=Etudiant.builder()
                .nom("Essalamani")
                .prenom("SWALID")
                .genre(Genre.Homme)
                .centre(c1)
                .build();
        etudiantRepository.save(et2);

        Etudiant et3=Etudiant.builder()
                .nom("SADIK")
                .prenom("OUSSAAAAAAA")
                .genre(Genre.Homme)
                .centre(c1)
                .build();
        etudiantRepository.save(et3);

        Etudiant et4=Etudiant.builder()
                .nom("TAOUFIK")
                .prenom("GHAZAL")
                .genre(Genre.Homme)
                .centre(c1)
                .build();
        etudiantRepository.save(et4);

    }

}