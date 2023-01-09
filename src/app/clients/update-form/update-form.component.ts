import {Component, Input, Output} from '@angular/core';
import {Client} from "../../Interfaces/client";

@Component({
  selector: 'app-update-form',
  templateUrl: './update-form.component.html',
  styleUrls: ['./update-form.component.css']
})
export class UpdateFormComponent {
  @Input() client!:Client;
  @Output() updatedClient!:Client;
  ngOnInit(): void{};
}
