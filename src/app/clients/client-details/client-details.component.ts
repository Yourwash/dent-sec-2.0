import {Component, Input, OnInit, Output} from '@angular/core';
import {Client} from "../../Interfaces/client";

@Component({
  selector: 'app-client-details',
  templateUrl: './client-details.component.html',
  styleUrls: ['./client-details.component.css']
})
export class ClientDetailsComponent implements OnInit{
  @Input() client!:Client;
  @Output() updatedClient!:Client;
  ngOnInit(): void{};
}
