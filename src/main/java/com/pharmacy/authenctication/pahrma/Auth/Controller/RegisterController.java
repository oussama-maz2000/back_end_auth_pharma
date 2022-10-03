package com.pharmacy.authenctication.pahrma.Auth.Controller;

import com.pharmacy.authenctication.pahrma.Auth.Data.PharmaDTO;
import com.pharmacy.authenctication.pahrma.Auth.Services.RegisterServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/register")
public class RegisterController {
    private final RegisterServ registerServ;
@Autowired
    public RegisterController(final RegisterServ registerServ) {
        this.registerServ = registerServ;
    }

    @PostMapping
    public ResponseEntity<PharmaDTO> addPharma(@RequestBody PharmaDTO pharmaDTO){

    registerServ.addPhamacy(pharmaDTO);
    return ResponseEntity.ok(pharmaDTO);
    }

}
