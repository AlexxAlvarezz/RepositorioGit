package RepositorioGit;

public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		int sum = 0;
        for (int num : sumArray) {
            sum += num;
        }
		System.out.println("La suma de los elementos de sumArray: " + sum);
		
		// User 2 fer la resta dels elements de subArray
		int resta1=subArray[0];
		for(int volt=1; volt<subArray.length;volt++){
			resta1=resta1-subArray[volt];
		}
		System.out.println("La resta da como resultado: " +  resta1);
		// User 3 fer la multiplicació dels elements de prodArray
	}

}
