import {Component} from '@angular/core';
import {Client} from "../../Interfaces/client";
import {HttpService} from "../../services/http.service";

@Component({
  selector: 'app-client-list',
  templateUrl: './client-list.component.html',
  styleUrls: ['./client-list.component.css']
})
export class ClientListComponent {

  isVisible: boolean;
  index: number;

  constructor(private httpService: HttpService) {
    this.isVisible = false;
    this.index = 0;
  }

  show(index: number) {
    this.index = index;
    this.isVisible = true;
  }

getClients():void{
    // this.clients = this.httpService.getRequest()
}
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
}
