import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { EmployeeSchedule } from '../classes/employee-schedule'
import { Observable } from 'rxjs';

@Injectable({
	providedIn: 'root'
})
export class EmployeeScheduleService {

	baseUrl: string = 'http://localhost:8989/api/';

	constructor(private http: HttpClient) { }

	addSchedule(employee: EmployeeSchedule): Observable<EmployeeSchedule> {
		return this.http.post<EmployeeSchedule>(this.baseUrl + "schedule", employee);
	}

	getScheduleById(id: number): Observable<EmployeeSchedule> {
		return this.http.get<EmployeeSchedule>(this.baseUrl + 'schedule/' + id);
	}

	getScheduleByEmployeeId(empId: number): Observable<EmployeeSchedule> {
		return this.http.get<EmployeeSchedule>(this.baseUrl + 'schedule/employee/' + empId);
	}

	getAllSchedules(): Observable<EmployeeSchedule[]> {
		return this.http.get<EmployeeSchedule[]>(this.baseUrl + "schedules");
	}

	updateSchedule(employee: EmployeeSchedule): Observable<EmployeeSchedule> {
		return this.http.put<EmployeeSchedule>(this.baseUrl + "schedule", employee);
	}

	deleteScheduleById(id: number): Observable<EmployeeSchedule> {
		return this.http.delete<EmployeeSchedule>(this.baseUrl + "schedule/delete/" + id);
	}
}