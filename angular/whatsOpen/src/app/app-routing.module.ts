import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeInfoComponent } from './components/employee-info/employee-info.component';
import { ScheduleListComponent } from './components/schedule-list/schedule-list.component';


const routes: Routes = [
    { path: '/', component: ScheduleListComponent},
    { path: 'employee-info', component: EmployeeInfoComponent },
    { path: 'schedules' , component: ScheduleListComponent},

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
export class AppRoutingModule {
}