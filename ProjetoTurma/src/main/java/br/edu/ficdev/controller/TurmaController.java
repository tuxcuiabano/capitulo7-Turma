package br.edu.ficdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import br.edu.ficdev.model.Turma;


@Controller
public class TurmaController {

    @GetMapping("/turma")
    public String listaTurma(Turma turma) {
        return "lista";
    }

    @GetMapping("/addTurma")
    public String addTurma(Turma turma) {
        return "add-turma";
    }
}
