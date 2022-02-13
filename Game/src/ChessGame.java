import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChessGame extends Board{
	
	static final int ROW = 8;
	static final int COLUMN = 8;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		Scanner scan = new Scanner(new File("board3.txt"));
		String[][] arr = new String[ROW][COLUMN];
		
		//Satir satir dosya okuma
		while (scan.hasNextLine()) {
			
			for (int i = 0; i < arr.length; i++) {
				String[] line = scan.nextLine().split(" ");
				
				for (int j = 0; j < line.length; j++) {
					arr[i][j] = line[j];
				}
			}
		}
	
		Board b = new Board();
		b.setBoard(arr);
		
		//Birinci oyuncu icin (Siyah taslar icin)
		ArrayList<Player1> pl = new ArrayList<Player1>();
		boolean bulundu = true;

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				
				Player1 p1 = new Player1();
			
				// siyah sah
				if (arr[i][j].equals("ss")) {
			
					p1.setTas(i, j, "Sah","Siyah");
					p1.setPuan(b.hesaplaSiyah(p1));
					pl.add(p1);
				} 
				
				// siyah kale
				else if (arr[i][j].equals("ks")) {
				
					p1.setTas(i, j, "Kale","Siyah");
					p1.setPuan(b.hesaplaSiyah(p1));
					pl.add(p1);
				}

				// siyah piyon
				else if (arr[i][j].equals("ps")) {
			
					p1.setTas(i, j, "Piyon","Siyah");
					p1.setPuan(b.hesaplaSiyah(p1));
					pl.add(p1);
				} 
				
				// siyah vezir
				else if (arr[i][j].equals("vs")) {
				
					p1.setTas(i, j, "Vezir","Siyah");
					p1.setPuan(b.hesaplaSiyah(p1));
					pl.add(p1);
				} 
				
				// siyah at
				else if (arr[i][j].equals("as")) {
					
					p1.setTas(i, j, "At","Siyah");
					p1.setPuan(b.hesaplaSiyah(p1));
					pl.add(p1);
				} 
				
				// siyah fil
				else if (arr[i][j].equals("fs")) {
					
					p1.setTas(i, j, "Fil","Siyah");
					p1.setPuan(b.hesaplaSiyah(p1));
					pl.add(p1);
				}

				else
					bulundu=false;

			}
			if (bulundu == false) {
				
			//	System.out.println(" Taþ bulunamadý!");
			}
		}

		//Ikinci oyuncu icin (Beyaz taslar icin)
		ArrayList<Player2> pl2 = new ArrayList<Player2>();
		bulundu = true;
		
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				
				Player2 p2 = new Player2();
			
				// beyaz þah
				if (arr[i][j].equals("sb")) {
			
					p2.setTas(i, j, "Sah","Beyaz");
					p2.setPuan(b.hesaplaBeyaz(p2));
					pl2.add(p2);
				} 
				
				// beyaz piyon
				else if (arr[i][j].equals("pb")) {
					
					p2.setTas(i, j, "Piyon","Beyaz");
					p2.setPuan(b.hesaplaBeyaz(p2));
					pl2.add(p2);
				} 
				
				// beyaz vezir
				else if (arr[i][j].equals("vb")) {
				
					p2.setTas(i, j, "Vezir","Beyaz");
					p2.setPuan(b.hesaplaBeyaz(p2));
					pl2.add(p2);

				} 
				
				// beyaz at
				else if (arr[i][j].equals("ab")) {
				
					p2.setTas(i, j, "At","Beyaz");
					p2.setPuan(b.hesaplaBeyaz(p2));
					pl2.add(p2);
				} 
				
				// beyaz fil
				else if (arr[i][j].equals("fb")) {
				
					p2.setTas((i), (j), "Fil","Beyaz");
					p2.setPuan(b.hesaplaBeyaz(p2));
					pl2.add(p2);
				}
				
				// beyaz kale
				else if (arr[i][j].equals("kb")) {
		
					p2.setTas((i), (j), "Kale","Beyaz");
					p2.setPuan(b.hesaplaBeyaz(p2));
					pl2.add(p2);
				}
				
				else
					bulundu = false;

			}
			if (bulundu == false) {
				
				// System.out.println("Taþ bulunamadý!");
			}
		}

	
		//Siyah satranc taslari ve puanlarini yazdir
		for (int i = 0; i < pl.size(); i++) {
			
			System.out.println("Player1: "+pl.get(i).display() + ", Puan= " + pl.get(i).getPuan());
		}
		
		System.out.println("**********************************************************************");

		//beyaz satranc taslari ve puanlarini yazdir
		for (int i = 0; i < pl2.size(); i++)
			System.out.println("Player2: " + pl2.get(i).display() + ", Puan= " + pl2.get(i).getPuan());

		System.out.println("**********************************************************************");
		
		//Siyah ve beyaz taþlar icin toplam puan hesabi
		double siyah=0;
		double beyaz=0;
		
		for (int s=0;s<pl.size();s++)  {
			siyah = siyah+(pl.get(s).getPuan());
		}
		
		System.out.println("Siyah= " + siyah);
		
		for (int s=0;s<pl2.size();s++)  {
			beyaz = beyaz+(pl2.get(s).getPuan());
		}
		
		System.out.println("Beyaz= " + beyaz);
		
	}
}
