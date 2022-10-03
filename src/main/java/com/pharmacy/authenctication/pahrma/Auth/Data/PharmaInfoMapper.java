package com.pharmacy.authenctication.pahrma.Auth.Data;

import com.pharmacy.authenctication.pahrma.Auth.Class.Pharma;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PharmaInfoMapper {
    PharmaDTO pharmaDTO(Pharma pharmaEntity);
    @Mapping(target = "pharmacyID", ignore = true)
    Pharma pharmaEntity(PharmaDTO pharmaDTO);

}
