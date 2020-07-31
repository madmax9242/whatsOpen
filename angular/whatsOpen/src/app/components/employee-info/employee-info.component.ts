import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { EmployeeService } from '../../services/employee.service'

import { Employee } from '../../classes/employee';

const EMP_DATA: Employee[] = [
	{ id: 101, firstName: "John", lastName: "Doe", email: "john@doe.com", password: "abc123" },
	{ id: 102, firstName: "Ewok", lastName: "Spacebear", email: "ewok@test.com", password: "c3po"},
	{ id: 103, firstName: "TK", lastName: "Tran", email: "tk@tran.com", password: "ABC123"},
	{ id: 104, firstName: "Max", lastName: "DePriest", email: "max@depriest.com", password: "ABC123"},
	{ id: 105, firstName: "Sergio", lastName: "Bernal", email: "sergio@bernal.com", password: "ABC123"},
	{ id: 106, firstName: "Tom", lastName: "Cat", email: "tom@test.com", password: "test123"},
	{ id: 107, firstName: "Jerry", lastName: "Mouse", email: "jerry@test.com", password: "test123"},
	{ id: 108, firstName: "James", lastName: "Bond", email: "james@test.com", password: "test007"},
	{ id: 109, firstName: "Han", lastName: "Solo", email: "han@test.com", password: "falcon"},
	{ id: 110, firstName: "Luke", lastName: "Skywalker", email: "luke@test.com", password: "tatooine"},
	{ id: 111, firstName: "Anakin", lastName: "Skywalker", email: "anakin@test.com", password: "padme"},
	{ id: 112, firstName: "Malcom", lastName: "Reynolds", email: "mal@test.com", password: "shiny" },
];

@Component({
	selector: 'app-employee-info',
	templateUrl: './employee-info.component.html',
	styleUrls: ['./employee-info.component.css']
})
export class EmployeeInfoComponent implements OnInit {

	constructor(private employeeService: EmployeeService) { }

	employeeData: Employee[];

	ngOnInit(): void {
		this.getAllEmployees();
		this.dataSource.paginator = this.paginator; // links our paginator reference to data source
		this.dataSource.sort = this.sort; // links our sort reference to data source
	}

	displayedColumns: string[] = ['id', 'firstName', 'lastName', 'email', 'password'];
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

	getAllEmployees() {
		this.employeeService.getAllEmployees().subscribe(data => {
			
			this.employeeData = data;
			console.log(this.employeeData);
		});

		console.log(this.employeeData);
			
	}
}
