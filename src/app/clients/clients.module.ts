import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {ClientsRoutingModule} from './clients-routing.module';
import {ClientListComponent} from './client-list/client-list.component';
import {FormsModule} from "@angular/forms";
import {HttpService} from "../services/http.service";


@NgModule({
  declarations: [
    ClientListComponent,
  ],
  exports: [
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
