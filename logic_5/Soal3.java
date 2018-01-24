package logic_5;

import java.util.Arrays;

public class Soal3 {

	//variable untuk max horizontal
	//variable untuk max vertical
	//data array
	int kolom = 0;
	int baris = 0;
	String[][] data = null;
	
	//fungsi untuk mendapatkan bilangan triangular 
	//output : 1, 3, 4, 10.. 
	public int getTriangular(int n){
		int result = 0;
		
		int temp = 0;
		for(int i = 1; i <= n; i++){
			temp = temp + i;
			result = temp;
		}
		return result;
	}
	
	public int[] bilPangkat3(int n){
		int[] data = new int[n];
		
		int index = 0;
		for(int i = 1; i <= n; i++){
			data[index] = 0 + (i-1)*3 +(i - 1)*(i - 2)*3 / 2;
			index++;
		}
		return data;
	}
	
	public int[] getTriangularArr(int n){
		int[] data = new int[n+1];
		int result = 0;
		
		int temp = 0;
		int index = 0;
		data[0] = 0;
		for(int i = 1; i <= n; i++){
			temp = temp + i;
			result = temp;
			data[i] = temp; 
			index++;
		}
		return data;
	}
	
	public int bilAbc(int n){
		return n*n;
	}
	
	public int[] bilAbcArr(int n){
		int[] data = new int[n+1];
		
		data[0] = 0;
		for(int i = 1; i <= n; i++){
			data[i] = i * i;
		}
		
		return data;
	}
	
	public void setDataArray(int n){
		int[] bil1 = this.getTriangularArr(n);
		int[] bil3 = this.bilAbcArr(n);
		
		int[] result = bilPangkat3(n);
		System.out.println(Arrays.toString(bil1));
		System.out.println(Arrays.toString(bil3));
		System.out.println(Arrays.toString(result));
		
		this.kolom = this.bilAbc(n);
		this.baris = this.getTriangular(n);
		
		this.data = new String[this.baris][this.kolom];
		
		for(int bangun = 0; bangun < n; bangun++){
			for(int i = 0; i < this.baris; i++){
				for(int j = 0; j < this.kolom; j++){
					//manual node
					for(int i2 = bil1[bangun]; i2 < bil1[bangun+1]; i2++){
						for(int j2 = bil3[bangun]; j2 < bil3[bangun+1]; j2++){
							if((-i2 + j2 <= bil1[bangun]) && (i2 + j2 >= result[bangun]) ){
								data[i2][j2] = "*";
							}
						}
					}
					
					/*for(int i2 =1; i2 < 3; i2++){
						for(int j2 = 1; j2 < 4; j2++){
							if((-i2 + j2 <= 1) && (i2 + j2 >= 3) ){
								data[i2][j2] = "*";
							}
						}
					}
					
					for(int i2 =3; i2 < 6; i2++){
						for(int j2 = 4; j2 < 9; j2++){
							if((-i2 + j2 <= 3) && (i2 + j2 >= 9) ){
								data[i2][j2] = "*";
							}
						}
					}
					
					for(int i2 =6; i2 < 10; i2++){
						for(int j2 = 9; j2 < 16; j2++){
							if((-i2 + j2 <= 6) && (i2 + j2 >= 18) ){
								data[i2][j2] = "*";
							}
						}
					}*/
				}
			}
		}
		
	}
	
	//merepresentasikan isi dalam data matrix
	public void showData(){
		for(int i = 0; i < this.baris; i++){
			for(int j = 0; j < this.kolom; j++){
				System.out.print(this.data[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[]){
		Soal3 jawab = new Soal3();
		int n = 3;
		jawab.setDataArray(n);
		jawab.showData();
	}
	
}
