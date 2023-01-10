interface Doctor {
  fullName:string;
}

interface Helper {
  fullName:string;
}

export interface Appointment {
  appointmentID:number;
  clientName: string;
  clientLastName: string;
  procedure: string;
  date: string;
  time: string;
  doctors: Doctor[];
  helpers: Helper[];


}
