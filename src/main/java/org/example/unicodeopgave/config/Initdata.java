package org.example.unicodeopgave.config;

import org.example.unicodeopgave.model.Unicode;
import org.example.unicodeopgave.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initdata implements CommandLineRunner {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) {
        for (char c = 'a'; c <= 'z'; c++) {
            Unicode u = new Unicode();
            u.setBogstav(c);
            u.setUnicode((int) c);

            unicodeRepository.save(u);


        }
    }

}
