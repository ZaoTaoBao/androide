import { Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
//ponemnos export para poder importarla
export class AppComponent {
  title = 'app';ç
  resultado: any;

//aqui va toda la logica 

constructor(){
  console.log("pollas"); 
}



obtenerSalida(event){
  console.log(event);
  }

obtenerSuma(valor){
    this.resultado = valor
  }
}
