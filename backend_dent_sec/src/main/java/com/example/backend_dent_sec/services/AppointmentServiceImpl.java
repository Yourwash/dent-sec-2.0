package com.example.backend_dent_sec.services;

import com.example.backend_dent_sec.repositories.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentServiceInterface {
    @Autowired
    AppointmentRepo appointmentRepo;
}
