package com.security.algorithms.implementations;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

import java.util.Scanner;

public class TesterPbkdf2 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String info;
        System.out.printf("Informe uma string para calculo de hash:\n");
        info = scanner.nextLine();
        String pepper = "yourSecretKey"; // secret key used by password encoding
        int iterations = 200000;  // number of hash iteration
        int hashWidth = 256;      // hash width in bits
        Pbkdf2PasswordEncoder pbkdf2PasswordEncoder = new Pbkdf2PasswordEncoder(pepper, iterations, hashWidth);
        pbkdf2PasswordEncoder.setEncodeHashAsBase64(true);
        String encodedPassword = pbkdf2PasswordEncoder.encode(info);
        System.out.println("hash:\n"+encodedPassword);
    }
}
// References -> Test of:  https://reflectoring.io/spring-security-password-handling/