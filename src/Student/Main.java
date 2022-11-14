package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Student> studenti = new ArrayList<>();
        List<Student> polozili = new ArrayList<>();
        Boolean quit = false;


        while (!quit) {
            System.out.println("Upisite ime studenta (quit ako zelite da prekinete):");
            String ime = scanner.nextLine();
            if (ime.equalsIgnoreCase("quit")) {
                System.out.println("Kraj upisa");
                break;
            }
            System.out.println("Upisite prezime studenta:");
            String prezime = scanner.nextLine();
            if (prezime.equalsIgnoreCase("quit")) {
                System.out.println("Kraj upisa");
                break;
            }


            System.out.println("Upisite ocenu studenta:");
            String ocena = scanner.nextLine();
            if (ocena.equalsIgnoreCase("quit")) {
                System.out.println("Kraj upisa");
                break;
            }
            studenti.add(new Student(ime, prezime, ocena));
            int o = Integer.parseInt(ocena);

            if (o>5) {
                polozili.add(new Student(ime,prezime,ocena));
            }


        }

        for (Student student : studenti) {
            System.out.println(student);
        }

        System.out.println("Polozili su:");
        for (Student p : polozili) {
            System.out.println(p);
        }


    }




}







