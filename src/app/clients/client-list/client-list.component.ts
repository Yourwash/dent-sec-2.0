import {Component, OnInit} from '@angular/core';
import {Client} from "../../Models/client";
import {HttpService} from "../../services/http.service";
import {ClientService} from "../client.service";
import {ClientView} from "../../Models/client-view";

@Component({
  selector: 'app-client-list',
  templateUrl: './client-list.component.html',
  styleUrls: ['./client-list.component.css']
})
export class ClientListComponent implements OnInit{

  isVisible: boolean;
  index: number;

  constructor(private httpService: HttpService,private clientService:ClientService) {
    this.isVisible = false;
    this.index = 0;
  }
  show(index: number) {
    this.index = index;
    this.isVisible = true;
  }
  clients: ClientView[] = [];

  ngOnInit(){
    this.fetchClients();
  }

  fetchClients(){
    return this.clientService.fetchClients().subscribe(res =>  res.forEach(value => {this.clients.push(value)}));
  }

  updateClient(client: ClientView){
    this.clientService.updateClient(client);
  }

  // deleteClient(client:ClientView){
  //   this.clientService.deleteClient(client)
  // }

}
