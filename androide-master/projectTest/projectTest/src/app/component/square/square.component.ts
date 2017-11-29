import { Component, OnInit } from '@angular/core';
import { OnDestroy, AfterViewInit } from '@angular/core/src/metadata/lifecycle_hooks';
import { Input, Output } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { DetailSizeService } from '../../services/detail-size.service';
import { Services } from '@angular/core/src/view';
import 'rxjs/Rx'


@Component({
  selector: 'app-square',
  templateUrl: './square.component.html',
  styleUrls: ['./square.component.scss']
})
export class SquareComponent implements OnInit, OnDestroy, AfterViewInit {

  constructor(private serviceDetail:DetailSizeService) { }
  miAtributo:string;
  miNumero:number;
  ganas:boolean;
  coches: Array<any>;

  @Input() miEntrada: string;
  @Output() miSalida: EventEmitter<any> = new EventEmitter();
  

   // no utilizar nunca el constructor utilizar los ciclos de vida del componente 
  ngOnInit() {
    console.log("vamos tio");
    this.miAtributo = "Pollemon 2, Pollaxu esta on fire."
    this.miNumero = 10; 
    this.ganas= false; 
    this.coches = [
        {
          "marca": "A",
          "coche":"B"
        }

    ]
    //aqui se inicializa el componente implements on OnInit
  }
  //repasar los ciclos de vida way
  ngOnDestroy(){
  }

  ngAfterViewInit(){
  }
/* no tira asi 
  miBoton(valor:string){
   console.log("ksdj.fhsadjkfhlaskfhlaskdfhlksd");
   console.log(valor);
  }*/
  miBoton(valor){
    this.miNumero++;
    console.log("ksdj.fhsadjkfhlaskfhlaskdfhlksd");
    console.log(valor);
   }


   miBoton2(){
     this.ganas = !this.ganas;
  this.coches.push(
    {
      "marca": "los coches son unos de los cancerres del mundo ",
      "coche":"C"
    }
    );
  }

  pasaParam(){
    this.miSalida.emit("viva cuba");
  }

  getDetailSize(){
    this.serviceDetail.getDetailSize().map(res=> {res.json();})
        .subscribe(data => {
          console.log(data);
        });
  }
}