import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/classes/employee';

@Component({
	selector: 'app-register',
	templateUrl: './register.component.html',
	styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

	emp: Employee;

	constructor() { }

	ngOnInit(): void {
		this.emp = new Employee();
	}

	register() {
		console.log("Register pressed.");
	}
}
