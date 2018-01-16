package pl.javastart.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CzescController {

    @GetMapping("/hej") //po przejściu pod adres localhost:8080/hej pojawi się strona czesc.html
//    @GetMapping("/hej/ho") //nie zadziała, trzeba użyć redirect: tak jak niżej przy @PostMapping
    public String showCzesc() {
        return "czesc.html";
    }

    @PostMapping("/parametry")
    public String testParametrow(@RequestParam String imie, @RequestParam String nazwisko) {
        System.out.println(imie + nazwisko);
        return "redirect:czesc.html"; //w przypadku @PostMapping konieczne jest dodanie redirect:
        //użytkownik zostanie przekierowany, czyli zobaczy w pasku adresu localhost:8080/czesc.html
    }

}
