package com.ebgr.todo_list.controller;

import com.ebgr.todo_list.model.User;
import com.ebgr.todo_list.repository.UserRepository;
import com.ebgr.todo_list.service.UserDetailsServiceImpl;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Index {

    @Autowired
    UserRepository repository;
    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @GetMapping("/")
    ResponseEntity<String> home(HttpServletRequest request) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();
        if(userName.equals("anonymousUser"))
            userName = "foo";

        return ResponseEntity.ok(String.format(
                "<span>Hello <b>%s</b>!</span><div> %s %s %s %s </div>",
                    userName,
                    hiperText("usuários", "all"),
                    hiperText("sobre mim", "me"),
                    hiperText("registrar", "criar"),
                    hiperText("sair", "sair")));
    }

    static String hiperText(String text, String path) {
        return String.format("<a href=\"/%s\">%s</a>", path, text);
    }

}