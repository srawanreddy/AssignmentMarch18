package arrayRotationwithTestcases;


public class ArrayRotation {
	private int array[];
	private int steps;
	ArrayRotation(int array[], int steps){
		this.array=array;
		this.steps=steps;
	}
	
	public int[] rotateArray() {
		for(int k=0;k<steps;k++) {
		int lastElement=array[array.length-1];
		for(int i=array.length-1;i>0;i--) {
			array[i]=array[i-1];
		}
		array[0]=lastElement;
		}
		return array;
	}
}
