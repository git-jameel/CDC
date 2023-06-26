package edu.disease.asn1;
import java.util.Objects;
import java.util.UUID;

class Disease {
	
	//UUID of the patient
	 UUID diseaseid;
	 
	 //Name of the disease
	 String name;
	 
	 /**
	     * Returns id of the disease
	     *
	     * @return diseaseId
	     */
	    public UUID getDiseaseId() {
	        return diseaseid;
	    }

	    /**
	     * @param diseaseId set the UUID of the disease
	     */
	    public void setDiseaseId(UUID diseaseId) {
	        this.diseaseid = diseaseId;
	    }

	    /**
	     * Returns Name of disease
	     *
	     * @return name
	     */
	    public String getName() {
	        return name;
	    }

	    /**
	     * @param name set the disease name
	     */
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    /**
	     * @return hash value which is unique to compare Objects here uniqueness is on patientId
	     */
	@Override
	public int hashCode() {
		return Objects.hash(diseaseid);
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
		Disease other = (Disease) obj;
		return Objects.equals(diseaseid, other.diseaseid);
	}
	  /**
     * Print the Disease Class Object values like DiseaseId,Name
     * @return string with all values declared at class level
     */
    @Override
    public String toString() {
        return "Disease{" +
                "diseaseId=" + diseaseid +
                ", name='" + name +
                "}";
	}
}
