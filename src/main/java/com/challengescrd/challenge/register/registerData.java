package com.challengescrd.challenge.register;

import com.challengescrd.challenge.address.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.util.Date;


public record registerData(String name, String cpf, String cellphone, String birthdate, Address address) {



}
