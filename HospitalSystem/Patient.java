
import java.util.HashSet;
/** Please see Physician admitPhysician
 *
 */
public class Patient {
    private Hospital admittedHospital;
    //treat physicians
    private HashSet<Physician> treatedPhysicians;

    // Either delete this attribute corresponding to UML or add this attribute in UML
    private Physician admitPhysician;

    public Physician getAdmitPhysician() {
        return admitPhysician;
    }

    public void setAdmitPhysician(Physician admitPhysician) {
        this.admitPhysician = admitPhysician;
    }

    public Hospital getAdmittedHospital() {
        return admittedHospital;
    }

    public void setAdmittedHospital(Hospital admittedHospital) {
        this.admittedHospital = admittedHospital;
    }

    public void addPhysicians(Physician physician) {
        if (treatedPhysicians == null)
            treatedPhysicians = new HashSet<>();
        treatedPhysicians.add(physician);
    }
}
