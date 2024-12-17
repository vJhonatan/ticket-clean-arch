package com.project.ticket.infra.controllers;

import com.project.ticket.infra.dtos.EventDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class EventController {

    @PostMapping
    public String newEvent(EventDTO dto) {
        return "event created";
    }

}
