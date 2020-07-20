import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

import { Employee } from '../../classes/employee';

// Fixed data, based on Employee class
const EMP_DATA: Employee[] = [
	{ id: 101, firstName: "John", lastName: "Doe", email: "john@doe.com", password: "abc123", employeeScheduleId: 1001 },
	{ id: 102, firstName: "Ewok", lastName: "Spacebear", email: "ewok@test.com", password: "c3po", employeeScheduleId: 1002 },
	{ id: 103, firstName: "TK", lastName: "Tran", email: "tk@tran.com", password: "ABC123", employeeScheduleId: 1003 },
	{ id: 104, firstName: "Max", lastName: "DePriest", email: "max@depriest.com", password: "ABC123", employeeScheduleId: 1004 },
	{ id: 105, firstName: "Sergio", lastName: "Bernal", email: "sergio@bernal.com", password: "ABC123", employeeScheduleId: 1005 },
	{ id: 106, firstName: "Tom", lastName: "Cat", email: "tom@test.com", password: "test123", employeeScheduleId: 1006 },
	{ id: 107, firstName: "Jerry", lastName: "Mouse", email: "jerry@test.com", password: "test123", employeeScheduleId: 1007 },
	{ id: 108, firstName: "James", lastName: "Bond", email: "james@test.com", password: "test007", employeeScheduleId: 1008 },
	{ id: 109, firstName: "Han", lastName: "Solo", email: "han@test.com", password: "falcon", employeeScheduleId: 1009 },
	{ id: 110, firstName: "Luke", lastName: "Skywalker", email: "luke@test.com", password: "tatooine", employeeScheduleId: 1010 },
	{ id: 111, firstName: "Anakin", lastName: "Skywalker", email: "anakin@test.com", password: "padme", employeeScheduleId: 1011 },
	{ id: 112, firstName: "Malcom", lastName: "Reynolds", email: "mal@test.com", password: "shiny", employeeScheduleId: 1012 },
];

@Component({
	selector: 'app-employee-info',
	templateUrl: './employee-info.component.html',
	styleUrls: ['./employee-info.component.css']
})
export class EmployeeInfoComponent implements OnInit {

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
