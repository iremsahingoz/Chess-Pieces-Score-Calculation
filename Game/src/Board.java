
public class Board {

	int satir;
	int sutun;
	private String board[][];

	public void setBoard(String[][] board) {
		this.board = board;
	}

	public String[][] getBoard() {

		return board;
	}

	//Tehdit altindaki siyah oyuncu icin puan hesaplayarak dondurur
	public float hesaplaSiyah(Player1 p1) {

		satir = p1.getSatir();
		sutun = p1.getSutun();
		
		//Tehdit altindaki at icin puan hesabi
		
		if ((satir+2)<8 && (sutun-1)>=0) {
			if (board[satir + 2][sutun - 1].equals("ab")) {
		
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}	
			
		}
		
		if ((satir+2)<8 && (sutun+1)<8) {
			if (board[satir + 2][sutun + 1].equals("ab")) {
			
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
		}
		
		if ((satir+1)<8 && (sutun+2)<8) {
			if (board[satir + 1][sutun + 2].equals("ab")) {

					p1.setPuan(p1.getPuan() / 2);
					return p1.getPuan();
			}
		}
		
		if ((satir+1)<8 && (sutun-2)>=0) {
			if (board[satir + 1][sutun - 2].equals("ab")) {

					p1.setPuan(p1.getPuan() / 2);
					return p1.getPuan();
			}
		}
		
		if ((satir-2)>=0 && (sutun-1)>=0) {
			if (board[satir - 2][sutun - 1].equals("ab")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
		}
		
		if ((satir-2)>=0 && (sutun+1)<8) {
			if (board[satir - 2][sutun + 1].equals("ab")) {

				p1.setPuan(p1.getPuan() / 2);	
				return p1.getPuan();
			} 
			
		}
		
		if ((satir-1)>=0 && (sutun-2)>=0) {
			if (board[satir - 1][sutun - 2].equals("ab")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}	
		}
		
		if ((satir-1)>=0 && (sutun+2)<8) {
			if (board[satir - 1][sutun + 2].equals("ab")) {

				p1.setPuan(p1.getPuan() / 2);			
				return p1.getPuan();
			}
		}

		
		//Tehdit altindaki fil icin puan hesabi
		
		int a = 1;
		while ((satir + a) < 8 && (sutun - a) >= 0) {
			if (!board[satir + a][sutun - a].equals("--") && !board[satir + a][sutun - a].equals("fb")) {
					
				break;
			}
			if (board[satir + a][sutun - a].equals("fb")) {
					
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
			a++;
		}
				
		a = 1;
		while ((sutun + a) < 8 && (satir - a) >= 0) {
			if (!board[satir - a][sutun + a].equals("--") && !board[satir - a][sutun + a].equals("fb")) {
					
				break;
			}
			if (board[satir - a][sutun + a].equals("fb")) {
				
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
			a++;
		}
			
		a = 1;
		while ((sutun - a) >= 0 && (satir - a) >= 0) {
			if (!board[satir - a][sutun - a].equals("--") && !board[satir - a][sutun - a].equals("fb")) {
					
				break;
			}
			if (board[satir - a][sutun - a].equals("fb")) {
					
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
			a++;
		}
			
		a = 1;
		while ((satir + a) < 8 && (sutun + a) < 8) {
			if (!board[satir + a][sutun + a].equals("--") && !board[satir + a][sutun + a].equals("fb")) {
				
				break;
			}
			if (board[satir + a][sutun + a].equals("fb")) {
				
				p1.setPuan(p1.getPuan() / 2);				
				return p1.getPuan();
			}
			a++;
		}
			
		//Tehdit altindaki piyon icin puan hesabi
			
		if ((satir+1)<8 && (sutun-1)>=0) {
			if (board[satir + 1][sutun - 1].equals("pb")) {
				
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			} 	
		}
			
		if ((satir+1)<8 && (sutun+1)<8) {
			if (board[satir + 1][sutun + 1].equals("pb")) {
				
				p1.setPuan(p1.getPuan() / 2);	
				return p1.getPuan();
			}	
		}
			
		//Tehdit altindaki kale icin puan hesabi
			
		for(int i=(satir-1); i>=0;i--) {
			if(!board[i][sutun].equals("--") && !board[i][sutun].equals("kb")) {
				
				break;
			}
			if (board[i][sutun].equals("kb")) {
				
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();	
			}
		}
			
		for(int i=(sutun-1); i>=0;i--) {
			if(!board[satir][i].equals("--") && !board[satir][i].equals("kb")) {
				
				break;
			}
			if (board[satir][i].equals("kb")) {

				p1.setPuan(p1.getPuan() / 2);					
				return p1.getPuan();
			}
		}
			
		for(int i=(satir+1); i<8;i++) {		
			if(!board[i][sutun].equals("--") && !board[i][sutun].equals("kb")) {
				
				break;	
			}
			if (board[i][sutun].equals("kb")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
		}
			
		for(int i=(sutun+1); i<8;i++) {
				
			if(!board[satir][i].equals("--") && !board[satir][i].equals("kb")) {
				break;
			}
				
			if (board[satir][i].equals("kb")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
		}
			
		//Tehdit altindaki sah icin puan hesabi
			
		if ((sutun-1)>=0) {
			if (board[satir][sutun - 1].equals("sb")) {

				p1.setPuan(p1.getPuan() / 2);					
				return p1.getPuan();
			} 	
		}
			
		if ((sutun+1)<8) {
			if (board[satir][sutun + 1].equals("sb")) {

					p1.setPuan(p1.getPuan() / 2);
					return p1.getPuan();		
			} 	
		}
			
		if ((satir+1)<8) {
			if (board[satir+1][sutun].equals("sb")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			} 	
		}
			
		if ((satir-1)>=0) {
			if (board[satir-1][sutun].equals("sb")) {
				
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			} 	
		}
			
		if ((satir-1)>=0 && (sutun + 1)<8) {
			if (board[satir-1][sutun + 1].equals("sb")) {
				
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			} 	
		}
			
		if ((satir-1)>=0 && (sutun - 1)>=0) {
			if (board[satir-1][sutun - 1].equals("sb")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			} 	
		}
			
		if ((satir - 1)>=0 && (sutun + 1)<8) {
			if (board[satir-1][sutun + 1].equals("sb")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			} 	
		}
			
		if ((satir + 1)<8 && (sutun - 1)>=0) {
			if (board[satir+1][sutun - 1].equals("sb")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			} 	
		} 
			
		//Tehdit altindaki vezir icin puan hesabi
				
		a = 1;
		while ((satir + a) < 8 && (sutun - a) >= 0) {
			if (!board[satir + a][sutun - a].equals("--") && !board[satir + a][sutun - a].equals("vb")) {
					
				break;
			}
			if (board[satir + a][sutun - a].equals("vb")) {
		
				p1.setPuan(p1.getPuan() / 2);	
				return p1.getPuan();
			}
			a++;
		}
				
		a = 1;
		while ((sutun + a) < 8 && (satir - a) >= 0) {
			if (!board[satir - a][sutun + a].equals("--") && !board[satir - a][sutun + a].equals("vb")) {
				
					break;
			}
			if (board[satir - a][sutun + a].equals("vb")) {
		
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
			a++;
		}
			
		a = 1;
		while ((sutun - a) >= 0 && (satir - a) >= 0) {
			if (!board[satir - a][sutun - a].equals("--")&& !board[satir - a][sutun - a].equals("vb")) {
	
				break;
			}
			if (board[satir - a][sutun - a].equals("vb")) {
					
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
			a++;
		}
			
		a = 1;
		while ((satir + a) < 8 && (sutun + a) < 8) {
			if (!board[satir + a][sutun + a].equals("--")&& !board[satir + a][sutun + a].equals("vb")) {
					
				break;
			}
			if (board[satir + a][sutun + a].equals("vb")) {
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
			a++;
		}

		for(int i=(satir-1); i>=0;i--) {
			if(!board[i][sutun].equals("--") && !board[i][sutun].equals("vb")) {
				
				break;
			}
			if (board[i][sutun].equals("vb")) {
				
				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();	
			}
		}
			
		for(int i=(sutun-1); i>=0;i--) {
			if(!board[satir][i].equals("--") && !board[satir][i].equals("vb")) {
				
				break;
			}
			if (board[satir][i].equals("vb")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
		}
			
		for(int i=(satir+1); i<8;i++) {	
			if(!board[i][sutun].equals("--") && !board[i][sutun].equals("vb")) {
				
					break;
			}	
			if (board[i][sutun].equals("vb")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();
			}
		}
			
		for(int i=(sutun+1); i<8;i++) {
				
			if(!board[satir][i].equals("--") && !board[satir][i].equals("vb")) {
				break;
			}			
			if (board[satir][i].equals("vb")) {

				p1.setPuan(p1.getPuan() / 2);
				return p1.getPuan();		
			}
		}
			
		p1.setPuan(p1.getPuan());
		return p1.getPuan();
	}
	
	//Tehdit altindaki beyaz oyuncu icin puan hesaplayarak dondurur
	public float hesaplaBeyaz(Player2 p2) {

		satir = p2.getSatir();
		sutun = p2.getSutun();
		
		//Tehdit altindaki at icin puan hesabi
		
		if ((satir+2)<8 && (sutun-1)>=0) {
			if (board[satir + 2][sutun - 1].equals("as")) {
		
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}	
			
		}
		
		if ((satir+2)<8 && (sutun+1)<8) {
			if (board[satir + 2][sutun + 1].equals("as")) {
			
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
		}
		
		if ((satir+1)<8 && (sutun+2)<8) {
			if (board[satir + 1][sutun + 2].equals("as")) {

					p2.setPuan(p2.getPuan() / 2);
					return p2.getPuan();
			}
		}
		
		if ((satir+1)<8 && (sutun-2)>=0) {
			if (board[satir + 1][sutun - 2].equals("as")) {

					p2.setPuan(p2.getPuan() / 2);
					return p2.getPuan();
			}
		}
		
		if ((satir-2)>=0 && (sutun-1)>=0) {
			if (board[satir - 2][sutun - 1].equals("as")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
		}
		
		if ((satir-2)>=0 && (sutun+1)<8) {
			if (board[satir - 2][sutun + 1].equals("as")) {

				p2.setPuan(p2.getPuan() / 2);	
				return p2.getPuan();
			} 
			
		}
		
		if ((satir-1)>=0 && (sutun-2)>=0) {
			if (board[satir - 1][sutun - 2].equals("as")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}	
		}
		
		if ((satir-1)>=0 && (sutun+2)<8) {
			if (board[satir - 1][sutun + 2].equals("as")) {

				p2.setPuan(p2.getPuan() / 2);			
				return p2.getPuan();
			}
		}

		
		//Tehdit altindaki fil icin puan hesabi
		
		int a = 1;
		while ((satir + a) < 8 && (sutun - a) >= 0) {
			if (!board[satir + a][sutun - a].equals("--") && !board[satir + a][sutun - a].equals("fs")) {
					
				break;
			}
			if (board[satir + a][sutun - a].equals("fs")) {
					
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
			a++;
		}
				
		a = 1;
		while ((sutun + a) < 8 && (satir - a) >= 0) {
			if (!board[satir - a][sutun + a].equals("--") && !board[satir - a][sutun + a].equals("fs")) {
					
				break;
			}
			if (board[satir - a][sutun + a].equals("fs")) {
				
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
			a++;
		}
			
		a = 1;
		while ((sutun - a) >= 0 && (satir - a) >= 0) {
			if (!board[satir - a][sutun - a].equals("--") && !board[satir - a][sutun - a].equals("fs")) {
					
				break;
			}
			if (board[satir - a][sutun - a].equals("fs")) {
					
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
			a++;
		}
			
		a = 1;
		while ((satir + a) < 8 && (sutun + a) < 8) {
			if (!board[satir + a][sutun + a].equals("--") && !board[satir + a][sutun + a].equals("fs")) {
				
				break;
			}
			if (board[satir + a][sutun + a].equals("fs")) {
				
				p2.setPuan(p2.getPuan() / 2);				
				return p2.getPuan();
			}
			a++;
		}
			
		//Tehdit altindaki piyon icin puan hesabi
			
		if ((satir-1)>=0 && (sutun+1)<8) {
			if (board[satir - 1][sutun + 1].equals("ps")) {
				
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			} 	
		}
			
		if ((satir-1)>=0 && (sutun-1)>=0) {
			if (board[satir - 1][sutun - 1].equals("ps")) {
				
				p2.setPuan(p2.getPuan() / 2);	
				return p2.getPuan();
			}	
		}
			
		//Tehdit altindaki kale icin puan hesabi
			
		for(int i=(satir-1); i>=0;i--) {
			if(!board[i][sutun].equals("--") && !board[i][sutun].equals("ks")) {
				
				break;
			}
			if (board[i][sutun].equals("ks")) {
				
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();	
			}
		}
			
		for(int i=(sutun-1); i>=0;i--) {
			if(!board[satir][i].equals("--") && !board[satir][i].equals("ks")) {
				
				break;
			}
			if (board[satir][i].equals("ks")) {

				p2.setPuan(p2.getPuan() / 2);					
				return p2.getPuan();
			}
		}
			
		for(int i=(satir+1); i<8;i++) {		
			if(!board[i][sutun].equals("--") && !board[i][sutun].equals("ks")) {
				
				break;	
			}
			if (board[i][sutun].equals("ks")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
		}
			
		for(int i=(sutun+1); i<8;i++) {
				
			if(!board[satir][i].equals("--") && !board[satir][i].equals("ks")) {
				break;
			}
				
			if (board[satir][i].equals("ks")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
		}
			
		//Tehdit altindaki sah icin puan hesabi
			
		if ((sutun-1)>=0) {
			if (board[satir][sutun - 1].equals("ss")) {

				p2.setPuan(p2.getPuan() / 2);					
				return p2.getPuan();
			} 	
		}
			
		if ((sutun+1)<8) {
			if (board[satir][sutun + 1].equals("ss")) {

					p2.setPuan(p2.getPuan() / 2);
					return p2.getPuan();		
			} 	
		}
			
		if ((satir+1)<8) {
			if (board[satir+1][sutun].equals("ss")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			} 	
		}
			
		if ((satir-1)>=0) {
			if (board[satir-1][sutun].equals("ss")) {
				
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			} 	
		}
			
		if ((satir-1)>=0 && (sutun + 1)<8) {
			if (board[satir-1][sutun + 1].equals("ss")) {
			
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			} 	
		}
			
		if ((satir-1)>=0 && (sutun - 1)>=0) {
			if (board[satir-1][sutun - 1].equals("ss")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			} 	
		}
			
		if ((satir - 1)>=0 && (sutun + 1)<8) {
			if (board[satir-1][sutun + 1].equals("ss")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			} 	
		}
			
		if ((satir + 1)<8 && (sutun - 1)>=0) {
			if (board[satir+1][sutun - 1].equals("ss")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			} 	
		} 
			
		//Tehdit altindaki vezir icin puan hesabi
				
		a = 1;
		while ((satir + a) < 8 && (sutun - a) >= 0) {
			if (!board[satir + a][sutun - a].equals("--") && !board[satir + a][sutun - a].equals("vs")) {
					
				break;
			}
			if (board[satir + a][sutun - a].equals("vs")) {
		
				p2.setPuan(p2.getPuan() / 2);	
				return p2.getPuan();
			}
			a++;
		}
				
		a = 1;
		while ((sutun + a) < 8 && (satir - a) >= 0) {
			if (!board[satir - a][sutun + a].equals("--") && !board[satir - a][sutun + a].equals("vs")) {
				
					break;
			}
			if (board[satir - a][sutun + a].equals("vs")) {
		
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
			a++;
		}
			
		a = 1;
		while ((sutun - a) >= 0 && (satir - a) >= 0) {
			if (!board[satir - a][sutun - a].equals("--")&& !board[satir - a][sutun - a].equals("vs")) {
	
				break;
			}
			if (board[satir - a][sutun - a].equals("vs")) {
					
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
			a++;
		}
			
		a = 1;
		while ((satir + a) < 8 && (sutun + a) < 8) {
			if (!board[satir + a][sutun + a].equals("--")&& !board[satir + a][sutun + a].equals("vs")) {
					
				break;
			}
			if (board[satir + a][sutun + a].equals("vs")) {
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
			a++;
		}

		for(int i=(satir-1); i>=0;i--) {
			if(!board[i][sutun].equals("--") && !board[i][sutun].equals("vs")) {
				
				break;
			}
			if (board[i][sutun].equals("vs")) {
				
				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();	
			}
		}
			
		for(int i=(sutun-1); i>=0;i--) {
			if(!board[satir][i].equals("--") && !board[satir][i].equals("vs")) {
				
				break;
			}
			if (board[satir][i].equals("vs")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
		}
			
		for(int i=(satir+1); i<8;i++) {	
			if(!board[i][sutun].equals("--") && !board[i][sutun].equals("vs")) {
				
					break;
			}	
			if (board[i][sutun].equals("vs")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();
			}
		}
			
		for(int i=(sutun+1); i<8;i++) {
				
			if(!board[satir][i].equals("--") && !board[satir][i].equals("vs")) {
				break;
			}			
			if (board[satir][i].equals("vs")) {

				p2.setPuan(p2.getPuan() / 2);
				return p2.getPuan();		
			}
		}
			
		p2.setPuan(p2.getPuan());
		return p2.getPuan();
	}
}
