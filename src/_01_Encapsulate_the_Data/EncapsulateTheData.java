package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

    /*
     * itemsReceived cannot negative. All negative parameters should set
     * itemsReceived to 0.
     */

   private  int itemsReceived;
    
    public void setItemsReceived(int randomPositiveNum) {
		this.itemsReceived = randomPositiveNum;
		 if(itemsReceived < 0) {
		    	itemsReceived = 0;
		    }
	}

	public Integer getItemsReceived() {
		// TODO Auto-generated method stub
		
		return itemsReceived;
	}

    /*
     * degreesTurned must be locked between 0.0 and 360.0 inclusive. All
     * parameters outside this range should set degreesTurned to the nearest
     * bound.
     */

    private double degreesTurned;
    public void setDegreesTurned(double randomPositiveNum) {
		// TODO Auto-generated method stub
		this.degreesTurned = randomPositiveNum;
		if(degreesTurned<0.0) {
			degreesTurned = 0.0;
		}
		if(degreesTurned>360.0) {
			degreesTurned = 360.0;
		}
	}

	public Double getDegreesTurned() {
		// TODO Auto-generated method stub
		
		return degreesTurned;
		
	}
    /*
     * nomenclature must not contain an empty String. An empty String parameter
     * should set nomenclature to a String with a single space.
     */

   private String nomenclature;
   
    public void setNomenclature(String randomString) {
		// TODO Auto-generated method stub
		this.nomenclature = randomString;
		if(nomenclature.isEmpty()) {
			nomenclature = " ";
			
		}
		
	}
    
    public Object getNomenclature() {
		// TODO Auto-generated method stub
		return nomenclature;
	}
    /*
     * memberObj must not be a String. A String parameter should set memberObj
     * to a new Object(); Hint: Use the instanceof operator.
     */

    private Object memberObj;

	public void setMemberObj(Object randomObject) {
		// TODO Auto-generated method stub
		this.memberObj = randomObject;
		if(memberObj instanceof String) {
			memberObj = new Object();
		}
			
		
	}

	public Object getMemberObj() {
		// TODO Auto-generated method stub
		
		return memberObj;
	}

	

	

	

	

}
