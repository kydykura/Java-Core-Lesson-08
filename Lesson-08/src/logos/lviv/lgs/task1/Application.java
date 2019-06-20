package logos.lviv.lgs.task1;

import java.util.Scanner;

public class Application {

	enum Seasons {

		WINTER, SPRING, SUMMER, FALL;
	}
	
	enum Months {

		JANUARY(31, Seasons.WINTER), 
		FEBRUARY(28, Seasons.WINTER), 
		MARCH(31, Seasons.SPRING), 
		APRIL(30, Seasons.SPRING), 
		MAY(31, Seasons.SPRING), 
		JUNE(30, Seasons.SUMMER), 
		JULY(31, Seasons.SUMMER), 
		AUGUST(31, Seasons.SUMMER), 
		SEPTEMBER(30, Seasons.FALL), 
		OCTOBER(31, Seasons.FALL), 
		NOVEMBER(30, Seasons.FALL), 
		DECEMBER(31, Seasons.WINTER);
		
		int day;
		Seasons season;
		private Months(int day, Seasons season){
			this.day = day;
			this.season = season;
		}
		public int getDay() {
			return day;
		}
		public Seasons getSeason() {
			return season;
		}
		
	}

	public static void menu() {
		System.out.println("Check if this month exists - 1");
		System.out.println("withdraw the months of the season - 2");
		System.out.println("even days of months - 3");
		System.out.println("less days - 4");
		System.out.println("more days - 5");
		System.out.println("next season's  - 6");
		System.out.println("previous season's  - 7");
		System.out.println("Months of the year with even number of days  - 8");
		System.out.println("Moon of the year with an odd number of days  - 9");
		System.out.println("even number of days per month  - 10");
	};
	
	public static void main(String[] args) {
		
		Months [] mas = Months.values();
		Seasons [] sea = Seasons.values();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			menu();
			
			switch (sc.next()) {
			case "1":
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				
				boolean flag = false;			
				for (Months m:mas) {
					if (m.name().equals(month)) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("month exists");
				} else {
					System.out.println("month does not exist");
				}
				
				break;

			case "2":
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();
				
				flag = false;			
				for (Seasons s:sea) {
					if (s.name().equals(season)) {
						flag = true;
						for (Months m:mas) {
							if (m.getSeason().name().equalsIgnoreCase(season)) {
								System.out.println(m);
							}
						}
						
					}
				}
				if (!flag) {
					System.out.println("season does not exist");
				}
	
			break;
			
			case "3":
				System.out.println("Enter the number of days");
				sc = new Scanner(System.in);
				 int d = sc.nextInt();
				 flag = false;
				 for (Months m : mas) {
					 if (m.day == d) {
						 System.out.println(m.name());
						 flag = true;
					 }
				 }
				if(!flag) {
					System.out.println("enter the correct number of days");
				}				
	
			break;
			
			case "4":
				System.out.println("Enter the number of days");
				sc = new Scanner(System.in);
				 d = sc.nextInt();
					 for (Months m : mas) {
					 if (m.day < d) {
						 System.out.println(m.name());
				 }
			 }
				
			break;
			
			case "5":
				System.out.println("Enter the number of days");
				sc = new Scanner(System.in);
				 d = sc.nextInt();
					 for (Months m : mas) {
					 if (m.day > d) {
						 System.out.println(m.name());
				 }
			 }
				
			break;
			
			case "6":
				System.out.println("Enter the name of season");
				sc = new Scanner(System.in);
				 season = sc.next().toUpperCase();
				 for (Seasons s:sea) {
						if(s.name().equals(season)) {
							if(s.ordinal()!=sea.length-1) {
							System.out.println(sea[s.ordinal()+1]);
							}else {
								System.out.println(sea[0]);
							}
						}
				 }
			break;
			
			case "7":
				System.out.println("Enter the name of season");
				sc = new Scanner(System.in);
				 season = sc.next().toUpperCase();
				 for (Seasons s:sea) {
						if(s.name().equals(season)) {
							if(s.ordinal()!=0) {
							System.out.println(sea[s.ordinal()-1]);
							}else {
								System.out.println(sea[sea.length-1]);
							}
						}
				 }
			break;
			
			case "8":
					 for (Months m : mas) {
					 if (m.day % 2 == 0) {
						 System.out.println(m.name());
				 }
			 }
				
			break;
			
			case "9":
				 for (Months m : mas) {
				 if (m.day % 2 != 0) {
					 System.out.println(m.name());
			 }
		 }
			
		    break;
		    
			case "10":
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				month = sc.next().toUpperCase();
					 for (Months m : mas) {
					 if (m.name().equals(month)) {
					 
						 switch (m.day % 2) {
						case 0:
							System.out.println("yes");
							break;
						case 1:
							System.out.println("no");
							break;
						
						}
				 } 
			 }
			
			default:
				break;
			}
		}
	}

	
}
