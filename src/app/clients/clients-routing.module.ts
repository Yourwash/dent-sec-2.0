import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ClientListComponent} from "./client-list/client-list.component";

const clientsRoutes: Routes = [
  { path: '',  component: ClientListComponent},
  // { path: 'clients/:id', component: ClientDetailComponent}
];

@NgModule({
  imports: [RouterModule.forChild(clientsRoutes)],
  exports: [RouterModule]
})
export class ClientsRoutingModule { }
