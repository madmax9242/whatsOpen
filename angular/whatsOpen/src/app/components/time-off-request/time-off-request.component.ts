import { Component, OnInit } from '@angular/core';
import { TimeOffRequest } from '../../classes/time-off-request';
import { TimeOffService } from '../../services/time-off.service';
import {MatDatepickerModule, MatDatepicker} from '@angular/material/datepicker';

@Component({
  selector: 'app-time-off-request',
  templateUrl: './time-off-request.component.html',
  styleUrls: ['./time-off-request.component.css']
})
export class TimeOffRequestComponent implements OnInit {

  timeOff: TimeOffRequest;
  matDatepicker: MatDatepickerModule;

  constructor(private timeOffService: TimeOffService) { }

  ngOnInit(): void {
    this.timeOff = new TimeOffRequest();
  }

  submitRequest(): void {
    this.timeOffService.addTimeOffRequest(this.timeOff).subscribe(data => {
      console.log(data);
      if(data) {
        alert("Request Sent");
      }
      else {
        alert("Error. Please try again");
      }
      
    })
  }

}
