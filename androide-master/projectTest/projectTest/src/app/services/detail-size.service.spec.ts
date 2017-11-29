import { TestBed, inject } from '@angular/core/testing';

import { DetailSizeService } from './detail-size.service';

describe('DetailSizeService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DetailSizeService]
    });
  });

  it('should be created', inject([DetailSizeService], (service: DetailSizeService) => {
    expect(service).toBeTruthy();
  }));
});
