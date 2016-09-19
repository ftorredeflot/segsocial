package com.seguridadsocial;


public class Persona {
    private String dni;
    private int nss;
    private String name;
    private  String surname;
    private  int  age;
    private double salary;

    public Persona(String dni, int nss, String name, String surname, int age, double salary) {
        this.dni = dni;
        this.nss = nss;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (nss != persona.nss) return false;
        if (age != persona.age) return false;
        if (Double.compare(persona.salary, salary) != 0) return false;
        if (dni != null ? !dni.equals(persona.dni) : persona.dni != null) return false;
        if (name != null ? !name.equals(persona.name) : persona.name != null) return false;
        return surname != null ? surname.equals(persona.surname) : persona.surname == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + nss;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nss=" + nss +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
