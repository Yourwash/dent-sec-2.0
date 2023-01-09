import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProceduresRoutingModule } from './procedures-routing.module';
import { ProceduresComponent } from './procedures/procedures.component';
import { ProceduresFormComponent } from './procedures-form/procedures-form.component';


@NgModule({
  declarations: [
    ProceduresComponent,
    ProceduresFormComponent
  ],
  imports: [
    CommonModule,
    ProceduresRoutingModule
  ]
})
export class ProceduresModule { }
