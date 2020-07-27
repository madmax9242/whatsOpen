import { Injectable } from '@angular/core';
import { Observable, BehaviorSubject } from 'rxjs';
import { Employee } from '../classes/employee';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  private employeeSource = new BehaviorSubject(null);
  loggedInEmployee = this.employeeSource.asObservable();

  constructor(private http: HttpClient, private router: Router) { }

  login(employee: Employee): Observable<Employee> {

    return this.http.post<Employee>("http://localhost:8989/api/employee/email", employee).pipe
    (map(result => {
      this.employeeSource.next(true);
      console.log(result);
      return result;
    }));
  }

  isAuthenticated(): boolean {
    let flag = false;
    this.loggedInEmployee.subscribe(result => {
      console.log(result);
      flag = result;
    })
    return flag;
  }

  logout(): void {
    this.employeeSource.next(null);
    this.router.navigate(['/login']);
  }


}
