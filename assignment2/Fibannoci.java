package week2.assignment2;

public class Fibannoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  firstNum=0;
		int secNum=1;
		int sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 1; i <6; i++)
		{                                              
			sum=firstNum+secNum;
					System.out.println(sum);
			firstNum=secNum;
			secNum=sum;

		}
		

	}

}
