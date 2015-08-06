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
	// TODO input val
  	public void setAisleStart(String aisleStart) {
  		this.aisleStart = Integer.parseInt(aisleStart);
  	}
  	
  	public void setAisleEnd(String aisleEnd) {
  		this.aisleEnd = Integer.parseInt(aisleEnd);
  	}
  	
  	public void setSectionStart(String sectionStart) {
  		this.sectionStart = Integer.parseInt(sectionStart);
  	}
    
  	public void setSectionEnd(String sectionEnd) {
  		this.sectionEnd = Integer.parseInt(sectionEnd);
  	}
  	
  	public void setLevelStart(String levelStart) {
  		this.levelStart = levelStart.charAt(0);
  	}
  	
  	public void setLevelEnd(String levelEnd) {
  		this.levelEnd = levelEnd.charAt(0);
  	}
  	
  	public void setPositionStart(String positionStart) {
  		this.positionStart = Integer.parseInt(positionStart);
  	}
  	
  	public void setPositionEnd(String positionEnd) {
  		this.positionEnd = Integer.parseInt(positionEnd);
  	}
  	
  	public void setAisle2(boolean aisle2) {
  		this.aisle2 = aisle2;
  	}
  	
  	public void setAisle4(boolean aisle4) {
  		this.aisle4 = aisle4;
  	}
  	
  	public void setSection2(boolean section2) {
  		this.section2 = section2;
  	}
	
  	public void setSection4(boolean section4) {
  		this.section4 = section4;
  	}
  	
  	public void setTotemPole(boolean totemPole) {
  		this.totemPole = totemPole;
  	}
  	
	public void main() {
		
		String desktop = System.getProperty("user.home") + "\\Desktop";
        File file = new File(desktop, "labels.txt");
        
        try (PrintWriter output = new PrintWriter(file);) {
        	
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
                            	output.print("\t");
                            }
                            
        				}
        			}
        			
                    if (section2) {
                    	section++;
                    } else if (section4) {
                    	section +=3;
                    }
                    
            		output.println();
        			
        		}
        		

        		
                if (aisle2) {
                	aisle++;
                } else if (aisle4) {
                	aisle += 3;
                }
        		
        	}
        } catch(Exception ex) {
        	//TODO
        	}
	}
}