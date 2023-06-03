import { TestBed } from '@angular/core/testing';

import { ListaMediasService } from './lista-medias.service';

describe('ListaMediasService', () => {
  let service: ListaMediasService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListaMediasService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
