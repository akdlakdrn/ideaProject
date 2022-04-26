package com.firstgit.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitApplication.class, args);
        System.out.println("프로젝트 생성완료");
        System.out.println("깃테스트 연동하는중");
    }

}
