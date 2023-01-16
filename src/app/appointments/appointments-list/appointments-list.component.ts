import {Component, OnInit} from '@angular/core';

import {HttpClient} from "@angular/common/http";
import {AppointmentService} from "../appointment.service";
import {AppointmentView} from "../../Models/appointment-view";


@Component({
  selector: 'app-appointments-list',
  templateUrl: './appointments-list.component.html',
  styleUrls: ['./appointments-list.component.css']
})
export class AppointmentsListComponent implements OnInit{

  constructor(private appointmentService: AppointmentService, private http: HttpClient) {}

  appointments: AppointmentView[] = [];
  page: number = 0;

  ngOnInit() {
    this.appointmentService.fetchAppointments(this.page).subscribe(res => res.forEach(value => {
          this.appointments.push(value)
        }
      )
    );
  }

  goDownOnePage() {
    if (this.page < 5) {
      this.page = this.page + 1;
      this.appointmentService.fetchAppointments(this.page).subscribe(res => res.forEach(value => {
            this.appointments.push(value);
          }
        )
      );
    }
  }

  goUpOnePage() {
    if (this.page > 0) {
      this.page = this.page - 1;
      this.appointmentService.fetchAppointments(this.page).subscribe(res => res.forEach(value => {
            this.appointments.push(value);
          }
        )
      );
    }


  }
}
