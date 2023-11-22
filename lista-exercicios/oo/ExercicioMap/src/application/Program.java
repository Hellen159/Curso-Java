package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<String, Integer> cookies = new HashMap <>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String  name= fields[0];
				int votos = Integer.parseInt(fields[1]);
				if (cookies.containsKey(name)) {
					int votesSoFar = cookies.get(name);
					cookies.put(name, votos + votesSoFar);
				}
				else {
					cookies.put(name, votos);
				}
				
				line = br.readLine();
			}
			
			for(String key: cookies.keySet()){
				System.out.println(key +" "+ cookies.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
