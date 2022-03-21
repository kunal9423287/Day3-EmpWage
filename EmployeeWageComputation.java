package employeeWage;

public class EmployeeWageComputation {

		public static void main(String[] args) {
			final int isPartTime = 1;
		    final int isFullTime = 2;
		    final int EmpRatePerHr = 20;
		    final int WORKINGDAYS = 20;

		    int totalWage = 0;
		    for (int day = 1; day <= WORKINGDAYS; day++)
		    {
		        int empCheck = (int) (Math.random() * 100) % 3;
		        int workingHours =0;
		        switch (empCheck)
		        {
		            case isFullTime:
		                workingHours = 8;
		                break;
		            case isPartTime:
		                workingHours = 4;
		                break;
		            default:
		        }
		        int wage = workingHours * EmpRatePerHr;
		        System.out.println("Day " + day + " wage is:" + wage);
		        totalWage += wage;
		    }
		    System.out.println("Total wage for a month is " + totalWage); 
			}
		}
		            


