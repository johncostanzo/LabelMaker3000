import java.io.File;
import java.io.PrintWriter;

public class LabelMaker {
	
	private int aisleStart;
	private int aisleEnd;
	private int sectionStart;
	private int sectionEnd;
	private char levelStart;
	private char levelEnd;
	private int positionStart;
	private int positionEnd;
	private boolean aisle2;
	private boolean aisle4;
	private boolean section2;
	private boolean section4;
	private boolean totemPole;
	
	public LabelMaker(String aisleStart, String aisleEnd, String sectionStart, String sectionEnd, 
			String levelStart, String levelEnd, String positionStart, String positionEnd, 
			boolean aisle2, boolean aisle4, boolean section2, boolean section4, boolean totemPole) 
	{
		setAisleStart(aisleStart);
		setAisleEnd(aisleEnd);
		setSectionStart(sectionStart);
		setSectionEnd(sectionEnd);
		setLevelStart(levelStart);
		setLevelEnd(levelEnd);
		setPositionStart(positionStart);
		setPositionEnd(positionEnd);
		setAisle2(aisle2);
		setAisle4(aisle4);
		setSection2(section2);
		setSection4(section4);
		setTotemPole(totemPole);
	}
	
	//mutators
  	public void setAisleStart(String aisleStart) {
  		try {
  	  		this.aisleStart = Integer.parseInt(aisleStart);
  		} catch (Exception x) {
  			inputErrorMSG();
  			
  		}
  	}
  	
  	public void setAisleEnd(String aisleEnd) {
  		try {
  			this.aisleEnd = Integer.parseInt(aisleEnd);
  			if (this.aisleStart > this.aisleEnd) {
  				inputErrorMSG();
  			}
  		} catch (Exception x) {
  			inputErrorMSG();
  		}
  	}
  	
  	public void setSectionStart(String sectionStart) {
  		try {
  			this.sectionStart = Integer.parseInt(sectionStart);
		} catch (Exception x) {
			inputErrorMSG();
  		}
  	}
    
  	public void setSectionEnd(String sectionEnd) {
  		try {
  			this.sectionEnd = Integer.parseInt(sectionEnd);
		} catch (Exception x) {
			inputErrorMSG();
  		}
  	}
  	
  	public void setLevelStart(String levelStart) {
  		try {
  			this.levelStart = levelStart.charAt(0);
  		} catch (Exception x) {
  			inputErrorMSG();
  		}
  	}
  	
  	public void setLevelEnd(String levelEnd) {
  		try {
  			this.levelEnd = levelEnd.charAt(0);
  		} catch (Exception x) {
  			inputErrorMSG();
  		}
  	}
  	
  	public void setPositionStart(String positionStart) {
  		try {
  			this.positionStart = Integer.parseInt(positionStart);
  		} catch (Exception x) {
  			inputErrorMSG();
  		}
  	}
  	
  	public void setPositionEnd(String positionEnd) {
  		try {
  			this.positionEnd = Integer.parseInt(positionEnd);
  		} catch (Exception x) {
  			inputErrorMSG();
  		}
  	}
  	
  	public void setAisle2(boolean aisle2) {
  		try {
  			this.aisle2 = aisle2;
  		} catch (Exception x) {
  			inputErrorMSG();
  		}
  	}
  	
  	public void setAisle4(boolean aisle4) {
  		try {
  			this.aisle4 = aisle4;
  		} catch (Exception x) {
  			inputErrorMSG();
  			
  		}
  	}
  	
  	public void setSection2(boolean section2) {
  		try {
  			this.section2 = section2;
  		} catch (Exception x) {
  			inputErrorMSG();
  		}
  	}
	
  	public void setSection4(boolean section4) {
  		try {
  			this.section4 = section4;
  		} catch (Exception x) {
  			inputErrorMSG();
  		}
  	}
  	
  	public void setTotemPole(boolean totemPole) {
  		try {
  			this.totemPole = totemPole;
  		} catch (Exception x) {
  			inputErrorMSG();
  		}
  	}
  	
  	public void inputErrorMSG() {
  		
  		String desktop = System.getProperty("user.home") + "\\Desktop";
        File file = new File(desktop, "LabelMakerERROR.txt");
        
        try (
        		PrintWriter output = new PrintWriter(file);
        		) {
        	output.println("Please enter data fields in the following format:");
        	output.println("-Aisles are positive integers no greater than 100");
        	output.println("-Sections are positive integers no greater than 100");
        	output.println("-Levels are single alphabetical characters");
        	output.println("-Positions are positive integers no greater than 10");
        	output.println("-Start values are ALWAYS less than end values");
        	output.println("\nPlease enter revised data and try again!");
        }
  	}
  	
	public void main() {
		
		String desktop = System.getProperty("user.home") + "\\Desktop";
        File file = new File(desktop, "labels.txt");
        
        try
        (PrintWriter output = new PrintWriter(file);
        		) {
        	for (int aisle = aisleStart; aisle < aisleEnd + 1; aisle++) {
        		for (int section = sectionStart; section < sectionEnd + 1; section++) {
        			for (int level = levelStart; level < levelEnd + 1; level++) {
        				for (int position = positionStart; position < positionEnd + 1; position++) 
        				{
        					String s1 = Integer.toString(aisle / 10) 
        							+ Integer.toString(aisle % 10);
        					
                            String s2 = Integer.toString(section / 10) 
                            		+ Integer.toString(section % 10);
                            
                            String s3 = "" + (char)level;
                            
                            String s4 = Integer.toString(position);
                            
                            output.print(s1 + "-" + s2 + "-" + s3 + "-" + s4);
                            
                            if (totemPole) {
                            	output.print("\t");
                            } else {
                            	output.print("\n");
                            }
        				}
        			}
        			
                    if (section2) {
                    	section++;
                    } else if (section4) {
                    	section +=3;
                    }
                    
                    if (totemPole) {
                    	output.println();
                    }
        		}
        		
                if (aisle2) {
                	aisle++;
                } else if (aisle4) {
                	aisle += 3;
                }
        	}
		}
	}
}