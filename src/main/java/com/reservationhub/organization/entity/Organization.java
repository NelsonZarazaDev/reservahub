package com.reservationhub.organization.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "organizations")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Column(name = "slug", nullable = false, length = 100, unique = true)
    private String slug;

    @Column(name = "active", nullable = false)
    private boolean active = true;

    @Column(name = "created_at", nullable = false)
    @CreationTimestamp
    private OffsetDateTime createdAt;

    //    Metodo de fabrica estatica, ya que este contruye una
    //    organziacion nueva mientras que .save giuarda una organizacion
    //    en porgrest
    public static Organization create(String name, String slug) {
        // 1. Instancias usando tu constructor vacío protegido
        Organization organization = new Organization();

        // 2. Asignas los valores directamente
        organization.name=name;
        organization.slug=slug;

        // 3. Devuelves el objeto listo
        return organization;
    }
}