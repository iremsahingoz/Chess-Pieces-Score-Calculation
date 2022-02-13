
//Siyah Oyuncu
public class Player1 {
	
	private String tip;
	private String renk="Siyah";
	private int satir;
	private int sutun;
	private float puan;
	   
	public Player1() {
		
	}
	
	public Player1(String tip, int satir,int sutun) {
		
		this.tip = tip;
		this.satir = satir;
		this.sutun = sutun;
	}
	
	public void setTas(int satir, int sutun, String tip, String renk) {
		
		this.renk=renk;
		this.satir= satir;
		this.sutun=sutun;
		
		if(tip == "Piyon") {
			
			this.tip="Piyon";
			this.puan=1;
		}
		
		else if(tip == "At") {
			
			this.tip="At";
			this.puan=3;
	    }
		
		else if(tip == "Fil") {
			
			this.tip="Fil";
			this.puan=3;	
		}
		
		else if(tip == "Kale") {
			
			this.tip="Kale";
			this.puan=5;
		}
		
		else if(tip == "Sah") {	
			
			this.tip="Sah";
			this.puan=100;	
		}
		
		else if(tip == "Vezir") {
			
			this.tip="Vezir";
			this.puan=9;
		}
		
	}
	
	public void setTip(String tip) {
		this.tip=tip;
	}
	
	public String getTip() {
		return tip;
	}
	
	public void setRenk(String renk) {
		this.renk=renk;
	}
	
	public String getRenk() {
		return renk;
	}
	
	public void setSatir(int satir) {
		this.satir = satir;
	}
	
	public int getSatir() {
		return satir;
	}
		
    public void setSutun(int sutun) {
    	this.sutun = sutun;
    }
    
    public int getSutun() {
    	return sutun;
    }
    public void setPuan(float puan) {
    	this.puan = puan;
    }
        
    public float getPuan() {
        	return puan;
    }

	public String display() {
		return "Renk= " + getRenk() + ", Tip= " + getTip() + ", Satýr= "+ getSatir() + ", Sütun= " + getSutun();
	}
	
}
	    
