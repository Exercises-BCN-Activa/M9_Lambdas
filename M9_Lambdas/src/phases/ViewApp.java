package phases;


public class ViewApp {

	public static void main(String[] args) {
		
		System.out.println("\n->->->->->-> Phase 1 <-<-<-<-<-<-<-\n".toUpperCase());
		
		System.out.println(Phase1.listBeginsAsize3char(Phase1.femaleNames)); 	//1.1
		System.out.println(Phase1.evenORodd(Phase1.list1To100));				//1.2
		System.out.println(Phase1.listConteinOchar(Phase1.maleNames));			//1.3
		System.out.println(Phase1.listConteinOsize5char(Phase1.maleNames)); 	//1.4
		Phase1.monthsYear(Phase1.list1To100);									//1.5
		Phase1.monthsYearReferenceMethod(Phase1.list1To100);					//1.6	
		
		//------------------------------------//---------------------------------------//
		
		System.out.println("\n->->->->->-> Phase 2 <-<-<-<-<-<-<-\n".toUpperCase());
		
		System.out.println(Phase2.i.getPiValue());								//2.1
		
		
		//------------------------------------//---------------------------------------//
		
		System.out.println("\n->->->->->-> Phase 3 <-<-<-<-<-<-<-\n".toUpperCase());
		
		System.out.println(Phase3.i.reverse("  níraM esoJ  ")); 				//3.1


	}


}
