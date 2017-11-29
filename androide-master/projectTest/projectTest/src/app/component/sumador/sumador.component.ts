import { Component, OnInit } from '@angular/core';
import { Output } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { SumadorService } from '../../services/sumador.service';

@Component({
  selector: 'app-sumador',
  templateUrl: './sumador.component.html',
  styleUrls: ['./sumador.component.scss']
})
export class SumadorComponent implements OnInit {
 
  @Output() variable: EventEmitter<any> = new EventEmitter();
  num1:any;
  num2;any;
  constructor(private sumadorService: SumadorService) {

    
   }

  ngOnInit() {
  }

  sumaRandomNum(){
      this.variable.emit(this.num1+this.num2);


  }

}
