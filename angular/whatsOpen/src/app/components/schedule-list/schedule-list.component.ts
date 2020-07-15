import { Component, OnInit } from '@angular/core';
import { Employee } from '../../classes/employee';

const EMP_DATA: Employee[] = [
	{ id: 101, firstName: "John", lastName: "Doe", email: "john@doe.com", password: "abc123", employeeScheduleId: 1001 },
	{ id: 102, firstName: "Jane", lastName: "Doe", email: "jane@doe.com", password: "123abc", employeeScheduleId: 1002 },
	{ id: 103, firstName: "TK", lastName: "Tran", email: "tk@tran.com", password: "ABC123", employeeScheduleId: 1003 },
	{ id: 104, firstName: "Max", lastName: "DePriest", email: "max@depriest.com", password: "ABC123", employeeScheduleId: 1004 },
	{ id: 105, firstName: "Sergio", lastName: "Bernal", email: "sergio@bernal.com", password: "ABC123", employeeScheduleId: 1005 }
];

@Component({
	selector: 'app-schedule-list',
	templateUrl: './schedule-list.component.html',
	styleUrls: ['./schedule-list.component.css']
})
export class ScheduleListComponent implements OnInit {

	constructor() { }

	ngOnInit(): void { }

	displayedColumns = ['id', 'firstName', "lastName", "email", "password", "employeeScheduleId"];
	dataSource = EMP_DATA;
}
