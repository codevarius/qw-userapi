package org.qwep.qwuserapi.controller;

import org.qwep.qwuserapi.response.SimplePingResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/v1/qwep/userapi/")
public class SimplePingController {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @GetMapping(value = "/ping")
    public ResponseEntity<SimplePingResponse> handleUserapiPingRequest() {
        return ResponseEntity.ok(new SimplePingResponse(LocalDateTime.now(), activeProfile));
    }
}
