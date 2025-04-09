package com.example.demo.controller;

import com.example.demo.domain.ResponseUserDTO;
import com.example.demo.domain.WriteUserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @PostMapping(value = "/user")
    public ResponseEntity<ResponseUserDTO> createUser(
            @RequestBody WriteUserDTO dto
    ){
        ResponseUserDTO responseDTO = new ResponseUserDTO();
        responseDTO.setUsername(dto.getUsername());
        responseDTO.setUserpart(dto.getUserpart());
        responseDTO.setMessage("Success");
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }
    @GetMapping(value = "/user")
    public ResponseEntity<List<ResponseUserDTO>> searchUser(){
        return ResponseEntity.status(HttpStatus.OK).body(new ArrayList<ResponseUserDTO>());
    }
}
