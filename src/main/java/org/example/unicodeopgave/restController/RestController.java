package org.example.unicodeopgave.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController

public class RestController {

    @GetMapping("/unicode/{i}")

    public String unicodeToChar(@PathVariable int i) {

        char c = (char) i;

        return "unicode=" + i + " char=" + c;

    }

    @GetMapping("/char/{ch}")
    public String charToUnicode(@PathVariable("ch") String ch) {
        if (ch.length() != 1) {
            return "Kun en enkelt Char er tilladt";
        }
        char c = ch.charAt(0);
        return "char=" + c + " unicode=" + (int) c;
    }

}
