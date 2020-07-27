import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/classes/employee';
import { EmployeeService } from '../../services/employee.service'
import { Router } from '@angular/router';

@Component({
	selector: 'app-register',
	templateUrl: './register.component.html',
	styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

	emp: Employee;

	constructor(private empService: EmployeeService, private router: Router) { }

	ngOnInit(): void {
		this.emp = new Employee();
	}

	register(): void {
		this.empService.addEmployee(this.emp).subscribe(data => {
			console.log("Registration successful.");
			console.log(data);
			sessionStorage.setItem("employeeId", this.emp.id + "");

			// Routes
			this.router.navigate['/employee-info'];
		});
	}
}