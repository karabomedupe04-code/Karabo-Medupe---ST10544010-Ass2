/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatappregistation;

/**
 *
 * @author Student
 */
public class login {
    
public boolean checkUsername(String username) {
    System.out.println("Username successfully captured.");
    return username.contains("_") && username.length() <=5;
}

//Password Validation
public boolean checkPasswordComplexity(String password) {
    System.out.println("Password successfully captured.");
    return password.length() >=8 
            && password.matches(".*[A-Z].*") 
            && password.matches(".*[0-9].*") 
            && password.matches(".*[#?!@$%^&*-].*");

    }

//Cellphone Number Validation
public boolean checkCellphoneNumber(String cellphoneNumber) {
    System.out.println("Cell phone number successfully added.");
    return cellphoneNumber.matches("^(\\+27|27)\\d{9}$");
    }


//Registered User
public String registeredUser(String username , String password, String cellphoneNumber){
    
   if (!checkUsername(username)) {
       return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than 5 characters in length.";
    }

    if (!checkPasswordComplexity(password)) {
        return "Password entered incorrectly; please ensure that your password that is at least eight characters long, contains a capital leter, a number, and a special character.";
    }
    
    if (!checkCellphoneNumber(cellphoneNumber)) {
        return "Cellphone number incorrectly formatted or does not contain an international code.";
    }
        
    if(!checkUsername(username) && checkPasswordComplexity(password) && checkCellphoneNumber(cellphoneNumber)){
        return "failed to register";
    }
    return "User successfully registered";
}


//loginUser
public boolean loginUser(String registeredUser, String registeredPassword, String loginUsername, String loginPassword) {
        return registeredUser.equals(loginUsername) && registeredPassword.equals(loginPassword);
    }
    
  
    //loginStatus
    public String returnLoginStatus(String firstName,  String lastName ,String registeredUser, String registeredPassword, String loginUsername, String loginPassword) {
        if (loginUser(registeredUser, registeredPassword, loginUsername, loginPassword)) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
            
    }
}



    
    


