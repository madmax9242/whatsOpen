import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from '../classes/employee'
import { Observable } from 'rxjs';

@Injectable({
	providedIn: 'root'
})
export class EmployeeService {

	baseUrl: string = 'http://localhost:4200/';

	constructor(private http: HttpClient) { }

	addEmployee(employee: Employee): Observable<Employee> {
		return this.http.post<Employee>(this.baseUrl + "employee/new", employee);
	}

	getEmployeeById(id: number): Observable<Employee> {
		return this.http.get<Employee>(this.baseUrl + 'employee/' + id);
	}

	getAllEmployees(): Observable<Employee[]> {
		return this.http.get<Employee[]>(this.baseUrl + "employee/all");
	}

	updateEmployee(employee: Employee): Observable<Employee> {
		return this.http.put<Employee>(this.baseUrl + "employee", employee);
	}

	deleteEmployeeById(id: number): Observable<Employee> {
		return this.http.delete<Employee>(this.baseUrl + "employee/delete/" + id);
	}

}
