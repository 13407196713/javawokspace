package ch11code;

public class EnumConsAbstract {
	public static void main(String[] args) { 
		WeekDay today = WeekDay.SAT;                        
		System.out.println("SAT的下一天为"+today.nextDay());  
		}
	public enum WeekDay {                       		
		SUN {                                  			
			public WeekDay nextDay() {
				return MON;
			}
		},
		MON {                                    		
			public WeekDay nextDay() {
				return TUE;
			}
		},
		TUE {                                    		    
			public WeekDay nextDay() {
				return WED;
			}
		},
		WED {                                   			
			public WeekDay nextDay() {
				return THU;
			}
		},
		THU {                              				//THU对象
			public WeekDay nextDay() {
				return FRI;
			}
		},
		FRI {                                  			//FRI对象
			public WeekDay nextDay() {
				return SAT;
			}
		},
		SAT {                                 			//SAT对象
			public WeekDay nextDay() {
				return SUN;
			}
				};
			public abstract WeekDay nextDay();    	

}
}
