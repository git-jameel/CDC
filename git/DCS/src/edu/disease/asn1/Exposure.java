package edu.disease.asn1;
import java.util.UUID;
import java.time.LocalDateTime;

public class Exposure {
	private UUID patientid;
	private LocalDateTime dateTime;
	String exposureType;
	
	public Exposure(UUID patientid) { //Constructor to set id
		this.patientid = patientid;
	}
	
	
	public static void main(String[] args) {
		UUID uuid = new UUID((int)2,(int)0);
		Exposure expo = new Exposure(uuid);
		expo.setExposureType("I");
		System.out.println("Patient id:\t\t DateTime:\t\t ExposureType");
		System.out.println(expo.patientid+"\t"+LocalDateTime.now()+"\t "+expo.exposureType);
		//Patient p = new Patient(5,5);
	}


	public UUID getPatientid() { //Patient id getter
		return patientid;
	}


	public LocalDateTime getDateTime() { //DateTime getter
		return dateTime;
	}


	public void setDateTime(LocalDateTime dateTime) { //DateTime setter
		this.dateTime = dateTime;
	}


	public String getExposureType() { //Exposure getter
		return exposureType;
		
	}


	public void setExposureType(String exposureType){ // Exposure setter
		
			if(exposureType.equals("D")||exposureType.equals("I")){//D - direct exposure 
				this.exposureType = exposureType; //I - indirect exposure
			}
			else{
				IllegalArgumentException iec = new IllegalArgumentException();
				throw iec;
			}
		}
	
	@Override
	public boolean equals(Object obj) { /**
	checks whether the two objects are equal or not*/
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exposure other = (Exposure) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (patientid == null) {
			if (other.patientid != null)
				return false;
		} else if (!patientid.equals(other.patientid))
			return false;
		return true;
	}
	
	/* (non-JavaDoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {/**
	If the objects are equal the hashCode will be same for the two objects else the hashCode will be different*/
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + ((patientid == null) ? 0 : patientid.hashCode());
		return result;
	}


	/* (non-JavaDoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	
	@Override
	public String toString() { /**
	To print the objects*/
		return patientid+"\t\t"+dateTime+"\t"+exposureType;
	}

}