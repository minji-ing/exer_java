package multiOfArr;
// ���α׷��ӽ�(����� ����) ���ϱ�
public class MultiOfArr {
	public static void main(String[] args) {
		int[][] arrA = {{1,4},{3,2},{4,1}};
		int[][] arrB = {{3,3},{3,3}};
		int[][] multiArr = new int[arrA.length][arrB[0].length]; //arrA*arrB�� ��� arr ����
		int i = 0; //arrA ����� row ����
		
		while(i < arrA.length) { //arrA ����� row ������ŭ loop
			for(int z = 0; z < arrA[i].length; z++) { //arrA ����� column ������ŭ loop
				for(int j = 0; j < arrB.length; j++) { //arrB ����� row ������ŭ loop
					multiArr[i][z] += arrA[i][j]*arrB[j][z];
				}	
			}
			i++;
		}
		//�������� ��� ���
		for(int n = 0; n < multiArr.length; n++) {
			for(int m = 0; m < multiArr[n].length; m++) {
				System.out.print(multiArr[n][m]+"\t");
			}
			System.out.println();
		}
	}
}
