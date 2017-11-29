import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Http } from '@angular/http';

@Injectable()
export class DetailSizeService {

  constructor(private http: Http) { }


  getDetailSize(): Observable<any>{
  return this.http.get("https://demo1904345.mockable.io/detailSizes");

  }

}
