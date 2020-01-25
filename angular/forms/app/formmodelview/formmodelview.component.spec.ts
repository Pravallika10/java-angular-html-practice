import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormmodelviewComponent } from './formmodelview.component';

describe('FormmodelviewComponent', () => {
  let component: FormmodelviewComponent;
  let fixture: ComponentFixture<FormmodelviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormmodelviewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormmodelviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
