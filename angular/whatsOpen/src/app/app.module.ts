import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { MatTableModule } from '@angular/material/table';
import { ScheduleListComponent } from './components/schedule-list/schedule-list.component';

@NgModule({
	declarations: [
		AppComponent,
		ScheduleListComponent
	],
	imports: [
		BrowserModule,
		BrowserAnimationsModule,
		NgbModule,
		MatTableModule
	],
	providers: [],
	bootstrap: [AppComponent]
})
export class AppModule { }
