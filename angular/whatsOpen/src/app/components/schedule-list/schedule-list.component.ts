import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

import { Employee } from '../../classes/employee';

// Fixed data, based on Employee class
const EMP_DATA: Employee[] = [
	{ id: 101, firstName: "John", lastName: "Doe", email: "john@doe.com", password: "abc123", employeeScheduleId: 1001 },
	{ id: 102, firstName: "Jane", lastName: "Doe", email: "jane@doe.com", password: "123abc", employeeScheduleId: 1002 },
	{ id: 103, firstName: "TK", lastName: "Tran", email: "tk@tran.com", password: "ABC123", employeeScheduleId: 1003 },
	{ id: 104, firstName: "Max", lastName: "DePriest", email: "max@depriest.com", password: "ABC123", employeeScheduleId: 1004 },
	{ id: 105, firstName: "Sergio", lastName: "Bernal", email: "sergio@bernal.com", password: "ABC123", employeeScheduleId: 1005 },
	{ id: 106, firstName: "Test", lastName: "Test", email: "test@test.com", password: "test123", employeeScheduleId: 1006 },
	{ id: 107, firstName: "Test", lastName: "Test", email: "test@test.com", password: "test123", employeeScheduleId: 1007 },
	{ id: 108, firstName: "Test", lastName: "Test", email: "test@test.com", password: "test123", employeeScheduleId: 1008 },
	{ id: 109, firstName: "Test", lastName: "Test", email: "test@test.com", password: "test123", employeeScheduleId: 1009 },
	{ id: 110, firstName: "Test", lastName: "Test", email: "test@test.com", password: "test123", employeeScheduleId: 1010 },
	{ id: 111, firstName: "Test", lastName: "Test", email: "test@test.com", password: "test123", employeeScheduleId: 1011 },
	{ id: 112, firstName: "Test", lastName: "Test", email: "test@test.com", password: "test123", employeeScheduleId: 1012 },
	{ id: 113, firstName: "Test", lastName: "Test", email: "test@test.com", password: "test123", employeeScheduleId: 1013 },
	{ id: 114, firstName: "Test", lastName: "Test", email: "test@test.com", password: "test123", employeeScheduleId: 1014 },
	{ id: 115, firstName: "Test", lastName: "Test", email: "test@test.com", password: "test123", employeeScheduleId: 1015 },
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

	displayedColumns: string[] = ['id', 'firstName', 'lastName', 'email', 'password', 'employeeScheduleId'];
	dataSource = new MatTableDataSource<Employee>(EMP_DATA);

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
