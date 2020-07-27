import { Component } from '@angular/core';
import { AuthServiceService } from './services/auth-service.service';


@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent {
	title = 'WhatsOpen';

	constructor(private authService: AuthServiceService) { }

	logout() {
		this.authService.logout();
	}
}
