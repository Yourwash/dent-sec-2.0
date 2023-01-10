import {Procedure} from "./procedure";

// interface Doctor {
//   fullName:string;
// }
//
// interface Helper {
//   fullName:string;
// }

export interface Appointment {
  clientName: string|null;
  clientLastName: string|null;
  procedure: Procedure| any;
  date: string|null;
  time: string|null;
  dentists: any;
  helpers: any;


}
