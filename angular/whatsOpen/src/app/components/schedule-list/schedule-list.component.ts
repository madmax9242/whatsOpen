import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';

import { Employee } from '../../classes/employee';
import { EmployeeSchedule } from "../../classes/employee-schedule";
import { EmployeeScheduleService } from "../../services/employee-schedule.service"

// id: number;
//     date: string;
//     description: string;
//     shiftType: string;
//     employee: Employee;
const SCHEDULE_DATA: EmployeeSchedule[] = [];

@Component({
	selector: 'app-schedule-list',
	templateUrl: './schedule-list.component.html',
	styleUrls: ['./schedule-list.component.css']
})
export class ScheduleListComponent implements OnInit {

	constructor(service: EmployeeScheduleService) { }

	ngOnInit(): void {
		this.dataSource.paginator = this.paginator; // links our paginator reference to data source
		this.dataSource.sort = this.sort; // links our sort reference to data source
	}

	displayedColumns: string[] = ['id', 'date', 'description', 'shiftType', 'employee'];
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
