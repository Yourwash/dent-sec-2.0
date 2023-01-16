import {Component, OnInit} from '@angular/core';
import {FormArray, FormBuilder, FormControl} from "@angular/forms";
import {Appointment} from "../../Models/appointment";
import {AppointmentService} from "../appointment.service";
import {ClientView} from "../../Models/client-view";
import {HttpClient} from "@angular/common/http";
import {OperationForForm} from "../../Models/operation-for-form";
import {StaffMemberForForm} from "../../Models/staff-member-for-form";
import {AppointmentToCreate} from "../../Models/appointment-to-create";

interface Dentist {
  id: number;
  name: string;
  lastName: string
  roleId: number;
}

interface Helper {
  id: number;
  name: string;
  lastName: string
  roleId: number;
}


@Component({
  selector: 'app-appointments-form',
  templateUrl: './appointments-form.component.html',
  styleUrls: ['./appointments-form.component.css']
})
export class AppointmentsFormComponent implements OnInit {

  constructor(private fb: FormBuilder, private appointmentService: AppointmentService, private http: HttpClient) {
    this.currentDate = new Date();
  }

  clients: ClientView[] = [];
  operations: OperationForForm[] = []
  staff: StaffMemberForForm[] = [];
  dentists1: Dentist[] = [];
  helpers1: Helper[] = []
  operation: OperationForForm = {id: 1, name: "Katharismos", dentists: 1, helpers: 0};
  currentDate: Date;
  appointmentToSubmit: AppointmentToCreate = {
    date: '',
    time: '',
    operationId: '',
    clientId: '',
    dentistIdList: [],
    helperIdList: []
  }

  addForm = this.fb.group({
      date: [],
      time: [],
      clientId: [],
      operationId: [this.operation.id],
      dentistIdList: this.fb.array(
        [
          this.fb.control({})
        ]),
      helperIdList: this.fb.array(
        [
          this.fb.control({}
          )
        ]
      )
    }
  );

  setStaff() {
    this.dentists1 = [];
    this.helpers1 = [];
    this.staff.forEach((staffMember) => {
        if (staffMember.roleId === 5) {
          this.dentists1.push(staffMember);
        } else {
          this.helpers1.push(staffMember);
        }
      }
    )
  }

  setFormControls() {
    this.dentistIdList.clear()
    this.helperIdList.clear()
    for (let i = 0; i < this.operation.dentists; i++) {
      this.addDentistId();
    }
    for (let i = 0; i < this.operation.helpers; i++) {
      this.addHelperId();
    }
    this.setStaff();
  }

  addDentistId() {
    this.dentistIdList.push(this.fb.control(''))
  }

  addHelperId() {
    this.helperIdList.push(this.fb.control(''))
  }

  get dentistIdList() {
    return this.addForm.get('dentistIdList') as FormArray;
  }

  get helperIdList() {
    return this.addForm.get('helperIdList') as FormArray;
  }

  ngOnInit()
    :
    void {
    this.appointmentService.fetchClients().subscribe(res => res.forEach(value => {
          this.clients.push(value)
        }
      )
    );
    this.appointmentService.fetchOperations().subscribe(res => res.forEach(value => {
          this.operations.push(value)
        }
      )
    );
    this.appointmentService.fetchStaff().subscribe(staff => staff.forEach(staffMember => {
          this.staff.push(staffMember)
        }
      )
    );
  }

  onSubmit() {
    this.formToAppointmentConverter()
    this.appointmentService.createAppointment(this.appointmentToSubmit);
  }

  formToAppointmentConverter() {
    console.log(this.addForm.value.time);
    this.appointmentToSubmit.clientId = this.addForm.value.clientId;
    this.appointmentToSubmit.date = this.addForm.value.date;
    this.appointmentToSubmit.time = this.addForm.value.time;
    let i = 0
    for (let control of this.dentistIdList.controls) {
      this.appointmentToSubmit.dentistIdList?.push(control.value)
    }
    for (let control of this.helperIdList.controls) {
      this.appointmentToSubmit.helperIdList?.push(control.value)
    }
    this.appointmentToSubmit.operationId = this.addForm.value.operationId;
  }
}
