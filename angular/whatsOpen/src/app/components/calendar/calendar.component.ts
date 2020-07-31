import { Component, OnInit } from '@angular/core';
import { DatePipe } from "@angular/common";
import { MatDialog } from '@angular/material/dialog';
import { EventDialogComponent } from '../event-dialog/event-dialog.component';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
	selector: 'app-calendar',
	templateUrl: './calendar.component.html',
	styleUrls: ['./calendar.component.css'],
	providers: [DatePipe]
})
export class CalendarComponent implements OnInit {

	month: Date[];
	monthHeader: string[] = [];
	
	additive: number  = 0;

	constructor(private datePipe: DatePipe, public dialog: MatDialog) {
		this.generateCalendar();
	}

	ngOnInit(): void { }

	openDialog(reqType: string, date: Date): void {
		console.log('The date', date);
		const dialogRef = this.dialog.open(EventDialogComponent, {
			width: '400px',
			data: { title: reqType, date: date }
		});

		dialogRef.afterClosed().subscribe(result => {
			console.log('The dialog was closed', result);
			//this.animal = result;
		});
	}

	selectDay(day: Date) {
		this.openDialog('Day Off', day);
	}

	/**
   * @param {int} The month number, 0 based
   * @param {int} The year, not zero based, required to account for leap years
   * @return {Date[]} List with date objects for each day of the month
   */
	getDaysInMonth() {
		this.monthHeader = [];
		var addition: number = +this.additive;
		let month = new Date().getMonth();
		month = month + addition;
		var date = new Date(new Date().getFullYear(), month, 1);
		var days = [];
		while (date.getMonth() === month) {
			days.push(new Date(date));
			date.setDate(date.getDate() + 1);
		}
		for (let i = 0; i < 7; i++) {
			console.log(this.monthHeader);
			this.monthHeader.push(this.datePipe.transform(days[i], 'EEEE').toString());
		}
		return days;
	}

	generateCalendar() {
		this.monthHeader = [];
		console.log(this.monthHeader);
		this.month = this.getDaysInMonth();
		
	}
}
