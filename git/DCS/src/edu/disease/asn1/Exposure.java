package edu.disease.asn1;
import java.util.Objects;
import java.util.UUID;
import java.time.LocalDateTime;

public class Exposure {
	
	//unique id to identify patients
	private UUID patientId;
	
	//Local date time of a patient
	private LocalDateTime dateTime;
	
	//Disease exposure type (direct exposure or indirect exposure)
	private String exposureType;
	
	/**
	 * Constructs a new {@link Exposure}
	 * @param patientId
	 * initialize {@link Exposure} class with unique id of patient
	 */
	
	public Exposure(UUID patientId) { 
		this.patientId = patientId;
	} 
	
	/**
	 * Returns patient id *
	 * @return patientId
	 */

	public UUID getpatientId() { //Patient id getter
		return patientId;
	}
	

    /**
     * @param patientId set the Id of patient
     */
    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

	/**
	 * Returns local date and time
	 * @return dateTime
	 */
	public LocalDateTime getDateTime() { //DateTime getter
		return dateTime;
	}

	/**
	 * set Local Date Time of patient
	 * @param dateTime
	 */

	public void setDateTime(LocalDateTime dateTime) { //DateTime setter
		this.dateTime = dateTime;
	}


    /**
     * Returns type of exposure ( Direct or Indirect)
     *
     * @return exposureType
     */
	public String getExposureType() { //Exposure getter
		return exposureType;
		
	}


    /**
     * @param exposureType Accepts String , it should contain only two values either D or I i.e D Indicates Direct Exposure
     *                     , I Indicates Indirect Exposure
     * @throws IllegalArgumentException If Exposure Type is other than D or I
     */
	public void setExposureType(String exposureType){ // Exposure setter
		
			if(exposureType.equals("D")||exposureType.equals("I")){//D - direct exposure 
				this.exposureType = exposureType; //I - indirect exposure
			}
			else{
				throw  new IllegalArgumentException("Exposure type should be direct or indirect exposure ('D' or 'I')");
			}
		}

	 /**
     * @return hash value which is unique to compare Objects here uniqueness is on patientId, dateTime
     */
	@Override
	public int hashCode() {
		return Objects.hash(dateTime, patientId);
	}

	 /**
     * @param obj It accepts Object as a parameter
     * @return boolean true only when both references that are pointing to same object
     *         Multiple invocations of it, should return same result, unless any of the object properties is modified that is being used in the equals() method implementation.
     */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exposure other = (Exposure) obj;
		return Objects.equals(dateTime, other.dateTime) && Objects.equals(patientId, other.patientId);
	}

	 /**
     * Print the Exposure Class Object values like PatientId,dateTime,exposureType
     * @return string with all values declared at class level
     */
    @Override
    public String toString() {
        return "Exposure{" +
                "patientId=" + patientId +
                ", dateTime=" + dateTime +
                ", exposureType='" + exposureType +
                "}";
    }


}
