import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SalesRepsRoutingModule } from './sales-reps-routing.module';
import { SalesRepListComponent } from './sales-rep-list/sales-rep-list.component';


@NgModule({
  declarations: [SalesRepListComponent],
  imports: [
    CommonModule,
    SalesRepsRoutingModule
  ]
})
export class SalesRepsModule { }
