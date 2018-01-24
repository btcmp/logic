package logic_5;

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
	
	public void setDataArray(int n){
		this.kolom = this.getTriangular(n);
		this.baris = this.kolom;
		this.data = new String[this.baris][this.kolom];
		for(int bangun = 0; bangun < n; bangun++){

			int start = this.getTriangular(bangun);
			int end = this.getTriangular(bangun+1);
			
			for(int i = 0; i < this.baris; i++){
				for(int j = 0; j < this.kolom; j++){
					//manual node
					for(int i2 = start; i2 < end; i2++){
						for(int j2 = start; j2 < end; j2++){
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
		int n = 3;
		jawab.setDataArray(n);
		jawab.showData();
	}
	
}
