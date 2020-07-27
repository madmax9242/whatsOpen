import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../classes/employee';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  constructor(private http: HttpClient, ) { }

  login(employee: Employee): Observable<Employee> {

    return this.http.post<Employee>("http://localhost:8989/api/employee/email", employee).pipe
    (map(result => {
      console.log(result);
      return result;
    }));
  }

  isAuthenticated(): boolean {
    return false;
  }


}
