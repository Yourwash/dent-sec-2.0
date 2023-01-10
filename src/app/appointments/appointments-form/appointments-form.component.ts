import {Component, OnInit} from '@angular/core';
import {FormArray, FormBuilder, FormControl} from "@angular/forms";
import {Client} from "../../Interfaces/client";
import {Appointment} from "../../Interfaces/appointment";

interface Dentist {
  staffID: number;
  name: string;
  lastName: string
}

interface Helper {
  staffID: number;
  name: string;
  lastName: string
}

interface Procedure {
  name: string;
  dentists: number;
  helpers: number;
}

@Component({
  selector: 'app-appointments-form',
  templateUrl: './appointments-form.component.html',
  styleUrls: ['./appointments-form.component.css']
})
export class AppointmentsFormComponent implements OnInit {

  procedures: Procedure[] = [
    {
      name: 'Aponebrosi',
      dentists: 2,
      helpers: 1
    },
    {
      name: 'Aponebrosi2',
      dentists: 1,
      helpers: 2
    }]
  clients: Client[] = [
    {clientID: 2, name: 'asdasd', lastName: "Asdasd", email: "Asdasda", number: "asdasd", dob: "asdasd"},
    {
      clientID: 1,
      name: "Cecelia",
      lastName: "Lyddon",
      email: "clyddon0@cbc.ca",
      number: "310-997-2204",
      dob: "1/26/1982"
    },
    {
      clientID: 2,
      name: "Edmon",
      lastName: "Conwell",
      email: "econwell1@wix.com",
      number: "811-374-8252",
      dob: "8/28/1989"
    },
    {
      clientID: 3,
      name: "Bent",
      lastName: "Wrate",
      email: "bwrate2@google.de",
      number: "735-301-6841",
      dob: "11/1/1992"
    },
    {
      clientID: 4,
      name: "Laetitia",
      lastName: "Tregust",
      email: "ltregust3@hao123.com",
      number: "438-168-2890",
      dob: "1/26/1996"
    },
    {
      clientID: 5,
      name: "Pavla",
      lastName: "Birth",
      email: "pbirth4@goo.ne.jp",
      number: "918-187-8750",
      dob: "12/2/1982"
    }
  ]
  dentists1: Dentist[] = [
    {staffID: 1, name: 'Stratos', lastName: 'Dionisiou'},
    {staffID: 3, name: 'Makis', lastName: 'Dimakis'}
  ]
  helpers1: Helper[] = [
    {staffID: 2, name: 'Tina', lastName: 'turner'},
    {staffID: 4, name: 'Billy', lastName: 'Joel'}
  ]
  procedure: Procedure;
  addForm = this.fb.group({
    clientName: [''],
    clientLastName: [''],
    procedure: [''],
    dentists: this.fb.array(
      [
        this.fb.control({})
      ]
    ), helpers: this.fb.array(
      [
        this.fb.control({})
      ]
    ),
    date: [''],
    time: [''],
  });

  setFormControls() {
    console.log(1)
    this.dentists.clear()
    this.helpers.clear()
    for(let i =0; i<this.procedure.helpers; i++){
      this.addDentists();
    }
    for(let i =0; i<this.procedure.dentists; i++){
      this.addHelpers();
    }
    console.log(this.helpers.controls)
  }
// appointment : Appointment;
  get dentists() {
    return this.addForm.get('dentists') as FormArray;
  }
  addDentists() {
    this.dentists.push(this.fb.control(''))
  }

  get helpers() {
    return this.addForm.get('helpers') as FormArray;
  }

  addHelpers() {
    this.helpers.push(this.fb.control(''))
  }

  currentDate: Date;

  constructor(private fb: FormBuilder) {
    this.currentDate = new Date();
    this.procedure = {name: 'Katharismos', dentists: 1, helpers: 0}
  }

  ngOnInit(): void {
  }

  onSubmit() {
    console.log(this.addForm.value);
  }
}
