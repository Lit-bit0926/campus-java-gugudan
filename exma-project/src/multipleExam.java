import java.util.Scanner;

public class multipleExam {	// ������ ��� ����
	public static void main(String[] args) {
		System.out.print("1~999������ ���ڸ� �Է����ּ��� : ");
        Scanner sc = new Scanner(System.in);	// ����ڰ� �Է��� ���ڸ� �޴� ���� ����� 1������ import�� �ʿ�
        int num1 = sc.nextInt();    // �Է¹��� ������ int�� ������ �����Ѵ�.
        if((num1 > 999) || (num1 < 1))	// 1~999 ������ �Ѿ�� ���� �߻� �� ���� ó��
            System.out.println("������ ������ ���� �ʽ��ϴ�. 1~999������ ���ڸ� �Է����ּ���");
        else{
            for(int i=1; i<=9; i++){	// ������ ������ ��ġ�� ��� ������ ���
                System.out.println(num1 + " * " + i + " = " + num1*i);
            }
        }
        sc.close();	// OS���� �ڿ��� �ǵ�����
	}
}