package com.pharmacy.authenctication.pahrma.Auth.Services;

import com.pharmacy.authenctication.pahrma.Auth.Class.Pharma;
import com.pharmacy.authenctication.pahrma.Auth.Data.PharmaDTO;
import com.pharmacy.authenctication.pahrma.Auth.Data.PharmaInfoMapper;
import com.pharmacy.authenctication.pahrma.Auth.Repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServ {

    private final RegisterRepo registerRepo;
    private final PharmaInfoMapper pharmaInfoMapper;
  @Autowired
    public RegisterServ(final RegisterRepo registerRepo,
                        final PharmaInfoMapper pharmaInfoMapper
    ) {
        this.registerRepo = registerRepo;
        this.pharmaInfoMapper = pharmaInfoMapper;
    }

    public void addPhamacy(PharmaDTO pharmaDTO) {
        Pharma pharmaEntity = pharmaInfoMapper.pharmaEntity(pharmaDTO);
        registerRepo.save(pharmaEntity);


    }
}
