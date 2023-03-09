import java.io.*;
class 3darrray{
	public static void main(String[] args) {
System.out.println("3d array");		
int myarray[][][] = new int[3][4][5];

int i,j,k;
for(i=0;i<3;i++)
for(j=0;j<4;j++)
for(k=0;k<5;k++)
myarray[i][j][k]=i*j*k;
 
 for(i=0;i<3;i++){
for(j=0;j<4;j++){
for(k=0;k<5;k++)
System.out.print(myarray[i][j][k] +" ");
System.out.println();
}}
			}
}
