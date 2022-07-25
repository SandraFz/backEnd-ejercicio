package com.portfolio.MyPortfolio8.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="experience")
public class Experience {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name="company")
    private String company;
    @Column(name="asignament")
    private String asignamet;
    @Column(name="anio_salida")
    private int anio_salida;
    @Column(name="duracion")
    private int duracion;
    @Column(name="logo_exp")
    private String logo_experience;
    @Column(name="link_exp")
    private String link_experience;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="person")
    private Person person;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ImgExperience> imgExperience;

    public Experience() {
    }

    public Experience(Long id, String company, String asignamet, int anio_salida, int duracion, String logo_experience, String link_experience, Person person, List<ImgExperience> imgExperience) {
        this.id = id;
        this.company = company;
        this.asignamet = asignamet;
        this.anio_salida = anio_salida;
        this.duracion = duracion;
        this.logo_experience = logo_experience;
        this.link_experience = link_experience;
        this.person = person;
        this.imgExperience = imgExperience;
    }

    

    

    

    
    
    
}
