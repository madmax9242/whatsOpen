import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

import { Employee } from '../../classes/employee';
import { EmployeeSchedule } from "../../classes/employee-schedule";

// Fixed data, based on Employee class
const SCHEDULE_DATA: EmployeeSchedule[] = [
	{ id: 1, monday: "day", tuesday: "off", wednesday: "night", thursday: "night", friday: "off", saturday: "day", sunday: "off", employee: null},
	{ id: 2, monday: "off", tuesday: "night", wednesday: "day", thursday: "off", friday: "day", saturday: "night", sunday: "off", employee: null},
	{ id: 3, monday: "day", tuesday: "off", wednesday: "night", thursday: "off", friday: "off", saturday: "day", sunday: "night", employee: null},
	{ id: 4, monday: "off", tuesday: "day", wednesday: "day", thursday: "night", friday: "day", saturday: "off", sunday: "day", employee: null},
	// { id: 101, firstName: "John", lastName: "Doe", email: "john@doe.com", password: "abc123", employeeScheduleId: 1001 },
	// { id: 102, firstName: "Jane", lastName: "Doe", email: "jane@doe.com", password: "123abc", employeeScheduleId: 1002 },
	// { id: 103, firstName: "TK", lastName: "Tran", email: "tk@tran.com", password: "ABC123", employeeScheduleId: 1003 },
	// { id: 104, firstName: "Max", lastName: "DePriest", email: "max@depriest.com", password: "ABC123", employeeScheduleId: 1004 },
	// { id: 105, firstName: "Sergio", lastName: "Bernal", email: "sergio@bernal.com", password: "ABC123", employeeScheduleId: 1005 },
	// { id: 106, firstName: "Tom", lastName: "Cat", email: "tom@test.com", password: "test123", employeeScheduleId: 1006 },
	// { id: 107, firstName: "Jerry", lastName: "Mouse", email: "jerry@test.com", password: "test123", employeeScheduleId: 1007 },
	// { id: 108, firstName: "James", lastName: "Bond", email: "james@test.com", password: "test007", employeeScheduleId: 1008 },
	// { id: 109, firstName: "Han", lastName: "Solo", email: "han@test.com", password: "falcon", employeeScheduleId: 1009 },
	// { id: 110, firstName: "Luke", lastName: "Skywalker", email: "luke@test.com", password: "tatooine", employeeScheduleId: 1010 },
	// { id: 111, firstName: "Anakin", lastName: "Skywalker", email: "anakin@test.com", password: "padme", employeeScheduleId: 1011 },
	// { id: 112, firstName: "Ewok", lastName: "Spacebear", email: "ewok@test.com", password: "c3po", employeeScheduleId: 1012 },
];

@Component({
	selector: 'app-schedule-list',
	templateUrl: './schedule-list.component.html',
	styleUrls: ['./schedule-list.component.css']
})
export class ScheduleListComponent implements OnInit {

	constructor() { }

	ngOnInit(): void {
		this.dataSource.paginator = this.paginator; // links our paginator reference to data source
		this.dataSource.sort = this.sort; // links our sort reference to data source
	}

	displayedColumns: string[] = ['id', 'monday', 'tuesday', 'wednesday', 'thursday', 'friday', 'saturday', 'sunday', 'employee'];
	dataSource = new MatTableDataSource<EmployeeSchedule>(SCHEDULE_DATA);

	// Pagination
	@ViewChild(MatPaginator, { static: true }) paginator: MatPaginator; // scans for paginator in HTML and assigns to reference variable paginator

	// Sorting
	@ViewChild(MatSort, { static: true }) sort: MatSort; // scans for sort in HTML and assigns to reference variable sort

	// Filtering
	applyFilter(event: Event) {
		const filterValue = (event.target as HTMLInputElement).value;
		this.dataSource.filter = filterValue.trim().toLowerCase();
	}
}
