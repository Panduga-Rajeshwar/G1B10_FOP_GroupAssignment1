package group_assignment_1;

public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//super department object initialization
		Super_Department o1 = new Admin_Department();
		System.out.println("Welcome to Admin Department");
		System.out.println(o1.getTodaysWork());
		System.out.println(o1.getWorkDeadline());
		System.out.println(o1.isTodayAHoliday());
		
		hr_Department o2 = new hr_Department();
		System.out.println("\nWelcome to Hr Department");
		System.out.println(o2.doActivity());
		System.out.println(o2.getTodaysWork());
		System.out.println(o2.getWorkDeadline());
		System.out.println(o2.isTodayAHoliday());
		
		Tech_Department o3 = new Tech_Department();
		System.out.println("\nWelcome to Tech Department");
		System.out.println(o3.getTodaysWork());
		System.out.println(o3.getWorkDeadline());
		System.out.println(o3.getTechStackInformation());
		System.out.println(o3.isTodayAHoliday());
		
		
		

	}

}
