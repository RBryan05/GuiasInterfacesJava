/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.borrador1;

import Services.InterfaceBD1;
import java.lang.reflect.Field;

/**
 *
 * @author bryan
 */
public class Borrador1 {

    public static void main(String[] args) {
        ImplementarClassInterfaz obj = new ImplementarClassInterfaz();
        ImplementacionClase2 obj2 = new ImplementacionClase2();

        System.out.println(ImplementarClassInterfaz.class.getName());
        System.out.println(ImplementacionClase2.class.getName());

        Field[] fields = ImplementacionClase2.class.getDeclaredFields();

        for (Field field : fields) {
            System.out.println("nombre " + field.getName());
            System.out.println("Tipo " + field.getType());
        }
        InterfaceBD1<String> temp = new InterfaceBD1<String>() {
            @Override
            public String getAll() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String getById(int id) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String insert(String objeto) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String Update(String objeto) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public String delete(String objeto) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }
}
