import { Component, OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';
import { FormBuilder, FormArray, AbstractControl, FormGroup } from '@angular/forms';
import { BehaviorSubject } from 'rxjs';

@Component({
	selector: 'app-create-schedule',
	templateUrl: './create-schedule.component.html',
	styleUrls: ['./create-schedule.component.css'],
	providers: [DatePipe]
})
export class CreateScheduleComponent implements OnInit {

	displayedColumns: string[] = [];
	// displayedColumnsTest: string[] = ['position', 'name', '1', '2', '3', '4', '5', '6'];
	dataSource = ELEMENT_DATA;
	dataSourceTable = new BehaviorSubject<AbstractControl[]>([]);

	today = new Date();
	daysMonth: any[] = [];

	constructor(private datePipe: DatePipe, private fb: FormBuilder) {
		this.daysMonth = this.getDaysInMonth();
		this.fillColumnNames(this.daysMonth);
	}

	// Add Employee as Form
	formCreateSchedule = this.fb.group({
		month: [''],
		employees: this.fb.array([]),
		// employees: this.fb.array([this.employee]),
	});

	get employees() {
		return this.formCreateSchedule.get('employees') as FormArray;
	}

	get employee(): FormGroup {
		return this.fb.group({
			name: [''],
			shiftDays: this.fb.array([])
			// shiftDays: this.fb.array([this.shiftDay])
		});
	}

	get shiftDay(): FormGroup {
		return this.fb.group({
			date: [''],
			shift: ['']
		})
	}

	get shiftDays() {
		return this.employee.get('shiftDays') as FormArray;
	}

	addEmployee(employee) {
		this.employees.push(employee);
	}

	addShift(employee, shiftDay) {
		employee.get("shiftDays").push(shiftDay);
	}

	onSubmit() {
		console.log(this.formCreateSchedule.value);
	}

	ngOnInit(): void {
		this.fillEmployeesForm(this.daysMonth);
	}

	getDaysInMonth() {
		let month = new Date().getMonth();
		let date = new Date(new Date().getFullYear(), month, 1);
		let days = [];
		while (date.getMonth() === month) {
			days.push(new Date(date));
			date.setDate(date.getDate() + 1);
		}
		return days;
	}

	fillColumnNames(days: any[]) {
		this.displayedColumns.length = days.length + 2;
		this.displayedColumns[0] = 'position';
		this.displayedColumns[1] = 'name';
		for (let i = 0; i < days.length; i++) {
			this.displayedColumns[i + 2] = (i + 1) + '';
		}
	}

	fillEmployeesForm(days: any[]) {
		for (let data of this.dataSource) {
			let setEmployee = this.employee;
			setEmployee.get('name').setValue(data.name);
			for (let i = 0; i < days.length; i++) {
				try {
					let setShiftDay = this.shiftDay;
					setShiftDay.get('date').setValue(this.datePipe.transform(days[i], 'longDate'));
					setShiftDay.get('shift').setValue(data.shiftDays[i]);
					this.addShift(setEmployee, setShiftDay);
				} catch (error) {
					console.log('Error', error);
				}
			}
			this.addEmployee(setEmployee);
		}
		this.dataSourceTable.next(this.employees.controls);
	}
}

export interface EmployeeSchedule {
	name: string;
	shiftDays: string[];
}

const ELEMENT_DATA: EmployeeSchedule[] = [
	{ name: 'Hydrogen Lithium Beryllium', shiftDays: ['ON', 'R', 'D', 'R'] },
	{ name: 'Lithium', shiftDays: ['D', 'D', 'ON', 'R'] },
];
