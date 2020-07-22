import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/classes/employee';
import { EmployeeService } from '../../services/employee.service'

@Component({
	selector: 'app-login',
	templateUrl: './login.component.html',
	styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

	emp: Employee;
	returnEmp: Employee;

	constructor(private empService: EmployeeService) { }

	ngOnInit(): void {
		this.emp = new Employee();
	}

	login() {
		this.empService.getEmployeeByEmail(this.emp).subscribe(data => {
			console.log("Login successful.");
			console.log(data);
			if (data) {
				this.returnEmp = data;
				if (this.returnEmp.password == this.emp.password) {
					window.location.assign("/schedule-list")
				} else {
					alert("Incorrect password!");
				}
			} else {
				alert("No account found!");
			}

			sessionStorage.setItem("employeeId", this.emp.id + "");

			// Route
			//window.location.assign("/profile")
		});
	}
}