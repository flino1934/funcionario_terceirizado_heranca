package entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of employee"));
		
		List<Employee>list = new ArrayList<>();
		
		for (int i = 1; i <=n; i++) {
			
			String name = JOptionPane.showInputDialog("Enter name employee: ");
			double valuePerHour = Double.parseDouble(JOptionPane.showInputDialog("Value per hour: "));
			int hour = Integer.parseInt(JOptionPane.showInputDialog("Hours: "));
			
			String[] select = { "Employe","Outsource Employee"};
			String type = (String) JOptionPane.showInputDialog(null, "Type ","Type of employee", JOptionPane.QUESTION_MESSAGE, null, select,select[0]);
			//Vai informar o tipo de funconario que é 
			
			if (type.equals("Employe")) {
				
				Employee e = new Employee(name, hour, valuePerHour);
				list.add(e);
				//Vai verificar se employee se for vai aplicar essa logica e instanciar na classe employee
				
			}else if (type.equals("Outsource Employee")) {
				
				double additionalCharge = Double.parseDouble(JOptionPane.showInputDialog("Additional Charge: "));
				Employee oe = new OutsourceEmployee(name, hour, valuePerHour, additionalCharge);
				//Uma classe OutsourceEmploye tambem é uma classe employee, foi feito um UpCasting
				list.add(oe);
				//Vai verificar se Outsource Employe se for vai aplicar essa logica e instanciar na classe OutsourceEmploye
			}
			
		}
		
		System.out.println("Payments: ");
		
		for (Employee em: list) {
			System.out.println("Name: "+em.getName()
			+"\nPayment: "+em.payment()+" R$");
			System.out.println();
		}
		


	}

}
