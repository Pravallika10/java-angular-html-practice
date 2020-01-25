import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MediadisplayComponent } from './mediadisplay.component';

describe('MediadisplayComponent', () => {
  let component: MediadisplayComponent;
  let fixture: ComponentFixture<MediadisplayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MediadisplayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MediadisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
