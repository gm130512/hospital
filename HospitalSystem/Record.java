
import java.util.Date;

public class Record {
    private Patient patient;
    private Physician physician;
    private Date date;
    private String result;

    public Record(Patient patient, Physician physician, Date date, String result) {
        this.patient = patient;
        this.physician = physician;
        this.date = date;
        this.result = result;
    }

    public Patient getPatient() {
        return patient;
    }

    public Physician getPhysician() {
        return physician;
    }

    public Date getDate() {
        return date;
    }

    public String getResult() {
        return result;
    }
}
