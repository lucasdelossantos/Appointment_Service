## About
The appointment service uses in-memory data structures to support storing appointments (no database required). In addition, there is no user interface for this milestone. You will verify the appointment service through JUnit tests. The appointment service contains an appointment object along with the appointment service. The requirements are outlined below.

## Appointment Class Requirements
- The appointment object shall have a required unique appointment ID string that cannot be longer than 10 characters. 
- The appointment ID shall not be null and shall not be updatable.
- The appointment object shall have a required appointment Date field. 
- The appointment Date field cannot be in the past. 
- The appointment Date field shall not be null. 
- Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past. 
- The appointment object shall have a required description String field that cannot be longer than 50 characters. 
- The description field shall not be null.
## Appointment Service Requirements
- The appointment service shall be able to add appointments with a unique appointment ID.
- The appointment service shall be able to delete appointments per appointment ID.