// package com.example.demo.Controller;


// import com.example.demo.Model.model;
// import org.springframework.web.bind.annotation.*;


// @RestController
// public class LoginService{

//     @GetMapping("/")
//     public String process(@RequestBody model data){

//         if (!"admin".equals(data.getUsername()) || 
//             !"1234".equals(data.getPassword())) {

//             return "Hi";
//         }

        
//         if (data.getQuantity() <= 0) {
//             return "Invalid quantity!";
//         }

//         return "Login Successful!\nOrder Confirmed:\nItem: " 
//                 + data.getItemName() + 
//                "\nQuantity: " + data.getQuantity();
//     }
// }

    

