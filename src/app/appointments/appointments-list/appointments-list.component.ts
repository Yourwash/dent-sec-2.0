import {Component, EventEmitter, OnInit, Output} from '@angular/core';

import {HttpClient} from "@angular/common/http";
import {AppointmentService} from "../appointment.service";
import {AppointmentDto} from "../../Models/appointment-dto";
import {Appointments} from "../../Models/appointments";
import {Observable} from "rxjs";


@Component({
  selector: 'app-appointments-list',
  templateUrl: './appointments-list.component.html',
  styleUrls: ['./appointments-list.component.css']
})
export class AppointmentsListComponent implements OnInit {

  constructor(private appointmentService: AppointmentService, private http: HttpClient) {
  }

  appointments: Appointments = {appointmentDtoList: []};
  page: number = 0;

  showClient(){
    this
  }

  ngOnInit() {
    this.appointmentService.fetchAppointments(this.page).subscribe(res => {
        this.appointments = res;
      }
    );
  }

  goDownOnePage() {
    if (this.page < 5) {
      this.page = this.page + 1;
      this.appointments.appointmentDtoList = [];
      this.appointmentService.fetchAppointments(this.page).subscribe(res => {
          this.appointments = res;
        }
      );
    }
  }

  goUpOnePage() {
    if (this.page > 0) {
      this.page = this.page - 1;
      this.appointments.appointmentDtoList = [];
      this.appointmentService.fetchAppointments(this.page).subscribe(res => {
          this.appointments = res;
        }
      );
    }
  }

}
