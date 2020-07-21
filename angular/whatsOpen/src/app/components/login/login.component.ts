import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/classes/employee';

@Component({
	selector: 'app-login',
	templateUrl: './login.component.html',
	styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

	emp: Employee;

	constructor() { }

	ngOnInit(): void {
		this.emp = new Employee();
	}

	login() {
		console.log("Login pressed.");
	}
}
