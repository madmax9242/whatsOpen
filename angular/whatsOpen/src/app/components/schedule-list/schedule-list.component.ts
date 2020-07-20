import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

import { Employee } from '../../classes/employee';
import { EmployeeSchedule } from "../../classes/employee-schedule";

// Fixed data, based on Employee class
const SCHEDULE_DATA: EmployeeSchedule[] = [
	{ id: 1, monday: "day", tuesday: "off", wednesday: "night", thursday: "night", friday: "off", saturday: "day", sunday: "off", employeeId: 101},
	{ id: 2, monday: "off", tuesday: "night", wednesday: "day", thursday: "off", friday: "day", saturday: "night", sunday: "off", employeeId: 102},
	{ id: 3, monday: "day", tuesday: "off", wednesday: "night", thursday: "off", friday: "off", saturday: "day", sunday: "night", employeeId: 103},
	{ id: 4, monday: "off", tuesday: "day", wednesday: "day", thursday: "night", friday: "day", saturday: "off", sunday: "day", employeeId: 104},

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

	displayedColumns: string[] = ['id', 'monday', 'tuesday', 'wednesday', 'thursday', 'friday', 'saturday', 'sunday'];
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
