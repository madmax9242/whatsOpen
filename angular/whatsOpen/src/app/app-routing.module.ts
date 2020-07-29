import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

import { AuthGuardGuard } from './services/auth-guard.guard';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';
import { EmployeeInfoComponent } from './components/employee-info/employee-info.component';
import { CalendarComponent } from './components/calendar/calendar.component';
import { TimeOffRequestComponent } from './components/time-off-request/time-off-request.component';
import { CreateScheduleComponent } from './components/create-schedule/create-schedule.component';

const routes: Routes = [
	{ path: '', component: LoginComponent },
	{ path: 'register', component: RegisterComponent },
	{ path: 'login', component: LoginComponent },
	{ path: 'employee-info', component: EmployeeInfoComponent, canActivate: [AuthGuardGuard] },
	{ path: 'calendar', component: CalendarComponent, canActivate: [AuthGuardGuard] },
	{ path: 'time-off-request', component: TimeOffRequestComponent, canActivate: [AuthGuardGuard] },
	{ path: 'create-schedule', component: CreateScheduleComponent, canActivate: [AuthGuardGuard] },
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
