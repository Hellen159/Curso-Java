package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("WOW that is awesome! ");
		
		Post p1 = new Post(sdf.parse("21/08/2018 13:05:44"), "Traveling to the new zelandy" , "I am going to visit this worderful country", 12);
		p1.addComments(c2);
		p1.addComments(c1);
		
		System.out.println(p1);
	}

}
