import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TimeOffRequestComponent } from './time-off-request.component';

describe('TimeOffRequestComponent', () => {
  let component: TimeOffRequestComponent;
  let fixture: ComponentFixture<TimeOffRequestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TimeOffRequestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TimeOffRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
