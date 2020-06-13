package arraycopy;
// arraycopy를 이용하여 2차원 배열을 저장하는 행렬 만들기
public class Arraycopy {
	// 1차원 배열 print 메소드
	public static void print1(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	// 2차원 배열 print 메소드
	public static void print2(double[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%.6f\t",arr[i][j]);
			}
			System.out.println();
		}
		System.out.print("-------------------"+"\n");
	}
	
	public static void main(String[] args) {
		// 1차원 배열의 깊은 복사
		int[] arr1 = {1, 2, 3};
		int[] copyArr1 = new int[arr1.length];
		
		System.arraycopy(arr1, 0, copyArr1, 0, arr1.length);
		
		System.out.println("1차원 배열의 Deep copy");
		Arraycopy.print1(arr1);
		System.out.print("\n"+"-------------------"+"\n");
		Arraycopy.print1(copyArr1);
		System.out.println("\n");
		
		// 2차원 배열의 깊은 복사
		double[][] arr2 = {{1,2,3}, {2,3,4}, {3,4,5}};
		double[][] copyArr2 = new double[arr2.length][arr2[0].length];
		
		for(int i = 0; i < arr2.length; i++) {
			System.arraycopy(arr2[i], 0, copyArr2[i], 0, arr2[0].length);
		}
		
		System.out.println("2차원 배열의 Deep copy");
		Arraycopy.print2(arr2);
		Arraycopy.print2(copyArr2);
		
		System.out.println("2차원 배열 원본 메모리 주소 : " + arr2);
		System.out.println("2차원 배열 복사본 메모리 주소 : " + copyArr2);
	}
}
