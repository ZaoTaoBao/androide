import { BrowserModule } from '@angular/platform-browser';
import { NgModule} from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { SquareComponent } from './component/square/square.component';
import { SumadorComponent } from './component/sumador/sumador.component';
import { SumadorService } from './services/sumador.service';
import { DetailSizeService } from './services/detail-size.service';


@NgModule({
  declarations: [
    AppComponent,
    //el nuevo componente que hemos creado 
    SquareComponent,
    SumadorComponent
  ],
  imports: [
    BrowserModule,
    FormsModule, 
    HttpModule,
    HttpClientModule
  ],
  providers: [SumadorService, DetailSizeService],
  //solo lo tendra el modulo de arranque patron bootstrap
  bootstrap: [AppComponent]
})
export class AppModule { }
