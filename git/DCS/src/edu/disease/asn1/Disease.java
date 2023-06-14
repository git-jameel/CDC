package edu.disease.asn1;
import java.util.UUID;
 class Disease {
	 UUID diseaseid;
	 String name;
	/* (non-JavaDoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseid == null) ? 0 : diseaseid.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Disease other = (Disease) obj;
		if (diseaseid == null) {
			if (other.diseaseid != null)
				return false;
		} else if (!diseaseid.equals(other.diseaseid))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
