package com.pharmacy.authenctication.pahrma.Auth.Repository;

import com.pharmacy.authenctication.pahrma.Auth.Class.Pharma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends JpaRepository<Pharma, Long> {}
