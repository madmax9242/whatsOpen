import { Component, OnInit } from '@angular/core';
import { TimeOffRequest } from '../../classes/time-off-request';
import { TimeOffService } from '../../services/time-off.service';

@Component({
  selector: 'app-time-off-request',
  templateUrl: './time-off-request.component.html',
  styleUrls: ['./time-off-request.component.css']
})
export class TimeOffRequestComponent implements OnInit {

  timeOff: TimeOffRequest;

  constructor(private timeOffService: TimeOffService) { }

  ngOnInit(): void {
    this.timeOff = new TimeOffRequest();
  }

}
