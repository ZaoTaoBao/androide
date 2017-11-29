import { Injectable } from '@angular/core';
import { OnInit } from '@angular/core';

@Injectable()
export class SumadorService implements OnInit{

  constructor() { }

  ngOnInit(){

  }

  sumadorService(a:number, b:number): number{
    return a + b; 

  }

}
