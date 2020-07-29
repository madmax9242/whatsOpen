import { Component, OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-create-schedule',
  templateUrl: './create-schedule.component.html',
  styleUrls: ['./create-schedule.component.css'],
  providers: [DatePipe]
})
export class CreateScheduleComponent implements OnInit {

  displayedColumns: string[] = [];
  dataSource = ELEMENT_DATA;

  tables = [0];
  dayOfTheMonth: any[] = [];

  constructor(private datePipe: DatePipe) {
    this.dayOfTheMonth = this.getDaysInMonth();
    this.fillColumnNames(this.dayOfTheMonth);
  }

  ngOnInit(): void {
  }

  getDaysInMonth() {
    let month = new Date().getMonth();
    let date = new Date(new Date().getFullYear(), month, 1);
    let days = [];
    while (date.getMonth() === month) {
      days.push(new Date(date));
      date.setDate(date.getDate() + 1);
    }
    return days;
  }

  fillColumnNames(days: any[]) {
    this.displayedColumns.length = days.length + 2;
    //this.displayedColumns.fill('filler');
    this.displayedColumns[0] = 'position';
    this.displayedColumns[1] = 'name';
    for (let i = 2; i < this.displayedColumns.length; i++) {
      this.displayedColumns[i] = this.datePipe.transform(days[i - 2], 'MMddyyyy');
    }
    console.log(this.displayedColumns);
  }

}

export interface EmployeeSchedule {
  name: string;
  day1Shift: String;
  day2Shift?: String;
  day3Shift?: String;
  day4Shift?: String;
  day5Shift?: String;
  day6Shift?: String;
  day7Shift?: String;
  day8Shift?: String;
  day9Shift?: String;
  day10Shift?: String;
  day11Shift?: String;
  day12Shift?: String;
  day13Shift?: String;
  day14Shift?: String;
  day15Shift?: String;
  day16Shift?: String;
  day17Shift?: String;
  day18Shift?: String;
  day19Shift?: String;
  day20Shift?: String;
  day21Shift?: String;
  day22Shift?: String;
  day23Shift?: String;
  day24Shift?: String;
  day25Shift?: String;
  day26Shift?: String;
  day27Shift?: String;
  day28Shift?: String;
  day29Shift?: String;
  day30Shift?: String;
  day31Shift?: String;
}

const ELEMENT_DATA: EmployeeSchedule[] = [
  { name: 'Hydrogen', day1Shift: 'N' },
  { name: 'Lithium', day1Shift: 'D' },
  { name: 'Beryllium', day1Shift: 'D' },
  { name: 'Boron', day1Shift: 'N' },
  { name: 'Carbon', day1Shift: 'N' },
  { name: 'Nitrogen', day1Shift: 'N' },
  { name: 'Oxygen', day1Shift: 'N' },
  { name: 'Fluorine', day1Shift: 'N' },
  { name: 'Neon', day1Shift: 'N' },
];
