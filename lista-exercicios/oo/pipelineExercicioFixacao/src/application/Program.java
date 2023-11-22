package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full file path:");
        String caminhoDoArquivo = sc.next();

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            List <Employee> list = new ArrayList<>();
            String line = leitor.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1],Double.parseDouble(fields[2])));
                line = leitor.readLine();
            }
            Comparator <String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            System.out.println("Enter salary:");
            double salary = sc.nextDouble();
            System.out.println("Email of people whose salary is more than " + salary + ":");
            List<String> emails = list.stream().filter( x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted(comp).collect(Collectors.toList());
            double sum = list.stream()
            		.filter(x -> x.getName().startsWith("M"))
            		.map(Employee :: getSalary)
            		.reduce(0.0, (a,b) -> a+b);
            emails.forEach(System.out :: println);
            System.out.println("Sum of salary of people whose name starts with 'M':" + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
	}

}
