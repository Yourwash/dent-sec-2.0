import {Time} from "@angular/common";

export interface ClientView {

  id: number | null;
  name: string | null;
  lastName: string | null;
  dob: Date | null;
  createTime: Time | null;
  phoneNumber: string | null;
  email: string | null;
}
