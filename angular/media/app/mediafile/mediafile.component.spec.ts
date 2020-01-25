import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MediafileComponent } from './mediafile.component';

describe('MediafileComponent', () => {
  let component: MediafileComponent;
  let fixture: ComponentFixture<MediafileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MediafileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MediafileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
