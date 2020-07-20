import { TestBed } from '@angular/core/testing';

import { EmployeeScheduleService } from './employee-schedule.service';

describe('EmployeeScheduleService', () => {
  let service: EmployeeScheduleService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmployeeScheduleService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
