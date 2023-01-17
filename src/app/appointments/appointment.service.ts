import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse} from "@angular/common/http";
import {AppointmentDto} from "../Models/appointment-dto";
import {ClientView} from "../Models/client-view";
import {StaffMemberForForm} from "../Models/staff-member-for-form";
import {OperationForForm} from "../Models/operation-for-form";
import {AppointmentToCreate} from "../Models/appointment-to-create";
import {catchError, Observable, throwError} from "rxjs";
import {Appointments} from "../Models/appointments";

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {

  constructor(private http: HttpClient) {
  }

  testObservable = new Observable<string>((v)=>{
    let appointments : AppointmentDto;
  });

  getTestObservable() {
    return this.testObservable
  }

  setTestObservable(str: string) {
    this.testObservable
  }

  createAppointment(appointment: AppointmentToCreate) {
    this.http.post<AppointmentToCreate>('http://localhost:8080/appointments/create',
      appointment).pipe(
      catchError(this.handleError)).subscribe();
  }

  fetchAppointments(page: number) {
    return this.http.get<Appointments>('http://localhost:8080/appointments/all-pageable/' + page);
  }

  fetchClients() {
    return this.http.get<ClientView[]>('http://localhost:8080/clients/dto/all').pipe(
      catchError(this.handleError));
  }

  fetchOperations() {
    return this.http.get<OperationForForm[]>('http://localhost:8080/operations/dto/all').pipe(
      catchError(this.handleError));
  }

  fetchStaff() {
    return this.http.get<StaffMemberForForm[]>('http://localhost:8080/staff/dto/all-operations-staff').pipe(
      catchError(this.handleError));
  }

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
