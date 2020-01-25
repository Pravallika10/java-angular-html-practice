import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SideeComponent } from './sidee.component';

describe('SideeComponent', () => {
  let component: SideeComponent;
  let fixture: ComponentFixture<SideeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SideeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SideeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
