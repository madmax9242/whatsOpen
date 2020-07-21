import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

import { ScheduleListComponent } from './components/schedule-list/schedule-list.component';
import { EmployeeInfoComponent } from './components/employee-info/employee-info.component';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
	{ path: '', component: LoginComponent },
	{ path: 'register', component: RegisterComponent },
	{ path: 'login', component: LoginComponent },
	{ path: 'employee-info', component: EmployeeInfoComponent },
	{ path: 'schedule-list', component: ScheduleListComponent },
];

@NgModule({
	declarations: [
	],
	imports: [
		CommonModule,
		RouterModule.forRoot(routes),
	],
	exports: [
		RouterModule,
	]
})
export class AppRoutingModule { }
