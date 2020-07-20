import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

import { ScheduleListComponent } from './components/schedule-list/schedule-list.component';
import { EmployeeInfoComponent } from './components/employee-info/employee-info.component';


const routes: Routes = [
	{ path: 'schedules', component: ScheduleListComponent },
	{ path: 'employee-info', component: EmployeeInfoComponent }
];


@NgModule({
	declarations: [

	],
	imports: [
		CommonModule,
		RouterModule.forRoot(routes)
	],
	exports: [
		RouterModule
	]
})
export class AppRoutingModule { }
