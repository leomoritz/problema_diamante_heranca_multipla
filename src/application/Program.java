package application;

import model.entities.ComboDevice;
import model.entities.ConcretePrinter;
import model.entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		ComboDevice cd = new ComboDevice("2081");
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println("Scan resulto: " + cd.scan());
		
	}

}
