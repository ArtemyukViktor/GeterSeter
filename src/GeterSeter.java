public class GeterSeter {

	public static void main(String[] args) {
		
		Encapsulate.setFirstName("Joon"); // статическая переменная firstName
		String ln = "Snoy"; // НЕ статическая переменная firstName lastname
		

		if (Encapsulate.MoznoStvority(Encapsulate.getFirstName(), ln)) { // проверка на возможность создания 
															//обекта класса а именно на длинну имени (<7)
			Encapsulate e = new Encapsulate(Encapsulate.getFirstName(), ln, 25);
			System.out.println(e);
		}else {System.out.println("имя очень длинное");
			
		}

		
		// 9 строка: надо сначала узнать ядовитий ли гриб или нет, а потом его кушать
	}

}
