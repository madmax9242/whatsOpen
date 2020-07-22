import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/classes/employee';
import { EmployeeService } from '../../services/employee.service'

@Component({
	selector: 'app-register',
	templateUrl: './register.component.html',
	styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

	emp: Employee;

	constructor(private empService: EmployeeService) { }

	ngOnInit(): void {
		this.emp = new Employee();
	}

	register() {
		console.log("Register pressed.");

		this.empService.addEmployee(this.emp).subscribe(data => {
				console.log("Registration successful");
				console.log(data);
				sessionStorage.setItem("employeeId", this.emp.id + "");
				

				// Route
				//window.location.assign("/profile")
		});
	
	}
}
