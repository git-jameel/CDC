package edu.disease.asn1;
import java.util.UUID;
 class Patient {
	UUID patientid;
	String firstname;
	String lastname;
	Exposure[] exposure;
	UUID[] diseaseid;
	 int maxDiseases;
	 int maxExposures;
	
	public Patient( int maxDiseases, int maxExposures) {
		if(maxDiseases>0 && maxExposures>0)
		{
			exposure = new Exposure[maxDiseases];
			diseaseid = new UUID[maxExposures];
			
		}
		else
		{
			IllegalArgumentException iae = new IllegalArgumentException();
			throw iae;
		}
	}
	static int i = 0;
	static int j = 0;
	 void addDisease(UUID args){
		 if(i <= maxDiseases)
			 diseaseid[i++] = args;
		 else
		 {
			 IndexOutOfBoundsException ioe = new IndexOutOfBoundsException();
			 System.out.println("Disease array is full...");
			 throw ioe;
		 }
	 }
		 
		 void addExposure(Exposure args){
			 if(i <= maxDiseases)
				 exposure[j++] = args;
			 else
			 {
				 IndexOutOfBoundsException ioe = new IndexOutOfBoundsException();
				 System.out.println("Exposure array is full...");
				 throw ioe;
			 }
		 }

		/* (non-JavaDoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((patientid == null) ? 0 : patientid.hashCode());
			return result;
		}

		/* (non-JavaDoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Patient other = (Patient) obj;
			if (patientid == null) {
				if (other.patientid != null)
					return false;
			} else if (!patientid.equals(other.patientid))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return patientid+" ";
		}
}
