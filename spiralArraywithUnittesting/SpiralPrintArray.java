package spiralArraywithUnittesting;

import java.util.*;

public class SpiralPrintArray {
public int[] printSpiralArray(int array[][]) {
	
	int noOfCols=array.length;
	int noOfRows=array[0].length;
	int rowStart=0;
	int rowEnd=noOfRows-1;
	int colStart=0;
	int colEnd=noOfCols-1;
	int[] spiralArray=new int[noOfCols*noOfRows];
	int index=0;
	while(spiralArray.length<=noOfCols*noOfRows) {
		for(int i=rowStart;i<=rowEnd;i++) spiralArray[index++]=array[colStart][i];
		colStart++;
		for(int i=colStart;i<=colEnd;i++) spiralArray[index++]=array[i][rowEnd];
		rowEnd--;
		if(colEnd<colStart) break;
		for(int i=rowEnd;i>=rowStart;i--) spiralArray[index++]=array[colEnd][i];
		colEnd--;
		if(rowEnd<rowStart) break;
		for(int i=colEnd;i>=colStart;i--) spiralArray[index++]=array[i][rowStart];
		rowStart++;	
	}
	return spiralArray;
}

}
