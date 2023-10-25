package package1;
import java.util.*;
public class CollegeList {
	public static void main(String[] args)throws Exception {
		
		Student s = new Student();
		Employee e = new Employee();
		Faculty f = new Faculty();
		Scanner scn = new Scanner(System.in);
		boolean indicator = true;
		while(indicator) {
			try { 
				System.out.println("Select one.");
				System.out.print("Which one are you [E]Employee, [F]Faculty or [S]Student? ");
				char who = scn.next().toUpperCase().charAt(0);
				switch(who) {
				case 'E':
					System.out.print("Type your name: ");
					String name = scn.next();
					e.setName(name);
					
					scn.nextLine();
					
					System.out.print("Type your contact no.: ");
					String conNum = scn.next();
					e.setContactNum(conNum);
					
						System.out.print("Please enter your monthly salary: ");
						double monSal = scn.nextDouble();
						e.setSalary(monSal);
						
						
						System.out.print("Please enter your department: ");
						String dep = scn.next();
						e.setDepartment(dep);
						
						System.out.println("");
						System.out.println("*******************************");
						System.out.println("");
						
						System.out.println("Name: " + e.getName());
						System.out.println("Contact no: " + e.getContactNum());
						System.out.println("Monthly Salary " + e.getSalary());
						System.out.println("Department: " + e.getDepartment());
						
						System.out.print("Would you like to continue Y or N? ");
						char cont = scn.next().toUpperCase().charAt(0);
						if(cont == 'Y') {
							System.out.println("");
							System.out.println("*******************************");
							System.out.println("");
							continue;
						}
						else {
							indicator = false;
						}
						
						break;
				case 'F':
					System.out.print("Type your name: ");
					String name1= scn.next();
					f.setName(name1);
					
					scn.nextLine();
					
					System.out.print("Type your contact no.: ");
					String conNum1 = scn.next();
					f.setContactNum(conNum1);	
						System.out.print("Press [Y] if Regular and [N] if not: ");
						char pick = scn.next().toUpperCase().charAt(0);
							if(pick == 'Y') {
								f.setStatus('Y');
								System.out.print("Please enter your monthly salary: ");
								double monSal2 = scn.nextDouble();
								f.setSalary(monSal2);
								
								System.out.print("Please enter your department: ");
								String dep2 = scn.next();
								f.setDepartment(dep2);
								
								System.out.println("");
								System.out.println("*******************************");
								System.out.println("");
								
								System.out.println("Name: " + f.getName());
								System.out.println("Contact no: " + f.getContactNum());
								System.out.println("Monthly Salary " + f.getSalary());
								System.out.println("Department: " + f.getDepartment());
								System.out.println("Regular: " + f.isRegular());
								System.out.print("Would you like to continue Y or N? ");
								char cont1 = scn.next().toUpperCase().charAt(0);
								if(cont1 == 'Y') {
									System.out.println("");
									System.out.println("*******************************");
									System.out.println("");
									continue;
								}
								else {
									indicator = false;
								}
								
							}
							else if(pick == 'N') {
								f.setStatus('N');
								System.out.print("Please enter your monthly salary: ");
								double monSal3 = scn.nextDouble();
								f.setSalary(monSal3);
								
								scn.nextLine();
								
								System.out.print("Please enter your department: ");
								String dep3 = scn.nextLine();
								f.setDepartment(dep3);
								
								System.out.println("");
								System.out.println("*******************************");
								System.out.println("");
								
								System.out.println("Name: " + f.getName());
								System.out.println("Contact no: " + f.getContactNum());
								System.out.println("Monthly Salary " + f.getSalary());
								System.out.println("Department: " + f.getDepartment());
								System.out.println("Regular: " + f.isRegular());
								System.out.print("Would you like to continue Y or N? ");
								char cont2 = scn.next().toUpperCase().charAt(0);
								if(cont2 == 'Y') {
									System.out.println("");
									System.out.println("*******************************");
									System.out.println("");
									continue;
								}
								else {
									indicator = false;
								}
							}
							else {
								System.out.println("Please type again.");
								continue;
							}
							break;
					
					case 'S':
						System.out.print("Type your name: ");
						String name2 = scn.next();
						s.setName(name2);
						
						scn.nextLine();
						
						System.out.print("Type your contact no.: ");
						String conNum2 = scn.next();
						s.setContactNum(conNum2);
						
						System.out.print("Please enter your program: ");
						String prog = scn.next();
						s.setProgram(prog);
						
						System.out.print("Please enter your year level: ");
						int yrLvl = scn.nextInt();
						s.setYearLevel(yrLvl);
						
						System.out.println("");
						System.out.println("*******************************");
						System.out.println("");
						System.out.println("Name: " + s.getName());
						System.out.println("Contact no: " + s.getContactNum());
						System.out.println("Program : " + s.getProgram());
						System.out.println("Year Level: " + s.getYearLevel());
						System.out.print("Would you like to continue Y or N? ");
						char cont3 = scn.next().toUpperCase().charAt(0);
						if(cont3 == 'Y') {
							System.out.println("");
							System.out.println("*******************************");
							System.out.println("");
							continue;
						}
						else {
							indicator = false;
						}
						
						break;
					default:
						 System.out.println("gago");
					}
				
			}
			catch(InputMismatchException ime) {
					System.err.println("Invalid input.");
					//continue;
			}
		}
	}
}

