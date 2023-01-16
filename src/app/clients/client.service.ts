import { Injectable } from '@angular/core';
import {HttpClient, HttpErrorResponse} from "@angular/common/http";
import {Client} from "../Models/client";
import {catchError, throwError} from "rxjs";
import {ClientView} from "../Models/client-view";

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  constructor(private http: HttpClient) {}

  createClient(client: Client){
    this.http.post<Client>('http://localhost:8080/clients/create',
      client).subscribe()
  }

  fetchClients(){
    return this.http.get<ClientView[]>('http://localhost:8080/clients/dto/all').pipe(
      catchError(this.handleError));
  }

  updateClient(client: ClientView){
    this.http.put('http://localhost:8080/clients/update',client).pipe(
      catchError(this.handleError)).subscribe()
  }

  // deleteClient(client:ClientView){
  //   this.http.put('http://localhost:8080/clients/delete',client).pipe(
  //     catchError(this.handleError)).subscribe()
  // }

  private handleError(error: HttpErrorResponse) {
    if (error.status === 0) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong.
      console.error(
        `Backend returned code ${error.status}, body was: `, error.error);
    }
    // Return an observable with a user-facing error message.
    return throwError(() => new Error('Something bad happened; please try again later.'));
  }
}
