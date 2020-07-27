import { Component, OnInit } from '@angular/core';
import { TimeOffRequest } from '../../classes/time-off-request';
import { FormGroup, FormControl } from '@angular/forms';
import { TimeOffService } from '../../services/time-off.service';

@Component({
	selector: 'app-time-off-request',
	templateUrl: './time-off-request.component.html',
	styleUrls: ['./time-off-request.component.css']
})
export class TimeOffRequestComponent implements OnInit {

	currentDate: Date = new Date();
	timeOff: TimeOffRequest;

	formTimeOff: FormGroup = new FormGroup({
		start: new FormControl(),
		end: new FormControl(),
		reason: new FormControl()
	});

	constructor(private timeOffService: TimeOffService) {
		setInterval(() => {
			this.currentDate = new Date();
		}, 1);
	}

	ngOnInit(): void {
		this.timeOff = new TimeOffRequest();
		console.log(sessionStorage.getItem("employeeId"));
	}

	submitRequest(): void {
		console.log(this.formTimeOff.value);
		// this.timeOffService.addTimeOffRequest(this.timeOff).subscribe(data => {
		//   console.log(data);
		//   if(data) {
		//     alert("Request Sent");
		//   }
		//   else {
		//     alert("Error. Please try again");
		//   }

		// })
	}
}
