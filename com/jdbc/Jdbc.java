package com.jdbc;
public class Jdbc {
    public static void main(String args[]){

    }
}
public void getConnection(){
    try {
        System.out.println("In getConection ");
        Class.forName("com.mysql.jdbc.Driver");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
}