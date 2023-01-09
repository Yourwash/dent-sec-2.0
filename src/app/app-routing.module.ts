import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';


const appRoutes: Routes = [
  {
    path: 'clients',
    loadChildren: () => import('./clients/clients.module').then(m => m.ClientsModule)
  },
  {
    path: 'salesReps',
    loadChildren: () => import('./salesReps/sales-reps.module').then(m => m.SalesRepsModule)
  },
  {
    path: 'appointments',
    loadChildren: () => import('./appointments/appointments.module').then(m => m.AppointmentsModule),
  }
];

@NgModule({
  imports: [RouterModule.forRoot(
    appRoutes,
    {enableTracing: true} // <-- debugging purposes only
  )],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
