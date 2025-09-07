package org.example.unicodeopgave.repositories;

import org.example.unicodeopgave.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {
}
