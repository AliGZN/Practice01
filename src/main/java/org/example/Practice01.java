package org.example;

public class Practice01 {

    String Name;
    String Family;
    int Age;
    int Codemeli;
    int Id;
    int Sum;


    public Practice01(String name, String family) {
        Name = name;
        Family = family;
        System.out.println("Name = " + name);
        System.out.println("Family = " + family);
    }

    public Practice01(int age, int codemeli, int id) {
        Age = age;
        Codemeli = codemeli;
        Id = id;
        Sum = age+id;
        System.out.println("Age = " + age);
        System.out.println("Codemeli = " + codemeli);
        System.out.println("ID =" + id);


    }
}
