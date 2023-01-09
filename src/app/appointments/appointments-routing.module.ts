import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AppointmentsListComponent} from "./appointments-list/appointments-list.component";
import {AppointmentsFormComponent} from "./appointments-form/appointments-form.component";


const appointmentsRoutes: Routes = [
  { path: '',  component: AppointmentsListComponent},
  { path: '',  component: AppointmentsFormComponent},
  // { path: 'clients/:id', component: ClientDetailComponent}
];
@NgModule({
  imports: [RouterModule.forChild(appointmentsRoutes)],
  exports: [RouterModule]
})
export class AppointmentsRoutingModule { }
