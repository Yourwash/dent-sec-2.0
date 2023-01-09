import { Component } from '@angular/core';
import {Appointment} from "../../Interfaces/appointment";

@Component({
  selector: 'app-appointments-list',
  templateUrl: './appointments-list.component.html',
  styleUrls: ['./appointments-list.component.css']
})
export class AppointmentsListComponent {

  appointments: Appointment[] = [];

}
