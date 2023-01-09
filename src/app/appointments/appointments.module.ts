import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AppointmentsRoutingModule } from './appointments-routing.module';
import { AppointmentsFormComponent } from './appointments-form/appointments-form.component';
import { AppointmentsListComponent } from './appointments-list/appointments-list.component';
import {FormsModule} from "@angular/forms";


@NgModule({
  declarations: [
    AppointmentsFormComponent,
    AppointmentsListComponent
  ],
  imports: [
    CommonModule,
    AppointmentsRoutingModule,
    FormsModule
  ]
})
export class AppointmentsModule { }
