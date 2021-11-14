package loctest;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		//old approach
		Adhar a=new Adhar(52156);
		Passport pass=new Passport(a);
//		Person per=new Person(pass);
//		Passport pass1=per.getPassport();
//		Adhar ad=pass1.getAdhar(a);
//		System.out.println(ad.getNumber());
		//1.8 approach
		//System.out.println(new Person(pass).getPassport().getAdhar().getNumber());
		//System.out.println();
		
		
		List<Person> perList=new ArrayList<>();
		perList.add(new Person(new Passport(new Adhar(66295))));
		perList.add(new Person(new Passport(new Adhar(86942655))));
		perList.add(new Person(new Passport(new Adhar(36563))));
		perList.add(new Person(new Passport(new Adhar(962595))));
		for (Person person : perList) {
			System.out.println(person.getPassport().getAdhar().getNumber());
		}
		Stream<Person> s=perList.stream();
		
s.forEach(p10->System.out.println(p10.getPassport().getAdhar().getNumber()));
	//System.out.println((new Person(new Passport(new Adhar(65464)))));
	}
}