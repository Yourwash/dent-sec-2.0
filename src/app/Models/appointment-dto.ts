import {Time} from "@angular/common";

export interface AppointmentDto {
  appointmentId: number | null;
  client: string | null;
  createTime: Date |null
  date: Date | null;
  operation: string | null;
  time: Time | null;
  staff: string[] | null;
}
