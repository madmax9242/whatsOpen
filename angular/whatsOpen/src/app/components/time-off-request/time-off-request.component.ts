import { Component, OnInit } from '@angular/core';
import { TimeOffRequest } from '../../classes/time-off-request';
import {FormGroup, FormControl} from '@angular/forms';
import { TimeOffService } from '../../services/time-off.service';
import {MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';

@Component({
  selector: 'app-time-off-request',
  templateUrl: './time-off-request.component.html',
  styleUrls: ['./time-off-request.component.css']
})
export class TimeOffRequestComponent implements OnInit {

  timeOff: TimeOffRequest;
  matDatepicker: MatDatepickerModule;
  range: FormGroup = new FormGroup({
    start: new FormControl(), 
    end: new FormControl()
  });

  constructor(private timeOffService: TimeOffService) { }

  ngOnInit(): void {
    this.timeOff = new TimeOffRequest();
  }

  submitRequest(): void {
    console.log(this.range.value);
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
