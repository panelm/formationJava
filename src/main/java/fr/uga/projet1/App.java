package fr.uga.projet1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class App {
	public static void main(String[] args) {
		
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
			
			System.out.println(sdf.format(d));
			
			LocalDate ld = LocalDate.now();
			LocalDate demain = ld.plusDays(1);
			
			Period periode = Period.between(ld, demain);
			
			
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			System.out.println("Aujoud'hui : "+ld.format(dtf));
			System.out.println("Demain : "+demain.format(dtf));
			System.out.println(periode.getDays());
			
			java.sql.Date dsql = java.sql.Date.valueOf(ld);
			System.out.println("SQL :"+dsql.toString());
			
			
//			try {
//			CompteB cb1 = new CompteB("AAA", 400);
//			CompteB cb2 = new CompteB("BBB", 300);
//			int resComp = cb1.compareTo(cb2);
//			System.out.println("resComp = "+resComp);
//			List<CompteB> lc = new ArrayList<>();
//			lc.add(cb1);
//			lc.add(cb2);
//			
//			List<CompteB> lc2 = Arrays.asList(cb1, cb2);
//			Collections.sort(lc2);
//			System.out.println("Apres tri croissant :");
//			for (CompteB cb: lc2) {
//				System.out.println(cb);
//			}
//			
//			lc2.sort(new CompSoldeDec());
//			System.out.println("Apres tri décroissant :");
//			for (CompteB cb: lc2) {
//				System.out.println(cb);
//			}
//			
//			List<Contact> contacts = 
//					Arrays.asList(new Contact(1,"toto",45), 
//								  new Contact(2,"titi",1));
//			ExportTools.exportCsv("contacts.csv", contacts);
//			System.out.println("Export OK");
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
	}
}
