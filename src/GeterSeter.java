public class GeterSeter {

	public static void main(String[] args) {
		
		Encapsulate.setFirstName("Joon"); // ����������� ���������� firstName
		String ln = "Snoy"; // �� ����������� ���������� firstName lastname
		

		if (Encapsulate.MoznoStvority(Encapsulate.getFirstName(), ln)) { // �������� �� ����������� �������� 
															//������ ������ � ������ �� ������ ����� (<7)
			Encapsulate e = new Encapsulate(Encapsulate.getFirstName(), ln, 25);
			System.out.println(e);
		}else {System.out.println("��� ����� �������");
			
		}

		
		// 9 ������: ���� ������� ������ �������� �� ���� ��� ���, � ����� ��� ������
	}

}
