package com.abdulhakimkaya.finalhomework.webprogramming.api;

import com.abdulhakimkaya.finalhomework.webprogramming.dto.JqueryDto;
import com.abdulhakimkaya.finalhomework.webprogramming.service.IJqueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

//LOMBOK
@RequiredArgsConstructor //injection
@Log4j2

//API: Dış Dünyaya açılan kapıdır.
@RestController
@RequestMapping("/api/v1/jquery")
@CrossOrigin //(origins = "http://localhost:3000")
public class JquerySpringApi  {
    //INJECTION
    private final IJqueryService iJqueryService;

    // http://localhost:4444/api/v1/jquery/post

    @PostMapping(value = "/post",consumes={"application/json"})
    public ResponseEntity<JqueryDto>  createRegister(@Valid @RequestBody(required = true) JqueryDto jqueryDto) { //@RequestBody(required = false)

        jqueryDto.setCreatedDate(new Date());
        System.out.println(jqueryDto);

        iJqueryService.createRegister(jqueryDto);
        return ResponseEntity.ok(jqueryDto);
    }

    // LIST
    // http://localhost:4444/api/v1/jquery/get
    @GetMapping(value = "/get")
    public ResponseEntity<List<JqueryDto>>  getAllRegisters() {
        return ResponseEntity.ok(iJqueryService.getAllRegisters());
    }
}
