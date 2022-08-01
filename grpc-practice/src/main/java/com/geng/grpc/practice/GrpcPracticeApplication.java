package com.geng.grpc.practice;

import com.geng.grpc.practice.service.GrpcStart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GrpcPracticeApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(GrpcPracticeApplication.class, args);
        GrpcStart grpcStart = (GrpcStart) run.getBean("grpcStart");
        try {
            grpcStart.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


