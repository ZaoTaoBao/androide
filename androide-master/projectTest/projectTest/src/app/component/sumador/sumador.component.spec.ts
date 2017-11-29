import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SumadorComponent } from './sumador.component';

describe('SumadorComponent', () => {
  let component: SumadorComponent;
  let fixture: ComponentFixture<SumadorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SumadorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SumadorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
