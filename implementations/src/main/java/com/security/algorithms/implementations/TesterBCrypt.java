package com.security.algorithms.implementations;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Scanner;

public class TesterBCrypt {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String info;
        System.out.printf("Informe uma string para calculo de hash:\n");
        info = scanner.nextLine();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(info);
        System.out.println("hash:\n"+encodedPassword);
    }
}
