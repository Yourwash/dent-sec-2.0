import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {ClientsRoutingModule} from './clients-routing.module';
import {ClientListComponent} from './client-list/client-list.component';
import {ClientDetailsComponent} from './client-details/client-details.component';
import {FormsModule} from "@angular/forms";
import {UpdateFormComponent} from './update-form/update-form.component';
import {HttpService} from "../services/http.service";


@NgModule({
  declarations: [
    ClientListComponent,
    ClientDetailsComponent,
    UpdateFormComponent
  ],
  exports: [
    ClientDetailsComponent
  ],
  imports: [
    CommonModule,
    ClientsRoutingModule,
    FormsModule,
  ],
  providers: [
    HttpService
  ]
})
export class ClientsModule {
}
