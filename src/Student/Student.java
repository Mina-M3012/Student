package Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String ime;
    private String prezime;
    String  ocena;

    public Student(String ime, String prezime, String ocena) {
        this.ime = ime;
        this.ocena = ocena;
        this.prezime = prezime;

    }


    @Override
    public String toString() {
        return "Student: " +
                "Ime= " + ime +
                ", Prezime= " + prezime +
                ", Ocena= " + ocena;
    }



    }

