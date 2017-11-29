import { TestBed, inject } from '@angular/core/testing';

import { SumadorService } from './sumador.service';

describe('SumadorService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SumadorService]
    });
  });

  it('should be created', inject([SumadorService], (service: SumadorService) => {
    expect(service).toBeTruthy();
  }));
});
