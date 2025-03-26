/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.function.Function;
import lombok.ToString;

/**
 *
 * @author bryan
 */
public class Serializacion2 {

    static Function<Person, ByteArrayOutputStream> serializer = p -> {
        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();
        try (ObjectOutputStream outputStream = new ObjectOutputStream(inMemoryBytes)) {
            outputStream.writeObject(p);
            outputStream.flush();
        } catch (IOException ioe) {
            System.err.println("lambdas.Serializacion2.methodName()" + ioe.getMessage());
        }
        return inMemoryBytes;
    };

    static Function<ByteArrayInputStream, Person> deserializer = bais -> {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(bais)) {
            return (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    };

    public static void main(String[] args) {
        ByteArrayOutputStream objetoSerializable = serializer.apply(new Person("Bryan", 20));

        System.out.println(Arrays.toString(objetoSerializable.toByteArray()));

        Person objetoDeserializado = deserializer.apply(new ByteArrayInputStream(objetoSerializable.toByteArray()));

        System.out.println(objetoDeserializado.toString());
    }
}

@ToString
class Person implements Serializable {

    private String nombre;
    private Integer age;

    public Person(String nombre, Integer age) {
        this.age = age;
        this.nombre = nombre;
    }

    public String toString() {
        return "nombre: " + nombre + " edad: " + age;
    }
}
