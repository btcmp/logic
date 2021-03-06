package logic_5;

import java.util.Arrays;

public class Soal1 {

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
	
	public void setDataArray(int n){
		this.kolom = this.getTriangular(n);
		this.baris = this.kolom;
		this.data = new String[this.baris][this.kolom];
		int[] dataArr = this.getTriangularArr(n);
		
		for(int bangun = 0; bangun < n; bangun++){
			for(int i = 0; i < this.baris; i++){
				for(int j = 0; j < this.kolom; j++){
					//manual node
					for(int i2 = dataArr[bangun]; i2 < dataArr[bangun+1]; i2++){
						for(int j2 = dataArr[bangun]; j2 < dataArr[bangun+1]; j2++){
							this.data[i2][j2] = "*";
						}
					}
					
					/*for(int i2 = 1; i2 < 3; i2++){
						for(int j2 = 1; j2 < 3; j2++){
							this.data[i2][j2] = "*";
						}
					}
					
					for(int i2 = 3; i2 < 6; i2++){
						for(int j2 = 3; j2 < 6; j2++){
							this.data[i2][j2] = "*";
						}
					}
					for(int i2 = 6; i2 < 10; i2++){
						for(int j2 = 6; j2 < 10; j2++){
							this.data[i2][j2] = "*";
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
		Soal1 jawab = new Soal1();
		int n = 4;
		jawab.setDataArray(n);
		jawab.showData();
	}
	
}
