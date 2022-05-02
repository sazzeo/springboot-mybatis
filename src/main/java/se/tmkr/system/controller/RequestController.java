package se.tmkr.system.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import se.tmkr.system.service.RequestService;

@RequiredArgsConstructor
@RestController
public class RequestController {

    private final RequestService requestService;


}
