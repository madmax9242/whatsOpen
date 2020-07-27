import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TimeOffRequest } from '../classes/time-off-request';


@Injectable({
	providedIn: 'root'
})
export class TimeOffService {

	baseUrl: string = 'http://localhost:8989/api/';

	constructor(private http: HttpClient) { }

	addTimeOffRequest(TimeOff: TimeOffRequest): Observable<TimeOffRequest> {
		return this.http.post<TimeOffRequest>(this.baseUrl + "timeOffRequest", TimeOff);
	}

	getTimeOffRequestById(id: number): Observable<TimeOffRequest> {
		return this.http.get<TimeOffRequest>(this.baseUrl + 'timeOffRequest/' + id);
	}

	getTimeOffRequestByEmployeeId(empId: number): Observable<TimeOffRequest> {
		return this.http.get<TimeOffRequest>(this.baseUrl + 'timeOffRequest')
	}

	getAllTimeOffRequests(): Observable<TimeOffRequest[]> {
		return this.http.get<TimeOffRequest[]>(this.baseUrl + "timeOffRequests");
	}
}
