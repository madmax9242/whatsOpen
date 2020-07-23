import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatSortModule } from '@angular/material/sort';
import { MatDialogModule } from '@angular/material/dialog';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatGridListModule } from '@angular/material/grid-list';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { ScheduleListComponent } from './components/schedule-list/schedule-list.component';
import { EmployeeInfoComponent } from './components/employee-info/employee-info.component';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';
import { CalendarComponent } from './components/calendar/calendar.component';
import { EventDialogComponent } from './components/event-dialog/event-dialog.component';

@NgModule({
	declarations: [
		AppComponent,
		ScheduleListComponent,
		EmployeeInfoComponent,
		RegisterComponent,
		LoginComponent,
		CalendarComponent,
		EventDialogComponent,
	],
	imports: [
		BrowserModule,
		NgbModule,
		BrowserAnimationsModule,
		MatTableModule,
		MatPaginatorModule,
		MatSortModule,
		MatDialogModule,
		MatFormFieldModule,
		MatGridListModule,
		MatInputModule,
		AppRoutingModule,
		HttpClientModule,
		FormsModule,
	],
	providers: [],
	bootstrap: [AppComponent]
})
export class AppModule { }
