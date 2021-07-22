import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExampleBannerComponent } from './example-banner.component';

describe('ExampleBannerComponent', () => {
  let component: ExampleBannerComponent;
  let fixture: ComponentFixture<ExampleBannerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExampleBannerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExampleBannerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
